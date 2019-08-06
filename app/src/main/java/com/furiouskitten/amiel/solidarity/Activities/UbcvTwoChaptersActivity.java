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
import com.furiouskitten.amiel.solidarity.Adapters.UbcvTwoAdapters;
import com.furiouskitten.amiel.solidarity.Authentication.LoginActivity;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.Models.UbcvOneChaptersModel;
import com.furiouskitten.amiel.solidarity.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class UbcvTwoChaptersActivity extends AppCompatActivity
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
        setContentView(R.layout.activity_ubcv_two_chapters);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("UBCV 102 Chapters");


        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();

        fadeInAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animation_two);

        //textxs

        bigTextBgCardView = findViewById(R.id.chapterBigTextBg);
        bigText = findViewById(R.id.chapterBigText);


        //Start RecyclerView
        mUbcvOneModels = new ArrayList<>();
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.godcreation, "Lesson 1: God Made Me"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.whoisgod, "Lesson 2: Who is God"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.godisomnipresent, "Lesson 2.1:God is Omnipresent"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.godisomnipotent, "Lesson 2.2 God is Omnipotent"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.omniscient, "Lesson 2.3 God is Omniscient"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.invisible, "Lesson 2.4 God is Invisible"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.immortaljesus, "Lesson 2.5 God is Immortal"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.godisholy, "Lesson 2.6 God is Holy"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.eternal, "Lesson 2.7 God is Eternal"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.godislove, "Lesson 2.8 God is Love"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.godislove, "Lesson 2.9 God is Truth"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.godisspirit, "Lesson 2.10 God is Spirit"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.knowingjesus, "Lesson 3: Knowing JESUS CHRIST"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.lightoftheworld, "Lesson 4: Light of the World"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.faith, "Lesson 5: Faith in God"));
        mUbcvOneModels.add(new UbcvOneChaptersModel(R.drawable.communicating, "Lesson 6: Communicating with God"));


        RecyclerView myUbcvRecyclerView = findViewById(R.id.ubcvOneRecyclerView);
        UbcvTwoAdapters myUbcvOneAdapter = new UbcvTwoAdapters(this, mUbcvOneModels);
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
        getMenuInflater().inflate(R.menu.ubcv_two_chapters, menu);
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
