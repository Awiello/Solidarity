package com.furiouskitten.amiel.solidarity.BookContents.UBCV1;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
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
import com.furiouskitten.amiel.solidarity.Activities.MainMenuActivity;
import com.furiouskitten.amiel.solidarity.Activities.UbcvOneChaptersActivity;
import com.furiouskitten.amiel.solidarity.Authentication.LoginActivity;
import com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV1QUIZ.UbcvOneChapterTwoQuizSS;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV1QUIZ.Homeubcv1chapter2;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

public class UbcvOneChapterTwo extends AppCompatActivity
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
        setContentView(R.layout.activity_ubcv_one_chapter_two);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Chapter 1: The Emergence of a College (1947-1955)");

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
"The clipping from the files of the late Mrs. Flordeliza M. Arguelles, the fourth WPC president and wife of one of the founders set the finality of true record of the beginnings of the Western Philippine Colleges, now the University of Batangas.\n\nOne afternoon in 1946, at the printing press of Mr. Juan Y. Javier on P. Burgos Street, two men with a common gripe against school owner had a chance meeting. Mr. Juan Y. Javier was not paid upon delivery of printed educational materials while Atty. Jesus A. Arguelles was not given his salary as a college teacher. These two unfortunate incidents motivated them to put up their own school. They invited prominent men of the community who are with vision, integrity, dedication, credibility, courage, optimism, perseverance, and leadership. They are Rev. Fr. Vicente R. Catapang, a well-known educator from Taal, Atty. Francisco G. Perez, the senior member of the Provincial Board, town mayor Roman L. Perez and Atty. Pablo C. Umali from Lipa to join them as members of the Board of Trustees.\n\n  Thus, the project plan was finalized in 1946 but the school year had already started. Due to financially unstable environment, the enterprising young men work as a team to raise the initial capital outlay. They exerted all efforts to bring to life the brainchild of Mr. Juan Y. Javier and Atty. Jesus A. Arguelles as gift of love to the people of Batangas and named it Western Philippine colleges because it is located on the Western side of the map and the college is located in Batangas; hence, the name fits the location of the institution.\n\nThe opening of classes was announced in June 1947 through posters and advertisements in local newspapers and movie houses. Also, with the help of the famous jeep of Mr. Javier and other founders in tow, they are able to gather bandwagon of enrolees. Everybody worked religiously in the preparation for the first day of classes. On May, 22, 1947, a meeting was called to actualize the functions of the Board of Trustees. Atty. Jesus A. Arguelles was appointed as the first executive secretary and custodian of records was approved. On April 28, 1947, first classes were formally conducted in a rented private house along Rizal Avenue with 48 college and high school enrolees. \n\nDuring the hectic preparation for July 4 Independence day, Atty. Arguelles suffered a massive heart attack which cause him dead and results to an emergency meeting where his wife Mrs. Flordeliza M. Arguelles was appointed as executive secretary as his replacement. In July 1947, due to the increasing number of college students, they decided to transfer to another school site in Javier-Villanueva house, now the Jollibee Corporation.\n\nThe actualization of administrative function of board of Trustees was approved by the board. The staffs was to be headed by Fr. Vicente R. Catapang as president and over all administrator because of his wisdom and educational expertise;  Mr. Juan Javier Sr., as vice president, High School principal and the dean of the College of Education; Board of Member Francisco F. Perez as treasurer and dean of Liberal Arts Department; Atty. Pablo C. Umali as dean of the College of Commerce; and Mrs. Flordeliza M. Arguelles as executive secretary and High School Principal in SY 1948-1949.\n\nThrough hard work of Father Catapang, Government Recognition No. 524 S. 1948 was given to WPC to operate a complete secondary course effective July 1, 1948. In 1948, there were no enrolees in the elementary department which is operated by Miss Amelia Berba, Mr. Francisco Mercado and Miss Lydia Tingchuy, with Miss Gliceria Martinez as the first Elementary school principal. On December 8, 1947, an educational partnership was signed by the founders and Mrs. Severina Orosa, which mark the beginning of Western Philippine Colleges, Inc. \n\nWhen the school identification was the trend, President Catapang formed a committee to design the institution’s flag which became the emblem of the school and the ROTC unit. Also, a group chaired by Mrs. Gregoria R. de Jesus come up with the music and lyrics of the “WPC Hymn” which was adopted from the song of Notre Dame University in Illinois, USA while President Catapang conceptualized the logo or seal of the WPC as the embodiment of the school’s philosophy, vision, and mission.\n\nProblems were met concerning the facilities and instruction but with high hopes, they solved it in due time. On April 30m 1948, the first commencement program was held with judge Vicente Arguelles as guest speaker. The first fourteen high school graduates marched on a makeshift stage in the campus that included Felicisima Atule, Francisco Borbon, Apolonia de Joya, Ignacia Magbilangm Natividad Villafuerte, Remigo Agpalo (Vaedictorian), Conrado Atienza, Rafael Dimaculangan (Salutatorian), Eugenio Benito, Ricardo Lauron, Ruben Luna, Ruperto Magpantay, Godofredo Dimayacyac, and Visitacion Ilagan.\n\nThere was a marked increase of high school graduates from 14 to 63 in SY 1948-1949. The first batch of college graduates, 18 from Liberal arts,  and 48 from Education listened to the advice of the commencement speaker Jose Laurel. Due to problem of accommodation, through the effort of Board member Atty. Francisco G. Perez, a lot measuring approximately 3290.76 square meters on M. H del Pilar was leased for 99 years to WPC. Due to insistent demand of enrolees, new courses were opened such as two year Associate in Commercial Science and the College of Law also started to operate in June 1949.\n\nAfter the tragic incident happened to Mayor Roman L. Perez, the school administrators recognized the need of the growing student population for an avenue where they could ventilate their opinions in a democratic society. On December 1950, the “Westernian Advocate” came out of the press with Pedro S. Tolentino, the first Editor-in-Chief.\n\nDuring the opening of classes in June 1951, 700 enrolees registered in the different courses which also lead to a marked increase in the number of graduates in March 1952. However after five years of dedicated service, Father Catapang decided to leave the college due to his failing health which was filled in by Vice president Juan Y. Javier. The onset of SY 1952-1953 was a period of great expectations which show appreciable achievements in both athletic and academic competitions. Also, another notable event during the school year was the creation of the Executive Committee for the management of College affairs composed of Father Catapang as Honorary President.\n\nThe College of Law, which was opened in 1949 with Atty Francisco G. Perez as the first dean, was the crowning achievement of the founders because their efforts were not in vain when candidates for graduation marched on the stage in 1953. Moreover, ten elementary school graduates received the Elementary certificate from the newly inducted President Juan Y. Javier, The first batch of law graduates in 1953 took the bar exam in the same year wherein five out of eleven candidates successfully hurdled the bar examinations including Atty. Juan, Abas, Isidro Laygo, Florencio Mercado, Juan V, Ramos and Clemente Sale. The accomplishment of the college of Law for two consecutive years added feathers to the caps of the “Founding Fathers” whose efforts and courage during the challenging years of existence were finally rewarded. \n\nThe decline in the number of enrolees had a break in SY 1954-1955. The college was able to recover from the sudden decrease with the cooperation of dedicated and loyal faculty members. This became the hallmark of the cordial relationship between the administration and the devoted teachers.";
        String pageContentTwo =
