package com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV4QUIZ;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.furiouskitten.amiel.solidarity.BookContents.UBCV4.UbcvFourChapterFour;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV4.UbcvFourChapterThree;
import com.furiouskitten.amiel.solidarity.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Doneubcv4chapter4 extends AppCompatActivity {

    Button btnTryAgain;



    FirebaseDatabase database;
    DatabaseReference question_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);

        btnTryAgain = findViewById(R.id.btnTryAgain);

        btnTryAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Doneubcv4chapter4.this, UbcvFourChapterFour.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
