package com.furiouskitten.amiel.solidarity.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.furiouskitten.amiel.solidarity.Adapters.UbcvAdapters;
import com.furiouskitten.amiel.solidarity.Authentication.LoginActivity;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.Models.UbcvOneChaptersModel;
import com.furiouskitten.amiel.solidarity.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class UbcvOneChaptersActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    //Firebase
    FirebaseAuth mAuth;
    FirebaseUser currentUser;
    List<UbcvOneChaptersModel> mUbcvOneModels;
    Animation fadeInAnim;
    CardView bigTextBgCardView;
    TextView bigText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubcv_one_chapters);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("UBCV 101 Chapters");


        //firebase
        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();

        fadeInAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animation_two);

        //textxs

        bigTextBgCardView = findViewById(R.id.chapterBigTextBg);
        bigText = findViewById(R.id.chapterBigText);



        //Start RecyclerView
        mUbcvOneModels = new ArrayList<>();
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.ubcvonecone, "Post-War Batangas: The Transition Year."));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.ubcvonectwo, "The Emergence of a College (1945-1946)"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.juanjavierjeep, "Great Expectations (1956-1965)"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.mhdelpilar, "New Challenges and Empowerment. (1966-1975)"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.boycott, "Years of Fulfillment. (1976-1985)"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.hilltopcampus, "Alliance for Networking and Technology (1986-1995)"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.ubeleven, "The Golden Years: Elevation to a University (1996-2005)"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.main, "At the Crossroads of the 21st Century (2006-2009)"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.lipa, "On the Road to Excellence"));




        RecyclerView myUbcvRecyclerView = findViewById(R.id.ubcvOneRecyclerView);
        UbcvAdapters myUbcvOneAdapter = new UbcvAdapters(this, mUbcvOneModels);
        myUbcvRecyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        myUbcvRecyclerView.setAdapter(myUbcvOneAdapter);


        bigTextBgCardView.startAnimation(fadeInAnim);
        bigText.startAnimation(fadeInAnim);
        myUbcvRecyclerView.startAnimation(fadeInAnim);



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
        getMenuInflater().inflate(R.menu.ubcv_one_chapters, menu);
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
