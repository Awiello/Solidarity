package com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV3QUIZ;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.furiouskitten.amiel.solidarity.R;
import com.furiouskitten.amiel.solidarity.TestFirebaseQuiz.Fragments.CategoryFragment;

public class Homeubcv3chapter2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.framelayout,CategoryFragmentubcv3chapter2.newInstance());
        transaction.commit();


    }
}
