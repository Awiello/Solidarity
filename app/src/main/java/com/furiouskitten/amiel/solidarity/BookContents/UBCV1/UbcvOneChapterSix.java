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
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV1QUIZ.UbcvOneChapterNineQuizSS;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV1QUIZ.UbcvOneChapterSixQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV1QUIZ.Homeubcv1chapter6;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvOneChapterSix extends AppCompatActivity
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
        setContentView(R.layout.activity_ubcv_one_chapter_six);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter Five: Alliances for Networking and Technology (1986-1995)");

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
"The development efforts of WPC this time were geared towards the enhancement of role performance and devising schemes to ensure continued growth. Challenges met were valued as opportunities for more active participation in the improvement of the school program and to increase the operating efficiency of the institution. \n\nThe next school year that started in June 1985 showed a 9 percent decrease of enrolment with the biggest drop in the Secretarial program followed by Basic Engineering and Commerce departments. Courses, like the 2-year Electronics Computer Technician, 4-year Secretarial Education and the new Bachelor of Elementary Education curriculum were the new courses applied for at the opening of classes. The weakest point of WPC was the limited research output. So, the teachers were encouraged to undertake and write researches in their advanced studies; hence, the possibility for improvement. \n\n There was a massive integration of moral values in the elementary and secondary school subjects as required by PRODED and RSEP curricula. Instructional plans were utilized to a large extent together with the formulation of a uniform grading system. Along the line of development of educational standards, top priority was given to faculty and staff improvement. Appropriate measures were instituted such as upgrading personal and professional qualifications through evaluation, enrolment in masteral and doctoral programs and preparation of the Faculty Manual as a requirement for accreditation.\n\nThe students likewise had their own stages for development through  their active participation in contests and other external activities such as: re-establishment of the defunct Western Philippine Colleges Student Government (WPCSG) as the umbrella of 21 accredited student organizations; \"Walk for a Cause\" project during the Foundation Day with the proceeds earmarked for the Sto. Nirio Children's Center and the Holy Spirit Orphanage in Taal, Batangas; launching of the radio program \"Mag-ugnayan 'rayon every Sunday at 1:00 to 4:00 PM to promote healthy family values; massive program for physical education and facilities development; and the preparation of the Accreditation and Institutional Development Programs as the attempts to increase management and institutional effectiveness through self-evaluation, systematic training and development by PACUCOA on January 17, 1986. All weaknesses were converted into strengths in the Institutional Development Plan. School year 1986-1987 marked the massive launching of moral values in the college level and in all departments of the whole school system. It was in this developmental context that all Outreach Activity of the WPC students. It was the thrust of activities were the school to provide the necessary support for the planned and carried improvement of the society. out. Emphasis was on te o approaches and strategies that would enable given the admin• study station, faculty, and students to cope with the demand for effective learning. \n\nA temporary permit to operate the first year of the 2-year Electronics Computer Technology was granted on February 5, 1987, which actually boosted the enrolment in the department. The faculty was given further training on how to render efficient services so as to gain skills in coping with stress. as much as the weakest point in the college department I  was research, the administration launched a research contest to motivate the teachers and graduate students to write research papers.\n\nCo-curricular and extra-curricular activities were not overlooked by both students and teachers who encouraged and gave the needed support. As such, Student Catholic Action was revived and Fr. Isabelo  Acero was appointed permanent chaplain for the newly-constructed chapel. During this time, the administrators encouraged participation in different activities, such as: \"Alay sa Sta. Nifio\" program before the celebration of the city fiesta; \"Bigay Puso\" project which adopted three public schools; and the \"Lakad Mula sa Puso,\" which was included in the WPC Foundation Week to raise funds for indigent patients of the Batangas Regional Hospital; and coordination with St. Bridget College in the outreach program at Barangay Wawa, where the faculty and students conducted remedial classes for slow learners and adult education classes. \n\nDuring the opening of classes, Miss Freshman Day was scheduled as a form of orientation activities for the newcomers. Relative to academic excellence, seven out of eight graduates of Civil Engineering students passed the Board examination with 87.5% passing record. The five-year Institutional Development Plan was directed toward the over-all uplift of the quality of services and facilities. In this regard, it became essential for the college to improve the physical facilities like the installation of two drinking fountains, waiting shed donated by the high school PTA, construction of two lunch counters, and providing the typing rooms with the needed equipments. \n\nThese accomplishments paid off with the granting of the Deregulated Status and Level I Accreditation to Liberal Arts, Commerce, and Education (LACOMED) departments in 1987. The following year in March, Level II Accreditation for three years was granted to the LACOMED departments. \n\nIt became necessary to revise the curricula of the Bachelor of Science in Elementary Education and in Civil Engineering. At the same time, the departments modified all syllabi. There were renewed initiatives of all departments to strengthen their program Participation in accreditation projects and the involvement in the Education Service Contracting Scheme (ESC). Spill overs from the public schools were accepted at WPC whose tuition fees were paid by the Funds for Assistance to Private Education (FAPE). To keep abreast of the PACUCOA team's recommendation, certain measures were adopted like: the beautification of all campuses and tree planting at the Hilltop site; provisions for covered walks from the gate to the different buildings, and upgrading of sections of the library. \n\nThe students were more involved in various activities like cultural programs during the President and Chairman's birthdays. They attended the symposia on different issues organized by the different departments. They also took part in the Operation Linis. The administrators also organized first Friday Masses and a recollection day for graduating classes. Even the teachers became a part of the students' activities by acting as their advisers and supporters of worthy projects, like participation in Student Government elections as poll clerks/board of canvassers. Relative to extension and community development, the WPC students and faculty lent their helping hands by organizing the WPC Literary/Livelihood Project to uplift the economic conditions of the barangays; and conducting seminars on the prevention of drug addiction in selected barangays. The Technical department, on the other hand, spearheaded a seminar for out-of-school youth. Tree planting activity was also a part of the community beautification project.\n\nPursuant to the recommendation of the Accreditation Committee, all collegiate classes were relocated to Hilltop campus. They transferred to the Perez Hall, formerly occupied by the High School department, which was relocated to Catapang Hall. This necessitated President Abelardo Perez and Chairman Vicente Mayo further improvements in the physical facilities like construction of additional offices, classrooms, and covered walks for the protection of students, and the separation of the audio-visual section and technical area of the main library. In SY 1988-1989, Spanish was replaced in the general education offerings. New courses were approved like BS Math, short EDP courses, Industrial Electronics Technician courses with majors in Automotive and Bio-Med Electronics, and Electronics Technician Course with major in Electrical Technology. \n\nIn relation to student government, the administrators reactivated the College Discipline Board to insure order and discipline in the campus. The yearbook \"Core\" was changed to \"Vision\" and incentives in terms of honoraria were given to staffers. The school year was also the year of active involvement in cultural presentations. In the first Bb. Lungsod ng Batangas '89 Quest of the Batangas City's Cultural Affairs Committee, Miss Avegale Moraleja as WPC's representative easily won the title. Another first was the thesis/feasibility studies requirement for graduation as embodied in Regional memorandum No. 114 s. 1989. A total enrolment of 9,830 during the first semester and 9,454 in the second semester of SY 1989-1990 was reported. Courses were expanded by six additional course offerings such as the Two-Year Civil Technology, Welding and Fabrication Technology, Construction and Carpentry Technology, Industrial Technology with Major in Automotive, and one-year Industrial Housekeeping. New electives to enhance competencies in the are of concentration were also included in the curriculum. \n\nThree successful examinees hit the mark in the May 1989 CPA examinations followed by eight examinees in October of the same year. Three out of twelve contenders passed the Licensure examination for Civil Engineers. This year marked the birth of the WPC Dance Company due to the ardent desire of the students with terpsichorean skills to display their talents in dancing. Relative to student exposure to industries, on-the-job training program was extended to many companies like Shell, National Panasonic, PLDT, Philippine Air Lines, Philippine Broadcasting Company Channel 4, and NASUREFCO in Balayan, Batangas. In the field of academic and cultural contests, WPC students did very well. Along this line, a 12-member Committee on Culture and Arts was formed on March 13, 1990 to develop among students consciousness of Filipino arts and culture\n\nBecause of the activities. WPC became known in the entire province and even outside the province of Batangas. Hence, the rolment increased by more or leis 1.000 students in SY 1990-1991. For this tter, new courses were permitted to operate like Bachelor of Science • Computer Science, Bachelor of Science in Accountancy, Bachelor of Science in Biology, and Bachelor of Science an Chemistry. \n\nIn May 1990, tour out of eleven engineering examinees, equivalent to 36 percent, qualified in the board examination together with 13 percent CPA examinees who passed the test, Bigay Puso and Paskuhan so Agosto were activities undertaken in adopted barangays so as to utilize massive articipation of students. Student activities were maximized that bProught the campus to. the communities as a marketing strategy. Even the on-the-job trainings ensured the cooperation of a number of firms and government agencies. Another program that created a Significant effect on the students was the opening of the Little Museum adjacent to the library during the 45th Anniversary Foundation. Likewise, outstanding WPC alumni who excelled in their fields of endeavor were awarded Plaques of Recognition to Gen. Jose M. Aquino and Gen. Melecio T. Agtay. \n\nTo attract incoming freshmen, scholarship programs were expanded; facilities like Javier Hall, Guidance and Counseling Office and the medical and dental clinics were renovated and also expanded. Environmental threats to the school's viability, stability, and efficiency were looked into by the administration hence, additional equipment had to be purchased for various offices. Audio-visual room and museum and a nursery house for agriculture teachers were deemed necessary to be constructed. \n\nThere was a need for the strengthening of factors internal to the school's operation and the making of concrete decisions towards updating the program of study. Collective efforts were mostly for facilitating the attainment of substantial gains in various development projects.\n\nThe attainment of said gains was seen in the increase of 4.6 percent in the enrolment for SY 1991-1992. There was also a little increase of more or less 100 graduates at the close of the year. There was a need therefore to hire additional 20 new teaching staff members. The number of faculty enrolled in post-graduate courses also increased. The Board of Trustees approved the opening of short term Courses like the two-year Nursing Aide, one-year Nursing Aide, Pharmacy Assistant. Police Science, two-year Computer Secretarial and BS Computer Education.\n\n Level II re-accredited status was given to Liberal Arts, the 1 Commerce, and Education during 1991 PACUCOA visit; hence, the College enjoyed full administration and financial deregulation as well as priority in terms of available funding assistance for scholarships, library materials, and laboratory apparatuses. Dr. Corazon B. Cabrera, as Vice President for Academic Affairs, prepared the Dean's List so as to motivate the students to strive harder in their academic standing. Eighty-eight (88) students qualified as Dean's Lister and were granted full and partial scholarships and membership in the honors program based on the approval of the Board of Regents in 1992. Students also performed favorably in athletics and literary-cultural contests but the credits were not included in the computation of academic honors in college. However, research output was still limited because the faculty members devoted more time and attention to materials preparation like workbooks, proto-type lesson plans and others. ";
        String pageContentTwo =
