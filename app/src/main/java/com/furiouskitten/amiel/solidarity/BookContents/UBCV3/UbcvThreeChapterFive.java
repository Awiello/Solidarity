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
import com.furiouskitten.amiel.solidarity.Activities.UbcvTwoChaptersActivity;
import com.furiouskitten.amiel.solidarity.Authentication.LoginActivity;
import com.furiouskitten.amiel.solidarity.BookContents.VIDEOS.GoodStudyHabits;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV2QUIZ.UbcvTwoChapterTwoQuizSS;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV3QUIZ.UbcvThreeChapterFiveQuizSS;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV3QUIZ.UbcvThreeChapterTwoQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV3QUIZ.Homeubcv3chapter5;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvThreeChapterFive extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{


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
        setContentView(R.layout.activity_ubcv_three_chapter_five);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter 5: Good Study Habits");

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
"Abstraction\nYou can prepare yourself to succeed on your studies. Try to develop and appreciate these following habits:\n\n • Take responsibility on yourself recognize that in order to succeed, you need to make decisions about your priorities, time and resources.\n\n • Centre yourself around your values and principles. Don’t let friends and acquaintances dictate what you consider important.\n\n • Put first things first on priorities you have set for yourself, and don’t let others or other interests, distract you from your goals.\n\n • Discover your key productivity periods and places. Find spaces where you are most productive. \n\n • Consider yourself in a win-win situation. When you contribute your best to a class, you and your fellow students will benefit, your teacher as well. • First understand others then try to be understood. \n\n • Look for a better solution to the problem. \n\n • Look to continually challenge yourself.";
        String pageContentTwo = "Good study habits \n\n It will help you in your college career to develop good study habits. The first thing you need to do is take responsibility for your actions. You are the only one who can describe your priorities and how you use your time and resources. \n\n Don’t allow yourself to become distracted by friends and fellow students. Keep in mind the bigger picture. Know what you have to do and when it needs to be done. Keep your goals in mind. When you put your best efforts in your work, then you have succeeded. If you are satisfied whit what you do and know you have done your best, then your grade is the icing on the cake. \n\n Time Management \n\n Developing time management skills is a journey that may begin with this guide, but needs practice and guidance along the way. One goal is to help you become aware of how you use your time as one resource in organizing priorities and succeeding on your work. \n\n Cooperative and Collaborative Learning \n\n Cooperative and Collaborative learning is a team process where members support and rely each other to achieve on agreed-upon goal. The classroom is an excellent place to develop team-building skills you will need later in life. \n\n Motivating yourself \n\n As we begin to get expectations we created by our own families, school and environment. The motivation of our early years can go shift from personal goals or pleasing others and desire to learn suffers. Take the control and responsibility for your learning and accept risks with confidence, competence and autonomy.";

        mChapterText.setText("Chapter Five");
        mTitleText.setText("Good Study Habits");


        SpannableString spannableOne = new SpannableString(pageContent);
        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getApplicationContext(), GoodStudyHabits.class);
                startActivity(intent);
            }
        };

        SpannableString spannableTwo = new SpannableString(pageContentTwo);
        ClickableSpan clickableSpanTwo = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showJapaneseKempeitaiImage();
            }
        };

        spannableOne.setSpan(clickableSpanOne, 94,116, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); // good study habits
        //spannableTwo.setSpan(clickableSpanTwo, 143, 150, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //
        mContentText.setText(spannableOne);
        mContentTextTwo.setText(spannableTwo);
        mContentText.setMovementMethod(LinkMovementMethod.getInstance());



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //implement firebase
        updateNavHeader();
    }

    public void transiBtn(View view){
        if(view == findViewById(R.id.nextPageButton)){
            startActivity(new Intent(this, Homeubcv3chapter5.class));
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
        getMenuInflater().inflate(R.menu.ubcv_three_chapter_five, menu);
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
