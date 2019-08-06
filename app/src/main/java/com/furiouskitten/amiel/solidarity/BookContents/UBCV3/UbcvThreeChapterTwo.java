package com.furiouskitten.amiel.solidarity.BookContents.UBCV3;

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
import android.view.Gravity;
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
import com.furiouskitten.amiel.solidarity.Activities.UbcvThreeChaptersActivity;
import com.furiouskitten.amiel.solidarity.Authentication.LoginActivity;
import com.furiouskitten.amiel.solidarity.BookContents.VIDEOS.HewbrewBible;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV3QUIZ.UbcvThreeChapterFiveQuizSS;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV3QUIZ.UbcvThreeChapterTwoQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV3QUIZ.Homeubcv3chapter2;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvThreeChapterTwo extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, YouTubePlayer.OnInitializedListener, YouTubePlayer.PlayerStateChangeListener, YouTubePlayer.PlaybackEventListener   {

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
        setContentView(R.layout.activity_ubcv_three_chapter_two);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter 3: Learning");

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


        String pageContent = "Here are some definitions of Wisdom according to different sources\n\nFrom  www.thefreedictionary.com, wisdom is the ability to discern or judge what is true, right, or lasting; insight. It is also the common sense that results to good judgment.\n \nAccording to e.wikipedia.org. Wisdom is deep understanding and realizing of people, things, events or people resulting in activity to choose or act to inspire to constantly produce optimum results with minimum time, energy or thought. \n \n";
        String pageContentTwo =
"Philosophical perspectives of Wisdom\n\nA basic philosophical definition of wisdom is to make the best use of knowledge. The opposite of wisdom is folly. The ancient Greeks considered wisdom to be an important virtue, personified as the goddesses Metis and Athena. To Socrates and Plato, philosophy was literally the love of Wisdom . \n\nPsychological perspectives\n\nPsychologists have gathered data on commonly held beliefs or folk theories about wisdom. These analyses indicate that although «there is an overlap of the implicit theory of wisdom with intelligence, perceptiveness, spirituality and shrewdness, it is evident that wisdom is a distinct term and not a composite of other terms.» Many, but not all, studies find that adults' self-ratings of perspective/wisdom do not depend on age.\n\nHebrew Bible\n\nIn the Christian Bible and Jewish scripture, wisdom is represented by the sense of justice of the lawful and wise king Solomon, who asks God for wisdom in 2 Chronicles 1. Much of the book of Proverbs is attributed to Solomon. It has been posited that an ancient belief existed among the Jews and Samaritans that both the wisest and most aged among them would grow Caprice Horns which were known as ‘’Rays of Light’’\n\nFrom Wisdom's Authority is born.\n\n His Wisdom shone unto them like of light - .However this is most likely a mistranslation of the Hebrew 'Keren' which means 'pride/defiance' in the emotive context but 'animal horn' in the vulgate. \n\n New Testament\n\nThere are oppositional elements in Christian thought between secular wisdom and Godly Wisdom. The apostle Paul states the worldly wisdom thinks the claims of Christ to be foolish, However, those who saved Christ represents Wisdom of God.(1 Cor. 1:17-31) \n\nWisdom is one of the seven gifts of the Holy Spirit according to Angelican, Catholic and Lutherian Belief.  \n\nQur'an\n\nIn Islam, according to the Qur'an, Wisdom is of the greatest gifts humankind can enjoy, as it can be seen in many verses such as: ‘’He gives wisdom unto whom He will, and he unto whom wisdom is given, he truly has received abundant good. But none remember except men of understanding.’’ [2:269]* And a Surah 31 is named ‘’Luqman’’ after a wise man that God has bestowed Wisdom upon him. \n\nEastern religions and philosophy\n\nAccording to Confucius, wisdom can be learned by three methods: Reflection, imitation and experience . Wisdom is not told by self but unless asked for by another. This means a wise man never tells his wisdom unless asked person to person. \n\nBuddhist scriptures teach that a wise person is endowed with a good bodily conduct, a good verbal conduct and good mental conduct. A wise person does actions that are unpleasant to do but give good results but does not do action that are pleasant but give bad results. Wisdom is the antidote of self-choice poison of ignorance.\n\nOther religions\n\nn Mesopotamian religion and mythology, Enki, also known as Ea, was the God of wisdom and intelligence. Wisdom was achieved by restoring balance.\n\nIn Norse Mythology, the God Odin is especially known for his wisdom, often acquired to most hardships and ordeals that involves pain and self-sacrifice. In one instance, he plucked out an eye and and offered to Mimir, the guardian of well of knowledge and wisdom, in return for a drink in the well.\n\nOdin hanged himself for nine nights from Yggdrasil, the World Tree that unites all the realms of existence, suffering from hunger and thirst, and finally wounding himself with a spear until he gained the knowledge of runes in casting powerful magic.\n\nSapience\n\nSapience is often defined as wisdom, or the ability of an organism or entity to act with appropriate judgment, a mental faculty which is a component of intelligence or alternatively an additional faculty with its own properties. The word Sapience is derived from the word ‘’sapientia’’ meaning wisdom. Related to this word is the latin verb ‘’sapere’’ which means to be wise, to taste and to know. \n\nIn Fantasy Fiction and Science Fiction., sapience describes an essential human property that bestows ’’pesonhood’’ onto non-human. The word ‘’sentience’’,’’self-awareness and ‘’consciousness’’ are used in similar ways in science fiction.";

        mChapterText.setText("Chapter Two");
        mTitleText.setText("Definition of Wisdom");

        SpannableString spannableOne = new SpannableString(pageContent);
        SpannableString spannableTwo = new SpannableString(pageContentTwo);

        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
               showSocratesImage();
            }
        };

        ClickableSpan clickableSpanTwo = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showPlatoImage();
            }
        };


        ClickableSpan clickableSpanThree = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getApplicationContext(), HewbrewBible.class);
                startActivity(intent);
            }
        };


        spannableTwo.setSpan(clickableSpanOne, 264,273, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableTwo.setSpan(clickableSpanTwo, 273,284, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableTwo.setSpan(clickableSpanThree, 792,806, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//hewbrebibile
        mContentText.setText(pageContent);
        mContentTextTwo.setText(spannableTwo);
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
        Intent intent = new Intent(getApplicationContext(), Homeubcv3chapter2.class);
        startActivity(intent);
        finish();
        if(view == findViewById(R.id.nextPageButton)){
            startActivity(new Intent(this, UbcvThreeChapterTwoQuizSS.class));
            Animatoo.animateFade(this);
            finish();
        }
    }

    @Override
    public void onBackPressed() {
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
        getMenuInflater().inflate(R.menu.ubcv_three_chapter_two, menu);
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
            youTubePlayer.cueVideo("fCCb10yBduA");
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

    //image dialog popup
    public void showPlatoImage(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.plato);
        TextView textText = new TextView(this);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    //image dialog popup
    public void showSocratesImage(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.socrates);
        TextView textText = new TextView(this);

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
