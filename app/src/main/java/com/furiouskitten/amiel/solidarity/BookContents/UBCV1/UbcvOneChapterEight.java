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
import com.furiouskitten.amiel.solidarity.BookContents.VIDEOS.UbHymnActivity;
import com.furiouskitten.amiel.solidarity.BookContents.VIDEOS.UbMarchingHymn;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV1QUIZ.UbcvOneChapterEightQuizSS;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV1QUIZ.UbcvOneChapterOneQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV1QUIZ.Homeubcv1chapter8;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvOneChapterEight extends AppCompatActivity
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
        setContentView(R.layout.activity_ubcv_one_chapter_eight);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter Seven: At the crossroads of 21st Century");

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
"The University of Batangas at the onset of the 21st century had already envisioned greater challenges linked to aspirations for innovations and changes towards more purposeful goals in making the program offering more relevant, functional, and attuned to the demands of the international market. \n\nThe institution had started to move with enthusiasm toward a new and wider horizon and had blazed new trails in providing new types of learning experiences. Coupled with the inclusion of technology learning, modern devices, and foreign languages, is the emphasis given to values across course content. Networking efforts with outside entities had been started in exploring varied research areas, extension work, and core values that guided the noble fathers in the founding of the Western Philippine Colleges, now the University of Batangas. \n\n The celebration of the University's foundation is traditionally set annually during the third week of February. The 60th Founding anniversary and the 10th University celebration was held in February 2006—an affair capped by the Eucharistic celebration, memorial lecture, and President's Night, parade, and selection of Miss UB. Academic and cultural contests were participated in by student representatives from each department with the \"Singing Idol\" contest as the center of attraction and the most popular activity. Likewise, the Anniversary Hymn for the 60th year of UB's Foundation, a jingle composed by tandem Ms. Lucita Baroja and Dr. Edward E. Bahasa was launched as the theme song of the celebration. However, the traditional UB March is retained as the University Hymn. \n\nThe59th Commencement Exercises on April 7, 2006 was highlighted by the conferment of the degree of Doctor of Laws (Honors Causa) on Supreme Court Justice Renato Antonio C. Corona as the honorary degree program, Justice Corolla was also the guest speaker. The next SY 2006-2007 was a very challenging year. After 60 years since its founding in 1946, and after 10 years as a University, the University of Batangas had successfully traversed the critical paths towards becoming a modern University of Choice. Linkages had also been started with the industries particularly those in Batangas relative to the graduates they prefer to select for employment and the courses, curricula, and training that they provided to the students so as not to create a mismatch between course offerings and market needs. \n\nWhile the courses are mainly student-centered or based on students' preferences, the University offers a variety of relevant courses to develop a comparative advantage where the students could make a broader range of choices. At the same time, those courses are rooted to the needs of the community for a higher level of socio-economic development. \n\nExtension services to underdeveloped Barangay marginalized communities are provided. Meanwhile, it had achieved si ed as UB's commitment. significant research linkages With ASAIHL in Jakarta, Indonesia and had worked out joint projects with on sustainable development and marine bio-diversity. The University of Batangas received  citations from PACUCOA for the Prestigious awards and most number of courses offered and most number of accredited programs. In spite of the recognitions, the institution did not lag behind in its efforts to sustain a continuous program of accreditation. \n\nIn addition to accredited programs, the UB examinees in Accountancy, Elementary and Secondary Education, Law, Engineering, Nursing, Nhclwifery, and Allied Medical Sciences garnered passing rates way above the national passing percentage. The dawning of the 6th decade of UB's colorful and historic rise to fame and glory brought about the continued effort of the administration ably supported by President Abelardo B. Perez to work for quality excellence and the International Standardization Organization (ISO), an internationally-recognized accreditation befitting the status of a modernized globally-oriented university. The President at that time quipped that the \"vision of the future is already the future attempting to being.\" \n\nThe realization of past visions well as the new dreams and aspirations was cut short by the mighty and cruel hands of Fate with the unexpected passing of the beloved President on the early morning of April 18, 2007 due to cardiac complications. In a span of 40 years, he was the patriarch, chief academic executive, and a leader who \"shepherded the growth of the college into a university.\" When he came home from the United States as an EENT specialist, he only wanted to serve WPC as a school physician but as Fate would have it, his services extended beyond what he aspired to be. As Chairman of the Executive Committee and concurrent President, he rose to become the third President from 1967-1971 and elected again as the fifth President after the stint of Mrs. Flordeliza Arguelles. This position was entrusted to him until his demise in 2007. \n\nExcellence in academics in the Colleges of Engineering, Education, Allied Medical Sciences, Commerce, Business and Accountancy and in the Bar examinations. Awards and prizes from various scholastic competitions had been earned year in and year out making the University of Batangas \"Undeniably the Best.\" The principles of \"faith in God, love of wisdom, and service to fellowmen\" guide the daily lives of the entire community of Batangas City and suburbia. All these principles are interwoven in a common desire to achieve quality education with spirituality in the center of all activities in the University of Batangas. Holistic development is imparted to the students who are exposed to all kinds of activities during the celebration of UB Week in August and Foundation Week in February. The Special Children's Foundation and the Waldorf School International have their own plans to booster the development of the special learners. \n\nThe High School Dance Troupe had a total of 45 or more performances not only in the university but also provincewide. The Elementary department has produced student champions in Taekwondo in the regional and national levels and even in the Palarong Pambansa. \n\nTen UB students had been lucky to enjoy the academic exchange program for one year at the Yeungnam University of Korea starting with the third quarter of 2009. As regards service to the community, the extension program Barangay Munting Tubig in lbaan, Batangas ended in 2010 but the adopted barangay. community of Sala, Balete, Batangas has been selected as the new adopted barangay \n\nBeing committed to provide the best education and the best facilities, the Dr. Abelardo B. Perez Hall, home of the College of Tourism and Hospitality Management is now functional. The oldest building in the Hilltop campus, the Francisco G. Perez Hall, has been completely renovated and provided with aircon units in all classrooms. All rooms in the buildings at the Hilltop campus eventually were made fully air conditioned to safeguard the health of the students and make them comfortable in their second home. Similarly, the entire elementary school buildings in the Main campus are provided with air conditioning units. \n\nThe Pallocan West campus near the SM Mall and the Holy Trinity church, a newly-acquired campus worth 30 million will be the future home of the High School department. The property has been enclosed with fences. Meanwhile, Pallocan East campus, site of the UB Special Children's Foundation and the UB Waldorf School International has been improved in view of the yearly visita iglesia during the Lenten season and the pilgrimage to the life-sized Stations of the Cross.\n\nAs the modern age demands strong linkages, UB signed Memoranda of Agreement with excellent engineering schools like Mapua Institute of Technology and Technological Institute of the Philippines for a wider scope of academic activities like faculty exchanges research, placement of OJT students and graduates, and closer ties with multi-national companies. As the LlI3 grows with the present time, linkages with companies like Allied Telesis and Smart ADIS were forged for the improvement of the computer network and computer-based programs. partnership with SMART Communications like the UBAT Sim was launched for free. Through this program, students receive messages from UB regarding announcements and advisories during calamities and weather disturbances. \n\nSuccess followed one after another in the Uuniversity. This was proven by feats of faculty members elected as officers in national and regional organizations. Faculty members sent abroad as representatives of the institution or as research paper presenters in foreign universities brought home honors. Students of the College of Tourism and Hospitality Management were hired as workers in Singapore after the on-the-job training, a valid gauge of the effective UB academic training and excellent student performance. \n\n On the other hand, the Batangas Heritage Center, pet project of the late President Dr. Abelardo B. Perez, started to publish a brochure on the UB presidents and founders. Eventually, the Batangas Heritage Center launched on April 27, 2010 its first publication. The book was entitled Fr. Vicente Catapang and the History of the Philippine Education, which was annotated by Dr. Lino L. Dizon. The Batangas Heritage Center started to collect and document cultural materials related to the University and the province of Batangas. Ready for publication are the two books written by Dr. Lionel Buenaflor, head of the Batangas Heritage Center. The first is about the four colonial churches in the Province of Batangas that had been affected by the 1754 eruption of Taal Volcano: Taal, Bauan, Lipa and Tanauan. This will be entitled Las Iglesias Coloniales en la Vida de los Batanguetios. The second is about the philosophy of Apolinario Mabini. This will be entitled The Metaphysics of Hope of Apolinario Mabini. Due to lack of funds, the publication of the two books are temporarily withheld. \n\nSpeakers during the 1st Dr. Abelardo Perez Memorial Lecture Series on the theme: \"Anting-anting sa Makabagong Panahon\" From left to right: Mr. Aquino Garcia, Director of the Cavite Studies Center; Dr. Jeffrey Lubang, Program Development Officer of Cavite Studies Center; and the late Dr. Regino Paular of the National Historical Institute. \n\nLikewise, the first Dr. Abelardo B. Perez Memorial Lecture was launched by the Batangas Heritage Center in SY 2008-2009 in cooperation with the Cavite Studies Center in De La Salle University Dasmaririas. With the rise of UB to prestige and power, frequent reorganization of key positions was undertaken.";
            String pageContentTwo =
