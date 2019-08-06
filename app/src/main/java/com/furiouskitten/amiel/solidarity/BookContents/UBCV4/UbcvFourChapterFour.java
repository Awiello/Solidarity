package com.furiouskitten.amiel.solidarity.BookContents.UBCV4;

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
import com.furiouskitten.amiel.solidarity.Activities.UbcvFourChaptersActivity;
import com.furiouskitten.amiel.solidarity.Activities.UbcvThreeChaptersActivity;
import com.furiouskitten.amiel.solidarity.Authentication.LoginActivity;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV3QUIZ.UbcvThreeChapterFiveQuizSS;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV4QUIZ.UbcvFourChapterTwoQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV4QUIZ.Homeubcv4chapter4;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvFourChapterFour extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, YouTubePlayer.OnInitializedListener, YouTubePlayer.PlayerStateChangeListener, YouTubePlayer.PlaybackEventListener{

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
        setContentView(R.layout.activity_ubcv_four_chapter_four);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter Four: Community Extension Service");

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

        String pageContent = "STUDENT AND EXTERNAL AFFAIRS (SEA)\n\nSEA Vision \n\nUB graduates will be leaders and valuable members of the community in the 21st century. Toward this end, Students and External Affairs will provide quality programs and services consistent with the excellence of our students, faculty, and staff. \n\nSEA Mission\n\nThe Office of Students and External Affairs aims to support the academic success of UB students, to foster their mental, social, cultural, and physical development, and to enhance the quality of their student life experience. \n\nSEA Goals \n\n1, SEA programs and services will be responsive, convenient, and cost-effective in supporting students in achieving academic success and personal development.\n\n2. SEA will forge meaningful, mutually-beneficial partnerships with other schools, colleges, universities, and community entities.\n\n3. SEA management will be accountable for attaining high levels of achievement in advancing the SEA mission, vision, values, and goals.\n\n4. SEA staff will have regular opportunities to assess their individual, professional, and work-related needs with identified developmental needs.\n\nCES History\n\nThe External Programs of the University of Batangas, formerly Western Philippine Colleges, formally started way back on May 20, 1985 with the appointment of Mrs. Remedios L. Cilindro as Dean of External Programs. Nevertheless, the extension services had been an integral part of the school's plans and programs since its foundation having provided functional literacy, livelihood development projects, feeding programs for malnourished children in depressed areas, coordinated and facilitated the conduct of seminars on drug abuse prevention, responsible parenthood, nutrition, etc. in various schools and communities in Batangas City and suburbs, gift giving to indigents and school children during Christmas and Foundation Days, ‘’Care and Share Program’’, ‘’Bigay Puso’’ etc. Catalino T. Samonte, the Personnel Officer of the College, was given the position after the retirement of Mrs. Remedios L. Cilindro.\n\nThe new Director presented to the President a proposal for the adoption of a barangay to hold the school's Outreach Development Programs. Ruby addition, a full-time External progra Coordinator, Mrs. Mayo-Baiason, was appointed on December 1, 1997 to assist the SAEP Director in implementing the community outreach programs and projects of the university. During the SY 1995-1996, the university started a community outreach project solely undertaken by a private educational Hi institution in the province,  the Free Evening  School for indigent students. \n\nCES Vision \n\nThe Community Extension Services (CES) as a Corporate Social Responsibility (CSR) of the university envision a dynamic participation, partnership and volunteerism in providing a holistic development that brings significant impact to the community. \n\nCES Mission\n\nThe Community Extension Services, is committed to promote total development of adopted and assisted communities through the enhancement of knowledge and skills shared by UB Volunteer Extension Coordinators that will facilitate equal access to resources and opportunities for the upliftment of the people's political, social, economic, moral and intellectual life geared toward self-reliance and cohesiveness. \n\nCES Goals\n\n1. To adopt communities where literacy, livelihood, and technology transfer projects can be implemented with the direct and indirect involvement of the UB family. \n\n2. To support/sponsor medical and dental missions in indigent barangays in coordination and cooperation with services and welfare organizationsn.\n\n3. To provide staff assistance, lecturers and training on Social, Cultural and Sports components such as anti-drug abuse education, peace and order, theater arts, health and safety, labor laws, cooperative, leadership, culture and sports, etc.\n\n4. To develop and strengthen the human and spiritual aspects of a person or individual through enhancement programs like group dynamics, recollection, retreat, etc. \n\n5. To support environmental programs and other community development projects.\n\nCES Capabilities \n\n1. The CES under the Community Assistance with Local Linkages (CALL -UB).\n\n2. Undertaking the Free Evening High School Project for the indigents as a contribution to the Education for All Programs of the Government\n\n3. Providing skilled and w ell-trained faculty members, employees and student leaders whocan prepare training designs and conduct seminar workshops) teach-ins, symposia and fora on cooperatives, peace and order, health and safety, drug abuse prevention, labor laws, livelihood projects and others.\n\n4. Adopting a barangay for a period of five (5) years and assist other barangays/ communities on self-help and development projects. \n\n5. Coordinating and establishing linkages with government and non-government organizations engaged in community development and public welfare programs.\n\n6. Mobilizing volunteers for community projects like tree-planting, cleanliness and beautification and other environmental projects. Providing transportation and allowances to volunteer workers who participate in community extension service. \n\n7. Conducting solicitation schemes and fund raising activities for the benefit of depressed communities through free medical-dental missions calamity-relief assistance and other donations. \n\n8. Providing consultants, writers, translators and designer of brochures, pamphlets, leaflets and posters for developmental project support and promotion. \n\n9. Conducting sports clinics, cultural workshops and of co-sponsoring of presentation as support activities of developmental projects. As part ‘’Alay- Kultura'' project, the faculty, employees and students cultural groups are actively involved in this project.\n\n10. Making the university's resources available for the community.\n\nCES Operating Principles\n\nThe University of Batangas Community Extension Services must be able to respond to the call for societal transformation by serving the poorest of the poor, the less privileged, the deprived and the oppressed. \n\nThe University of Batangas Community Extension Services shall operate on the following principles: \n\n1. Extension service goals should be achieved through the participation of the stakeholders and the University community. The potential of the stakeholders will be identified and developed to the end that the target community shall be trained and capacitated to solve their own problems and make and implement their own decisions. 1. Extension service goals should be achieved through the participation of the stakeholders and the University community. The potential of the stakeholders will be identified and developed to the end that the target community shall be trained and capacitated to solve their own problems and make and implement their own decisions. \n\n2. The leadership and managerial skills and potentials of the community leaders shall be developed. CES shall prepare these leaders to continue carry on with the project operation after active community extension work by the community shall have ceased.\n\n 3. The university shall establish a clear time frame. The gradual phase-out of the community extension workers shall be co-terminus with the funding of the extension program as approved by proper authorities. \n\n4 There shall be continuous monitoring of the project from the planning stage and beyond the phase-out or project termination phase. For this reason, the community shall be trained to handle and sustain project monitoring in order to increase the community's involvement in the management process.  5. The target community shall be enjoined to identify their needs and problems. The community shall be encouraged and motivated to seek alternative solutions to their own problems.\n\n6. The project should prove to be sustainable by:\n\na. Advocating organizational policies and sanctions as determined by the respective community;\n\nb. Institutionalize self-help concepts to bring about internal organizational funding;\n\nc. Continuing social and technical education for its members. \n\nCES Structure and Organization \n\nThe Community Extension Services of the University of Batangas is headed by the President and is assisted by the Vice-President for Students and External Programs, the Director for Student Affairs and External Programs, the External Programs Coordinator and the Assistant External Programs Coordinator. Community Extension Service Coordinators (formerly called Designated Contact Persons) from the different Colleges/Departments/Offices are appointed every school year in order to maximize involvement from among the UB family and achieve a more systematic Outreach Programs. \n\nThe External Programs Coordinator \n\nUnder the immediate supervision and direction of the Director, SAEP, the External Programs Coordinator shall perform the following Duties and Responsibilities aimed at providing services to the UB family and the people in general:\n\n 1. To coordinate and assist in the preparation of an Integrated External Program of the school, students' organizations and alumni every semester I school year.\n\n 2. To develop rapport and maintain strong linkages with government and non-governmental institutions for the implementation of public welfare projects I programs initiated by the school. \n\n3. To assist in the organization, training and maintenance of a volunteer organization within UB which shall provide free manpower assistance and services to the UB community and the general public especially during disasters, conflagration and other calamities. \n\n4. To request any form of assistance from the school administration, faculty, employees, students, alumni and other civic-spirited persons/organization for the implementation of External Programs. \n\n5. To assist in the production and publication of research work and other information about External Programs.\n\n6. To perform such other duties as maybe directed by higher authorities. \n\nThe Assistant External Programs Coordinator \n\nUnder the supervision of the External Affairs Coordinator, the position is responsible in coordinating activities and functions of the external affairs program to ensure established prior incumbent to the position shall ensure that community extension and outreach services/linkages with non-government, \n\ngovernment and private agencies are well-established, solicitation schemed and fund raising projects are carried out, external program advertising/promotions are properly coordinated and the conduct of relevant research/feasibility studies are undertaken.\n\n 1. To coordinate, monitor and assist in the supervision of activities and programs of the department. Develop and recommend new or revised program goals and objectives.\n\n2. Assist in developing and scheduling program work plan in accordance with specifications and funding limitations. Oversee daily operations and coordinate activities of program and determine priorities.\n\n3. Monitor program expenditures ensuring that budget allocations are not overspent. \n\n4. Confer with advise staff, students and others to answer provide technical advise, problem solving assistance,  questions and programs goals and policy interpretation; refer to appropriate department person when unable to respond. \n\n5. Prepare periodic reports, financial statements and records on program activities, progress, status or other special reports for management or outside agencies.\n\n6. Assist in the evaluation of program effectiveness to develop improved methods; devise evaluation methodology and implement such, analyze results and recommend and for take appropriate action as consulted with superior.\n\n7. Review application or other program documents independently or in conjunction with supervisor to determine acceptance or make decisions pertaining to programs. \n\n8. Recruit program participants, members and volunteers utilizing most appropriate promotional or marketing methods, such as individual letters, brochures or presentations at meetings.\n\n 9. Facilitate workshops, meetings or conferences; coordinate logistics, scheduling and participant communications.\n\n10. Interact and maintain liaison with students, faculty, staff and outside/community agencies in facilitating program objectives. \n\nThe CES Coordinators \n\nIn order to achieve a more systematic planning, coordination, implementation and evaluation of the University's Community Outreach Program, each department/office, academic and non - academic, shall have at least two (2) Community Extension Service Coordinators who shall perform the following duties and responsibilities in consultation with their respective Deans, Directors, Principals, and Chiefs of Offices:\n\n1. Work hand-in-hand with the Coordinator for External Programs in the preparation of action plans, monitoring implementation and evaluation of projects, and activities of the department/office. \n\n2. Perform liaison/coordination work with the recipients/beneficiaries of projects. \n\n3. Recommend ways and means on how to generate internal and external funding to support the projects.\n\n 5. Extend assistance in the preparation of an integrated Community Outreach Program of the University and the semestral and annual Accomplishment Reports by the departments/office.\n\n6. Be directly responsible for the documentation and publicity requirements of the department's/office's Community Outreach Projects/activities. \n\n7. Perform other duties as may be directed from time to time. \n\nThe community that shall be adopted by the University of Batangas for five (5) years for its Community Extension Services must meet the following requirements: \n\n1. Certified by the Provincial Social Welfare Department (PSWD) as a depressed barangay and verified by SAEP.\n\n2. A small barangay/sitio with a population of not more than two thousand (2,000). \n\n3. With residents and Barangay Officials who are receptive to development through self-help projects.\n\n4. Belonging to a lower class municipality.\n\n5. Distance from Batangas City must be within the fifty (50) kilometer radius. Accessible by land transportation for regular monitoring purposes.";
        String pageContentTwo = "COMMUNITY EXTENSION SERVICES DEVELOPMENT PLAN \n\nRationale \n\nIn line with UB's mission of developing in the students the  professional competence and the proper moral and social attitudes, UB's vision of becoming a key player in the development and growth in the Catabarzon area, and the Community Extension Services mission of promoting total development of adopted and assisted communities, the University of Batangas Community Extension Services designs and implements programs, projects, and activities aimed at improving the quality of life of the target communities in the following Key Result Areas: 1. Economic Development The improvement of the target community's economic condition through livelihood, skills enhancement, technology transfer, infrastructural support, and other pertinent programs and projects \n\n2. Human and Social Empowerment The development of the total person in relation with his social environment and vice-versa. \n\n3. Educational Assistance The offering of literacy programs, scholarship opportunities, tutorial services and other learning enhancement initiatives. \n\n4. Environmental Advocacy The promotion of environmental consciousness and concern. \n\n5. Socio-Civic Support The maintenance of the university's active participation and support to community sponsored programs, projects and activities. \n\nCES PROGRAMS Based from the Key Result Areas, the University of Batangas Community Extension Services adopts the following community outreach programs:\n\n1. Economic Development \n\n• Livelihood Program : ’’Alalay Kita’’ - This program aims to introduce, improve, and/or induce viable industries, valuable interventions, or valid innovations to enhance economic activity. \n\n• Skills  and  Technlogy Transfer Program - This program aims to upgrade the beneficiaries' level of professional, vocational, and/or technological competencies. \n\n• Infrastructural Support Program  - This program aims to either provide or facilitate the provision of pertinent structural and/or infrastructural facilities to enhance economic activity. \n\n2. Human and Social Empowerment\n\n • Personhood Enhancement Program - This program aims to promote spiritual, moral, and emotional wellness. \n\n• Social Development Program  - This program aims to promote social, political and cultural development and empowerment.\n\n • Medical Support Program: ''Alalay Kalusugan'' - This program aims to provide services that promote physical health and wellness. \n\n3. Educational Assistance\n\n  • Free Evening High School Program - This program aims to provide free secondary education to working youths. \n\n• Literacy Program - This program aims to provide opportunities for acquiring basic competencies in reading, writing and arithmetic.\n\n• School Support Program -This program aims to extend the necessary assistance to enhance learning. \n\n4. Environmental Advocacy and Management\n\n• Environmental Awareness Program - This program aims to promote environmental advocacy issues and concern. \n\n• Environmental projects/ Activities - This program aims to conduct/ implement environment related projects/activities such as coastal clean-up, mangrove rehabilitation, clean and green, tree planting, waste management and the likes\n\n• Environmental Organizations - This program aims to establish an organization in the community (i.e. young, youth and elderly) or strengthen the youth who will spearhead the protection and conservation of the environment.\n\n5. Socio-Civic Support \n\n• Touch-A-Heart Program  - This program aims to extend love and concern to the disadvantaged sector of the society, and joy and relief to victims of disasters and calamities. \n\n• Socio-Civic Support Program  - This program aims to support activities sponsored and organized by the socio-civic community.";

        mChapterText.setText("Chapter Four");
        mTitleText.setText("Community Extension Service");


        SpannableString spannableOne = new SpannableString(pageContent);
        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showJapaneseKempeitaiImage();
            }
        };

        SpannableString spannableTwo = new SpannableString(pageContent);
        ClickableSpan clickableSpanTwo = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showJapaneseKempeitaiImage();
            }
        };

        spannableOne.setSpan(clickableSpanOne, 123,141, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableTwo.setSpan(clickableSpanTwo, 143, 150, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        mContentText.setText(pageContent);
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
            startActivity(new Intent(this, Homeubcv4chapter4.class));
            Animatoo.animateFade(this);
            finish();
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), UbcvFourChaptersActivity.class);
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
        getMenuInflater().inflate(R.menu.ubcv_four_chapter_four, menu);
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
            youTubePlayer.cueVideo("sHCr0YMJpxo");
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
