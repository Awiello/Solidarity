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
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV1QUIZ.UbcvOneChapterSevenQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV1QUIZ.Homeubcv1chapter7;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvOneChapterSeven extends AppCompatActivity
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
        setContentView(R.layout.activity_ubcv_one_chapter_seven);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter Six: The Golden Years and Elevation to a University (1996-2005)");

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
"When classes resumed in January 1996, the administrators, faculty, personnel, and students were mobilized and their full cooperation enlisted for the Golden Jubilee of the College. All available resources were tapped including the alumni so as to be assured of a grand celebration while eagerly awaiting the grant of the university status by the Commission on Higher Education. Western Philippine Colleges had grown figuratively and literally. From 48 students some 50 years ago, the College this time boast of an enrollment of 14, 465 students. The College had six departments when founded. In 1996, there were 12 colleges and departments with four graduate studies offerings, 17 undergraduate programs, 20 vocational/short term courses, secondary, elementary, and kindergarten or pre-elem courses. \n\nThe accredited academic programs made WPC tick by being the only College in Batangas with such programs. Accreditation had been granted to the Liberal Arts, Commerce, and Education departments. Western Philippine Colleges then was the undisputed leader in academic excellence in the province of Batangas. \n\nIn terms of insfrastracture development and facilities, the College could be termed a leader school with two campuses at that time, 12 high-rise buildings, three libraries, a mini-museum, several laboratories, medical and dental clinics, study and recreational areas, guidance and counseling offices, support offices, and faculty rooms. It could be said that there was a strong and loyal faculty set-up due to the personal advancement program offered to all teachers in terms of advance degrees and hyper-active research and cultural and Was service supported by faculty members. The garden chapel as constructed and finished before the celebration of the 50th year of wpc. \n\nThe Golden Jubilee Week took place on February 17-24, 1996. A motorcade started the celebration in the morning followed by the evening beauty pageant and coronation of Miss Rhizza Perez of the Nursing department as Miss WPC '96, Miss Pre-Elementary Karen Ester U. Plata and Miss Elementary Elaine O. Lozano, the winners in the Miss WPC-Bulilit Green Pageant. Other activities for the week-long celebration were the thanksgiving mass with symbolic offerings; the literary, cultural/musical competitions participated in by the students, faculty, and employees, administration ball, and parade of beauties and student organization that highlighted the grand celebration. The student’ night closed the memorable celebration of WPCs 50 years of service to the community. For the first time in 50 years, I he alumni kind employees were honored on a separate day instead of. t he grand Alumni day. \n\nDeputy Hernando B. Perez and Rosalinda C. Macatangay were chosen as the Most Distinguished Alumni For having gained national/international recognition that brought honor to their alma mater and to the Country. Other awardees were Dr. Corazon B. Cabrera, Achievement in the Academe; Fiscal Pedro C. Castillo, Law; Atty. Narciso B. Macarandang, Public Service; Crispina de la Peria, Service to the College; Sofia Arce, Outstanding Faculty member; Honesto M. Babasa, Most Successful High School Graduate; Priscilla R. Martinez, Outstanding Employee; Rosalind a P. Hernandez, Outstanding Supervisor, and Aurora L. Velasquez, Speacial Award. High School and College scholars were also selected. At the same time, 24 service awardees were given recognition. \n\nCongressman Hernando B. Perez, pride of the University of Batangas , After a respite of several years, the alumni came to attend the 50th year of the founding of WPC on February 24, 1996. Dr. Aurora M. Babasa, MA '75, was elected president of the 11 Board of Directors. The outstanding accomplishments of the officers were the adoption of a Constitution and By-Laws as a guide for the acts of the \"University of Batangas Alumni Association, Inc.” and its registration with the Securities and Exchange Commision for a 25-year duration. The Alumni day started with a mass celebrated by Rev. Fr. Nonie Dolor, an alumnus, followed by a short program capped by the Welcome address of President Abelardo B. Perez, messages of Loreto Guinhawa, alumni president and, Atty. Roberto Panganiban, VP-MEP, with intermission numbers rendered by the WPC cultural.\n\nThe first University President UB, Dr. Abelardo B. Perez, during his younger days.  The afternoon was highlighted by raffle draws, games, meeting, and election of officers. The celebration of school life spent across 50 years certainly brought moments of joy, triumphs, sorrows, and wonderful reminiscences. Gift items and a souvenir program documented the momentous event and showed some milestones on the growth of the institution including the week-long of celebration after the grant of university status on August 1, 1996 and the investitutre of the first University President, Dr. Abelardo B. Perez, three months after. \n\nThe solemn investiture of the first University President was attended by around 1,000 guests from the Commission on Higher Education, public and private academe, university presidents, doctors and local officials on November 9, 1996. It was a meaningful manifestation of leadership bestowed on Dr. Abelardo B. Perez in a once-in-a-- lifetime memorable occasion. Dr. Abelardo B. Perez received an image of na Poong Sta. Krus during his investiture as president of UB. With the conversion of Western Philippine Colleges into the University of Batangas, research remained a challenge but researchers made a commitment to  programs related to the institution update new initiatives and and regional levels. \n\nAccreditation by PACUCOA was done almost every two years. Level II re-accredited status was granted to Liberal Arts, Commerce, and Education courses with Civil Engineering evaluated by PACUCOA and FAAP and given Level 1 status on December 17, 1996. It was necessary to strengthen the faculty; hence the requirements of the Master's degree for promotion, together with an intensive faculty development program were made into a commitment. \n\nMassive involvement of students in activities outside the organization like cultural and athletic competitions as active members of the USCAA, community service in the \"Alalay Kita\" project in Madalunot, Calaca, Batangas and broad coordination with alumni became a part of student development program. \n\nThe first midwifery graduates had a 100 percent passing grade in the Board examination and this was really something to be proud of. Meanwhile, infrastructure development was not neglected. The College of Allied Medical Sciences had been expanded with separate exercise room and occupation therapy rooms inasmuch as the enrolment was beginning to pick up. \n\nAs a whole, the development of the campuses was impressive and the construction of a new entrance gate at the Hilltop campus reflected a big change in the facade. The following SY 1997-1998 that marked the first anniversary of the University of Batangas as the first university in the province of Batangas, was a time for rethinking of management strategies. Shared decision-making gave the staff members the chance to assess objectives and undertake consultancy services that enlivened their contributions to major school projects. The quality of work was enhanced and they appreciated more their roles in the institutional development program.\n\nSeries of seminar workshops for the management and the rank and file were sponsored by the Human Resource and Development office. The aims were to enable the participants to be more proactive in promoting a culture of efficiency in the institution; to enhance leadership in the top and middle level managers; and for the staff to exhibit a deep concern for individual functions. \n\nA very significant event for the new University was the conferment on the President of the Philippines, Fidel V. Ramos the honorary degree Doctor of Humanities (Honoris Causa) on August 14, 1997. He was recognized for his deep concern for the individual's well-being and strong sense of national pride. The University had to face countless challenges so as to meet the requirements of the new status. The biggest challenge was further enhancement of research capability building; increase attention in the use of wide-ranged technology and make intellectual and material resources available for the upgrading of research efficiency. The Kalinangan Journal is the publication that answers the need for research capability. Learning to publish is an integral part of learning how to research. Writing a textbook would hone author's knowledge and encourage himself that his knowledge is up-to-date. Hence, there is a need to study other authors. \n\n It was for this reason that the office of the President created the Institutional Materials Development Committee to formulate guidelines and President Fidel V. Ramos, Doctor organize sub-committees on the basis of Humanities (Honoris Causa). of the nature of the materials to be prepared and the subjects where the learning devices would be used as a result. \n\nA new publication, the WPC Newsletter came from the Office of Public Relations Director, Mrs. Maricel Q. Verceles. The newsletter was changed to U of B Forum later on. To be able to publish periodically school wide events is a great accomplishment of a dynamic institution like the University of Batangas. In an information-based society, faculty members and every school worker need the newest wealth of teaching and learning resources. They should not lag behind in expanding innovative strategies in acquiring good educational practices; hence, the need for more attendance in local and national in-service training activities that enabled massive participation and optimum utilization of instructional resources was extended to all concerned. \n\nFaculty-student assemblies were tasked to attain more meaningful ideas in extra and co-curricular activities; to minimize duplication and overlapping of presentations; and to avoid conflicts In the use of facilities and venues. The idea of building greater responsiveness to programs and projects in a more systematic manner was approved by the Academic Council and was made effective in 1997-1998. So as to have a highly suitable and satisfying. learning environment, the General Service office effected immediately the const ruct ion of the new Founders Hall to serve as the Admnistration building, similarly, renovations and painting of physical facilities were also undertaken\n\nDuring the past year (1997-1998), significant achievement of the different departments had been noted. It was the consensus in SY 1998-1999 that the general performance had improved based on the results of the Licensure examinations including co-curricular and dvised extra-curricular involvement. However, the UB President a the academic community to strengthen academic programs and schema. make them more relevant to student needs through a learning The institution adopted mechanisms ty assurance and training for high-level work ethics. through effective decision-makin for quali g and problem- solving techniques Accreditation was given more emphasis together with departments. revisions in the curricular offerings in the Engineering and Tech-Voc departments. \n\nA more rigid scheme of monitoring institutional standards without curtailing academic freedom was considered. Flexibility to determine competency-based subjects to meet the requirements gave way to the minimum w implementation of a Nursing and Midifery courses and the adoption of the Associate in Health Science Education ladderized (ARSE and Associate in Computer Technology. with the ladderization of BS Technology (ACT) in line Computer on March 22, 1999, the College of Law was permitted to offer addition of research re Doctor of Jurisprudence in addition to Bachelor of Laws with the quirements. Multi-disciplinary researches funded by the University of Batangas and linkages with various agencies were initiated by Permanently assigned faculty who were also de-loaded of their subjects equivalent to nine units as incentive. \n\nThe UB envisioned offering individualized and comprehensive special education program for handicapped children; promoting multi-faceted training activities so as to enhance the cognitive psychological, social, and ling m uistic development of the child with physical handicap and behavioral problems. With this vision, the UB Special Education Foundation was started at Pallocan East campus on a 10-hectare site that is conducive to the mission of UB in relation to handicapped children for them not to be a family burden. \n\nLife-sized Stations of the Cross were erected on the Pallocan campus as a reflection of UB's faith in God contained in its mission statement. Another first in the book of the University was the blessing and unveiling of the Juan Ylagan Javier Memorial bust to honor a great academician, founder, and second president of the institution. The bronze bust was placed in the lobby of the Engineering building named after him. At this time, UB still dominated the fields of sports, cultural presentations of the Tanghalang Darwa Singko and beautification of school site. The physical plant was improved with the setting up of the signage at the facade of the main gate at the Hilltop campus. UB expanded its campus at the Pallocan West site, a lot beside the SM. Meanwhile, Perez Hall became an on-going extension project together   with the painting of all buildings to exude the real ambience of university.\n\nSchool year 1999-2000 saw the need for continuous re-engineering of the teaching-learning processes due to increased global concerns. Efforts to improve the learning environment received much attention from the manage-ment so as to develop both strategic and operational plans and harmonize the present situation with the aspired conditions of the future. \n\nThe stability of the system was the main concern thus pressure to produce better and more competitive outputs had been done. The University adopted strategies to make the non-teachin g g mand and teaching staff become more conscious of the increasing for quality education. The entire school community was to welcome self-evaluation and enhanced team work through a encouraged mechanism for quantifiable assessment of performance. Various activities held during the year made UB visible in all areas such as hosting the grand Alumni Homecoming, membership in the Network of CALABARZON Educational In (NOCEI), Welcoming relics oft he Doctor of the Church St. Therese of the Child Jesus, and hosting the Youth Congress at the UB Gymnasium. After five years, another Alumni Homecoming was held on February 19, 2000 for the ratification of the Constitutions and By-Laws. A status quo was declared in the election of officers.";
        String pageContentTwo = "With the start of the 21st century, the UB saw the challenges connected with the linkages needed for a more relevant and functional program offerings attuned to the demands of the international market. At the end of SY 2000-2001, a comprehensive development plan was formulated for the institution to be able to deal with even the most complex situations. School year 2000-2001 was a significant year that will be remembered in UB's history as the year of the opening of the Doctoral program. Doctor of Philosophy with majors in English, Filipino, Mathematics, and Educational Management was the initial course offered together with Doctor of Business Management and Doctor in Public Administration. The enrollees were more or less 30 students who wished to complete their post-graduate studies in Batangas. \n\nThe first four graduates of the Doctoral program received their diplomas in April 2004. There were three graduates of Doctor of Philosophy in Education, major in Educational Management Yolanda D. Africa; Cresenciana C. Manongsong (Filipino), and Ruby Editha C. Peji (Filipino) and Doctor of Philosophy in Business Management Atty. Florencio A. de Loyola. They were also the last batch of graduates under Dr. Corazon Cabrera, who retired on October 19, 2005. Dr. Edith Mission took over the deanship as officer-in-charge and was later appointed dean. \n\nHowever, numerous problems confronted the UB such as the threats of downtrend enrolment being experienced by three-level schools nationwide; the strengthening of linkages; fast upgrading of the professional qualifications of the faculty; updating of course offerings and improvement of facilities. The UB family was enjoined once again to work in the spirit of oneness so as to cope with the multifarious educational problems. Throughout the year, the elementary, high school, and collegiate students unleashed their talents and creativity in academic contests, skills competition, athletic meets, and invitational performances, which brought honors to the University. To add colors to the annual Foundation Week, the first President's Cup was initiated by President Abelardo B. Perez.\n\nExcellent performance in the Board/Bar examinations were seoefnuiBn the passing rate of 80 percent in Engineering and 50 percent in the Bar examination. In the other board courses, the performance graduates is at par with other schools nationwide. Faculty members started to develop and publish books, and other manuals, workbooks, photo-type lesson plans  with diverse needs and learning instructional materials for classes  styles. Even the research program was strengthened with the completion of several studies undertaken by the UB researchers which were published in the Graduate Journal. At this time, the possibility of forging a tie-up with a local well-established university and a university abroad seemed to be realized in the near future. For this matter, the learning resources and infrastructure program were stepped-up to meet the emerging challenges. \n\nAs a whole, the primary concern of UB in SY 2000-2001 was information technology because of the sudden awareness for generating, processing, disseminating, and using information to make quality learning accessible. Hence, there was the gradual shift from the traditional method to innovative strategies for better learning opportunities. \n\nThe UB Continued moving toward a new  learning to the students in SY 2001-2.he curriculum review trend in providing 002 brought to the fore the need for the adoption of man content changes using and integrating newer technologies. Thus, technology curriculum content. devices, foreign langua y ges, and networking were included in the In line with the inclusion of information and communications technology in the curriculum to harness the latest technological advances, it was imperative for the deans, directors and department chairpersons to discuss global •integration and information exchange so that student learning could become effective and be more Competitive. All these were keynoted in SY 2001-2002. Massive involvement of UB's officials, faculty, 8 4 1 Page personnel and students on accreditation of three Level II programs was observed. \n\n. There  program. The facul stwas also the accreditation of ty rengthened their res earch competencies, and the Legal Aid extension services were not allowed to stagnate. While UB was trying to o with other a envies pen more linkages and collaborate as partners in research and training, another pall of gloom was cast over the Engineering department when Dr. Cristy R. Hernandez, Board of Regents' Vice Chairman and Dean of the College of Engineering, succumbed  complications to asthma and heart and a great loss to his department that was being expanded in terms of enrolment and number of board passers.\n\n This year, more and more projects were started as a marketing strategy. The Expanded Tertiary Education Equivalency and Accreditation Program (ETEEAP) was launched after the attendance of a team in a training-workshop on February 5-7, 2002. The library acquired the Athena Library Automation System as a very convenient system of library management. Passers in government Board and Bar examinations were honored in a motorcade, torch parade, and banquet as the UB's appreciation for good work and encouragement for future board examiners. Testimonials were offered to the passers of the College of Law with an average passing grade of 50 percent; Electrical and Civil Engineering with a passing rate of 48.47 percent and 51.43 percent respectively; as well as the College of Commerce, College of Education and the paramedical courses. \n\nThe UB community experienced great pride for excellent student performance as champions in athletics, academic, and cultural competitions. The UB High School cheerers romped off with the first place in the ABS-CBN Cheer Bombah grand finals taking home with them a trophy, cash award, plus applicances for the University. On the other hand, the College of Commerce and Accountancy was declared champion in the President's Cup Tournament.\n\nThe 55th Founding Anniversary and the 5th Anniversary as a University, were marked by a grand celebration on August 1347, 2001. Several cultural and educational events were organized and supported by students, employees, and the faculty. A fabulous line-up of presentations and the search for Mutya ng UB 2001 made the celebration a very memorable affair. Awards were given to faculty and employees for outstanding performance. Important accomplishments were focused on changes in student learning paradigm oriented toward more collaboration through the use of multiple channels. \n\nAgain, UB was recognized as a top performing school in the April 2003 Electrical Engineering Licensure examination for having garnered 100 percent passing performance.  examination, UB's examinee was the 15th In the previous placer in the test. The English Communication Skills Pro advancement in the Universi dentsc, gram is one of the few ty'scommitment to professional and personal developments of stu faculty, and the staff. Another note-worthy project was the realization of the dream of President Abelardo B. Perez, who was obsessed with the establishment of the Heritage Center as a repository of the culture and arts not only of the University of Batangas but also those that belong to Batangas province and Batangas City. \n\n To enrich individual experiences in religious activities and promote social cohesion in the activities in pursuit of the UB mission of spirituality and faith in God, such as holding prayer meetings, recollections, youth camps, symposia, and campus ministry coordinated with the Parish of the Immaculate Conception, were undertaken at regular intervals during the year. \n\nA continuing commitment to the culture of quality research was realized with the holding of the research forum on December 12, 2002. Series of meetings with the President and academic groups also renewed the commitment towards quality education and stimulated the continuing desire for improved teaching competencies. The Legal Aid Program was finally implemented by the 3rd and 4th year Law students and those enrolled in Practice Court I and Ii for them to have trainings in the limited practice of Law. Other departments like Hotel and Restaurant Management (HRM) also had intensive hands-on training in their particular majors. \n\nNot to be outdone, the faculty members engaged in activities related to current issues and concerns were given a chance to enjoy summer fun outside the institution with expenses shouldered by the University. \n\nAs a reward for continuous commitment to quality performance, the UB contestants did not lag behind. There were top winners in Jakarta, San Juan de Letran College, and De La Salle University in Lipa in Mathematics contests and quiz shows. Likewise, the UB Dance Company was able to set high standards of performance in various activities in and outside the institution. The High School Grand Alumni Homecoming (1987-2001) on May 26, 2002 capped the activities for SY 2002-2003. It was indeed a memorable affair with old alumni in attendance sharing experiences with the younger ones and recalling beautiful memories they had as students of the old WPC and UB. \n\nIn the curricular programs of SY 2002-2003, the subjects offered had been well-structured to be able to compete with international standards. More and more graduates earned more laurels by performing extremely well in Board examinations were appreciated by the University of Batangas in terms of testimonial luncheons and cash awards to placers in varying amounts dependent upon the rank achieved. Active participation in contests was encouraged to broaden national and international perspectives; hence, student representatives were sent to participate in the English competition in switzerland, TESDA competition in Jakarta, AFS in Japan and the BcpRISAA where UB emerged champions in the said activities. On the other hand, the faculty had trainings on E-learning, multiple intelligence learning styles, and digital skill integrating macro-media into the academic courses. Meanwhile, Dr. Conrado I igo cited the importance of marketing and public relations to elevate the local, national, and international reputation of the University of Batangas in the lecture he shared with the staff in preparation for ISO (International Standardization Organization). \n\nIn so doing, through functional marketing strategies, improved management and coordination of the studentry, faculty, and non-teaching staff, the University of Batangas was able to develop a greater sense of community immersion, improved the individual's morale and enhanced the commitment to shared programs. \n\nSchool year 2004-2005 was again a lucky year that brought to the fore the best that the University could offer. A high standard of performance is a good indication of the effectiveness of the program. The UB produced a first placer in LET Elementary Education; a 6th placer in the April 2004 Electrical Board examination; 7th placer in Physical Therapy Board exam, a 9th placer and high passing rate in CPA. For the outstanding performance, the University of Batangas received a Recognition Award from the Professional Regulation Commission. Based on Supreme Court records, UB ranked No. 11 among the top performing law schools. A 100 percent passing score was obtained in the Civil Engineering examination in 2005. At this time, quality assurance through accreditation is the main concern so that quality assessment through continuous accreditation of curricular offerings and certification by the International Standardization Organization (ISO) are being Considered.\n\nAs part of the ISO accreditation, the 5S Housekeeping ;Program was launched on August 28, 2005 in the hope that it will improve the the quality of infrastructure and equipment, intensify safetY, and reduce costs of building maintenance. atanas maintains a policy provider for The University of Batangas  personnel, facilities, and frequent and necessary upgrading of p  equipment together with the reformation and benchmarking of the curricula, accelerating instructional competencies via E-learning and high technology, and enhancement of research and linkages in relation to comprehensive, sophisticated technology, and science education. Regarding facilities, management, and services, the University of Batangas, through its working arm, the office of the General Services, responds to specialized needs with a basic maintenance, construction, and repair program. \n\nThe newly constructed Culture and Arts building as the institution's show-window houses the auditorium on the second floor and the business offices on the ground floor. It is being maintained closely and religiously for the benefit of the students, the faculty, and the staff, and even the community. Before the close of SY 2004-2005, UB received another PRC Award of Recognition for outstanding performance in Electrical Engineering for a 100 percent passing rate; thus, it could be said with certainty that UB is moving towards greater heights. As reported by President Abelardo B. Perez in his message to the Board of Regents and shareholder in SY 2005-2006, the University of Batangas is at the threshold of \"Education without Borders\" where academic functions of instruction, research, and extension can be done not only on-site but also on-line. Thus, steps had been taken to strengthen UB as a language center, a learning center, and a livelihood education center. \n\nEmphasis is placed on the teaching and correct usage of English with Filipino equally emphasized. Greater emphasis is likewise given to Mathematics and Sciences for scientific growth and development, which opened the avenue for UB to enter the \"Age of Cyber Education\" so as to produce a remarkable advancement in information technology. For the University of Batangas to survive in the 21st century, English, Science, and Mathematics had to be learned and mastered with the use of new tools in communication and research. In keeping up with its rapid educational changes, new technologies, teaching strategies, research methodologies, and community development interventions had been religiously developed and applied. \n\nSY 2005-2006 was a year of hectic preparation for the 60th Foundation anniversary of WPC and the 10th anniversary as a University. Activities were on deck so as to make the affair a very colorful and memorable one. \n\nOne of the activities slated during the 60th anniversary of UB's founding was the Grand Alumni Homecoming. The Alumni Board of Directors, by virtue of a resolution, transferred the date of the homecoming from February 2006 to December 30, 2005 so as to accommodate the alumni balikbayans who would be coming home for the Christmas holidays.\n\n Hence, the alumni were able to renew old acquaintances and established once again the camaraderie they had missed for a long time. The affair culminated with the election of the Board of Directors for AY 2006-2011 with Atty. Leona Castillo as president. The University's past and present are deeply rooted in the legacy of its founders whose memory is forever honored and kept alive with the passing of the years during the celebration of the annual Foundation and University Week and Alumni Homecoming every five years capped by the election of officers.";


        mChapterText.setText("Chapter Six");
        mTitleText.setText("The Golden Years and Elevation to a University (1996-2005)");

        SpannableString spannableOne = new SpannableString(pageContent);
        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showFVRImage();
            }
        };

        ClickableSpan clickableSpanTwo = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showPoongsantaCruzImage();
            }
        };

        ClickableSpan clickableSpanThree = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showAlumniImage();
            }
        };


        spannableOne.setSpan(clickableSpanOne, 7849,7863, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableOne.setSpan(clickableSpanTwo, 5322, 5337, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableOne.setSpan(clickableSpanThree, 3825, 3872, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
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
            startActivity(new Intent(this, Homeubcv1chapter7.class));
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
        getMenuInflater().inflate(R.menu.ubcv_one_chapter_seven, menu);
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
            youTubePlayer.cueVideo("AZeO76--mks");
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
    public void showFVRImage(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.ramos);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    //image dialog popup
    public void showAlumniImage(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.ubalumni);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    public void showPoongsantaCruzImage(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.poongsantacruz);


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
