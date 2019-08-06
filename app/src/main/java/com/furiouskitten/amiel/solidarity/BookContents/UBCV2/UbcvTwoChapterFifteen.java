package com.furiouskitten.amiel.solidarity.BookContents.UBCV2;

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
import com.furiouskitten.amiel.solidarity.Activities.UbcvTwoChaptersActivity;
import com.furiouskitten.amiel.solidarity.Authentication.LoginActivity;
import com.furiouskitten.amiel.solidarity.BookContents.VIDEOS.FormsOfPrayer;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV2QUIZ.UbcvTwoChapterFifteenQuizSS;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV2QUIZ.UbcvTwoChapterTwoQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV2QUIZ.Homeubcv2chapter15;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvTwoChapterFifteen extends AppCompatActivity
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
        setContentView(R.layout.activity_ubcv_two_chapter_fifteen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter 6: Communicating with God");

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
"Objectives: At the end of this lesson, the students should be able to:\n\n 1. Discuss the importance of maintaining good communication.\n\n  2. Identify the different forms of prayer.\n\n3. Differentiate the way we communicate with God and with our fellows.\n\n4. Explain the importance of prayer.\n\n Communicating with God In today's society, two or more people can interact, discuss, and respond to one another through cell phones, face book and other de-vices. Communication means dialogue. But how do people commu-nicate with God? In our life, though we cannot see God, we can feel Him and He wants us to talk with Him through PRAYER.\n\n  Prayer is a form of religious practice that seeks to activate a voli-tional rapport to a deity through deliberate practice. Prayer may be either individual or communal and take place in public or in private. It may involve the use of words or song. When language is used, prayer may take the form of a hymn, incantation, formal creed, or a spontane-ous utterance in the praying person. \n\nThere are different forms of prayer such as:\n\n• petitionary  prayer,\n\n • prayers of supplication,\n\n • thanksgiving,\n\n• and worship/praise.\n\nPrayer may be directed towards a deity, spirit, deceased person, or lofty idea, for the purpose of worshipping, requesting guidance, re-questing assistance, confessing sins or to express one's thoughts and emotions. Thus, people pray for many reasons such as personal benefit or for the sake of others. Most major religions involve prayer in one way or another. \n\nSome ritualize the act of prayer, requiring a strict sequence of actions or placing a restriction on who is permitted to pray, while others teach that prayer may be practiced spontaneously by anyone at any time. Scientific studies regarding the use of prayer have mostly concen-trated on its effect on the healing of sick or injured people. \n\nThe efficacy of petition in prayer for physical healing to a deity has been evaluated in numerous studies, with contradictory results. There has been some criticism of the way the studies were conducted. Forms of Prayer varies spiritual traditions offer a wide variety of devotional acts. There are morning and evening prayers, graces said over meals, and reverent physical gestures.\n\nSome Christians bow their heads and fold their hands. Some Native Americans regard dancing as a form of prayer, some Sufis whirl, Hindus chant mantras while Orthodox Jews sway their bodies back and forth, plus at some point of prayer all Jewish communities partially kneel and bow their bodies and Salah for Muslims (\"kneel and prostrate as seen on the right\"). ";
        String pageContentTwo = "Quakers keep silent. Some pray according to standardized rituals and liturgies, while others prefer extemporaneous prayers. Still others combine the two. These methods show a variety of understandings to prayer, which are led by underlying beliefs. \n\nThese beliefs may be that:\n\n 1.the finite can communicate with the infinite.\n\n2.the infinite is interested in communicating with the finite. \n\n3.prayer is intended to inculcate certain attitudes in the one who prays, rather than to influence the recipient\n\n4.prayer is intended to train a person to focus on the recipient through philosophy and intellectual contemplation. \n\n5.prayer is intended to enable a person to gain a direct experience of the recipient.\n\n 6.prayer is intended to affect the very fabric of reality as we perceive it.\n\n7.prayer is a catalyst for change in oneself and/or one's circum stances, or likewise those of third party beneficiaries\n\n8.the recipient desires and appreciates prayer\n\n9.or any combination of these.\n\nThe Act of Worship Prayer has many different forms. Prayer may be done privately and individually, or it may be done corporately in the presence of fellow believers. Prayer can be incorporated into a daily \"thought life\", in which one is in constant communication with a god. Some people pray ted ine throughout all that is happening during the day and seek guidance as soril the day progresses. \n\nThis is actually regarded as a requirement in several Christian denominations, although enforcement is not possible or desirable. There can be many different answers to prayer, just as there are many ways to interpret an answer to a question, if there in fact comes an answer. Some may experience audible, physical, or mental epiphanies. If indeed an answer comes, the time and place it comes is considered random. Some outward acts that sometimes accompany prayer are:\n\n • anointing with oil;\n\n • ringing a bell; \n\n• burning incense or paper;\n\n• lighting a candle or candles; \n\n• facing a specific direction (i.e. towards Mecca or the East); • making the sign of the cross;\n\n • one less noticeable act related to prayer is fasting. A variety of body postures may be assumed, often with specific meaning (mainly respect or adoration) associated with them: stand-ing; sitting; kneeling; prostrate on the floor; eyes opened; eyes closed; hands folded or clasped; hands upraised; holding hands with others; a laying on of hands and others. Prayers may be recited from memory, read from a book of prayers, or composed spontaneously as they are prayed. They may be said, chanted, or sung. \n\nThey may be with musi-cal accompaniment or not. There may be a time of outward silence while prayers are offered mentally. Often, there are prayers to fit spe-cific occasions, such as the blessing of a meal, the birth or death of a loved one, other significant events in the life of a believer, or days of the year that have special religious significance.\n\n Details corresponding to specific traditions are outlined below. Understanding Prayer • Mean your prayer- pray with utmost respect since we're talking to God. Do not just utter meaningless words.• Pray in private — Matthew 6:6. Silent prayer is the language of the soul in need of God. The Lord communes in silence, we can speak to Him in humble, silent spirit.\n\n • A listening God — God can be our friend. He listens to us and wants us to tell Him our concerns. He listens and ready to carry our burdens. When praying, we experience the op-portunity to be heard by God. It is the key that unlocks heaven's storehouse. \n\n• Prayer lets you speak to God; meditation lets God speak to you. Both are essential to becoming a friend of God. \n\n• Prayer is the breath of the soul. It is the secret of spiritual power. No other means of grace can be substituted and the health of the soul be preserved.\n\n • Prayer brings the heart into immediate contact with the Wellspring of life, and strengthens the sinew and muscle of the religious experience. \n\n• Pray often to your heavenly Father. The oftener you engage in prayer, the closer your soul will be drawn into a sacred nearness to God. \n\n• Prayer is not a spare tire we pull when we feel our life has gone flat. It is a steering wheel that helps us direct our life in the right path.\n\n• Be not discouraged if your prayers do not seem to obtain an immediate answer. When we come to God, we must be submissive and contrite of heart, subordinating everything to His sacred will. \n\n• The prayer of faith is the key that unlocks the treasury of heaven. As we commit our souls to God, let us remember that He holds Himself responsible to hear and answer our supplications. When you pray, trust in His wisdom and His power.";

        mChapterText.setText("Lesson 6");
        mTitleText.setText("Communicating with God");

        SpannableString spannableOne = new SpannableString(pageContent);
        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getApplicationContext(), FormsOfPrayer.class);
                startActivity(intent);
            }
        };


        spannableOne.setSpan(clickableSpanOne, 152,177, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        //spannableTwo.setSpan(clickableSpanTwo, 143, 150, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        mContentText.setText(spannableOne);
        mContentTextTwo.setText(pageContentTwo);
        mContentText.setMovementMethod(LinkMovementMethod.getInstance());



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
            startActivity(new Intent(this, Homeubcv2chapter15.class));
            Animatoo.animateFade(this);
            finish();
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), UbcvTwoChaptersActivity.class);
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
        getMenuInflater().inflate(R.menu.ubcv_two_chapter_fifteen, menu);
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
            youTubePlayer.cueVideo("y8tHh0U5n2Q");
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
