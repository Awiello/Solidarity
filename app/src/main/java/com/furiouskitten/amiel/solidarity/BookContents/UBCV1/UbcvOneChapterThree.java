package com.furiouskitten.amiel.solidarity.BookContents.UBCV1;

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
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
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
import com.furiouskitten.amiel.solidarity.Activities.UbcvOneChaptersActivity;
import com.furiouskitten.amiel.solidarity.Authentication.LoginActivity;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV1QUIZ.UbcvOneChapterFiveQuizSS;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV1QUIZ.UbcvOneChapterNineQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV1QUIZ.Homeubcv1chapter3;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvOneChapterThree extends AppCompatActivity
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
        setContentView(R.layout.activity_ubcv_one_chapter_three);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter Two: Great Expectations (1956-1965)");

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
"Mr. Juan Y. Javier and his trademark jeep at the forefront of the activities, the confidence on the usefulness of the i college not only n the community but even in the Bureau of Private Schools had become truly apparent. \n\nThe enrolment continued period. There was no change in the administration but in SY 1957-1958, a new set of staff was appointed followed by a change of officers of the Board of Trustees. Mr. Javier was re-elected president with Mrs. Flordeliza M. Arguelles as vice president and High School principal on a concurrent basis with Miss Vicente de J. Nacu as her assistant. Mrs. Aurora L. Velasquez served as secretary-registrar with Mrs. Gregoria Redublo and Miss Sonia L. Velasquez as cashier. The deanship of the existing colleges remained unchanged. Mrs. Adoracion R. Moraleja was designated principal of the Elementary department. \n\nThe first WPC Alumni Association founded in 1951 suffered a natural death like other organizations. President Javier, being an active leader called an assembly of alumni during the summer of 1952. The attendance was just perfect for the rebirth of the Alumni. Association and election of a new set of officers. Vicente Kalalo of San Jose, Batangas was unanimously elected President. Another tragic incident brought about by the untimely visit.\n\nMembers of the IV-A Class of 1951-1952 poses with Mrs. Flordeliza M. Arguelles and their adviser, Miss Nacu for a class picture. of the Angel of Death happened at around 4:00 to 5:00 in the morning of August 20, 1959 who claimed the earthly life of Dean Francisco G. Perez. Bokal Perez complained of severe stomach pains as a complication of a massive heart attack according to his doctor's diagnosis. \n\nThe Perez family wanted the funeral to be simple so as to assuage the anguish and pain of the sudden loss of a dearly beloved patriarch. The agony over the demise of another WPC founder was shared by friends, relatives, and the members of the WPC academe at his home where his mortal remains rested for three days. The grief-stricken family felt another loss with the news that the eldest son, Dr. Abelardo, who was then in New York as a resident physician specializing in EENT at the New York Polyclinic, would not be able to go home to pay his last respects to his Papa. The second son, Hernando, who was then a law student at the Ateneo de Manila University, took over the responsibilities of a father for and in behalf of his Kuya Beling.\n\nMrs. Flordeliza M. Arguelles regarded Atty. Francisco G. Perez as \"one of the dedicated leaders of the College—a champion of its integrity and progress who did not involve WPC in politics. His death left a void which was hard to fill.\" The Board of Trustees elected another set of officers of the administration. Mr. Juan Y. Javier retained the presidency with Mrs. Florcieliza M. Arguelles as re-elected vice president, Mrs. Auroral L. Velasquez also was retained treasurer with Miss Belen V. Perez, secretary, and Mrs. Mary Ruth Aceveda, member. Miss Erlinda Ilustre was designated principal of the Elementary department. \n\nNot to be outdone by the barristers, the accounting majors of the College of Commerce tried their luck in the Certified Public Accountants (CPA) examination. They performed very well in the first try with four passers out of five candidates and two out of three examinees in the second hit with passing scores in a very taxing and mind-boggling test. \n\nThe high ratings of passers at the bar and CPA examinations cemented the trust and confidence that the community had bestowed on the college. For this matter, the prestige earned by the college encouraged more and more enrollees to flock at the Western Philippine Colleges. For this reason, more buildings had to be added. In 1961, a P20,000 semi-permanent building was built for the Commerce department at the main downtown campus. The expansion paved the transfer of the Elementary department, formerly housed at the rented Knights of Columbus building, to the WPC campus on M.H. del Pilar Street.\n\nWith respect to military training, the Western Philippine Colleges in the late 1950s and early 1960s was always at the to Time and again, the WPC-ROTC as member of the noted Sword and Shield Fraternity, always garnered first place in the yearly competitor and had won many pennants of distinction. For a well-rounded training in leadership, the Supreme Student Council (SSC) was organized after gaining the approval of President Javier. The council became the avenue for the training of future politicians. It also served as the coordinating arm for student activities and participation in college affairs and finally, as a liaison between the administration and the student body.\n\nThe Board of Trustees likewise felt the demand and necessity of opening additional courses. The Secretarial department opened its doors in 1962 by offering the two-year Secretarial course leading to the title Associate in Commercial Secretarial Science (ACS). The department was not an independent entity but rather a part of the College of Commerce under Dean Atty. Eliseo Austria.With the expansion program due to the growth in school population was the hiring of new members of the faculty and key personnel. Atty. Pedro A. Tolentino was appointed dean of the College of Law (1960-1961), Miss Vicenta de J. Nacu, assistant Highe School principal (1960-1964); Miss Violeta Gertes, officer-in-chargt, of the Elementary department (1963-1965); and Miss Crispin; Manalo, successor of cashier Sonia L. Velasquez until her retirement - in 1963. \n\nThe WPC publication \"Westernian Advocate\" founded by Pedro Tolentino in the early 1950s showed signs of neglect due to lack of qualified news writers. Pedro Castillo, a student assistant and librarian of the Law library came to the rescue and reactivated the school.\n\nThe fame and popularity of Western Philippine Colleges spread not only to far-flung towns of Batangas but also to other provinces. However, the beautiful scenario was marred by the news that President Javier was very ill and was confined at the De Los Santos General Hospital in Manila. The Board of Trustees visited him in the hospital but barely three days after the visit, the sad news of the passing away of the principal founder was received on January 12, 1964 at the college he loved most. On the campus of the Western Philippine Colleges was cast a thick pall of gloom. His remains were brought to the big room of the new Commerce building for the three-day wake.\n\nIt was a mournful event that gave the students, the faculty, the staff, and the alumni the time to pay their last respects to a man respected and loved by the whole population of the WPC. In the eulogy before his funeral, President Javier was cited as \"a true and dynamic leader who exuded charisma, kindness, understanding, and generosity, and above all, an ambitious administrator.\" His sudden demise was a great loss to WPC that was slowly surviving the tests of time. Juan A. Javier, Jr., his only son, temporarily took over the reins of leadership so as to fill the vacuum until such time that the next set of officers had been elected.";
        String pageContentTwo =
