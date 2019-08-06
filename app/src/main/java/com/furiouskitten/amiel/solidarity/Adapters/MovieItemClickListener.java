package com.furiouskitten.amiel.solidarity.Adapters;

import android.widget.ImageView;

import com.furiouskitten.amiel.solidarity.Models.Movie;


public interface MovieItemClickListener {

    void onMovieClick(Movie movie, ImageView movieImageView); // we will need the imageview to make the shared animation between the two activity

}
