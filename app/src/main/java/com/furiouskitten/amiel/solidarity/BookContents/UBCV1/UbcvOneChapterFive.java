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
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV1QUIZ.UbcvOneChapterOneQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV1QUIZ.Homeubcv1chapter5;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvOneChapterFive extends AppCompatActivity
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
        setContentView(R.layout.activity_ubcv_one_chapter_five);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter Four: Years of Fulfillment (1976-1985)");

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
"On many years, the graduates of the different colleges have adcTed laurels to the cap of their alma mater especially those from the College of Commerce and the College of Law. They have maintained a high percentage of passing in the board and bar examinations. In the business and political arenas, familiar names of WPC graduates dominated the fields like Dr. Remigio Agpalo, Atty. Hernando B. Perez, Atty. Francisco de Loyola, Atty. Liberato de Jesus, Atty. Eugenio Mendoza, Atty. Roberto Panganiban and other successful graduates. \n\n The enrolment continued to increase especially in the College of Education. There was a necessity then to hire two guidance counselors, Mrs. Helen Magay and Mrs. Araceli Lucena in 1977 and 1978 respectively. A permanent stage was constructed at the Hilltop campus on February 7, 1977 followed by the gymnasium also at the Hilltop campus on June 11, 1978 to protect the PE students from the elements. To ease the problem of accommodation at the main campus, the Secretarial, and Technical departments were transferred from the main campus in MH del Pilar St. to the Hilltop campus. \n\nThe Age of Scientific and Technological Advances had entered the domains of business and sciences. Not to be outdone in this great upheaval that influenced the shift of enrollees' choice from the highly academic to technically-oriented courses, the Western Philippine Colleges launched the opening of the College of Engineering as an agent in realizing and answering the social and technological needs of men in 1978. It started to operate on a temporary permit with Dr. Cristeto Hernandez as the first dean. The courses offered were Bachelor of Science in Civil Engineering, Bachelor of Science in Electrical Engineering and Bachelor of Science Industrial Engineering. Geodetic Engineering was also offered but ince there was no enrollee in this course, it was phased out. The Juan Y. Javier building was constructed to serve as the home of future engineers. \n\nIn 1979, Western Philippine Colleges continued to receive more blessings with the acquisition of a larger lot at the Hilltop campus. A new property owned by Dr. Malabanan, located beside the WPC lot was exchanged where a five-storey building with a penthouse at the roof deck for the engineering students was erected and completed. There was a sudden increase in enrollment from 7,438 in 1974 to 10,983 in School Year 1979-1980 capped by the high passing percentage in the first Professional Board Examination for Teachers (PBET) on April 23, 1978. All of these were God-given graces and valid proofs that the institution had withstood the tests of time and had emerged triumphant from the trials and difficulties of the past decades. \n\nThe very stable foundation of the WPC needed highly\" qualified staff to assist the administration in the management of the institution. For this matter, Dr. Corazon B. Cabrera was appointed Academic Coordinator in 1979-1981 and was later named Vice president for Academic Affairs (from 1982 to her retirement in 2002); while Mrs. Anita V. Cauntay took charge of the newly-created purchasing office in 1979 up to her demise. The enrolment in the College of Law decreased due to the high passing grade required in the bar examinations. At the same time, WPC had to maintain highly-qualified professors for a few students, which the college could not make both ends meet. Hence, the administrators, upon the approval of the Board of Trustees, decided to phase out the College of Law temporarily in order to give priority to other courses in SY 1979-1980. \n\nSchool year 1980-1981 was replete with many noteworthy events. The unfinished Technology building was occupied by the students of the Technical-Vocational courses. The newly-acquired 5 hectare farm in Sta. Rita for the practicum students was fenced. The new offerings of the College had to meet basic requirements like equipments and facilities before the opening of classes. Again, there was an increase in enrolment in all courses except in the graduate level. The increase equivalent to 60% came mostly from the Commerce department. \n\nThe Westernian Pioneer, as the official publication of the High School department, was born in 1981 with Minerva Mendoza as Chief Editor. Since then, it began to reap local and national awards. Assigned first advisers were Miss Lilia Aseron and Miss Armen Perez. Bernardita Rodis was the first Regional winner in the Regional Secondary Schools Press Conference in 1982 in Filipino Literary Writing. Abegayle Machelle M. Perez was the first national winner in the National Secondary Schools Press Conference in Editing and copy Reading in 1983.\n\nThe year proved to be very fruitful because 33 commerce accounting majors passed the CPA examination. The 1981 passers were considered the highest ever produced by WPC. In the past, the average of CPA passers was 14 for the period of 27 years. In recognition of the achievement of these professionals, the College kept on holding torch parades/testimonials in their honor. \n\nFaculty members of WPC also increased in number out of necessity due to the increase of enrolment. The most number of faculty members was in the College of Liberal Arts, followed by the Commerce and the Secretarial courses. At this point in time, the development of the faculty and improvement of teaching skills were the administration's center of attention. For the teachers to grow professionally, the College initiated series of seminars and other in-service trainings annually or every semester as needed aside from the attendance in regional and national trainings sponsored by government and private entities. \n\nAfter 37 years, the graduates of WPC had proven themselves worthy sons/daughters of their alma mater. For this reason, the administration, in consonance with the desire of the Board of Trustees, created the Alumni Interim Board tasked to organize a grand Alumni Homecoming in 1980. The peak of WPC enrolment was reached with the total enrolment of more than 10,000 or 4.4% increase during SY 1982-1953. For this reason, faculty development was intensified particularly in the research area. The Board was justified to work for accreditation and the attainment of the university status. Furthermore, WPC was again placed in the limelight when the first four Civil Engineering graduates passed the board examination with a 100 percent rate of passing. More developments began to take shape at the WPC such as: 1 the full nationwide implementation of the Program for Decentralized Education (PRODED) in the elementary schools and the launching of the Regional Science High School Curriculum aside from the Revised Secondary Education Program (RSEP) for the high school students; and new coding system to facilitate scheduling, verification, and sequencing of subjects.\n\nAnother movement on the shuffling of teachers took place with the appointment of Dr. Corazon B. Cabrera as Dean of K-12,  Graduate Studies and Research after the death of former dean, Dr. Antonio Javier. Dr. Abelardo B. Perez was appointed acting Dean of the College of Liberal Arts. Mrs. Dimpna Shed in front of the Javier Hall was prow•e• or e students. Aquino acted as Dean of the College of Secretarial Administration when it became an independent college and not anymore under the College of Commerce. Mr. Conrado Aya was assigned as OIC of the security force.\n\nThe expansion program took a speedy pace with the completion of 15 classrooms and a medium-sized building for the Education department at the Hilltop campus on time for the opening of the first semester of the current school year. Other projects initiated by the school was the fencing of the school perimeter, the improvement and landscaping of the 2-hectare playground on the Hilltop site. The students' roofed rest shed at the main building was also finished. The shed was provided with benches for the convenience of students during their off-periods. Students practiced their freedom of expression. The administrators' concern for the welfare of the students prevailed and made moves in order to address the issue. \n\nThe plan for the conversion of the College of Liberal Arts into the College of Arts and Sciences became a reality together with the addition of Mathematics, Biology, Chemistry, and Psychology as major subjects. The students' handbook was also on the initial stage and ready for distribution at the enrollment of the following year. For the first time, the holding of the intramural games was allowed in order to select the college athletes for the regional and national games. With the fast rate of development, it was necessary to hike the tuition fees by 5 percent not only for the welfare of the school but also for the upgrading of the salaries of teachers. The move was not acceptable to the students and for two weeks from August 31 to September 15, 1983, the students led by militant leaders staged a mass walkout and boycott of classes. The once happy and peaceful campuses of the Western Philippine Colleges were rocked by shouts of students as they sounded off their battle cry. To prevent the untoward events, all classes were suspended. Four dialogues with student representatives and the administration tried to resolve the tuition fee increase and other issues about the Student Council, school facilities, library regulations, and medical and dental services. Region IV officials of the Ministry of Education, Culture, and Sports, headed by legal affairs Atty. Ernesto Jovallos led the negotiation which ended with the postponement of the MECS approved 15 percent tuition fee increase until next SY 1984-1985. \n\nThe MECS negotiators commended the administration for giving in to the requests of the students. The faculty and employees, led by Atty. Roberto Panganiban, on the other hand, voluntarily sacrificed their expected salary increases. The boycott/rally however left an indelible mark in the history of progressive student movement as well as a sign of growing activism in school campuses especially in Metro Manila. \n\nDespite all odds, the College continued to win in song and dance competitions. The administration and college officers praised the WPC Dance Company for contributing to the prestige of cultural awakening.  The WPC, having contributed an accumulated value of P.5 million, became qualified as a bonailde member of the Private Education Retirement Annuity Association (PERAA) Golden Club and was awarded the PERAA Golden Club plaque in 1983. School year 1984-1985 saw an increase of enrolment equivalent to S percent. With this, there was naturally an increase in the number of graduates. The administration had its hands full in injecting changes in the academe and in the image of the college. The major innovations were: the granting of scholarships to faculty members for them to pursue higher studies; formulation and adoption of the Student Government Constitution and By-Laws.\n\nCreation of the offices for External program and the College of Secretariak Administration; organization of WPC Faculty-EmploYees Cooperative; improvement of the laboratory; extension of the ilDrary; renovation of offices; construction of the admin-canteen oullding at Hilltop campus costing P897,994.12; organization of the mobile theater by student thespians through the initiative of Atty. Florencio de Loyola; and the preparation of the Institutional Development Program for the Philippine Association for Accreditation of Schools, colleges, and Universities (PAASCU). \n\n Since then, the group had been active in Presenting plays of all genres starting with \"Rebulto\" and \"Bilanggo\". It has more than 26 years to its credit with Dr. Roel A. Asi as the adviser with the longest term of service.\n\nSince then, the group had been active in Presenting plays of all genres starting with \"Rebulto\" and \"Bilanggo\". It has more than 26 years to its credit with Dr. Roel A. Asi as the adviser with the longest term of service.\n\nA lampoon issue of the school paper published by the \"Advocate\" staffers came out of the press and was named \"Madvocate.\" The issue was not censored by the administration and the Board due to the constitutional mandate of press freedom. For several years, the lampoon tabloid gained a foothold in the campus as a once-a-year special issue. Everybody in the administration, faculty, and students alike were not spared of the ridicule in the tabloid. At any rate, it did not in any way affect the prestige being enjoyed by the College as well as the good public image created at that time. \n\n";
        String pageContentTwo =
