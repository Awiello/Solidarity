package com.furiouskitten.amiel.solidarity.TestFirebaseQuiz.Activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.furiouskitten.amiel.solidarity.R;
import com.furiouskitten.amiel.solidarity.TestFirebaseQuiz.Fragments.CategoryFragment;
import com.furiouskitten.amiel.solidarity.TestFirebaseQuiz.Fragments.RankingFragment;
import com.furiouskitten.amiel.solidarity.TestFirebaseQuiz.Model.Category;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.framelayout,CategoryFragment.newInstance());
        transaction.commit();


    }
}
