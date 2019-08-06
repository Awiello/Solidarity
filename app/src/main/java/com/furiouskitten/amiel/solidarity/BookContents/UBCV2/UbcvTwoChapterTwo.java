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
import com.furiouskitten.amiel.solidarity.BookContents.VIDEOS.GodsNature;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV2QUIZ.UbcvTwoChapterTwoQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV2QUIZ.Homeubcv2chapter2;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvTwoChapterTwo extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener , YouTubePlayer.OnInitializedListener, YouTubePlayer.PlayerStateChangeListener, YouTubePlayer.PlaybackEventListener  {

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
        setContentView(R.layout.activity_ubcv_two_chapter_two);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter 2: Who is God?");


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
"Objectives: At the end of this lesson, the students should be able to:\n\n1.Share his/her own idea about God's nature.\n\n2. Identify the nature, characteristics, attributes and qualities of God Christians believe in.\n \n3. Make a reflection on God's nature. \n \nWho is God? The many theories attempting to explain God, and the many arguments for and against His existence, show that human wisdom can-not penetrate the divine. Depending on human wisdom alone to learn about God is like using a magnifying glass to study the constellations. Hence, to many, God's wisdom is a \"hidden wisdom\".\n\nTo them God is a mystery. Paul wrote, \"None of the rulers of this new age knew; for of had they crucified the Lord glory\" (1 Cyr. 2:8). One of the basic commandments of Scripture is to love \"God with all your heart, with all your soul, and with all your mind' (Matt. 22:37; Deut. 6:5). We cannot love someone we know nothing about, yet we cannot by searching find out the deep things of God (Job 11:7). How then can we come to know and love the Creator? soon reached out to us through His word — the Bible. It reveals that realizing the human predicament, God, in His love and compassion, God be known? Christianity is not a record of a man's quest for God; it is the product of God's revelation of Himself and His purposes to man.\n\nThis self-revelation is designed to bridge the gulf between a rebellious world and a caring God. Of course the greatest manifestation of God's love came through His supreme revelation, Jesus Christ, His son. Through Jesus Christ we can know the Father. As John states, \"The Son of God has come and has given us an understanding, that may know Him who is true\" (I John 5:20). And Jesus said, \"This is eternal life, that they may know You, the only true God, and Jesus Christ whom you have sent' (John 17:3). This is good news.\n\n Although it is impossible to know God com-pletely, the Scriptures afford a practical knowledge of Him that is sufficient for us to enter into a saving relationship with Him. What about God's nature? What do you mean by it? God's \"nature\" means His characteristics, His attributes, His qualities. \"What is the nature of the God Christians believe in? What are His characteristics, His attributes, His qualities? What is He like? Christianity claims that the God of all things is unique in that He alone has the following divine characteristics (in no particular order).";
        String pageContentTwo = "1. SUPREMACY. The God of Judaism and Christianity is the Supreme Being. He is not merely a different type of being or a superior being but the Supreme Being.\n\n2. UNIQUENESS. God is unique. The Bible describes Him in Greek as monogenesis, i.e., one of a kind,having a unique nature.\n\n3. ETERNALNESS. He always has existed and always will exist. He had no beginning and will never cease to exist.\n\n4. OMNISCIENCE. He knows all things.\n\n5. OMNIPOTENCE. He is all powerful.\n\n7. SELF-EXISTENT. God is the only thing that had no beginning that was not created by something else.\n\n8. HOLINESS. Holy means pure, undefiled.\n\n9. TRIUNE NATURE. The one God is a single \"trinity\" consisting of three distinct \"persons\": (Note: not all Christian believe on this doctrine).\n\na. FATHER\n\nb. JESUS - often referred to as the Son or the ''Word of God''\n\nc. THE HOLY SPIRIT\n\n10. THEISTIC. Deistic and theistic are adjectives from the field of comparative religion. They describe the relationship between a god and that which it creates. A deistic god is one that would distance itself from that which it creates, one that would not get involved in the activities of the things it created. A deistic god would essentially be an ''absentee father'' god — it would create a uni-verse and then sit back and says ''I made you, but I don't want to get involved. You're on your own!'' The God of the Bible is theistic. He does not distance Himself from that which He creates. He gets actively involved in the activities of the things He created. In fact, the God of the Bible `micromanages' things.\n\n12. ALIVE. The one God is a living being.\n\n13. PERSONAL. God is a living person with thoughts, reactions, etc., not an impersonal thing.\n\n14. SPIRIT. A spirit is a living being that is incorporeal, i.e., it does not possess a physical body. Note that Jesus took on a physical human body. It is not an inherent part of His nature. By comparison, our bodies are part of our human nature but we put on clothes.\n\n15. INTELLIGENCE. He knows everything.\n\n16. SENTIENCE. A sentient being has intelligence, and also is aware of its own existence, and aware that there is a 'big picture'. For instance, cats, dogs, and horses have intelligence but probably are not sentient.\n\n 17. IMMORTAL. God is a being that will live forever. Note the technical difference between eternalness and immortality: God is eternal because had He had no beginning. He also is immortal because He will live forever. Humans, angels, demon, etc., are immortal because we will never cease to exists, but not eternal because we did not always exist. It is important to realize that in practice eternal and immortal are ways maintained. Often used interchangeably and the technical difference is not at-\n\n18. SEPARATE. God is separate from that which He created. The universe itself is not God. (The opposite is pantheism. Some \"nature\" religions believe that the universe itself is god.)";


        mChapterText.setText("Lesson 2");
        mTitleText.setText("Who is God?");

        SpannableString spannableOne = new SpannableString(pageContent);
        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getApplicationContext(), GodsNature.class);
                startActivity(intent);
            }
        };

        ClickableSpan clickableSpanTwo = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getApplicationContext(), GodsNature.class);
                startActivity(intent);
            }
        };


        spannableOne.setSpan(clickableSpanOne, 239,252, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);// god's nature
        spannableOne.setSpan(clickableSpanTwo, 277, 311, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //theory about god
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
            startActivity(new Intent(this, Homeubcv2chapter2.class));
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
        getMenuInflater().inflate(R.menu.ubcv_two_chapter_two, menu);
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
            youTubePlayer.cueVideo("ihnOkBC99RY");
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