"After 37 years, the graduates of WPC had proven themselves worthy sons/daughters of their alma mater. For this reason, the administration, in consonance with the desire of the Board of Trustees, created the Alumni Interim Board tasked to organize a grand Alumni Homecoming in 1980. The peak of WPC enrolment was reached with the total enrolment of more than 10,000 or 4.4% increase during SY 1982-1953. For this reason, faculty development was intensified particularly in the research area. The Board was justified to work for accreditation and the attainment of the university status. Furthermore, WPC was again placed in the limelight when the first four Civil Engineering graduates passed the board examination with a 100 percent rate of passing. More developments began to take shape at the WPC such as: 1 the full nationwide implementation of the Program for Decentralized Education (PRODED) in the elementary schools and the launching of the Regional Science High School Curriculum aside from the Revised Secondary Education Program (RSEP) for the high school students; and new coding system to facilitate scheduling, verification, and sequencing of subjects.\n\nAnother movement on the shuffling of teachers took place with the appointment of Dr. Corazon B. Cabrera as Dean of K-12,  Graduate Studies and Research after the death of former dean, Dr. Antonio Javier. Dr. Abelardo B. Perez was appointed acting Dean of the College of Liberal Arts. Mrs. Dimpna Shed in front of the Javier Hall was prow•e• or e students. Aquino acted as Dean of the College of Secretarial Administration when it became an independent college and not anymore under the College of Commerce. Mr. Conrado Aya was assigned as OIC of the security force.\n\nThe expansion program took a speedy pace with the completion of 15 classrooms and a medium-sized building for the Education department at the Hilltop campus on time for the opening of the first semester of the current school year. Other projects initiated by the school was the fencing of the school perimeter, the improvement and landscaping of the 2-hectare playground on the Hilltop site. The students' roofed rest shed at the main building was also finished. The shed was provided with benches for the convenience of students during their off-periods. Students practiced their freedom of expression. The administrators' concern for the welfare of the students prevailed and made moves in order to address the issue. \n\nThe plan for the conversion of the College of Liberal Arts into the College of Arts and Sciences became a reality together with the addition of Mathematics, Biology, Chemistry, and Psychology as major subjects. The students' handbook was also on the initial stage and ready for distribution at the enrollment of the following year. For the first time, the holding of the intramural games was allowed in order to select the college athletes for the regional and national games. With the fast rate of development, it was necessary to hike the tuition fees by 5 percent not only for the welfare of the school but also for the upgrading of the salaries of teachers. The move was not acceptable to the students and for two weeks from August 31 to September 15, 1983, the students led by militant leaders staged a mass walkout and boycott of classes. The once happy and peaceful campuses of the Western Philippine Colleges were rocked by shouts of students as they sounded off their battle cry. To prevent the untoward events, all classes were suspended. Four dialogues with student representatives and the administration tried to resolve the tuition fee increase and other issues about the Student Council, school facilities, library regulations, and medical and dental services. Region IV officials of the Ministry of Education, Culture, and Sports, headed by legal affairs Atty. Ernesto Jovallos led the negotiation which ended with the postponement of the MECS approved 15 percent tuition fee increase until next SY 1984-1985. \n\nThe MECS negotiators commended the administration for giving in to the requests of the students. The faculty and employees, led by Atty. Roberto Panganiban, on the other hand, voluntarily sacrificed their expected salary increases. The boycott rally however left an indelible mark in the history of progressive student movement as well as a sign of growing activism in school campuses especially in Metro Manila. \n\nDespite all odds, the College continued to win in song and dance competitions. The administration and college officers praised the WPC Dance Company for contributing to the prestige of cultural awakening.  The WPC, having contributed an accumulated value of P.5 million, became qualified as a bonailde member of the Private Education Retirement Annuity Association (PERAA) Golden Club and was awarded the PERAA Golden Club plaque in 1983. School year 1984-1985 saw an increase of enrolment equivalent to S percent. With this, there was naturally an increase in the number of graduates. The administration had its hands full in injecting changes in the academe and in the image of the college. The major innovations were: the granting of scholarships to faculty members for them to pursue higher studies; formulation and adoption of the Student Government Constitution and By-Laws.\n\nCreation of the offices for External program and the College of Secretariak Administration; organization of WPC Faculty-EmploYees Cooperative; improvement of the laboratory; extension of the ilDrary; renovation of offices; construction of the admin-canteen oullding at Hilltop campus costing P897,994.12; organization of the mobile theater by student thespians through the initiative of Atty. Florencio de Loyola; and the preparation of the Institutional Development Program for the Philippine Association for Accreditation of Schools, colleges, and Universities (PAASCU). \n\n Since then, the group had been active in Presenting plays of all genres starting with \"Rebulto\" and \"Bilanggo\". It has more than 26 years to its credit with Dr. Roel A. Asi as the adviser with the longest term of service.\n\nSince then, the group had been active in Presenting plays of all genres starting with \"Rebulto\" and \"Bilanggo\". It has more than 26 years to its credit with Dr. Roel A. Asi as the adviser with the longest term of service.\n\nA lampoon issue of the school paper published by the \"Advocate\" staffers came out of the press and was named \"Madvocate.\" The issue was not censored by the administration and the Board due to the constitutional mandate of press freedom. For several years, the lampoon tabloid gained a foothold in the campus as a once-a-year special issue. Everybody in the administration, faculty, and students alike were not spared of the ridicule in the tabloid. At any rate, it did not in any way affect the prestige being enjoyed by the College as well as the good public image created at that time.";

        mChapterText.setText("Chapter Four");
        mTitleText.setText("Years of Fulfillment (1976-1985)");

        SpannableString spannableOne = new SpannableString(pageContent);
        SpannableString spannableTwo = new SpannableString(pageContentTwo);

        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showSirNaniImage();
            }
        };

        ClickableSpan clickableSpanTwo = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showAbegaylePerezimage();
            }
        };

        ClickableSpan clickableSpanThree = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showSirBoycottImage();
            }
        };




        spannableOne.setSpan(clickableSpanOne, 376,399, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//sir nani
        spannableOne.setSpan(clickableSpanTwo, 4509, 4535, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//abegayle
        spannableTwo.setSpan(clickableSpanThree, 4222, 4229, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//boycott
        //spannableTwo.setSpan(clickableSpanFour, 145, 165, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//pabloumalihall

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


        //implement firebase
        updateNavHeader();
    }

    public void transiBtn(View view){
        if(view == findViewById(R.id.nextPageButton)){
            startActivity(new Intent(this, Homeubcv1chapter5.class));
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
        getMenuInflater().inflate(R.menu.ubcv_one_chapter_five, menu);
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
    public void showAbegaylePerezimage(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.abegayleperez);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    public void showSirNaniImage(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.sirnani);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    public void showSirBoycottImage(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.boycott);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    public void showPabloUmaliHall(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.pabloumalihall);


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
