package com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV1QUIZ;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.furiouskitten.amiel.solidarity.R;
import com.furiouskitten.amiel.solidarity.TestFirebaseQuiz.Fragments.CategoryFragment;

public class Homeubcv1chapter3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.framelayout,CategoryFragmentubcv1chapter3.newInstance());
        transaction.commit();


    }
}