"The position of Vice President for Academic Affairs as the side arm of the President had undergone three movements during this decade. After the retirement of Dr. Corazon B. Cabrera on October 19, 2005, Dr.Victor M. Arguelles took over and served the institution for four years. Upon his retirement in May 2009, Dr. Abegayle M. Perez-Chua replaced him on a concurrent capacity as Vice President forAcademic Affairs and Dean of the College of Allied Medical Sciences.\n\n The office of the VP for Administration was given to Mr. Alex Ramos, ointed Vice president for while Mrs. Rosario S. Perez was app Jesus Victor Mayo was Business and Finance and Treasurer; Atty. designated Vice president for Students and External Affairs while Dr. Florencio V. Reyes was appointed as Vice president for Research, Publications, Linkages and Liaison, together with Dr. Editha Mission who was appointed Assistant Vice president for Accreditation, Recognition, and Awards. Associate deans and other officers were also designated with the hope that these leaders would assist in bringing UB to greater heights. It should be noted that each passing year produces a new UB image that has fully bloomed.\n\nA very strong foundation of mighty and witty men and women champions in the sports arena and in the academic battle of the minds as well as top performers in licensure examinations could not be overpowered anymore. BATANGAS A close scrutiny of the map of Batangas province reveals a bull-shaped territory. The face of a bull with horns. as those of the carabao serves as the head attached to the animal's bended body and supported by fore and hind legs. \n\nIt could be deduced that the University of Batangas is a symbol of the power and might of a bull due to the strategic position it occupies in the territorial limits of the province. The University's success in all kinds of endeavors inspired Chairman Atty. Vicente A. Mayo to make an analogy bull, symbol of strength and bravery. of the UB and the \"Brahman\" for the UB mascot— Thus, he coined the word UB's might and power—strong men and women of distinguished orders from the land of castles and heroes.\n\nMascot Brahman proudly rnarshalled the walking parade of talents and alumni during the 62nd Administrators from the president to the rank and file and the anniversary of UB's Foundation. The solid proof of the UB's continuous climb to the top is visualized in the great performance of the College of Education (Elementary and Secondary), College of Business and Accountancy, and the College of Law with their consistent high passing scores above the national passing percentage; 6th and 13th placers in the Nursing Board examination; No. 1 performing school in the 2009 Nursing Licensure test province Wide; No. 2 ranking school in the 2009 Midwifery Board examination; and the UB College of Electrical Engineers Integrated Chapter of UB as the most outstanding chapter. In the May 2010 Civil Engineer's Board Examination„ UB is the second top performing school nationwide next to the University of the Philippines-Los Banos. In the recent CPA Licensure examination, the UB examinees occupied the top berths. The University has finally reached the peak of success in its long, hard climb for excellence but it has to move on since the journey towards greater achievements is still long and tedious. The seeds planted by the \"Pioneering Fathers\" are now bearing fruits. The harvest is bountiful due to the grace and blessings of the Divine Power that guides the destiny of the University of Batangas. Manifestations of God's love for an institution born because of love are the four Level II and five Level III accredited programs and deregulated statuses, AJA JAS-ANZ ISO 9001:2008 certified institution as of 2009; the Autonomous Status awarded on April 15, 2010, the Center of Development award granted to the College of Business and Accountancy in 2010, another prestigious award given to only five institutions in the Philippines, and the Center of Excellence in Teacher Education award given in July 2010. This award is significant and will go down in history as the only Center of Excellence in Teacher Education in the province of Batangas. N.New boundaries had been crossed to meet local and inter nationai standards. \n\nThe deep concern for the academic growth of the Batanguefios is being satisfied by the ETEEAP by turning out Masteral education graduates through the equivalency system and accreditation seminars and leadership trainings. At the same time, a total of 1, 003 TESDA scholarship grants had been availed by students who had undergone short term and finishing courses either as call center agents or caregivers. To achieve the University's vision of excellence, the Batangas Review Center for Nursing and Engineering graduates conducts review classes for the UB graduates and non-UB reviewers. The center, since its organization, has produced examinees whose scores are above the national passing percentage, besting the reviewees from other schools. In the latest release of the Nursing licensure examination, UB examinees garnered the number one slot in Batangas City and number two in Batangas province. The University keeps on growing to attain its vision. The growth commenced with the construction of buildings and expansion of the physical plant. \n\nThe edifice assigned to the Waldorf School International was completed and occupied by the young learners whose minds, hearts, and bodies are being specially trained and developed. At the inception of the fully owned internationally patterned school, it was managed by UB's Elementary department. It is now an independent entity with Dr. Shaneil R. Dipasupil designated as Principal on June 2010 and Mrs. Lolita F. Tegon as consultant. \n\nFor purposes of achieving continuous academic growth, new courses were offered for SY 2010-2011 namely: BS Legal Management, BS in Information Technology and Communications, Bachelor of Library and Information Science, and hopefully, BS in Criminology and BS in Marine Science by next academic year. The Commission on Higher Education recognized the Doctor of Jurisprudence program of the College of Law as a model Course and a forerunner followed by the Ateneo Law School curriculum, which is another source of pride for the University of Batangas.\n\nUB’s expansion program has already crossed the high seas i has traversed the high lands and cities thereby clearing all oru_iers to carry out its commitment to academic growth and bavielopment. The College of Graduate Studies branched out to delapan, Oriental Mindoro with more or less 170 enrollees in the Ca cteral level at the Luna Goo° Colleges at the opening of the first nla'ester of School Year 2010-2011. A Memorandum of Agreement was entered into by the UB and Calayan Educational Foundation Inc. for a partnership in the Graduate Extension program in November 2010 that marked the start of the program in Lucena City with an enrollment of more or less 40 graduate students.  In line with the expansion program, the construction of school buildings for the Lipa City campus is completed on June 2011. Courses being offered include Education, Legal Management, Information Technology, Business and Accountacy, and Criminology. Just before the 65th Founding Anniversary in February 2011, bountiful graces in the form of awards kept on pouring like rain from the heavens above.\n\nThis is the actual year of fulfilling the dreams and aspirations of the past and present educational leaders and most of all, the vision of the Noble Founders. Their efforts had not been in vain for the dreams they had yesterday are the realities of the Present era. \n\nThe scenario in UB's colorful history has taken a new shade in the course of time with the rapid rise from an inmfantulti- inawa stitution rded striving for existence and academic supremacy to a  University that has finally bloomed to full maturity. Weathering all storms and surmounting all odds and difificulties, it has set up new grounds in its quest for academic excellence and enhancement of career opportunities. The flagship of the College of Law, which was hoisted when the institution was still a yearling, has remained in full mast with of Batangas could be p achievements that the University Aside from the yearly high passing percentage above the national recognized of passing average, the Commission on Higher Education  the UB College of Law as one of the top 20 law schools and model school in the country; granted by the Supreme Court MCLE Education Provider. Practicing lawyers could now avail of Governing Board the authority to be a Mandatory ContinuingthLeeg3a61 hours credit units to maintain the practice of law\n\nRecent barristers of UB have moved higher in their law career. Prosecutor Cynthia Ricablanca was appointed Presiding Judge of RTC in Sta. Cruz, Laguna while Judge Myla Villavicencio-01an was appointed MTC judge of Padre Garcia, Batangas. Atty. Charito Sawali, JD'03 graduated cum laude, Masters of Law at the University of Santo Tomas. \n\nThese achievements are the symbols of the excellent foundation of UB education. They are the reflections of the  performance of the university in terms of quali over-all ty education attained through hard labor, strong faith in the Almihty maintaining a culture of excellence. g and perseverance in In recognition of the countless blessings and astounding accomplishments, President Hernando \"Nani\" B. Perez, one of the \"inheritors of the founders' glorious past,\" made the remark that the fondest dreams and promises were fulfilled through the assistance of the Greater Power. Everybody worked hard as One big family, strongly united in making the University of Batangas, the \"University of the Future,\" the \"University of Choice,\" \"Undeniably the Best,\" and \"Home of the Champions.\"";

        mChapterText.setText("Chapter Seven");
        mTitleText.setText("At the crossroads of 21st Century");

        SpannableString spannableOne = new SpannableString(pageContent);
        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showJapaneseKempeitaiImage();
            }
        };

        ClickableSpan clickableSpanTwo = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getApplicationContext(), UbHymnActivity.class);
                startActivity(intent);
            }
        };

        ClickableSpan clickableSpanThree = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(getApplicationContext(), UbMarchingHymn.class);
                startActivity(intent);
            }
        };

        spannableOne.setSpan(clickableSpanOne, 0,26, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//UB pic
        spannableOne.setSpan(clickableSpanTwo, 1431, 1501, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);// UB Jingle next ub hymnnnn
        spannableOne.setSpan(clickableSpanThree, 1565, 1621, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);// UB hymnn
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
            startActivity(new Intent(this, Homeubcv1chapter8.class));
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
        getMenuInflater().inflate(R.menu.ubcv_one_chapter_eight, menu);
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
            youTubePlayer.cueVideo("syI8jtLtuak");
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
        imageView.setImageResource(R.drawable.meyn);


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
