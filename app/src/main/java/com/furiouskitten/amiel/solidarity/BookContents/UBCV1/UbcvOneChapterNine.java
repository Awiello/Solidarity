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
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV1QUIZ.UbcvOneChapterOneQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV1QUIZ.Homeubcv1chapter9;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvOneChapterNine extends AppCompatActivity
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
        setContentView(R.layout.activity_ubcv_one_chapter_nine);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter Eight: On the Road to Excellence");

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
"The long and winding road towards a successful venture seems to be insurmountable and challenging. However, with the aid of Divine Providence, plus the firm determination and strong commitment to excellence, the Board of Regents and the management team moved on to greater heights to realize the mission of the University of Batangas. \n\nAlthough the past year (2009) was already a bountiful year, the institution did not rest on its bounty but continued the hard climb towards quality but affordable education. It responded actively to the demands of the industrial world by producing qualified applicants to fill in the industry's needs. \n\nThe office of Professional Development and Non-Credit Program was able to avail of 800 TESDA slots for the training of interested students in the technology and vocational courses. In April 2010, the university's Expanded Tertiary Education Equivalency and Accreditation Program (ETEEAP) as the first program provider in Batangas province turned out a high number of graduates who progressed and earned the degrees in their academic and professional courses while gainfully employed. Research constituted the bulk of the UB's mission hence, the different colleges led by the College of Allied Medical Sciences spearheaded the first \"Annual Research Student Forum\" where all Year levelsp resented researches and posters in a competitor. The College of Arts and Sciences and College of Education presented researches, while the College of Business and Accountancy worked and vied on the business plans.\n\nThe university also participated in international fora and for aper competitions. The coveted CHED Republica Award presented by the Center for Research and Publication in an international forum was received and brought to UB by the presenters. To broaden the horizon of the University of Batangas, an alliance and educational partnership with foreign institutions was forged with Korea through the Yeungnam University of South Korea where the UB exchange scholars stayed for a year of studies and observation. \n\nThe Batangas Heritage Center, in line with its task of creating student awareness on the importance of heritage and to familiarize them with the history and culture of Batangas, participated in the guided tours of scenic and historical spots of the province and the three cities. \n\nTo promote the spiritual and moral development of the students, the Academic Council moved for the inclusion of the core values of faith in God, love of wisdom, and service to fellowmen in the curriculum. For this matter, after the publication of Fr. Vicente Catapang's book annotated by Dr. Lino L. Dizon, the first \"Legacy\" series was written and printed to serve as the course book of Core Values I. The \"Legacy of Love\" traces the history of the former Western Philippine Colleges, now the University of Batangas. It is replete with interesting accounts on the founding of the institution and the sacrifices of the founders as well as the great achievements of the University as perceived by the authors Dr. Aurora M. Babasa and Dr. Lionel E. Buenaflor. However, it was launched and dedicated at a later date on February 22, 2011. \n\nThe Academic Council, in coordination with the Vice President for academic Affairs, Dr. Abegayle Machelle Perez-Chua introduced innovations, such as the 4-day a week class meetings from Monday to Thursday, with Friday as a free day for researches and other class activities and the mid-year graduation exercises on November 23, 2010 with Vice President Jejomar Binay as guest speaker.\n\nThe three-year old UB Waldorf School slowly gained prestige in the community. The students are trained on the Rudolf Steiner method of instruction geared towards music, arts, theater, languages and scouting. The multi-disciplinary curriculum is carried over to the learners' home for vicarious experiences with the whole-hearted support and participation of parents. A part of the institution's social responsibility is the concern and care of the UB family towards the Special Children's Foundation so as to make the special children productive and to train them for n independent and happy future life.\n\nThis is complemented by the non-academic activities like the community extension service by adopting distressed barangays like Munting-Tubig in lbaan, Batangas for five years and selecting another barangay, Barangay Sala in Balete Batangas for the economic development of the said barangay together with educational assistance, socio-civic support, and other community needs. In view of the efforts exerted, the UB's community extension services was a regional finalist in the CHED search for Outstanding Extension Award. \n\nMeanwhile, the students of the Elementary and High School departments showcased their talents in various contests where they dominated other schools in academic and sports competitions as well as in cultural and extra-curricular activities. The \"U13 Stringers,\" composed of students skilled in playing string musical instruments, is the first of its kind in Batangas and is often invited in the community for performances. The high school RondaIla, the Jazz Band, UB Dance Company, UB Chorale and Tanghalang Darwa Singko served to market the University of Batangas through their splendid stage performances. The year 2010 is indeed another very fruitful year. Extension classes of the Graduate School reached as far as Calapan City in Mindoro and Lucena City in Quezon; hence, the graduate school's enrolment increased and accredited by PACUCOA. \n\n The institution's advocacy is to provide \"a strong and cohesive leadership to respond to the call of responsibility.\" Thus, the year 2011 is the reaffirmation of the vision to \"grow, thrive and survive.\" \n\nThe expansion of UB in Marauoy Lipa City in 2010 was a sign of growth, which was projected to deliver quality education in June 2011. Within a year, all pertinent documents had been prepared as well as the necessary permits for the applied programs. In June 2011, the Lipa campus started to operate with 394 students that exceeded the projected enrolment of 300 students from Lipa City, Malvar, Tanauan City, Sto. Tomas, Padre Garcia and Rosario. Scholarship grants of Vice President Jejomar Binay and Mayor Meynardo Sabili were awarded to qualified students. It is the pride of the students of Lipa campus to avail of a spacious and beautiful terrain, modern infrastructure, and state-of-the-art facilities ranging from television connected to computers in every classroom and other high-tech equipments. The speech, computer, biology, chemistry, and physics laboratories are well-equipped for the educational process.\n\nThe University of Batangas Lipa City Campus Year in and year out, the university is blessed in countless ways. Its quality of education is validated from time to time and awarded the distinction as the educational institution with the most number of accredited programs in the province and \"top 5 nationwide.\"\n\nThe College of Engineering is still the \"show window\" of the entire university and has consistently performed above the national score to the extent of having a 100% passing average in the Licensure examinations as well. The college has so far maintained its position as consistent Champion in regional and national competitions. \n\n In the Bar examination, the University retained the status of being the top 20 law schools in the Philippines and ranked no 14 in the very difficult Law examination of 2011. The law students regularly participates in the Law Moot Court and Debating Society and publishes quarterly issues of the Law Journal. The UB examinees harvested good fruits in the board examinations by producing 43 CPA's in.SY 2011-2012; 100% passing the national passing grade n Nursing, . rate in the Midwifery Board Examination and passing scores above.\n\nAccountancy and Teachers' Test LET, or the ensure Examination for Teachers). ded the In addition, the College of Education hgaass,befeo Center of Excellence, the only one in Bata Warded nikawweadr by the Center of Development Award granted to the College of Business Administration. There was no respite in its accreditation process. PACUCOA Level III was granted to the College of Arts and Sciences in the AB Psychology and Political Science programs with Level I accreditation in the AB Communication Arts. This year, AB Legal Management was opened for those interested in legal and paralegal studies. The extension classes in the cities of Calapan, Lucena and Lipa are the testimonies of the founders' aspirations nestled on service, now the realities of the present. However, more efforts have to be exerted for the realization of the dream for quality education. \n\nTrending Towards Success (2012)\n\nThe past years were fruitful and bountiful; yet, the team of hardworking men and women continued to move assiduously to perpetuate the ideals of the institution. \n\nIllpThe Lipa campus (UBLC) created its biggest surprise when the inti ail 400 students rose to 893 in the second year of operation. The UBLC students bested the Batangas City campus by grabbing the much-coveted President's Cup in the academics and other activities during the Foundation Week and proved once and for all that they are also great achievers. \n\nMore and more learning opportunities were deemed necessary to assist the learners aside from the Alternative learning System (ALS) through the Expanded Tertiary Education Equivalency and Accreditation Program (ETEEAP) by increasing the number of programs offered to graduates that beefed up from year to year. In addition, the Distance Education Program blazed the trail for more educational empowerment with the signing of the agreement with the University of the Philippine Open University WPM. Hence, post-graduate learning could be made with less expenses and without the ordeal of travel.\n\nLinkages with local universities were forged, specifically the mOtl with Centro Escolar University. This is anchored on the vision of promoting exchange and cooperation in all appropriate academic areas of internship, research, teaching strategies, and even the possibility of exchanging students and faculty to improve the quality of education being provided by both universities. Research is a major responsibility in any institution for the dissemination and innovation of learning. For this matter, students from the elementary grade to high school undergraduate and undergraduate levels are required to undertake research work and had come up with projects which they defended and emerged as finalists in research contests. \n\nThe faculty members also showcased their talents in research activities. The research of Dr. Shaneil Dipasupil and Mrs. Imelda de los Reyes on \"Climate Change Impacts, Vulnerability, Assessments and Economic Analysis of Adaptation Strategies in the Coastal Areas of San Juan Batangas\" was funded by the World Fish Center and Economy and Environment Program for Southeast Asia (EEPSEA). The paper was presented at the EEPSEA workshop in Ho Chi Minh City, Vietnam in January, 2012 with all expenses paid for by the organization. \n\n Researches were presented in international conventions like the project on \"Quality Criteria for Online Distance Education in the Philippines: A Delphic Study\" of Dr. Abegayle Machelle P. Chua during the First International Convention on Open and Distance Learning. Dr. Jesus Briones and Mr. Doringer Cabrera also presented their paper on \"Financing Services Offered by Banks in the Philippines Relevant to Small and Medium Enterprise (WE) Development\" at the 6th Asian Business Research Conference in Bangkok, Thailand and \"Innovative Marketing Practices of Small and Medium Enterprises (SMES) in the Province of Batangas, Philippines.\" The paper was presented at the 5th Annual Conference of the Academy of innovation and Entrepreneurship in Macau, China. During the 5th Rizal Library International Library Congress held at the Ateneo de Manila University, Dr. Lionel Buenaflor presented his paper entitled \"The Role of the UB Learning Resource Center on Tourism Enhancement and Cultural Preservation.\"\n\n .\" These papers serve to affirm the strong research program recognized locally and internationally. Likewise, training partnerships had been opened with agencies like IBM and Smart Communication for the Computer and Information Technology, Sofitel► Shangri-la and Philippine Airlines for Tourism, Hotel and Restaurant Management, noted banks like Metrobank, Banco de Oro, Bank of Commerce, Philippine Savings Bank, Rizal Commercial Banking Corporation,k and Bank of the Philippine islands for students of the business and accountancy programs. Hospitals like Lung Center, Philippine Heart Center, Philippine Children's Medical Center, St. Patrick's Hospital Medical Center, and St. Luke's Medical Center are some of the hospitals that provide the needed training for students of the Rehabilitation therapy, Occupational and Respiratory therapies where they received \"Outstanding Interns Award\" every year. \n\n The University of Batangas continued to excel in the Licensure examination. The College of Engineering is the producer of 100% passing scores in Electrical Engineering. It has maintained its Top One nationawide position, Top One provincewide in Civil Engineering and Top 3 in Electronics Engineering. \n\nThe College of Business and Accountancy harvested 43 Certified Public Accountants, the highest number of examinees who hurdled the CPA examination in Batangas City; while the education students performed well with scores above the national passing average in the Licensure Examination for Teachers (LET). Although, there is a nationwide decrease in the enrolment in the College of Nursing and Midwifery, the UB examinees had a 1005 passing in the Midwifery test and a higher rate above the national passing rate in the Nursing Board examination. \n\nLikewise, the 100% gradegiven by TESDA on the assessment of the UB's students afterqualifying in areas related to cooking, housekeeping, food and beverage and front •office assessment made the College of Tourism and Hospitality Management (CTHM) very proud of the good performance of the students. They were also declared Champion in the Barako-Based- Dessert Makin gat SM (Region IV-A College Level, Batangas and second overall chard in the Batangas Food and  Beverage Exposition and sec ampioond place in Waitering Olympics The Technical Education department was also TESDA in the assessment tests on Mechatronics recognized by , Computer Hardware Servicing and Technical Drafting. Not relegated in the background is the College of Information had established a name due to its and Communication Technology PICT is the youngest college but outstanding achievements and had for Microsoft . been identified as IBM Center of Excellence and the training center Successes gained by the university ere not limited to the w college level alone. The elementary pupils exposed their,talents and hurdled successfully the variety of competitions. The high school students on the other hand always excelled in the division regional and national levels as first placers in the Quest Student Category, Science Strategic Intervention Materials together with some faculty members, whose hidden talents were put to good use by emerging champion, second placer or third placer in the English, Filipino, Cheerdance contests and sports competitions.\n\nThey also excelled in writing contests related to press work. The school papers \"Kiddie Journal\" of the Elementary department and the high school \"Westernian Pioneer\" dominated yearly the City Schools Press Conference and made headway to the Regional and Secondary Schools Press Conferences. In the same vein, the UB Brahmans (college team) became a by-word in basketball tournaments where they romped off as Champions or first runner-ups. Meanwhile, the UB Chess Team also Won the gold and bronze medals in the chess individual event. \n\nThe high school and college thespians are popular theatrical figures who showcased their talents in acting and dancing in Contests where they excelled. Meanwhile, the UB college and high school Chorale garnered top awards in competitive musical quests. Musical talents are always ready to perform any place, anywhere most especially the rondalla. The youngest musical group is the UB Stringers—a favorite group during regional meetings and conventions hosted by the University. \n\nIn its quest for educational excellence, the UB Waldorf School is the answer with its international curriculum brought to Batangas for emotional, intellectual and physical growth compatible with the needs of the child's natural method of learning. The multi-disciplinary and integrated approaches with the use of the head, speaking, writing, acting and play phases of learning. \n\nThe management team is always on the go for program accreditation and/or ISO certification anytime of the year. The efforts exerted by the team bore the fruits of their labor with the PACUCOA award granted to the UB research as the Best Case Study nationwide. The institution's entry to the national research competition is titled \"Accreditation: UB's yardstick Towards World Class Quality Education\" is another laurel added to the cap. \n\nLikewise, the University was able to maintain its ISO certification and was also adjudged by PACUCOA as the top five institution with the highest number of accredited programs nationwide and the most number of accredited programs in the province of Batangas.";
        String pageContentTwo =
