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
import com.furiouskitten.amiel.solidarity.BookContents.VIDEOS.DomainsOfLearning;
import com.furiouskitten.amiel.solidarity.BookContents.VIDEOS.LawsOfLearning;
import com.furiouskitten.amiel.solidarity.BookContents.VIDEOS.LearningVideo;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV3QUIZ.UbcvThreeChapterFiveQuizSS;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV3QUIZ.UbcvThreeChapterThreeQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV3QUIZ.Homeubcv3chapter3;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV3QUIZ.Homeubcv3chapter5;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvThreeChapterThree extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, YouTubePlayer.OnInitializedListener, YouTubePlayer.PlayerStateChangeListener, YouTubePlayer.PlaybackEventListener    {

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
        setContentView(R.layout.activity_ubcv_three_chapter_three);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter 3: Principles of Learning and Thinking");

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
"Abstraction\n\nWhat is Learning?\n\nFrom Wikipedia, the free encyclopedia Learning is acquiring new or modifying existing knowledge, behaviors, skills, values, or preferences and may involve synthesizing different types of information. The ability to learn is possesed by humans, animals and some machines.Progress over time tends to follow learning curves.\n\nNon-Associative Learning\n\nHabituation\nHabituation is an example of non-associative learning in which there are progressive dimunition of behavioral response probability with repetition stimulus. but if it is not rewarding or harmful, the animal reduces subsequent responses. Habituation has been showeed essentially every species of animal including the large protzoan ''Stentor Coeruleus''\n\nSensitization\nSentisization is an example of of non-associative learning in which progressive amplifiation of a response follows repeated administrations of a stimulus. An everyday example is is the repeated tonic stimulation of peripheral nerves that will occur as a person rubs his arms continuously. After a while, this the stimulation will create a warm sensation and eventually turn painful. Sensitization is thought to underlie botha adaptve and maladaptive learning process in the organism.\n\nAssociative learning\nAssociative learning is the process by which an element is taught through association with a separate, pre-occurring element. It is also referred to as classical conditioning.\n\nOperant Conditioning\nOperant Conditioning is is the use of consequences to modify the occurrence and form of behavior. This conditioning uses reinforcement or punishment to alter action-outcome association.\n\n Behaviourism\n It is a psychological movement that seeks alter behaviour by arranging environments ot elicit successful changes and to arrange consequences to maintain or diminish a behaviour. Behaviourist study behaviours that can be measured and changed by the environment. However they do not eliminate that there are thought process that interact with those behaviours.\n\n Classical Conditioning\n\n The typical paradigm for classical conditioning involves pairing of unconditioned stimulus with another previously neutral stimulus, Following conditioning, the response occurs both to the unconditioned and to the unrelated stimulus.\n\n Imprinting\n It is the term used in psychology and entology to describe any kinds of phase-sensitive learning that is rapid and apparently independent of the consequences of the behaviour. It was first described situations in which an animal learns the characteristics of some stimulus.\n\nObservational Learning\nThe learning process most characteristics of humans is immitation; ones personal repetition of an observed behaviour, such as dance. Humans can copy three types of information simultaneously: the demonstrator's goals, actions and environmental outcomes.";
        String pageContentTwo =
"Play\nit generally describes behaviour which has no particular end in itself, but improves performance in similar situations in the future. This is seen in wide variety of vertebrates besides humans but mostly limited to mamals and birds.\n\n Enculturation\n Process by which a person learns the requirements of their native culture by which he or she is surrounded and acquires values and behaviours that are appropriate and necessary in the culture.\n\n Multimeda Learning \n This is a learning where a person uses auditory and visual stimuli to learn information.\n\n E-learning\n Electronic learning or E-Learning is a general term used to refer to internet-based network or computer-enhanced learning. A specific and more diffused is mobile learning, which uses different mobile communication equipments such as smartphones.\n\n Rote Learning\nTechnique which avoids understanding the inner complexities and inferences the subject that is being learned and instead focuses on memorizing the material so it can be easily recognized or remembered. Rote learning is used in diverse areas, from mathematics to music, to religion. Although it has been criticized in some schools, Rote learning is a necessity in some schools.\n\n Formal Learning\nFormal learning takes place within a teacher and a student, such as in school system. \n\n Non-formal Learning\n Non-formal learning is is an organized learning outside formal learning system.\n\n Tangential Learning\n A process by which people will self-educate if the topic is exposed to them in the context that they enjoy.\n\n Dialogic Learning\nIt is a type of learning based on reading and understandng dialogues.\n\n Domains of Learning:\n\n• Cognitive - To recall, calculate, discuss, analyze, problem solve. etc...\n\n • Psychomotor - To dance, swim, ski, dive, drive a car, ride a bike. etc...\n\n Affective - To like someone or something, love, fear etc...\n\n Laws of Learning \n\n Readiness \n\n Readiness implies a degree of single-mindedness and eagerness. A child is being prepared to write by purpose, a clear objective, and a definite reason for learning something, they make more progress than if they lack motivation. \n\n Excercise \n\n Things often repeated are best remembered. It has been proven that students learn best and retain information longer where the have meaningful practice and repetition. The key here is that the practice must be meaningful. \n\n Effect \n\n the principle of effect is based on the emotional reaction of the student. It has direct relationship to motivation. The principle of effect is that learning is strengthen when accompanied with pleasant or satisfying meaning. \n\n Primacy\n\nPrimacy, the state of being first, often creates a strong, almost unshakable, impression. The student's first experience should be positive, functional, and lay the foundation for all that is to follow.\n\n Recency \n\n The principle of Recency is the most recently learned is best remembered. Conversely, the further the student is removed, time-wise for a new fact or understanding, the most difficult for it to remember.\n\n Intensity \n\n The most intense the material taught, is the most likely will be retained. A sharp, clear, vivid, dramatic or exciting learning teaches more than a routine or boring experience.\n\n Principles of Critical Thinking \n\n • Knowledge is acquired only through thinking, reasoning and thinking. Knowledge is based on facts.\n • It is only from learning how to think that you learn what to think.\n\n • Critical thinking is organized and systematic process used to judge the effectiveness of an argument. \n\n • Critical meaning is search for meaning. \n\n • Critical thinking is a skill that can be learned.";

        mChapterText.setText("Chapter Three");
        mTitleText.setText("Principles of Learning and Thinking");


        SpannableString spannableOne = new SpannableString(pageContent);
        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getApplicationContext(), LearningVideo.class);
                startActivity(intent);
            }
        };

        SpannableString spannableTwo = new SpannableString(pageContentTwo);
        ClickableSpan clickableSpanTwo = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getApplicationContext(), LearningVideo.class);
                startActivity(intent);
            }
        };

        ClickableSpan clickableSpanThree = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getApplicationContext(), DomainsOfLearning.class);
                startActivity(intent);
            }
        };

        ClickableSpan clickableSpanFour = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getApplicationContext(), LawsOfLearning.class);
                startActivity(intent);
            }
        };

        spannableOne.setSpan(clickableSpanOne, 70,78, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //learning vid
        //spannableTwo.setSpan(clickableSpanTwo, 0, 3, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //example of play vid
        spannableTwo.setSpan(clickableSpanThree, 1646, 1662, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //Domains of learning
        spannableTwo.setSpan(clickableSpanFour, 3250, 3281, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //Laws of learning
        mContentText.setText(spannableOne);
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
        if(view == findViewById(R.id.nextPageButton)){
            startActivity(new Intent(this, Homeubcv3chapter3.class));
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
        getMenuInflater().inflate(R.menu.ubcv_three_chapter_three, menu);
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
            youTubePlayer.cueVideo("zRdY2Gy22ao");
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
