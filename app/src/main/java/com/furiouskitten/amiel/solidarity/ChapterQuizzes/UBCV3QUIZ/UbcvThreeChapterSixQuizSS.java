package com.furiouskitten.amiel.solidarity.ChapterQuizzes.UBCV3QUIZ;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.furiouskitten.amiel.solidarity.Activities.UbcvOneChaptersActivity;
import com.furiouskitten.amiel.solidarity.BookContents.UBCV3.UbcvThreeChapterSix;
import com.furiouskitten.amiel.solidarity.QuizComponents.Category;
import com.furiouskitten.amiel.solidarity.QuizComponents.Question;
import com.furiouskitten.amiel.solidarity.QuizComponents.QuizActivity;
import com.furiouskitten.amiel.solidarity.QuizComponents.QuizDbHelper;
import com.furiouskitten.amiel.solidarity.R;

import java.util.List;

public class UbcvThreeChapterSixQuizSS extends AppCompatActivity {

    private static final int REQUEST_CODE_QUIZ = 1;
    public static final String EXTRA_CATEGORY_ID = "extraCategoryID";
    public static final String EXTRA_CATEGORY_NAME = "extraCategoryName";
    public static final String EXTRA_DIFFICULTY = "extraDifficulty";

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String KEY_HIGHSCORE = "keyHighscore";


    private Button buttonGoToChapters;
    private Button buttonGoToChaptersTwo;
    private Button buttonStartQuiz;
    private Button buttonStartQuizAgain;
    private TextView textViewHighscore;
    private TextView textRecap;
    private TextView textTitle;
    private Spinner spinnerCategory;
    private Spinner spinnerDifficulty;

    private int highscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_screen);

        textRecap = findViewById(R.id.quizRecap);
        textTitle = findViewById(R.id.quizTitle);
        textViewHighscore = findViewById(R.id.text_view_highscore);


        //loadCategories();
        //loadDifficultyLevels();
        loadHighscore();

        buttonStartQuiz = findViewById(R.id.button_start_quiz);
        buttonStartQuizAgain = findViewById(R.id.button_start_quiz_again);
        buttonGoToChapters = findViewById(R.id.gotoChaptersBtn);
        buttonGoToChaptersTwo = findViewById(R.id.gotoChaptersBtnTwo);

        buttonShow();

        buttonGoToChapters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UbcvThreeChapterSixQuizSS.this, UbcvThreeChapterSix.class));
                Animatoo.animateFade(UbcvThreeChapterSixQuizSS.this);
                finish();
            }
        });

        buttonGoToChaptersTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UbcvThreeChapterSixQuizSS.this, UbcvThreeChapterSix.class));
                Animatoo.animateFade(UbcvThreeChapterSixQuizSS.this);
                finish();
            }
        });


        buttonStartQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuiz();
            }
        });


        buttonStartQuizAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuiz();
            }
        });
    }



    private void startQuiz() {
        //baguhin sa naaayon
        Intent intent = new Intent(UbcvThreeChapterSixQuizSS.this, UbcvThreeChapterThreeQuiz.class);
        startActivityForResult(intent, REQUEST_CODE_QUIZ);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_QUIZ) {
            if (resultCode == RESULT_OK) {
                int score = data.getIntExtra(QuizActivity.EXTRA_SCORE, 0);
                if (score > highscore) {
                    updateHighscore(score);
                }
            }
        }
    }

    private void loadCategories() {
        QuizDbHelper dbHelper = QuizDbHelper.getInstance(this);
        List<Category> categories = dbHelper.getAllCategories();

        ArrayAdapter<Category> adapterCategories = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, categories);
        adapterCategories.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCategory.setAdapter(adapterCategories);
    }

    private void loadDifficultyLevels() {
        String[] difficultyLevels = Question.getAllDifficultyLevels();

        ArrayAdapter<String> adapterDifficulty = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, difficultyLevels);
        adapterDifficulty.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerDifficulty.setAdapter(adapterDifficulty);
    }

    private void loadHighscore() {
        SharedPreferences prefs = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        highscore = prefs.getInt(KEY_HIGHSCORE, 0);
        textViewHighscore.setText("Highscore: " + highscore);
    }

    private void updateHighscore(int highscoreNew) {
        highscore = highscoreNew;
        textViewHighscore.setText("Highscore: " + highscore);

        SharedPreferences prefs = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putInt(KEY_HIGHSCORE, highscore);
        editor.apply();
    }

    private void buttonShow(){
        buttonStartQuiz.setVisibility(View.VISIBLE);
        buttonStartQuizAgain.setVisibility(View.GONE);
        buttonGoToChapters.setVisibility(View.VISIBLE);
    }


}
