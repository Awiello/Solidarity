package com.furiouskitten.amiel.solidarity.Activities;

import android.animation.ArgbEvaluator;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
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
import com.furiouskitten.amiel.solidarity.Adapters.BookMainMenuAdapter;
import com.furiouskitten.amiel.solidarity.Adapters.MainMenuAdapter;
import com.furiouskitten.amiel.solidarity.Authentication.LoginActivity;
import com.furiouskitten.amiel.solidarity.DictionaryMainActivity;
import com.furiouskitten.amiel.solidarity.Models.BookMainMenuModel;
import com.furiouskitten.amiel.solidarity.Models.MainMenuModel;
import com.furiouskitten.amiel.solidarity.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class BookMainMenu extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    //test
    FirebaseAuth mAuth;
    FirebaseUser currentUser;

    //Main menu ViewPagers and shiet.

    ViewPager mBookMainMenuViewPager;
    List<BookMainMenuModel> mBookMainMenuModelList;
    BookMainMenuAdapter mBookMainMenuAdapter;
    Integer[] color = null;
    ArgbEvaluator mArgbEvaluator = new ArgbEvaluator();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_main_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //test
        mAuth = FirebaseAuth.getInstance();
        currentUser = mAuth.getCurrentUser();



        //Start ng view pager properties

        mBookMainMenuModelList = new ArrayList<>();
        mBookMainMenuModelList.add(new BookMainMenuModel(R.drawable.educ, "Learn UBCV","Find facts, information and valuable things from the summarized pages of your UBCV books.","Learn Now"));
        mBookMainMenuModelList.add(new BookMainMenuModel(R.drawable.hs, "Challenge Quizzes","Test your knowledge and answer the challenge questions. Are you up to the challenge?","Challenge Yourself"));
        mBookMainMenuModelList.add(new BookMainMenuModel(R.drawable.studentslife, "The Solidarity Wall","Feel to post something inspiring? Check out our Solidarity Wall and share your inspiring quotes and motivating captures.","Go to the Wall"));

        mBookMainMenuAdapter = new BookMainMenuAdapter(mBookMainMenuModelList, this);
        mBookMainMenuViewPager = findViewById(R.id.MainMenuViewPager);
        mBookMainMenuViewPager.setAdapter(mBookMainMenuAdapter);

        //End ng viewpager properties


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
        getMenuInflater().inflate(R.menu.book_main_menu, menu);
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

    //update nav header contents
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
