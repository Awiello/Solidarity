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
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV1QUIZ.UbcvOneChapterFourQuizSS;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV1QUIZ.UbcvOneChapterOneQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV1QUIZ.Homeubcv1chapter4;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvOneChapterFour extends AppCompatActivity
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

    //imagezoom variables
    ScaleGestureDetector mScaleGestureDetector;
    float mScaleFactor = 1.0f;
    ImageView mTestImage;
    ImageView mTestImageTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubcv_one_chapter_four);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter Three: New Challenges and Empowerment (1966-1975)");

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

        //testImageZoom
        mTestImage = findViewById(R.id.contentImageOne);
        mTestImageTwo = findViewById(R.id.contentImageTwo);

        mScaleGestureDetector = new ScaleGestureDetector(this,new ScaleListener());


        String pageContent =
"Since the creation of the WPC Board of Trustees, later named Executive Board, the policy was for all shareholders to assemble annually during the summer term prior to the opening of classes. In 1966, Dr. Abelardo B. Perez was elected chairman of the Executive Board. The position was subsequently changed to chairman and president on a concurrent capacity. \n\nBeing a doctor of medicine fresh from his residency and specialty training at the New York Polyclinic and Medical Center, he assured the college of better facilities, improved sanitation and health services. The school clinic started to function with himself as chief school physician assisted by Dr. Paterno Arguelles, Dr. Emiliano Aquino as school dentist, and the first school nurse Miss Aurora Untalan. \n\nDue to the availability of medical and dental services for the students, medical and dental fees were included in the miscellaneous fees. As a result, the clinic was always visited by students, who submitted themselves to medical and dental examinations, because they wanted to gain their money's worth. At this point in time, the College continued to reap success. The WPC cadet corps emerged champion in the first province-wide ROTC competition, which really proved that the WPC cadets were trained to be good military leaders.\n\n With the College Student Council and the High School Council already organized, Dr. Abelardo B. Perez, in his capacity as chairman and president of the Executive Board, encouraged the organizationof the Supreme Student Council to give the students the opportunity for responsible citizenship. \n\nThe bar and CPA examinees continued their impressive performance. For this reason, the confidence of parents and students on the College were the factors responsible for the enrolment to soar every schoolyear. The rapid increase of the school population spoke of the warm support accorded by parents. \n\nThe popularity of the College had gone beyond the campus with the organization of an all-college orchestra with Mr. Petronilo Rosel as adviser in 1968. It was frequently invited to assist in some out-of-school formal dances and musical affairs that gave a strong competition with the famous Babat Orchestra at that time. In academic competitons like spelling, declamation, and oratorical contests, the high school contestants romped away with the major awards. \n\nFanned by the intense desire to foster professional growths the Graduate Studies and Research started to operate under a temporary permit during school year 1968-1969 with 74 enrollees 1 for a one-course offering Master of Arts in Education every Saturday. Dr. Lydia M. Profeta was invited as consultant with Dr. Crispina Faller as the first dean and Mercedes Macarandang as first MA graduate. Five distinguished MA graduate professors were hired to teach the first batch of enrollees. Every year there was a change of dean inasmuch as the deans found it difficult to commute every Saturday from Manila to Batangas City. In 1971, Dr. Maximo Ramos took over as the second head, followed by Rev. Father Peter Liu and Dr. Antonio Javier, retired superintendent of the Division of Batangas from 1974 to 1982. His deanship made possible the offering of additional courses in English, Social Studies, Filipino, and Educational Administration. The enrolment increased with the addition of these courses. \n\nIt was also in 1969, during the 22nd Foundation Day that meritorious service awards were granted to the administrators and faculty members who had rendered 20 or more years of continuous service to the college. The recipients were Sra. Mary Ruth Aceveda, 21 years; Mrs. Flordeliza M. Arguelles, 22 years; Mrs. Gregoria R. de Jesus, 21 years, and Atty Juan Ramos, 22 years.\n\nLoyalty awards were likewise given to faculty members Dean Eliseo Austria and Eduardo Sanchez for 21 years and 22 years of service respectively. School year 1968-1969 proved to be a very successful year when700 college and high school graduates received the fruits of their toils during the graduation program with the National Anthem played by the WPC band. For the first time, two college graduates Julieta Mauhay (BSEEd) and Petra Ramirez (BSEEd) received the Magna cum Laude award. There were also three Cum Laude graduates. Schoolyear 1968-1969 was the initial year of the 20-year service of Mrs. Conrada B. Perez, widow of Atty. Francisco G. Perez.\n\nEven before the appointment to the Board, she had played the prominent role of raising the much-needed money during the difficult and trying days of the Western Philippine Colleges. She Was the banker and money lender whose money was loaned out without interest to meet the institution's financial commitments. Starting as a member of the Board of Trustees in SY 1928-1969, she was elected Treasurer in SY 1972-1973 until her retirement in 1993. \n\nLike her predecessor Mrs. Aurora L. Velasquez, she was a spend-thrift who considered a single centavo as hard-earned money. The two lady administrators proved to be very frugal with their control of funds and supervision of building construction to minimize wastage of materials like nails, scraps of wood, iron roofings and cement. This frugality gradually paid off in succeeding projects. \n\nMrs. Conrada B. Perez was a very soft-spoken and kind Manilena, yet forceful in granting requests for release of funds; hence, her name became synonymous to thriftiness. Her retirement was very much felt by her constituents in the department. Mrs. Josevina V. Javier, the second wife of founder Juan Y. Javier, played a very significant and relevant role in the realization of the mission of the Western Philippine Colleges.";
        String pageContentTwo =
