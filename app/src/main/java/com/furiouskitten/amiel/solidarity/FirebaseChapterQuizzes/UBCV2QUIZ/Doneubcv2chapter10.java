package com.furiouskitten.amiel.solidarity.FirebaseChapterQuizzes.UBCV2QUIZ;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterEleven;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV2.UbcvTwoChapterTen;
import com.furiouskitten.amiel.solidarity.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Doneubcv2chapter10 extends AppCompatActivity {

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
                Intent intent = new Intent(Doneubcv2chapter10.this, UbcvTwoChapterTen.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
