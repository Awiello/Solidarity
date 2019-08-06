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
import com.furiouskitten.amiel.solidarity.BookContents.VIDEOS.GodMadeMe;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV2QUIZ.UbcvTwoChapterOneQuizSS;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV2QUIZ.UbcvTwoChapterTwoQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV2QUIZ.Homeubcv2chapter1;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvTwoChapterOne extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener , YouTubePlayer.OnInitializedListener, YouTubePlayer.PlayerStateChangeListener, YouTubePlayer.PlaybackEventListener {

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
        setContentView(R.layout.activity_ubcv_two_chapter_one);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Lesson 1: God Made Me");


        //Firebase auth
        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();



        //FULL PAGE CONTENT

        //Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/PalatinoLinotype.ttf");

        mChapterText = findViewById(R.id.ChapterText);
        mTitleText = findViewById(R.id.TitleText);
        mContentText = findViewById(R.id.ContentText);
        mContentTextTwo = findViewById(R.id.ContentTextTwo);
        mContentTextThree = findViewById(R.id.ContentTextThree);
        mContentTextFour = findViewById(R.id.ContentTextThree);
        mScrolScrollView = findViewById(R.id.scrollScrollView);
        mNextPageButton = findViewById(R.id.nextPageButton);



        //Page Content
        String pageContent = "Objectives: At the end of this lesson, the students should be able to:\n \n 1. Give some characteristics or traits that describe an individual.\n \n 2. Discuss the nature of man and their origin.\n \n 3. Explain what it meant to be created in the likeness and image of God. \n \n 4. Determine God's purpose in creating man.\n \n ";
        String pageContentTwo =
"God Made Us There are several and in fact many theories and ideas about the origin of man. Where did we come from? Are we a product of spontaneous generation or evolution? Well, the Bible account is very simple. At the creative command of God, the heaven and the earth, the sea, and all that is in them (Exodus 20:11) appeared instantly. A mere six days saw the change from without form, and void to a lush planet teeming with fully mature creatures and plant forms. ";
        String pageContentThree = "Our planet was adorned with clear, pure, bright colors, shapes, and fragrances, put together with superb taste and exactness of detail and function. How about you and me, how are we created and formed? Genesis 1:27 as God made man in His own image; in the image of God He created him; male and female He created them. God saw everything he had created and indeed it was very good (Gen. 1:31) \n \n \n A. I am special in God. God made my design special. \n \n God created us and the world around us. We humans have been created according to God's likeness. We are valuable be-cause God has created us in His image. God has designed man uniquely and intricately. God made man as the best among all His creations. He made man so special because He had a special purpose for them. \n B. I am made in God's image. \n \n ✓ God's image is in every man and woman \n \n C. My God is interested with me  \n\n✓ God's plan is manifested in every human being.\n\n✓ God's best plan to mankind. \n\n✓ God's special purpose in creating mankind. \n\n✓ God's fellowship and deep friendship with us- — He made us so that we could enjoy fellowship with Him. \n\n✓ God's LOVE unto us- He made us to love and receive love. God's Will- He made us to fulfill His divine will. \n\n✓ God has the best plan for mankind. \n\n✓ God specifically chosen mankind to take care of all His creation.";
        String pageContentFour = " The God of Creation, The Bible's creation account begins with God and moves to human beings. It implies that in creating the heavens and the earth God was preparing the perfect environment for the human race. Mankind,  male and female, was His glorious masterpiece. The account reveals God as a careful planner with a concern for His creation. He planted a special garden home for them and gave them the responsibility of cultivating it. \n\n He created human beings so that they could have a relationship with Him. This was not to be a forced, unnatural relationship; He created them with freedom of choice and a capacity to love and serve Him. In his book The Purpose Driven Life, Rick Warren said, \"You were made by God and for God — and until you understand that, life will never make sense. It is only in God that we discover our origin, our identity, our meaning, our purpose, our significance, and our destiny. \n\n Every other path leads to a dead end.\" We were made for God, not vice versa, and life is about letting God use us for His purpose, not us using Him for our own purpose. To discover your purpose in life you must turn to God's word, not the world's wisdom. We can discover that meaning and purpose only when we make God the reference point of our lives.\n\nThe poem by Russel Keifer sums it up: You are who are you for a reason. You're part of an intricate plan. You're a precious and perfect unique design, Called God's special woman or man. You look like you look for a reason. Our God made no mistake. He knit you together within the womb, You're just what wanted to make. \n\n  The parents you had were the ones he chose, And no matter how you may feel, They were custom-designed with God's plan in mind, And they bear the Master's seal. No, that trauma you faced was not easy. And God wept that it hurt you so; But it was allowed to shape your heart So that into His likeness you'd grow. You are who you are for a reason, You've been formed by the Master's rod. You are who you are, beloved, because there is a God!";

        mScrolScrollView.requestDisallowInterceptTouchEvent(true);

        mChapterText.setText("Lesson 1");
        mTitleText.setText("God Made Me");

        SpannableString spannableOne = new SpannableString(pageContent);
        SpannableString spannableTwo = new SpannableString(pageContentTwo);

        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getApplicationContext(), GodMadeMe.class);
                startActivity(intent);
            }
        };

        spannableTwo.setSpan(clickableSpanOne, 211,241, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        mContentText.setText(pageContent);
        mContentTextTwo.setText(spannableTwo);
        mContentTextThree.setText(pageContentThree);
        mContentTextFour.setText(pageContentFour);

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
            startActivity(new Intent(this, Homeubcv2chapter1.class));
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
        getMenuInflater().inflate(R.menu.ubcv_two_chapter_one, menu);
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



    //Youtube Fragment properties

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

        youTubePlayer.setPlayerStateChangeListener(this);
        youTubePlayer.setPlaybackEventListener(this);

        if (!b){
            youTubePlayer.cueVideo("76h3kcmkO5s");
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
