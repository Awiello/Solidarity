package com.furiouskitten.amiel.solidarity.BookContents.VIDEOS;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.furiouskitten.amiel.solidarity.BookContents.UBCV1.UbcvOneChapterEight;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV3.UbcvThreeChapterThree;
import com.furiouskitten.amiel.solidarity.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;

public class LearningVideo extends AppCompatActivity implements YouTubePlayer.OnInitializedListener, YouTubePlayer.PlayerStateChangeListener, YouTubePlayer.PlaybackEventListener{


    String API_KEY = "AIzaSyDPqwPQIAhTwfNR6PjRdnh1YJdjr82aVbM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_video);


        //Youtube fragment show
        YouTubePlayerSupportFragment frag = (YouTubePlayerSupportFragment) getSupportFragmentManager().findFragmentById(R.id.youtube_fragment);
        frag.initialize(API_KEY, this);

    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(getApplicationContext(), UbcvThreeChapterThree.class);
        startActivity(intent);
        finish();
    }

    //Youtube Fragment properties

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

        youTubePlayer.setPlayerStateChangeListener(this);
        youTubePlayer.setPlaybackEventListener(this);

        if (!b){
            youTubePlayer.cueVideo("TZXwtG06t64");
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

}