"Another social institutional responsibility is the community extension service as a key resource area for development. It is in this context that the University adopted the new barangay Sala in Balete, Batangas province. The main objective is to foster service to the barangay with the UB family as a partner in making barangay Sala a better place to live in.  Various skills from cosmetology to hair cutting; bangus deboning; flower arrangement, table skirting, and other emergency home activities were taught through technology transfer. All these were realized through weekend visits of the High School department, College of Tourism and Hospitality Management and Technical Education Department.\n\nIn addition, the Colleges of Nursing and Midwifery and Allied Medical Sciences reached out to different barangays via the medical and dental missions. The UB Special Education Foundation Inc. conducted Safety Disaster Management and Safety Workshops while the College of Arts and Sciences conducted personhood programs. The disadvantaged and underserved sectors, as well as victims of calamities, were given the institution's share of love and service. The needs of the Alay Lakad Foundation were responded to with UB as top participant in the city and provincial sectors. The underprivileged group of working students like store helpers, house helpers or Kasambahay and the financially unstable group of educationally inspired students are still provided with the 5-year free evening high school programs. \n\nNew courses for curriculum enrichment were offered such as AB Multi-Media Arts, BS Real Estate Management, BS Criminology AND bs Industrial Security Administration. \n\nPhysical facilities are constantly upgraded and improved to satisfy the students' needs. UB Lipa has formulated the plan to erect the gymnasium for physical and co-curricular activities of the UBLC students. Library facilities in all campuses are being enhanced for faster Internet connections. \n\nThe core values of Faith in God, Love of Wisdom, and Service to Fellowmen, or Spirit, Intellect, and Purpose are inculcat-ed in the students in the subjects UB Core Values I, II, III, and IV. Hopefully, the Brahmans (UB students), Computer laboratory in UB Lipa Campus. trained and molded by an affordable quality of education will be steadfast men and women, inheritors of the founders' legacy, stalwart alumni who will Continue their splendid performances in their professional careers so as to make the University of Batangas a shining jewel in the field of education. \n\nThe year 2012 is noted for the remarkable achievements made by the institution in the midst of challenges. The year is significant in terms of future innovations in line with the K to 12 program in Batangas and Lipa campuses. UB's basic education has undergone a sudden change with the adoption of the Kto12 program as mandated by the Department of Education. The University is indeed very proud to be chosen as training institution of public and private school teachers of the province and the three cities for two summer terms for the preparatory steps for the implementation of the Kto12 program. Select faculty members of the College of Education as well as Elementary and High School teachers served as trainors. The College of Information and Communications Technology is recognized as IBM Center of Excellence as well as a Microsoft Center in the region. Thus, UB provides training for students to be internationally recognized in their areas of specialization. \n\nSo as not to be left behind, the faculty members are also trained to ensure their fitness to mold their students for quality education. Four CTHM faculty members had been trained and passed the Amadeus Certification examination. Four teachers of Waldorf are the first graduates of Masters in Steiner Education, the only specialists and degree holders in the Steiner and Waldorf Education in the country. Likewise, students undergo practicum in leading industries and companies as in the case of CTHM students who were trained in well-known hotels in the Philippines and in Hard Rock Café in Washington DC.\n\n Students of the College of Allied Medical Sciences completed their internship in institutions like the Philippine Heart Center, Armed Forces of the Philippines Medical Center, Philippine Cerebral Palsy, Inc. and other prestigious medical institutions where they received \"Outstanding\" awards. As such, the Physical Therapy and Occupational Therapy graduates were assured of a 100% employment after passing the Board examination; while the Respiratory Therapy graduates became gainfully employed within a month after graduation. \b\bPartnerships with leading local corporations and foreign countries paved the way for UB students to gain skills for employment in the local market. Students were also sent to Korea as a part of the exchange partnership agreement and to Thailand as exchange scholars. In the Philippines, partnership is maintained with the University of the Philippines Open University (UPOU), with Centro Escolar University and with the Technological Institute of the Philippines. \n\nAcademically, the UB graduates continuously shine in the Licensure examinations most especially the College of Engineering with Electrical Engineering as the top performing school nationwide. All other board courses like Law, Accountancy, Physical Therapy, Elementary and Secondary Education, Nursing and Midwifery posted high passing scores over and above the national passing percentage. Passing rate of 100% has been consistently maintained by the Colleges of Electrical Engineering, Physical Therapy and Occupational Therapy with a Physical Therapy graduate Alethia S. Andaleon as third placer in the Licensure Examination. \n\nJob opportunities are always open to UB graduates even before and after graduation or hired after the OJT becaue of the quality of job performance, interviews and excellent demonstration lessons as in the case of Teacher Education, Library Science as well as with the other non-board courses. \n\nThe College of Law is recognized by CHED as one of the two law chools with a model curriculum for the degree of Juris Doctor (Doctor of Jurisprudence). It is ranked 14th among the 114 law schools in the country. It is now the object of attention because of the good performance of its graduates. The students performed well in the International Committee on Red Cross, and second runner-up in the National Moot Court Competition in role playing. \n\nIn line with the university's mission of \"participating in a global technology and research-driven environment, the faculty and students continued to immerse themselves in research activities. Dr. Jesus Briones and Mr. Doringer Cabrera of the College of Business Administration presented papers in an International Business and Economic Research Conference in Semarang°, Indonesia. Their paper was adjudged \"Best Paper.\" The students also conducted researches and capstone projects for the University and the community as well. Community service is a cog in UB's educational wheel; hence, the different colleges had been actively participating in technology-related, literary programs, rehabilitation services, health activities like fun run, Alay Lakad, coastal clean-up, outreach projects, medical missions and assistance to victims of calamities. It is a tradition to commemorate the birthday of UB's late president, Dr. Abelardo B. Perez on August 15 every year, with the blood letting program co-sponsored by St. Patrick's Hospital Medical Center. \n\nThe ETEEAP program keeps on increasing each year thereby benefitting the work force with incomplete units to earn a degree. Short term courses like the Caregiver Training Proram and Finishing courses for Call Center Agents turn out an increased number of graduates certified by TESDA. The University of Batangas is now a Regional Competency Assessment Center. With regards to skill competition, the University of Batangas always emerges as champion in the local, regional and national levels to wit: the 12th IIEE Regional Math Wizard, the IIEE  Electronics Engineering Quiz Show , Quiz Show, best PICE Regional Quiz Show and many more competitons attended by the other colleges. \n\nThe High School students also dominate the academic and DepEd Math challen non-academic contests by showcasing the talents in ge , UP Caballeros the MTAP Literary Contests, Speech Secondary Schools Press Co nf Choir, Oration and Impromptu Lite Conference was the show window of the y were declared Champions Speech Contests. The National members of the editorial staff where the as in the individual writing categ s with the \"Western Pion eer orie the best school paper. They also dominated majority of the athletic Southern Luzon. competitions such as the USCAA, BCPRISA, PRISAA and PCCL Southern Luzon.\n\nThe kids of the Elementary department are not left behind by their big brothers and sisters. They also honed their writing skills and talents and came out Champions in broadcasting and scriptwnting skills in the Division Press Conference. The \"Kiddie journal\" was highlighted by the individual contestants who were declared winners in Online News Writing in Filipino. They were also champions in the BCPR1SA chess competition, in the 4X1.00 meter relay, shotput and badminton. UB contestants had a good showing as champions in Table Tennis, Men's Taekwondo and in other sports events. However, the greatest pride is the men's basketball as champion in the NBOL, National, regional and provincial PRISAA and in the PCCL Calabarzon and South Luzon. The Brahmans has the distinct honor of competing against the players of well-known universities; thus, it has established the name as \"a team to beat.\" \n\nThe University of Batangas is also a shining jewel in cultural presentations and competitions by winning the coveted top prize in the Centennial Cultural contest of St. Bridget College. In the same contest, the UB choir bested other contestants in the Kundiman and Pag-awit ng Koro competitions. Other cultural groups such as the Rondalla, the UB Stringers, Dance Troupe, Folkloric Dance Troupe, Teatro Anino, Tanghalang Dal'wa Singko, Jazz Band and the UB Dance Company are always in the limelight within and outside the University. \n\nThe Future of the Legacy (2013) The University of Batangas has soared new heights and has crossed new barriers with the extension campus at Lipa whose population keeps on increasing every year. After two years, the enrolment more than doubled and continued to surge in the third year.  The campus in Lipa as well as the infrastructure and state-of-the-art laboratories, classrooms and facilities are competitive with Manila universities. Its curricula are enriched with new programs added each year including Grade 7 of the Basic Education or Kto12 curriculum.\n\nThe UBLC is fast moving towards excellence as it strives to be recognized as another center of learning in the regions by adding school year to meet the needs of the students. new programs each y he university's distinct pride to have produced great It is the  achievers among the countless doctors, politicians, lawyers, army men, teachers, engineers, businessmen, writers, movie personalities andgovernment personnel. Another feather added to the cap is the honor bestowed to the UB 2007 high school valedictorian graduation as the only Filipino to be accepted to the West Point Military Academy in the United States. Another UB high schooler, James Threstel Buensuceso was also admitted as a West Pointer several years before. \n\nThe institution has been blessed by numerous awards and recognitions with the relentless efforts exerted to \"strive, to seek and not to yield\" from CHED, Level IV PACUCOA Accreditation in Elementary and Secondary Educaiton, Business Administration and Arts and Sciences. Hence, it is the institution with the most number of Level IV accredited programs. \n\nThe University of Batangas is still the CHED Center for Excellence in Education, Center of Excellence in Business Administration, IBM Center of Excellence in Information Technology, ISO-AJA certified and has maintained its deregulatory status. Meanwhile, leadership and management in the Board of Regents took a new turn with the sudden resignation of Chairman Vicente A. Mayo, whose age has overpowered his once youthful energy. His 41 years of fruitful and productive service as Board Chairman were cut short at the meeting of the board in August, 2013. He is succeeded by his son, Vice President for Students and External Affairs Atty. Jesus Victor V. Mayo, whose new task is to foster and uphold the institution's ideals and core values towards excellence. Fired by the pioneering spirit of service of the founders, as well as the desire to inject novel techniques for enhancing learning, Grades 5 to 7 of the Elementary department adapted the digital use of e-books; hence, personal computers gave way to textbook learning.\n\nThe world of modern technology has opened the portals to the digital revolution with the faculty and students constantly moving forward with today's trending technology. These are the enthusiastic men and women who wish to give tribute to excellence and innovations by taking a step further in responding to the higher demands of the business world and the job market. September 25, 2013 was a red-letter day for the College of Law debating team for the awards received as semi-finalist in the ANC 7th Season Square Off: The Firm Debate with Ms. Claribel Ochoa as Best Speaker. \n\nThe University of Batangas, on its 68th Founding anniversary as a college and 18th year as a university, is now trending the easy road to success after all the sacrifices and challenges of the past decades of its existence. Much has been attained since 1946 as an unknown college and it has moved on to be a renowned institution aiming for excellence. \n\nIt has gained prestige in the professional board examinations with the UB examinees obtaining high passing rates far above the national passing scores in Engineering, Nursing, Midwifery, Physical and Respiratory Therapy and in the Licensure Examinations for Teachers of the elementary and secondary education aside from the 100 percent passing rates of examinees every now and then. The College of Engineering is recognized as the \"Top Performing School\" nationwide and has received awards from the PRC and CHED. The University is widely known as the \"Producer of Topnotchers\" in the professional and bar exams, the latest of which is the Juris Doctor valedictorian Rudy V. Ortea, 3rd Placer in the 2013 mind-taxing Bar examination. Other shining jewels who brought honors to the institution in 2013 are Engr. Edward G. Tirao, 8th placer in the Civil Engineering examination; 3rd placers Alethia S. Andaleon in Physical Therapy; Engr. Joven Castillo, 4th placer in the Industrial Engineering Certification examination and Rose! H. Mapoy, lOth placer in the Librarian Licensure examination.\n\nThe conferment of the degree Doctor of Humanities (Honoris causa) on Mr. Willy N. Ocier, Chairman and President of the Pacific Online Systems Corporation capped the 70th Commencement Exercises on April 23, 2014. The honorary degree was bestowed on him in grateful recognition of his humanitarian service by giving more jobs and employment to many Filipinos and for his significant role in raising funds to support the charitable concerns and medical assistance program for indigents of the Philippine Charity Sweepstakes Office. \n\nMeanwhile, for the first time, a foreign diplomat, the Ambassador of Nigeria to the Philippines, his excellency Akinyemi Farounbi was invited to share his insights and expertice as speaker of the first batch of college graduates on April 22,2014 as a testament of the UB's linkages not only with local institutions but The new UB topnotchers with foreign partners as well.Pregnant with high hopes for a very promising future and empowered by an abiding faith in the Divine Providence, an ardent love of wisdom and with the intense desire to be of service to others regardless of race, creed or religion, the Univesity of Batangas will move on to reach the vast horizon, cross all barrierse untrodden trails and open new frontiers in its indefatigable quest for knowledge to realize its mission.";

        mChapterText.setText("Chapter Eight");
        mTitleText.setText("On the Road to Excellence");

        SpannableString spannableOne = new SpannableString(pageContent);
        SpannableString spannableTwo = new SpannableString(pageContentTwo);
        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                catapangbook();
            }
        };

        ClickableSpan clickableSpanTwo = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showmaraouycamm();
            }
        };

        ClickableSpan clickableSpanThree = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showbrgysala();
            }
        };

        spannableOne.setSpan(clickableSpanOne, 2584,2642, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableOne.setSpan(clickableSpanTwo, 5789, 5795, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableTwo.setSpan(clickableSpanThree, 150, 219, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
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
            startActivity(new Intent(this, Homeubcv1chapter9.class));
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
        getMenuInflater().inflate(R.menu.ubcv_one_chapter_nine, menu);
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
            youTubePlayer.cueVideo("ckPd50yODcVM");
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
    public void catapangbook(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.catapangbook);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    //image dialog popup
    public void showmaraouycamm(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.lipa);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    //image dialog popup
    public void showbrgysala(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.brgysala);


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
