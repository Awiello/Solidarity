package com.furiouskitten.amiel.solidarity.Activities;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.Toast;

import com.furiouskitten.amiel.solidarity.Adapters.MovieAdapter;
import com.furiouskitten.amiel.solidarity.Adapters.MovieItemClickListener;
import com.furiouskitten.amiel.solidarity.Adapters.SliderPagerAdapter;
import com.furiouskitten.amiel.solidarity.Models.Movie;
import com.furiouskitten.amiel.solidarity.Models.Slide;
import com.furiouskitten.amiel.solidarity.R;


import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class HomeActivity extends AppCompatActivity implements MovieItemClickListener {

    private List<Slide> lstSlides ;
    private List<Movie> lstMovies ;
    private ViewPager sliderpager;
    private TabLayout indicator;
    private RecyclerView MoviesRV ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sliderpager = findViewById(R.id.slider_pager) ;
        indicator = findViewById(R.id.indicator);
        MoviesRV = findViewById(R.id.Rv_movies);

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
        timer.scheduleAtFixedRate(new HomeActivity.SliderTimer(),4000,6000);
        indicator.setupWithViewPager(sliderpager,true);

        // Recyclerview Setup
        // ini data

        lstMovies = new ArrayList<>();
        lstMovies.add(new Movie("Moana",R.drawable.moana,R.drawable.spidercover));
        lstMovies.add(new Movie("Black P",R.drawable.blackp,R.drawable.spidercover));


        MovieAdapter movieAdapter = new MovieAdapter(this,lstMovies,this);
        MoviesRV.setAdapter(movieAdapter);
        MoviesRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));



    }

    @Override
    public void onMovieClick(Movie movie, ImageView movieImageView) {
        // here we send movie information to detail activity
        // also we ll create the transition animation between the two activity

        if(movie.getTitle().equals("Moana")){
            Intent intent = new Intent(this,MovieDetailActivity.class);
            // send movie information to deatilActivity
            intent.putExtra("title",movie.getTitle());
            intent.putExtra("imgURL",movie.getThumbnail());
            intent.putExtra("imgCover",movie.getCoverPhoto());
            // lets crezte the animation
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(HomeActivity.this,
                    movieImageView,"sharedName");

            startActivity(intent,options.toBundle());

        }else if(movie.getTitle().equals("Black P")){
            Intent intent = new Intent(this,MovieDetailActivity.class);
            // send movie information to deatilActivity
            intent.putExtra("title",movie.getTitle());
            intent.putExtra("imgURL",movie.getThumbnail());
            intent.putExtra("imgCover",movie.getCoverPhoto());
            // lets crezte the animation
            ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(HomeActivity.this,
                    movieImageView,"sharedName");

            startActivity(intent,options.toBundle());

        }

        /*
        Intent intent = new Intent(this,MovieDetailActivity.class);
        // send movie information to deatilActivity
        intent.putExtra("title",movie.getTitle());
        intent.putExtra("imgURL",movie.getThumbnail());
        intent.putExtra("imgCover",movie.getCoverPhoto());
        // lets crezte the animation
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(HomeActivity.this,
                                                    movieImageView,"sharedName");

        startActivity(intent,options.toBundle());
         */


        // i l make a simple test to see if the click works

        //Toast.makeText(this,"item clicked : " + movie.getTitle(),Toast.LENGTH_LONG).show();
        // it works great


    }

    class SliderTimer extends TimerTask {


        @Override
        public void run() {

            HomeActivity.this.runOnUiThread(new Runnable() {
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





}