"Relative to reading matters, the faculty and students were given greater involvement in the selection of books. Several volumes of books and journals were acquired from the Thomas Jefferson Library and FAPE. In line with improvement and development, WPC had provisions for physical facilities, renovation, repair, painting, and re-wiring of the computer laboratories, construction of 40 long computer tables and the construction of the WPC gymnasium. For quality education and envisioning of broadened programs and services, the direction undertaken in Sy 1992-1993 was focused on the expansion of curricular offerings and improving its absorptive capacity. This challenge was brought about by the emerging industrialization trend of CALABARZON projects.\n\nMassive implementation of marketing strengthening of linkages with industrial strategies and establishments were eyed through curricular upgradainn of h dg business and community-based competencies and pursuance of research projects to enable the institution to turn out quality graduates. The enrolment increased again in all courses with the biggest rate of 61 percent in Bachelor of Science in Computer Science. Government recognition was granted on February 15, 1993 to one-year Auto Diesel Mechanics, one-year Auto Gas Mechanic, one-year and two-year Nursing Aide, 2-year Electric Technology, P Assistant, and Two-year Police Science. Meanwhile, Licha rmacy e examination in Civil Engineering revealed scores way above t national passing scores, a proof that graduates of the course werhe e trying to excel. \n\nAs in the past years, on-the-job training was well-coordinated. The college was also actively involved in drug abuse prevention integrated in literary and cultural presentations. Particular attention was given to developmental projects like affiliation with Edu Vision 2000. This consultancy firm provided resources for upgrading education through computer assisted instruction. Teachers were trained in a seminar workshop to prepare them for classroom implementation. Campus ministry continued as a movement to strengthen the foundation of the true Christian life. \"Mag-ugnayan Tayo\" marketed college offerings via the radio program aired every Saturday afternoon; \"Sulyap sa Kalinangang Batangueno\", a telenovela program initially presented on January 16, 1993 featured outputs of faculty cultural researches. \n\nThe program was aired every Saturday at 6:00 to 7:00 PM through CATV, Channel 6. With the increase in student population, the construction of facilities and purchase of equipment were deemed necessary like the multi-purpose hall, more classrooms and comfort rooms, computer laboratories, temporary garage, roofing of the stairs of the Administration building, and a presentable moot court for the College of Law.\n\nThe following School year 1993-1994 was highlighted by visible growth in terms of construction and completion of the Tech-The building, additional wings of the Engineering building, and temporary classrooms for the ever-increasing population. The college's facilities, fixtures, furnitures, and equipment were either renovated, updated or acquired to cope with the growing demands of the students like the 313 KUA 250KW electric generator; hundreds of computer units, air conditioners, and books. Laboratories for new course offerings such as Physical Therapy, Nursing, marine Technology, and Pharmacy Assistant were designed at can parallel those in leading hospitals. \n\nGrowth was not only in terms of structures but also equated with employees' satisfaction. More rooms were constructed to meet the demands of quality education. With the upward trend in enrolment and in the number of graduates, the college also worked for a higher status. \n\nCurricular programs were geared towards enrichment of educational outcomes and diminishing inflexibilities. Programs were modified by using strategies to yield varied forms of learning, relevant teaching techniques, instructional materials, and innovative transformation to satisfy basic learning needs. In June 1993, the College of Law, which was phased out in 1979, was reopened in the belief that it would contribute to the attainment of the school's mission to the community. In the post-secondary and tertiary levels, there was a need to step-up efforts for incorporating newer learning approaches and in developing a diversified range of program offerings. \n\nSimilar activities were also given greater emphasis on intensification of values development. The Expanded Spiritual Renewal Program was organized as an appropriate measure to imbue love of God, respect for human rights, and concern for discipline and productivity. Elementary religious instruction, rituals related to religious affiliations, campus ministry, first Friday masses, Filipino values related to work ethics and concern for environmental protection contributed to the success of the program. Partnership with Edu Vision 2000 for computer assisted learning as an innovative program, together with modern teaching strategies, as well as the strengthening of the curriculum and making it responsive to the needs of learners and the demands of a changing society were all made possible in the WPC's desire to provide better services to her clientele. In view of the very limited research outputs, steps were undertaken to strengthen research capability and provide substantial gains to the community being served and on-the-job training was likewise maximized. \n\nIn June 1993, the Allied Medical Sciences opened the five-year B.S. Therapy, BS Occupational Therapy, and the four-year BS Respiratory Therapy courses with an enrolment of 110 students. This paved the way for growth in curricular offerings. New alliances were also forged so as to establish linkages with the University of Ryukyus in Okinawa, Japan for possibilities of services and resource materials necessary for the enhancement of the capabilities of the college. \n\nAlberta Vocational college in Edmonton, Alberta in Canada was also willing to enter into a partnership with Western Philippine Colleges. More foreign alliances hopefully would be realized for a mutual educational set-up• With the onset of SY 1994-1995, the college administrators pledged for a higher commitment to improve on a larger scale the education it provides to the student clienteles. At this point, numerous initiatives were undertaken such as improvement of the curricular program; upgrading of physical facilities, and expanding community outreach projects. \n\nStrategic planning and management by objectives with outputs in terms of group action plans reflected the modification and strategies to make them conform to the WPC mission statement. Student development provided students with ample opportunities for them to develop not only mentally but also physically, psychologically, culturally, and spiritually. The school paper became independent and completely managed by the students. Similarly, the student government became an independent body with two organizations accredited or recognized. The SG was considered a partner in the changing environment in the academic community. For this matter, consultative dialogues were conducted with student leaders. \n\nIn the desire to improve physical facilities, the library was made fully-airconditioned. At the same time, canteen services were expanded. New buildings, classrooms, and study areas were constructed while the existing pathways were covered with roofing. Other developments were the construction of the Computer Science building; 22 temporary high school classrooms; construction of the WPC Community Cooperative store, anatomy laboratory in the Engineering building, and the renovation of the downtown campus, the main library, the different offices, and the canteen.\n\nJune 1994, the first classes of the College of Nursing and Midwifery started kvith thirteen students who enrolled in the four year Nursing curriculum. At the same time, there were nine students for the two-ear Midwifery program. Cultural development was also given emphasis by hiring consultants in folk dancing and music. As incentives, scholarships and tuition fee discounts were offered to choral group members and WPC dancers. \n\nLeadership was given a boost with the leadership training workshops conducted during the school year that produced a big harvest of responsible and dynamic student and youth leaders.  Community outreach activities related to route survey, traversing, profile leveling, and cross section dwelling were engaged in by the College of Engineering. Samahang Batanguena, assisted by the WPC students, offered a comprehensive literacy program to the out-of-school youth. Young housewives and students from Batangas City and neighboring towns were given free computer lessons. \n\n The publication of the Research journal could be an invigorating activity that Could possibly attract researchers to produce more research outputs. Finally, the college staff in of accreditation had to •exert double efforts in preparin timonial evidences for g all tes  submission to the accrediting team. Meanwhile, plans for the celebration of the 50th foundation of the Western Philippine Colleges had been launched and everybody promised not to leave any stone unturned to make the affair a grand celebration. The remaining six months of the year 1995 were devoted to the mobilization of human resources in preparation for the 50th foundation of the College. Numerous project planning activities and strengthening of programs and services to gain assurance of meeting the requirement for university status were also done. The academic offerings were enriched with the additional program in the Graduate School—Master of Business Management major in Human Resource Management, Master in Public Administration, and Master of Science in Mathematics. \n\nThe permit to open the course Bachelor of Science in Mass Communication was granted on November 8, 1995; thus, a fully-equipped language laboratory to meet the need for advanced communication technology was constructed. Likewise, the course Bachelor of Science in Accounting Management, a non-board program, was opened to screen enrollees to the Bachelor of Science in Accountancy and increase the chances of better performance in the Board examination for CPAs. Other courses opened were two-year Marine Engineering, two-year Marine Transportation, one-year Basic Marine in Engine and Deck Personnel, and one-year Refrigeration and Aircon Technology. Technical Education was given recognition by TESDA due to its upgraded facilities. At this time, WPC envisioned a strong research program that would focus on basic and applied research outputs. The initial step to visualize the vision was to convert the office of Research, planning and Development to Research and Development Center managed by the Assistant Vice President for Research and Development.\n\nResearch activities were planned; teams of 10 faculty researchers were formed; a research manual was developed that broadly defined the research agenda, philosophy, organization, and internal and external linkages like membership and linkages in the NRCP, PSERE, BIOTA, PICE, and MSP. In addition, more rooms for research to expand the research area was constructed. In the same vein, computer programs like Micro Stat—SPSS software were acquired to facilitate data analysis and interpretation. To booster research, the first volume of the research journal \"Kalinangan\" was published. It was a quiet year in so far as students complaints were concerned. The concentration of the College was devoted more on academic, non-academic contests and athletics.  Even community extension program was given emphasis through massive involvement of the faculty and students in outreach programs in Barangay Madalunot in Calaca; some depressed areas in Batangas City and places that experienced natural calamities. \n\nPrograms like tree-planting with the slogan \"Tsang Puno, Ating Buhay any Katapat\" and \"Oplan: Sagip Kababayan\" were actively engaged in by students in all levels. Cultural programs were presented by the Tanghalang Dal'wa Singko while the WPC Dance Troupe joined in the street dancing sponsored by the Cultural Affairs Committee of Batangas City. Even guest dancers from Mendez, Cavite were invited to participate in the \"Sanghaya sa Kultura.\" The two-week Christmas vacation proved to be busy weeks for the faculty and students in preparation for the grand celebration of the 50th year of the founding of the Western Philippine Colleges.";

        mChapterText.setText("Chapter Five");
        mTitleText.setText("Alliances for Networking and Technology (1986-1995)");

        SpannableString spannableOne = new SpannableString(pageContent);
        SpannableString spannableTwo = new SpannableString(pageContentTwo);
        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showWpcDancersImage();
            }
        };

        ClickableSpan clickableSpanTwo = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showExtensionBuilding();
            }
        };

        spannableOne.setSpan(clickableSpanOne, 9315,9333, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //wpcdancecompany
        spannableOne.setSpan(clickableSpanTwo, 7481,7577, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE); //extensionofbuilding
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
            startActivity(new Intent(this, Homeubcv1chapter6.class));
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
        getMenuInflater().inflate(R.menu.ubcv_one_chapter_six, menu);
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
            youTubePlayer.cueVideo("DRmGfVBz_3M");
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
    public void showWpcDancersImage(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.wpcdancers);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    //image dialog popup
    public void showExtensionBuilding(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.extension);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }


    //firebase auth

    public void updateNavHeader() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        View headerView = navigationView.getHeaderView(0);
        TextView navUserMail = headerView.findViewById(R.id.bookMenuDrawerEmail);
        ImageView navUserPhoto = headerView.findViewById(R.id.bookMenuDrawerImageView);

        navUserMail.setText(currentUser.getEmail());
        String photo = String.valueOf(currentUser.getPhotoUrl());

        Picasso.get().load(photo).into(navUserPhoto);
    }
}
