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
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV2QUIZ.UbcvTwoChapterFourteenQuizSS;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV2QUIZ.UbcvTwoChapterTwoQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV2QUIZ.Homeubcv2chapter14;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvTwoChapterFourteen extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, YouTubePlayer.OnInitializedListener, YouTubePlayer.PlayerStateChangeListener, YouTubePlayer.PlaybackEventListener  {

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
        setContentView(R.layout.activity_ubcv_two_chapter_fourteen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter 5: Faith in God");

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
"Objectives: At the end of this lesson, the students should be able to:\n\n 1. Discuss ways of nourishing our faith in God. \n\n 2. Analyze an essay about faith and its importance\n\n3. Site specific experiences that strengthen their faith in God.\n\n4. Show appreciation to God by respecting each other belief\n\n Faith in God is essential to human existence for it gives purpose and mean-ing to our life. As defined faith is a belief or trust, devotion to or trust in somebody or something especially without logical proof.\n\n In his letter to the Hebrew, Apostle Paul said, \" Now faith is being sure of what we hope for and certain of what we do not see\" (Heb. 11:1). Each individual should have faith whatever denomination he or she belongs. But of course the way we practice our faith is different from one another.";
        String pageContentTwo = "To achieve harmony and peace, we have to learn how to respect each other's faith. Our faith in God is bolstered by the evidence and grounded in a transformed life. However, the simplicity of our faith is summed-up best by the innocence of a pure heart. Here's an essay written by an eight-year-old... Faith in God - Through the Innocent Heart of a Child One of God's main jobs is making people. He makes them to re-place the ones that die, so there will be enough people to take care of things on earth.\n\nHe doesn't make grown-ups, just babies. I think be-cause they are smaller and easier to make. That way He doesn't have to take up His valuable time teaching them to talk and walk. He can just leave that to the mothers and fathers. God's second most important job is listening to prayers.\n\nAn awful lot of this goes on, since some people, like preachers and things, pray at times beside bedtime. God doesn't have time to listen to the radio or TV because of this. God sees everything and hears everything and is everywhere, which keeps Him pretty busy. So you shouldn't go wasting His time by going over your Mom and Dad's head asking for something they said you couldn't have.";

        mChapterText.setText("Lesson 5");
        mTitleText.setText("Faith in God");

        SpannableString spannableOne = new SpannableString(pageContent);
        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getApplicationContext(),NourishingFaith.class);
                startActivity(intent);
            }
        };

        spannableOne.setSpan(clickableSpanOne, 83,118, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
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
            startActivity(new Intent(this, Homeubcv2chapter14.class));
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
        getMenuInflater().inflate(R.menu.ubcv_two_chapter_fourteen, menu);
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
            youTubePlayer.cueVideo("CpTniEnWs-w");
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
