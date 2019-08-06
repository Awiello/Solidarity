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
import com.furiouskitten.amiel.solidarity.BookContents.VIDEOS.LifelongLearningCharacters;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV3QUIZ.UbcvThreeChapterFiveQuizSS;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV3QUIZ.UbcvThreeChapterSixQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV3QUIZ.Homeubcv3chapter6;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvThreeChapterSix extends AppCompatActivity
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
        setContentView(R.layout.activity_ubcv_three_chapter_six);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter 6: Lifelong Learning");

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
"Abstraction\n\nLifelong learning is the continuous building of skills and knowledge throughout life of an individual. It occurs through experiences encountered in the course of a lifetime. These experiences could be formal, or informal.\n\nCharacters of lifelong learning\n\nThe concept of lifelong learning spans a wide range of education and training issues and speaks to many different audiences. Common themes conveyed in literature on lifelong learning articulate four characteristics and which ’education and training’ into concepts of lifelong learning.\n\nInformal Learning\n\nFormal learning includes the structured school system that runs from primary programs created through the university and school-like programs in business for educational and professional training. Whereas informal learning describes a lifelong process whereby individuals acquire attitudes, values, skills and knowledge from daily experiences.\n\nSelf-Motivated Learning\n\nThere is a heavy need for individuals to take responsibility for their own learning. Lifelong learners are not defined by the type of education or learning which they are involved, but the personal characteristics that lead to such involvement. Personal characteristics of individuals who are most likely to participate in learning, either formally or informally have acquired: \n • The necessary skills and attitudes for learning especially literacy and numeracy skills\n • Confidence to learn, including a sense of engagement with the education and the training system.\n • Willingness to learn\n\nFactors motivating people to engage in Lifelong Learning:\n\n •To upgrade job skills.\n • To start a business\n • To learn about a subject\n • To meet new people\n • To develop self-confidence\n • To get involved in the community\n •To develop personal skills\n • To participate in social networking\n\n";
        String pageContentTwo = "Self-funded learning\n\nSelf-funded learning is the third characteristic of lifelong learning. In recognition of the cost involved in subsidizing the lifelong involvement on education and training. The lifelong learning policy agenda emphasizes the responsibility of individual to finance to their continual education and training with minimal support from the government. \n\nUniversal Participation \n\nThe fourth distinctive feature of the lifelong learning policy literature is a commitment to universal participation in education and training. The concept of universal participation of includes both formal and informal for all purposes – social economic and personal. The Delors report proposes four characteristics of lifelong learners that would be the pillars of the learning societies:\n\n • Learning to do\n • Learning to be • \n • Learning to know \n •\tLearning to live together\n\nTraditional learning\n\n • The teacher is the source of knowledge\n\n • Learners receive knowledge from teachers\n\n • Learners work by themselves\n\n • Tests are given to prevent progress until students have completely mastered a set of skills and to ration access to further learning.\n\n • All learners to the same thing \n\n • Teachers receive initial training plus ad-hoc in-service training \n\n Lifelong Learning \n\n • Educators are guides the sources of knowledge \n • People learn by doing \n • People learn in groups and from each other\n • Assessment is used to guide learning strategies and to identify pathways for future learning\n • People have access to learning opportunities over a lifetime \n • Learning is put into practice \n •\tLearners reflect into learning and analyse personal development\n\nBenefits of lifelong learning\n\nA number of socio-economic forces are pushing for the lifelong learning approach. The increased pace of globalization and technological change, the changing nature of change in the labour market and the ageing population are the forces in emphasizing the need for continuing upgrading the work and life skills throughout life.\n\nTen Benefits of lifelong learning according to Nancy Merz Nordstrom, M.ed.\n\n • Lifelong learning fully develops natural abilities \n • Lifelong learning opens the mind\n • Lifelong learning creates a curious and a hungry mind \n • Lifelong learning increases our wisdom \n • Lifelong learning creates a better world \n • Lifelong learning helps us adapt to change \n • Lifelong learning helps us find meaning in our lives \n • Lifelong leaning keeps us involved as an active contributors to society \n • Lifelong learning helps us make new friends and establish valuable relationship \n • Lifelong learning leads to an enriching life and self-fulfilment";

        mChapterText.setText("Chapter Five");
        mTitleText.setText("Good Study Habits");


        SpannableString spannableOne = new SpannableString(pageContent);
        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getApplicationContext(), LifelongLearningCharacters.class);
                startActivity(intent);
            }
        };

        //SpannableString spannableTwo = new SpannableString(pageContent);


        spannableOne.setSpan(clickableSpanOne, 235,266, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
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
            startActivity(new Intent(this, Homeubcv3chapter6.class));
            Animatoo.animateFade(this);
            finish();
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), UbcvThreeChaptersActivity.class);
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
        getMenuInflater().inflate(R.menu.ubcv_three_chapter_six, menu);
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
            youTubePlayer.cueVideo("MJNCLkRxQBA");
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
