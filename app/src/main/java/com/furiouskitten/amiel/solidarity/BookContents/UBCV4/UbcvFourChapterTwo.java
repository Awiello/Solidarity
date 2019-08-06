package com.furiouskitten.amiel.solidarity.BookContents.UBCV4;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.furiouskitten.amiel.solidarity.Activities.BookHomeActivity;
import com.furiouskitten.amiel.solidarity.Activities.BookMainMenu;
import com.furiouskitten.amiel.solidarity.Activities.MainMenuActivity;
import com.furiouskitten.amiel.solidarity.Activities.UbcvFourChaptersActivity;
import com.furiouskitten.amiel.solidarity.Activities.UbcvThreeChaptersActivity;
import com.furiouskitten.amiel.solidarity.Authentication.LoginActivity;
import com.furiouskitten.amiel.solidarity.BookContents.VIDEOS.NoManIsAnIsland;
import com.furiouskitten.amiel.solidarity.BookContents.VIDEOS.PananagutanActivity;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV4QUIZ.UbcvFourChapterFourQuizSS;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV4QUIZ.UbcvFourChapterTwoQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV4QUIZ.Homeubcv4chapter2;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV4QUIZ.Homeubcv4chapter4;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvFourChapterTwo extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, YouTubePlayer.OnInitializedListener, YouTubePlayer.PlayerStateChangeListener, YouTubePlayer.PlaybackEventListener {

    String API_KEY = "AIzaSyDPqwPQIAhTwfNR6PjRdnh1YJdjr82aVbM";

    //Firebase auth
    FirebaseAuth mAuth;
    FirebaseUser currentUser;


    TextView mChapterText;
    TextView mTitleText;
    TextView mContentText;
    TextView mContentTextTwo;
    TextView mContentTextThree;
    TextView mContentTextFour;
    ScrollView mScrolScrollView;
    Button mNextPageButton;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubcv_four_chapter_two);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter Two: Definition of Sevice");

        //Firebase auth
        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();




        //FULL PAGE CONTENT

        //Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/PalatinoLinotype.ttf");

        mChapterText = findViewById(R.id.ChapterText);
        mTitleText = findViewById(R.id.TitleText);
        mContentText = findViewById(R.id.ContentText);
        mContentTextTwo = findViewById(R.id.ContentTextTwo);
        mNextPageButton = findViewById(R.id.nextPageButton);

        String pageContent =