"Mrs. Josevina V. Javier, the second wife of founder Juan Y. Javier, played a very significant and relevant role in the realization of the mission of the Western Philippine Colleges. She was the spiritual guardian of both the Board of Trustees and the faculty, as well as of the students.\n\nBeing a religious woman, she was a visible figure in all religious activities and functions of the college. She initiated and led the observance of all church holy days and moved for their integration in the school calendar. \n\nMrs. Javier was also a key figure during the difficult and trying years of the WPC who was ever-willing and ready to share whatever resources she could dole out. \n\nThe blooming popularity of Western Philippine Colleges and its contributions to educational growth could not be denied when Dr. Abelardo B. Perez as president of WPC and the Batangas Private Schools Association was elected board member in the 10th Annual Convention of the Philippine Association of Private Schools and Colleges. He was the first school head of the private schools of Batangas to be elected to the national organization. \n\nWith the enriched curricular offerings and the continuous influx of enrollees, there was a need for more innovations. More organizations cropped up like the Batangas Youth Movement for Reforms and Radicalism and the Philippine Youth Corps which also aspired for changes. \n\nThe surge of enrolment needed a compilation of updated records  and other office procedures. In SY 1969-1970, the services of Josue Arceo and company was sought to ensure a systematic accounting of the finances of the institution. The system introduced the use of control numbers for all students. In the same year, the mini-bus was purchased as a service vehicle for transporting records and other related matters. Likewise, it was used by teachers and students for out-of-school activities. In school year 1970-1971, the four-storey edifice for the High School worth half a million pesos at Hilltop was completed. It Was named Francisco Perez Hall in the early 1980's. On June 25, 1970, the Nursery and Kindergarten classes were started at the newly opened building. \n\nThis school year also saw the promotion of the most deserving staff of the college: Atty. Florencio de Loyola, dean of Student Affairs (1971-1988); Atty. Eliseo Austria, vice president for Academic Affairs (1971-1977); Dr. Maximo B. Ramos, dean of the Graduate Studies and Research (1971-1972), Dr. Corazon B. Cabrera, dean of the College of Liberal Arts(1971-1982) and concurrent assistant dean of Graduate Studies and Research; Mr. Juan P. Lozano II, dean of the College of Commerce(1971 to May 31, 1993); Mrs. Dolores H. Solis, registrar (1971 to her retirement in September 14, 2006); Mrs. Carmen de Castro, officer-in-charge Office. of the Property \n\nSince the early years of its founding, the WPC was known to be generous to its staff particularly the employees of the institution. In December 1971, a P20.00 incentive was given which paved the way for the granting of the traditional Christmas cashgift not only to employees but also to faculty members that increased every year. The approval of a 35% tuition fee discount to employees was another benevolent act of the administration. Similarly, scholarships were given to deserving personnel. \n\nDuring the yearly Founders' Memorial Lecture held during the 25th Foundation of WPC on February 1971, Service Awards were given to Miss Belen V. Perez of the College of Liberal Arts and Miss Aurora M. Babasa of the College of Education and High School department. Each received a medal and a plaque of appreciation as a reward for rendering 20 years of service to the instititution. \n\nNew appointments took effect with the designation of Mrs. Carmen de Castro as permanent property custodian, Miss Flerida Aquino as guidance counselor, and Father Peter Liu, dean of Graduate Studies and Research for SY 1972-1973. \n\nAtty. Vicente A. Mayo was elected chairman of the Board of Trustees, the position he held until the present; while Dr. Antonio Javier was appointed dean of the Graduate Studies and Research (1973-1983). During his incumbency, he strove to add major Courses such as English, Social Sciences, Filipino, and Educational Administration to the Graduate School programs; hence, increasing gradually the MA enrolment to 253 students. It was also in 1973-1974 that the Graduate School Program was given Government Recognition No. 49, s. 1973. \n\nThe Revised Secondary Education Program of 1973 Was introduced in the High School department. With the revtsion of the secondary curriculum, Preparatory Military Training (PMT) was changed Training (CAT). In line with the provisions of the RSEp 1973, all graduating students were required to take tne National College Entrance Examination (NCEE) for the assessment of their aptitudes and skills and to prepare them for college \n\nAtty. Vicente A. Mayo, former education. Another remarkable Chairman of the Board of Trustees. event that took place in the same year was the tremendous rise of enrolment in the evening session inspite of its 5-year curriculum. \n\nIn June 1974, Dr. Abelardo B. Perez was again elected college president after a lull of five years. Since then, he held the position until his death on April 18, 2007. At this time, the administration deemed it wise to open new courses in keeping with the constitutional mandate of providing the youth with broad general education as well as training in competitive skills. Hence, the college focused its vision on the opening of the Technical-Vocational department in SY 1973-1974 with Mr. Domingo Ramirez as director operating under a government permit for special vocational courses. The department's intial offerings included Automotive Technology, Drafting, Electronics, and Food Technology with integrated practicum classes for each courseware. In school year 1974-1975, the Tech-Voc department offered p , Agriculture, \n\nRefrigeration, Airconditioning and Practical ElectricitYi Other short term courses like Pipefitting, Iron Works, Sheet Meta and Welding were also offered. To keep up with the progress, the college purchased the Burrough machine in 1975 and installed it in the accounting office. The machine was a great help in recording students' charges and payments with Prisco Macalalad as operator. \n\nDue to the needs of the increasing population, WPC hired Miss Lucita Baroja as head counselor. Likewise, Government Recognition No. 148 s. 1975 was the University of Batangas. granted to the College for the Kindergarten classes. Regarding the implementation of DECS Curricular No. 3 s. 1975 stating that \"all existing secretarial courses previously authorized by the Department of Education, Culture, and Sports are considered phased out effective school year 1975-1976, the college requested for permission and authority to offer new courses such as Bachelor of Science in Secretarial Administratoin, Junior Secretarial Course, and Typing. \n\nThe administration's deep concern for the welfare of the employees motivated them to join the Private Retirement Annuity Association (PERAA) in June, 1975. The participating employees are entitled to all benefits and privileges appurtenant to PERAA membership embodied in Republic Act No. 4917 and the resolution on Retirement Plan of the institution. Many benefits were extended to the WPC personnel, one of which was the granting of a 25% tuition fee discount to two legitimate children.She was the spiritual guardian of both the Board of Trustees and the faculty, as well as of the students. Being a religious woman, she was a visible figure in all religious activities and functions of the college. She initiated and led the observance of all church holy days and moved for their integration in the school calendar. \n\n Mrs. Javier was also a key figure during the difficult and trying years of the WPC who was ever-willing and ready to share whatever resources she could dole out, Mrs. josefina V. Javier, together with Mrs. Aurora L. Velasquez and Mrs. Conrada B. Perez, are the unsung heroines to whom tribute is due. The blooming popularity of Western Philippine Colleges and its contributions to educational growth could not be denied when Dr. Abelardo B. Perez as president of WPC and the Batangas Private Schools Association was elected board member in the 10th Annual Convention of the Philippine Association of Private Schools and Colleges. He was the first school head of the private schools of Batangas to be elected to the national organization. With the enriched curricular offerings and the continuous influx of enrollees, there was a need for more innovations. More organizations cropped up like the Batangas Youth Movement for Reforms and Radicalism and the Philippine Youth Corps which also aspired for changes.\n\nThe surge of enrolment needed a compilation of updated records  and other office procedures. In SY 1969-1970, the services of Josue Arceo and company was sought to ensure a systematic accounting of the finances of the institution. The system introduced the use of control numbers for all students. In the same year, the mini-bus was purchased as a service vehicle for transporting records and other related matters. Likewise, it was used by teachers and students for out-of-school activities. In school year 1970-1971, the four-storey edifice for the High School worth half a million pesos at Hilltop was completed. It Was named Francisco Perez Hall in the early 1980's. On June 25, 1970, the Nursery and Kindergarten classes were started at the newly opened building. This school year also saw the promotion of the most deserving staff of the college: Atty. Florencio de Loyola, dean of Student Affairs (1971-1988); Atty. Eliseo Austria, vice president for Academic Affairs (1971-1977); Dr. Maximo B. Ramos, dean of the Graduate Studies and Research (1971-1972), Dr. Corazon B. Cabrera, dean of the College of Liberal Arts(1971-1982) and concurrent assistant dean of Graduate Studies and Research; Mr. Juan P. Lozano II, dean of the College of Commerce(1971 to May 31, 1993); Mrs. Dolores H. Solis, registrar (1971 to her retirement in September 14, 2006); Mrs. Carmen de Castro, officer-in-charge Office. of the Property. \n\nSince the early years of its founding, the WPC was known to be generous to its staff particularly the employees of the institution. In December 1971, a P20.00 incentive was given which paved the way for the granting of the traditional Christmas cashgift not only to employees but also to faculty members that increased every year. The approval of a 35% tuition fee discount to employees was another benevolent act of the administration. Similarly, scholarships were given to deserving personnel. \n\nDuring the yearly Founders' Memorial Lecture held during the 25th Foundation of WPC on February 1971, Service Awards were given to Miss Belen V. Perez of the College of Liberal Arts and Miss Aurora M. Babasa of the College of Education and High School department. Each received a medal and a plaque of appreciation as a reward for rendering 20 years of service to the instititution. New appointments took effect with the designation of Mrs. Carmen de Castro as permanent property custodian, Miss Flerida Aquino as guidance counselor, and Father Peter Liu, dean of Graduate Studies and Research for SY 1972-1973. \n\nAtty. Vicente A. Mayo was elected chairman of the Board of Trustees, the position he held until the present; while Dr. Antonio Javier was appointed dean of the Graduate Studies and Research (1973-1983). During his incumbency, he strove to add major Courses such as English, Social Sciences, Filipino, and Educational Administration to the Graduate School programs; hence, increasing gradually the MA enrolment to 253 students. It was also in 1973-1974 that the Graduate School Program was given Government Recognition No. 49, s. 1973. \n\nThe Revised Secondary Education Program of 1973 Was introduced in the High School department. With the revtsion of the secondary curriculum, Preparatory Military Training (PMT) was changed Training (CAT). In line with the provisions of the RSEp 1973, all graduating students were required to take tne National College Entrance Examination (NCEE) for the assessment of their aptitudes and skills and to prepare them for college. \n\nIn June 1974, Dr. Abelardo B. Perez was again elected college president after a lull of five years. Since then, he held the position until his death on April 18, 2007. At this time, the administration deemed it wise to open new courses in keeping with the constitutional mandate of providing the youth with broad general education as well as training in competitive skills. Hence, the college focused its vision on the opening of the Technical-Vocational department in SY 1973-1974 with Mr. Domingo Ramirez as director operating under a government permit for special vocational courses. The department's intial offerings included Automotive Technology, Drafting, Electronics, and Food Technology with integrated practicum classes for each courseware. In school year 1974-1975, the Tech-Voc department offered p , Agriculture, Refrigeration, Airconditioning and Practical ElectricitYi Other short term courses like Pipefitting, Iron Works, Sheet Meta and Welding were also offered. To keep up with the progress, the college purchased the Burrough machine in 1975 and installed it in the accounting office. The machine was a great help in recording students' charges and payments with Prisco Macalalad as operator. \n\n Due to the needs of the increasing population, WPC hired Miss Lucita Baroja as head counselor. Likewise, Government Recognition No. 148 s. 1975 was the University of Batangas. granted to the College for the Kindergarten classes. Regarding the implementation of DECS Curricular No. 3 s. 1975 stating that \"all existing secretarial courses previously authorized by the Department of Education, Culture, and Sports are considered phased out effective school year 1975-1976, the college requested for permission and authority to offer new courses such as Bachelor of Science in Secretarial Administratoin, Junior Secretarial Course, and Typing. \n\n The administration's deep concern for the welfare of the employees motivated them to join the Private Retirement Annuity Association (PERAA) in June, 1975. The participating employees are entitled to all benefits and privileges appurtenant to PERAA membership embodied in Republic Act No. 4917 and the resolution on Retirement Plan of the institution. Many benefits were extended to the WPC personnel, one of which was the granting of a 25% tuition fee discount to two legitimate children.";

        mChapterText.setText("Chapter Three");
        mTitleText.setText("New Challenges and Empowerment (1966-1975)");

        SpannableString spannableOne = new SpannableString(pageContent);
        SpannableString spannableTwo = new SpannableString(pageContentTwo);

        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showAbelardoPerezImage();
            }
        };

        ClickableSpan clickableSpanTwo = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showMercedesMacarandangImage();
            }
        };

        spannableOne.setSpan(clickableSpanOne, 202,223, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //abelardoprerez
        spannableOne.setSpan(clickableSpanTwo, 2711, 2731, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //mercedesmacarandang

        mContentText.setText(spannableOne);
        mContentTextTwo.setText(pageContentTwo);
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
            startActivity(new Intent(this, Homeubcv1chapter4.class));
            Animatoo.animateFade(this);

            finish();
        }
    }

    //zoom touchevent
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        mScaleGestureDetector.onTouchEvent(event);
        return true;
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
        getMenuInflater().inflate(R.menu.ubcv_one_chapter_four, menu);
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
    public void showMercedesMacarandangImage(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.meredesmacarandang);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    //image dialog popup
    public void showAbelardoPerezImage(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.abelardoperez);


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


    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener{
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            mScaleFactor *= mScaleGestureDetector.getScaleFactor();
            mScaleFactor = Math.max(0.1f, Math.min(mScaleFactor,10.0f));
            mTestImage.setScaleX(mScaleFactor);
            mTestImage.setScaleY(mScaleFactor);
            return true;
        }
    }
}
