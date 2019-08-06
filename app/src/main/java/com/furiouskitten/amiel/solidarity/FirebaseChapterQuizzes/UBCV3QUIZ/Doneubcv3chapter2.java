package com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV3QUIZ;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.furiouskitten.amiel.solidarity.BookContents.UBCV3.UbcvThreeChapterThree;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV3.UbcvThreeChapterTwo;
import com.furiouskitten.amiel.solidarity.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Doneubcv3chapter2 extends AppCompatActivity {

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
                Intent intent = new Intent(Doneubcv3chapter2.this, UbcvThreeChapterTwo.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