"DEFINITION OF SERVICE\n\nPreliminary Activity\n\nLet us sing these songs:\n\n • No man is an Island \n\n • Pananagutan \n\nAbstraction\n\nAs human persons, men are by nature social beings, hence, they continuously relate with others from the time they were born because they cannot really live alone by themselves. They continuously search for others since they believe that life is a continuous journey and service is a never ending process. \n\n Because man is a social being, he becomes responsible not only to himself but to others in his community or society where he belongs. He has to make decisions continually which involve, to some degree, his sense of values, his belief about man's worth and his responsibility toward his neighbour. In this regard, the Christian ethics teach us that the good life for man consists in the love of God and that this good life can be attained by behaving in accordance with rules ordained by God and by serving his fellowmen. Aristotle said that man is a political animal. He needs to interact with others to define him. John done further underscored this trait when he wrote: \"Man is not an Island complete in himself.\" Man can fulfil himself only in relation to others in day to day situations. Man's attitudes are not formed and values are not imbibed in a state of isolation. They are inculcated through words and examples by observation as the members of a group interact in activities provided by group members.";
        String pageContentTwo = "Definitions of Service: \n\n 1. The occupation or condition of being a servant \n\n 2. Employment especially public employment \n\n 3. Work done or duty performed for others \n\n4. A religious ceremony, esp. a meeting for prayer\n\n5. An act of assistance, the result of this benefit or friendly help\n\n6. The act or manner of serving food\n\n7. A system or method of providing people with electric power, water, transportation\n\n8.  Installation, maintenance, repairs provided to customers by a dealer\n\n9. The act or manner of serving the ball in tennis or one's turn to serve\n\n10. Law notification of legal action, esp. through the serving of a write.\n\nThinking like a Servant (Warren 2002)\n\nService starts in your mind. \n\n- God is always more interested in why we do something than in what we do.\n\nReal servants serve God with a mindset of five attitudes.\n\n1. Real servants think more about others than about themselves. This is true humility. When one stops focusing on his own needs, he becomes aware of the needs around him. It Is only then that man can do things that deserve to be remembered. Unfortunately, a lot of man's service is often self-serving. Man serves to get others to like him, to be admired, or to achieve his own goals. Some people try to use service as a bargaining tool r-i with God: ‘’I'll do this for you God, if you'll do something for me.’’ Real servants don't try to use God for their purposes. They let God use them for his purposes.\n\nReflections:\n\nHumility is a daily struggle, a lesson I must relearn over and over. The opportunity to be a servant confronts me several times, in which I am given the choice to decide between meeting my needs or the needs of others. \n\n2. Real servants make themselves available to serve.\n\nServants are always on the lookout for ways to help others. When they see a need, they seize the moment to meet it, just as the Bible commands us: ‘’Whenever we have the opportunity, we have to do what is good for everyone.’’ When God puts someone in need right in front of you, he is giving you the opportunity to grow in servant hood. We miss many occasions for serving because we lack sensitivity and spontaneity. Great opportunities to serve never last long. You may only get one chance to serve that person, so take advantage of the moment. Never tell your neighbours to wait until tomorrow if you can help them now.\n\nReflections:If you only serve when it's convenient for you, you're not a real servant. Real servants do what's needed, even when it's inconvenient. Are you available to serve? When you serve, you don't get to pick and choose when or where you will serve.\n\n3. Real Servant do every task with equal dedication.\n\nWhatever they do, servants do it with all their hearts. The size of the task is irrelevant. The only issue is, does it ‘’heed to be done?’’ Servants finish their tasks, fulfill their responsibilities, keep their promises and complete their commitments. They don't leave job half undone, and they don't quit when they get discouraged. They are trustworthy and dependable.\n\nReflections:\n\nCan you be counted on by others? Are there Reflections: promises you need to keep, vows you need to fulfil, or commitments you need to honor? This is a test.\n\n4. Real servants maintain a low profile. Servants don't promote or call attention to themselves. instead on ofthe acting ton of impress andto serve dressing onfore success, they put ,  another. If recognized for their service, they humbly accept it but don't allow notoriety to distract them from their work. Jesus said: When you do good deeds, don't try to show off If you do, you won't get a reward from your Father in heaven. Reflections:\n\nDon't be discouraged when your service is unnoticed or taken for granted. Even the smallest service is noticed by God and will be rewarded. I serve God by serving others. \n\n5. Real servants do every task with equal dedication. Whatever they do, people who are dedicated to service do it with all their heart. Small tasks often show a big heart. Your heart is revealed in little acts that others don't think of doing. \n\nThere are things for God that will always there be more People willing to do \"great\" g are People Willing to do the little things. The race to be a leader is crowded, but the field is wide open for those willing to serve.\n\n";

        mChapterText.setText("Chapter Two");
        mTitleText.setText("Definition of Service");


        SpannableString spannableOne = new SpannableString(pageContent);
        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getApplicationContext(), NoManIsAnIsland.class);
                startActivity(intent);
            }
        };

        SpannableString spannableTwo = new SpannableString(pageContent);
        ClickableSpan clickableSpanTwo = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getApplicationContext(), PananagutanActivity.class);
                startActivity(intent);
            }
        };

        spannableOne.setSpan(clickableSpanOne, 74,93, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //no man is an island
        spannableOne.setSpan(clickableSpanTwo, 99, 110, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); // pananagutan
        mContentText.setText(spannableOne);
        mContentTextTwo.setText(pageContentTwo);
        mContentText.setMovementMethod(LinkMovementMethod.getInstance());
        mContentTextTwo.setMovementMethod(LinkMovementMethod.getInstance());



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //Youtube fragment show
        YouTubePlayerSupportFragment frag = (YouTubePlayerSupportFragment) getSupportFragmentManager().findFragmentById(R.id.youtube_fragment);
        frag.initialize(API_KEY, this);


        //implement firebase
        updateNavHeader();
    }

    public void transiBtn(View view){
        if(view == findViewById(R.id.nextPageButton)){
            startActivity(new Intent(this, Homeubcv4chapter2.class));
            Animatoo.animateFade(this);
            finish();
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), UbcvFourChaptersActivity.class);
        startActivity(intent);
        finish();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ubcv_four_chapter_two, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            startActivity(new Intent(this, BookHomeActivity.class));
            Animatoo.animateFade(this);
            finish();

        } else if (id == R.id.nav_gallery){
            startActivity(new Intent(this, DictionaryMainActivity.class));
            Animatoo.animateFade(this);
            finish();


        } else if (id == R.id.nav_send) {

            FirebaseAuth.getInstance().signOut();
            Intent loginActivity = new Intent(getApplicationContext(), LoginActivity.class);
            startActivity(loginActivity);
            finish();

        } else if (id == R.id.nav_main){
            startActivity(new Intent(this, MainMenuActivity.class));
            Animatoo.animateFade(this);
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    //Youtube Fragment properties

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

        youTubePlayer.setPlayerStateChangeListener(this);
        youTubePlayer.setPlaybackEventListener(this);

        if (!b){
            youTubePlayer.cueVideo("tuglFq7iTE0");
            //youTubePlayer.cueVideo("WImkf0V7u-4");
        }
    }


    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }

    @Override
    public void onPlaying() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onStopped() {

    }

    @Override
    public void onBuffering(boolean b) {

    }

    @Override
    public void onSeekTo(int i) {

    }

    @Override
    public void onLoading() {

    }

    @Override
    public void onLoaded(String s) {

    }

    @Override
    public void onAdStarted() {

    }

    @Override
    public void onVideoStarted() {

    }

    @Override
    public void onVideoEnded() {

    }

    @Override
    public void onError(YouTubePlayer.ErrorReason errorReason) {

    }


    //image dialog popup
    public void showJapaneseKempeitaiImage(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.kempeitai);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }


    //firebase auth

    public void updateNavHeader(){
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        View headerView = navigationView.getHeaderView(0);
        TextView navUserMail = headerView.findViewById(R.id.bookMenuDrawerEmail);
        ImageView navUserPhoto = headerView.findViewById(R.id.bookMenuDrawerImageView);

        navUserMail.setText(currentUser.getEmail());
        String photo = String.valueOf(currentUser.getPhotoUrl());

        Picasso.get().load(photo).into(navUserPhoto);
    }

}