"Through hard work of Father Catapang, Government Recognition No. 524 S. 1948 was given to WPC to operate a complete secondary course effective July 1, 1948. In 1948, there were no enrolees in the elementary department which is operated by Miss Amelia Berba, Mr. Francisco Mercado and Miss Lydia Tingchuy, with Miss Gliceria Martinez as the first Elementary school principal. On December 8, 1947, an educational partnership was signed by the founders and Mrs. Severina Orosa, which mark the beginning of Western Philippine Colleges, Inc. \n\nWhen the school identification was the trend, President Catapang formed a committee to design the institution’s flag which became the emblem of the school and the ROTC unit. Also, a group chaired by Mrs. Gregoria R. de Jesus come up with the music and lyrics of the “WPC Hymn” which was adopted from the song of Notre Dame University in Illinois, USA while President Catapang conceptualized the logo or seal of the WPC as the embodiment of the school’s philosophy, vision, and mission.\n\nProblems were met concerning the facilities and instruction but with high hopes, they solved it in due time. On April 30m 1948, the first commencement program was held with judge Vicente Arguelles as guest speaker. The first fourteen high school graduates marched on a makeshift stage in the campus that included Felicisima Atule, Francisco Borbon, Apolonia de Joya, Ignacia Magbilangm Natividad Villafuerte, Remigo Agpalo (Vaedictorian), Conrado Atienza, Rafael Dimaculangan (Salutatorian), Eugenio Benito, Ricardo Lauron, Ruben Luna, Ruperto Magpantay, Godofredo Dimayacyac, and Visitacion Ilagan.\n\nThere was a marked increase of high school graduates from 14 to 63 in SY 1948-1949. The first batch of college graduates, 18 from Liberal arts,  and 48 from Education listened to the advice of the commencement speaker Jose Laurel. Due to problem of accommodation, through the effort of Board member Atty. Francisco G. Perez, a lot measuring approximately 3290.76 square meters on M. H del Pilar was leased for 99 years to WPC. Due to insistent demand of enrolees, new courses were opened such as two year Associate in Commercial Science and the College of Law also started to operate in June 1949.\n\nAfter the tragic incident happened to Mayor Roman L. Perez, the school administrators recognized the need of the growing student population for an avenue where they could ventilate their opinions in a democratic society. On December 1950, the “Westernian Advocate” came out of the press with Pedro S. Tolentino, the first Editor-in-Chief.\n\nDuring the opening of classes in June 1951, 700 enrolees registered in the different courses which also lead to a marked increase in the number of graduates in March 1952. However after five years of dedicated service, Father Catapang decided to leave the college due to his failing health which was filled in by Vice president Juan Y. Javier. The onset of SY 1952-1953 was a period of great expectations which show appreciable achievements in both athletic and academic competitions. Also, another notable event during the school year was the creation of the Executive Committee for the management of College affairs composed of Father Catapang as Honorary President.\n\nThe College of Law, which was opened in 1949 with Atty Francisco G. Perez as the first dean, was the crowning achievement of the founders because their efforts were not in vain when candidates for graduation marched on the stage in 1953. Moreover, ten elementary school graduates received the Elementary certificate from the newly inducted President Juan Y. Javier, The first batch of law graduates in 1953 took the bar exam in the same year wherein five out of eleven candidates successfully hurdled the bar examinations including Atty. Juan, Abas, Isidro Laygo, Florencio Mercado, Juan V, Ramos and Clemente Sale. The accomplishment of the college of Law for two consecutive years added feathers to the caps of the “Founding Fathers” whose efforts and courage during the challenging years of existence were finally rewarded. \n\nThe decline in the number of enrolees had a break in SY 1954-1955. The college was able to recover from the sudden decrease with the cooperation of dedicated and loyal faculty members. This became the hallmark of the cordial relationship between the administration and the devoted teachers.";

        mChapterText.setText("Chapter One");
        mTitleText.setText("Emergence of a College (1947-1955)");

        SpannableString spannableOne = new SpannableString(pageContent);
        SpannableString spannableTwo = new SpannableString(pageContentTwo);

        ClickableSpan clickableSpanOne = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showFlordelizaArgImage();
            }
        };

        ClickableSpan clickableSpanTwo = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showJuanJavierImage();
            }
        };

        ClickableSpan clickableSpanThree = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showJesusArguellez();
            }
        };


        ClickableSpan clickableSpanFive = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showFatherCatapang();
            }
        };

        ClickableSpan clickableSpanSix = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                showWpcLogo();
            }
        };

        ClickableSpan clickableSpanSeven = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
               showFirstBatch();
            }
        };


        spannableOne.setSpan(clickableSpanOne, 40,68, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableOne.setSpan(clickableSpanTwo, 294, 312, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableOne.setSpan(clickableSpanThree, 489, 513, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableOne.setSpan(clickableSpanFive, 796, 824, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableOne.setSpan(clickableSpanSix, 4224, 4241, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableTwo.setSpan(clickableSpanSeven, 3600, 3631, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


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






        //implement firebase
        updateNavHeader();
    }

    public void transiBtn(View view){
        if(view == findViewById(R.id.nextPageButton)){
            startActivity(new Intent(this, Homeubcv1chapter2.class));
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
        getMenuInflater().inflate(R.menu.ubcv_one_chapter_two, menu);
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
    public void showFlordelizaArgImage(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.flordelizaarg);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    //image dialog popup
    public void showJuanJavierImage(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.juanjavier);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    //image dialog popup
    public void showJesusArguellez(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.jesusarg);


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

    //image dialog popup
    public void showFatherCatapang(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.fathercatapang);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }


    public void showWpcLogo(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.wpclogo);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    public void showFirstBatch(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.firstbatcwpc);


        mDialog.addContentView(imageView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        mDialog.show();
    }

    //image dialog popup
    public void test(){
        final Dialog mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        mDialog.setCanceledOnTouchOutside(false);

        TextView textView = new TextView(this);
        textView.setText("Beam me up scottie");

        //ImageView imageView = new ImageView(this);
        //imageView.setImageResource(R.drawable.fathercatapang);


        mDialog.addContentView(textView, new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
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
