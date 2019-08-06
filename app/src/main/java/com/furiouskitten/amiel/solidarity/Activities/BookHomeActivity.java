package com.furiouskitten.amiel.solidarity.Activities;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.furiouskitten.amiel.solidarity.Adapters.BookItemClickListener;
import com.furiouskitten.amiel.solidarity.Adapters.BookiesAdapter;
import com.furiouskitten.amiel.solidarity.Adapters.SliderPagerAdapter;
import com.furiouskitten.amiel.solidarity.Authentication.LoginActivity;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.Models.Bookies;
import com.furiouskitten.amiel.solidarity.Models.Slide;
import com.furiouskitten.amiel.solidarity.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class BookHomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, BookItemClickListener {


    private List<Slide> lstSlides ;
    private ViewPager sliderpager;
    private TabLayout indicator;
    private RecyclerView bookiesRV;


    //Firebase
    FirebaseAuth mAuth;
    FirebaseUser currentUser;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Your Library");

        //firebase
        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();

        sliderpager = findViewById(R.id.slider_pager) ;
        indicator = findViewById(R.id.indicator);
        bookiesRV = findViewById(R.id.Rv_movies);

        // prepare a list of slides ..
        lstSlides = new ArrayList<>() ;
        lstSlides.add(new Slide(R.drawable.servicetofellowmen,"Develop your own wisdom\nand make it part of your own life."));
        lstSlides.add(new Slide(R.drawable.service,"Reach out for others.\nNo man is an island, no man stands alone."));
        lstSlides.add(new Slide(R.drawable.ubeleven,"For the ''Founding Fathers'' whose idealism, dedication, zeal and values we fondly remember.\n "));
        lstSlides.add(new Slide(R.drawable.faith,"Study about one's faith, \nand express their beliefs about God."));
        SliderPagerAdapter adapter = new SliderPagerAdapter(this,lstSlides);
        sliderpager.setAdapter(adapter);
        // setup timer
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new BookHomeActivity.SliderTimer(),4000,6000);
        indicator.setupWithViewPager(sliderpager,true);


        List<Bookies> lstBookies = new ArrayList<>();
        lstBookies.add(new Bookies("University of Batangas Core Value 1: Legacy of Love","The book is all about the values, dreams, aspirations, sacrifices and commitment of the Founding Fathers to put up a college designed to maintain a standard of excellence aswell as the outstanding attainment of their ideals and vision by the succeeding generation are inside this book for readers to digest and appreciate.",R.drawable.ubcv1, R.drawable.ubcv1));
        lstBookies.add(new Bookies("University of Batangas Core Value 2: Faith in God","This book deals with the studying the attributes of God and the basis of our faith. Emphasis is given on developing and nurturing a strong Faith in God as part of the University's Core Values regardless of one's religious affiliation.",R.drawable.ubcv2, R.drawable.ubcv2));
        lstBookies.add(new Bookies("University of Batangas Core Value 3: Love of Wisdom","This book focuses on the Third Core Value of the University of Batangas which is Love of Wisdom. Different ways of Developing wisdom will be discussed. Student will have a chance to participate in the activities on how wisdom will be developed among themselves, and later on, making it a part of their life.",R.drawable.ubcv3, R.drawable.ubcv3));
        lstBookies.add(new Bookies("University of Batangas Core Value 4: Service to Fellowmen","This book focuses on the Fourth Core Value of the University which is SERVICE TO  FELLOWMEN. Ways on how to reach out to others will be discussed. Practicum activities to develop service  to fellowmen will be discussed.",R.drawable.ubcv4, R.drawable.ubcv4));

        BookiesAdapter bookiesAdapter = new BookiesAdapter(this, lstBookies, this);
        bookiesRV.setAdapter(bookiesAdapter);
        bookiesRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        updateNavHeader();
    }

    @Override
    public void onBackPressed() {
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
        getMenuInflater().inflate(R.menu.book_home, menu);
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

    @Override
    public void onBookClick(Bookies bookies, ImageView bookiesImageView) {

        if(bookies.getTitle().equals("University of Batangas Core Value 1: Legacy of Love")){
            Intent intent = new Intent(this,BookDetailActivity.class);
            // send movie information to deatilActivity
            intent.putExtra("title",bookies.getTitle());
            intent.putExtra("imgURL",bookies.getThumbnail());
            intent.putExtra("imgCover",bookies.getCoverPhoto());
            intent.putExtra("description",bookies.getDescription());
            // lets crezte the animation
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(BookHomeActivity.this,
                    bookiesImageView,"sharedName");

            startActivity(intent,options.toBundle());

        }else if(bookies.getTitle().equals("University of Batangas Core Value 2: Faith in God")){
            Intent intent = new Intent(this,BookDetailActivityTwo.class);
            // send movie information to deatilActivity
            intent.putExtra("title",bookies.getTitle());
            intent.putExtra("imgURL",bookies.getThumbnail());
            intent.putExtra("imgCover",bookies.getCoverPhoto());
            intent.putExtra("description",bookies.getDescription());
            // lets crezte the animation
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(BookHomeActivity.this,
                    bookiesImageView,"sharedName");

            startActivity(intent,options.toBundle());

        }else if(bookies.getTitle().equals("University of Batangas Core Value 3: Love of Wisdom")){
            Intent intent = new Intent(this,BookDetailActivityThree.class);
            // send movie information to deatilActivity
            intent.putExtra("title",bookies.getTitle());
            intent.putExtra("imgURL",bookies.getThumbnail());
            intent.putExtra("imgCover",bookies.getCoverPhoto());
            intent.putExtra("description",bookies.getDescription());
            // lets crezte the animation
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(BookHomeActivity.this,
                    bookiesImageView,"sharedName");

            startActivity(intent,options.toBundle());

        }else if(bookies.getTitle().equals("University of Batangas Core Value 4: Service to Fellowmen")){
            Intent intent = new Intent(this,BookDetailActivityFour.class);
            // send movie information to deatilActivity
            intent.putExtra("title",bookies.getTitle());
            intent.putExtra("imgURL",bookies.getThumbnail());
            intent.putExtra("imgCover",bookies.getCoverPhoto());
            intent.putExtra("description",bookies.getDescription());
            // lets crezte the animation
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(BookHomeActivity.this,
                    bookiesImageView,"sharedName");

            startActivity(intent,options.toBundle());

        }




        /*
        Intent intent = new Intent(this,BookDetailActivity.class);
        // send movie information to deatilActivity
        intent.putExtra("title",bookies.getTitle());
        intent.putExtra("imgURL",bookies.getThumbnail());
        intent.putExtra("imgCover",bookies.getCoverPhoto());
        // lets crezte the animation
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(BookHomeActivity.this,
                bookiesImageView,"sharedName");

        startActivity(intent,options.toBundle());

        */
    }


    class SliderTimer extends TimerTask {


        @Override
        public void run() {

            BookHomeActivity.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (sliderpager.getCurrentItem()<lstSlides.size()-1) {
                        sliderpager.setCurrentItem(sliderpager.getCurrentItem()+1);
                    }
                    else
                        sliderpager.setCurrentItem(0);
                }
            });


        }
    }

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
