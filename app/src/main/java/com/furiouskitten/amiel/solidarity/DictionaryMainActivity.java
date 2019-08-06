package com.furiouskitten.amiel.solidarity;

import android.app.ActionBar;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
//import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.furiouskitten.amiel.solidarity.Activities.HomeActivity;
import com.furiouskitten.amiel.solidarity.Activities.MainMenuActivity;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import org.json.JSONException;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import com.furiouskitten.amiel.solidarity.GoogleAnalytics.AnalyticsApplication;
import com.furiouskitten.amiel.solidarity.Receiver.ClipboardMonitor;
import com.furiouskitten.amiel.solidarity.Util.Internet;
import com.furiouskitten.amiel.solidarity.Util.Parser;
import com.furiouskitten.amiel.solidarity.Util.Util;

public class DictionaryMainActivity extends AppCompatActivity {

    private EditText searchWord;
    private NotificationManager nManager;
    private ListView wordList;
    private String[] words;
    private Tracker t;
    private Button mainButton;

    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startClipboardMonitor();

        init();

        mainButton = findViewById(R.id.mainButton);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DictionaryMainActivity.this, MainMenuActivity.class));
                Animatoo.animateFade(DictionaryMainActivity.this);
                finish();
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            finish();
        } else {
            Toast.makeText(this, "Press back again to finish", Toast.LENGTH_SHORT).show();
        }

        backPressedTime = System.currentTimeMillis();
    }

    private void init() {
        wordList = (ListView) findViewById(R.id.listViewSearchResults);
        wordList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(DictionaryMainActivity.this, Meaning.class).putExtra("Word", words[position]));
            }
        });

        searchWord = (EditText) findViewById(R.id.editTextQueryMain);
        searchWord.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if(event.getAction() == KeyEvent.ACTION_DOWN &&
                        event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                    t.send(new HitBuilders.EventBuilder()
                            .setCategory("Word search")
                            .setAction("Search (Main Page)")
                            .setLabel("Searched for " + searchWord.getText().toString())
                            .build());

                    startActivity(new Intent(DictionaryMainActivity.this, Meaning.class)
                        .putExtra("Word", searchWord.getText().toString()));

                    return true;
                }
                return false;
            }
        });
        searchWord.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Nothing...
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //Nothing...
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    new WordList().execute(URLEncoder.encode(s.toString().trim(), "UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        });
        t = ((AnalyticsApplication) getApplication())
                .getTracker(AnalyticsApplication.TrackerName.APP_TRACKER);
        t.setScreenName("Home");
        t.setLanguage(Util.getApiEndpoint(this));
        t.send(new HitBuilders.AppViewBuilder().build());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch(item.getItemId()) {
            case R.id.action_settings:
                startActivity(new Intent(this, SettingsHolder.class));
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*
     * When ClipboardMonitor doesn't start on boot due to the reason like we
     * install new app after android phone boots, causing it won't receive boot
     * broadcast, this method makes sure ClipboardMonitor starts when MyClips
     * activity created.
     */
    private void startClipboardMonitor() {
        ComponentName service = startService(new Intent(this,
                ClipboardMonitor.class));
        if (service == null) {
            Log.e(getClass().getName(), "Can't start service"
                    + ClipboardMonitor.class.getName());
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private class WordList extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            try {
                return Internet.getResponse(Internet
                        .getWordListURL(Util.getApiEndpoint(DictionaryMainActivity.this), params[0]));
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        protected void onPostExecute(String strings) {
            super.onPostExecute(strings);

            if(strings != null) {
                try {
                    words = Parser.getWords(strings);
                    wordList.setAdapter(new ArrayAdapter<String>(DictionaryMainActivity.this,
                            android.R.layout.simple_list_item_1, words));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