"When the WPC became a stock corporation, subscriptions of shares were opened to those who were interested in the educational venture. In the same manner, some of the original founders sold a portion of their shares to new shareholders, which provided them with slots for membership in the Board of Trustees. A change was introduced in the composition of the Board in 1964-1965. An Executive Committee chairmanned by Atty. Manuel Panganiban was created with Dr. Abelardo B. Perez as vice chairman., Mrs. Aurora Velasquez as treasurer; Ms. Belen V. Perez as secretary; and Mr. Juanito Limbo as auditor. No president was elected so that all policies were implemented by the Executive Committee.\n\nThe Board of Trustees was still the source of all policies but its composition was increased. The Board was composed of the five officers of the Executive Committee plus 10 members namely: Mrs. Flordeliza M. Arguelles, Mrs. Josefina V. Javier, Mrs. Ofelia ). Hernandez, Miss Rizalina V. Javier, Mrs. Conrada B. Perez, Mrs. Mary Ruth Aceveda, Dr. Severina I. Orosa, Mr. Juanito V. Javier Jr., Dr. Emiliano Aquino, and Atty. Juan V. Ramos.\n\nAt this time, the enrolment hit a new high with the High School department leading the increase; followed by the Education-Normal department and the Commerce department. It was but natural that the increase in enrolment had a corresponding rise of enrollees in the ROTC course. The young ladies who wanted to join the military after graduation from high school enrolled in the newly-organized Women's Auxiliary Service (WAS). The WPC-ROTC unit had a tie-up with Rizal Colleges but it was considered as an independent unit. \n\nNew appointments came about because of the growth of student population. Mrs. Remedios L. Cilindro was appointed dean of the College of Education-Normal (1964-1973). Soon after her appointment, the first three (3) years of the Bachelor of Elementary Education (BEED) curriculum was approved by the Bureau of Private Schools. Likewise, Mr. Petronilo Rosel took over as High School principal from vice president Mrs. Flordeliza M. Arguelles\n\nNew appointments came about because of the growth of student population. Mrs. Remedios L. Cilindro was appointed dean of the College of Education-Normal (1964-1973). Soon after her appointment, the first three (3) years of the Bachelor of Elementary Education (BEED) curriculum was approved by the Bureau of Private Schools. Likewise, Mr. Petronilo Rosel took over as High School principal from vice president Mrs. Flordeliza M. Arguelles (1964-1987). ). Mr. Domingo Ramirez was also appointed dean of High School boys to assist the principal in adolescent discipline. He was tasked to pay particular attention to good behavior, courtesy, proper dress code and regular class attendance. In the same vein, the collegiate students proved to be active leaders when they managed the election for the Collegiate Student Council. During the said electionu, Atty. Florencio de Loyola acted as The said activity was very successful as the students were able to practice the principles of democracy. They also proved themselves true leaders as they practiced a clean and honest election sans vote-grabbing and vote-buying. Graciano Benedicto of the AB department lorded it over as first president.\n\n Other organizations were born like the Westernian Press Club with \"The Courier\" as official organ. The Student Teachers' Literary Club produced and presented radio plays through the leadership of its president Alejandro Esmiller. The Student Catholic Action was deeply involved in church and religious activities. With the strong desire for supremacy in the academe, the WPC athletes joined the Private Schools Athletic Association (PRISAA with five entries in sports competition and won the major awards. In the individual contests, Pacifico Pasno competed in bantam weightlifting and brought home the title \"Junior Mr. Philippines. Through its president, Mr. Esteban Espina, an out-of-town general assembly at Holiday Hills was enjoyed by all members. For the first time, the teachers broke away from the heavy classroom schedules and enjoyed sights as well as the camaraderie among one another. \n\nMore appointments were made during that year. Mr. Diego Matibag was tasked to be the liaison officer. The position was a necessity because the college was growing. Miss Eugenia Sarmiento was appointed property custodian and Mrs. Damiana (Ka Yayang) Quijano was appointed canteen manager that started as a small store. Inspired by the determination and tenacity of purpose of the original founders, the college administration spearheaded by Treasurer Mrs. Aurora L. Velasquez, gradually solved the problem of accommodation by purchasing five adjacent lots with an area of about 23, 253 square meters at Hilltop site, Batangas City. On the corner of the newly-acquired property, a P100,000 three-storey high school building was constructed. Due to the increase in enrollment, a new floor was added in order to accommodate more students.\n\nIn September 1965, Taal Volcano erupted and spewed ashes as far as Batangas City. The calamity touched the hearts of the members of the Westernian Press Club so they immediately launched their \"Operation Kawanggawa\" in order to aid the victims of the said volcanic eruption. Donations in cash or in kind were collected through various clubs and organizations. Everybody from the administration, faculty, employees, and students worked as one big family. Relief goods and cash were distributed to the affected people. The spirit of giving and sharing was made alive through the voluntary assistance of the Westernians, who played the most challenging role in the relief operation. \n\nWhile construction was going on in the newly-acquired site, the administration thought of hiring a qualified librarian with a rich background of experiences. Thus, Mrs. Ana B. Cads, the new librarian, introduced a modern library system patterned after the big libraries in Manila. Through her initiative, she was able to secure almost 2,000 volumes of books through purchases and donations from the Asia Foundation in 1966.\n\nSpeaking of modernity, Treasurer Mrs. Aurora L. Velasquez initiated a new system of salary distribution. Instead of the usual pay envelopes, the teachers and employees received Far East Bank and Trust Co. (FEBTC) bank books with the salaries/earnings for the period posted and could be withdrawn anytime based on the owners' discretion. The rationale behind this modificatiojn was to encourage forced savings among the WPC staff. On that same year, Mr. Domingo Ramirez faculty member of HS and college departments became the lucky scholar grantee of the National Science Development Board.";

        mChapterText.setText("Chapter Two");
        mTitleText.setText("Great Expectations (1956-1965)");


        SpannableString spannableOne = new SpannableString(pageContent);
        SpannableString spannableTwo = new SpannableString(pageContentTwo);

        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showJuanJavierJeep();
            }
        };

        ClickableSpan clickableSpanTwo = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showPrisaa();
            }
        };

        ClickableSpan clickableSpanThree = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showROTCwpc();
            }
        };

        ClickableSpan clickableSpanFour = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showROTCwpc();
            }
        };



        ClickableSpan clickableSpanSix = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showKnightsOfColumbus();
            }
        };


        spannableOne.setSpan(clickableSpanOne, 0,41, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableTwo.setSpan(clickableSpanTwo, 3681, 3719, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableTwo.setSpan(clickableSpanThree, 3682, 3717, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableOne.setSpan(clickableSpanSix, 3954, 3985, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

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
            startActivity(new Intent(this, Homeubcv1chapter3.class));
            Animatoo.animateFade(this);
            finish();
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), UbcvOneChaptersActivity.class);
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
        getMenuInflater().inflate(R.menu.ubcv_one_chapter_three, menu);
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
            youTubePlayer.cueVideo("3shOUAS7kB8");
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
    public void showJuanJavierJeep(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.juanjavierjeep);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    public void showPrisaa(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.WHITE));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.prisaalogo);
        TextView textText = new TextView(this);
        textText.setText("Private Schools Athletic Association, founded in February 17, 1953, is an association of private schools, Christian schools, and home school athletic departments throughout the Philippines. \n The PRISAA exist to bring exposure and credibility to private schools across the nation.");
        textText.setTextColor(Color.BLACK);
        textText.setGravity(Gravity.BOTTOM);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        mDialog.addContentView(textText, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        mDialog.show();
    }

    //image dialog popup
    public void showROTCwpc(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.rotcplazamabini);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    public void showSSCwpc(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.supremestudentcouncil);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    //image dialog popup
    public void showKnightsOfColumbus(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.knightsofcolumbus);


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
