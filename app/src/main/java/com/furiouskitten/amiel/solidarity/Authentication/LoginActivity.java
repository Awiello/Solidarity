package com.furiouskitten.amiel.solidarity.Authentication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.furiouskitten.amiel.solidarity.Activities.BookMainMenu;
import com.furiouskitten.amiel.solidarity.Activities.HomeActivity;
import com.furiouskitten.amiel.solidarity.Activities.IntroActivity;
import com.furiouskitten.amiel.solidarity.Activities.LandingActivity;
import com.furiouskitten.amiel.solidarity.Activities.MainMenuActivity;
import com.furiouskitten.amiel.solidarity.QuizComponents.QuizActivityUbcvOneChapterOne;
import com.furiouskitten.amiel.solidarity.R;
import com.furiouskitten.amiel.solidarity.TestFirebaseQuiz.Activities.Home;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

public class LoginActivity extends AppCompatActivity {


    //API key ng youtube!
    public static final String API_KEY = "AIzaSyDPqwPQIAhTwfNR6PjRdnh1YJdjr82aVbM";

    static final int GOOGLE_SIGN = 123;
    FirebaseAuth mAuth;
    Button mLoginButton;
    GoogleSignInClient mGoogleSignInClient;
    Intent testHomeActivity;
    Animation mButtonAnimation;
    ProgressBar mLoginProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //hide actionbar
        getSupportActionBar().hide();

        //moving colors bg animation
        RelativeLayout relativeLayout = findViewById(R.id.layout);
        AnimationDrawable animationDrawable = (AnimationDrawable) relativeLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
        //moving colors bg animation

        mLoginProgressBar = findViewById(R.id.loginProgressBar);
        mLoginButton = findViewById(R.id.loginButton);
        mButtonAnimation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animation);

        mAuth = FirebaseAuth.getInstance();
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions.Builder().requestIdToken(getString(R.string.default_web_client_id)).requestEmail().build();
        mGoogleSignInClient = GoogleSignIn.getClient(this,googleSignInOptions);

        //button animantion
        loginButtonAnimation();


        //intents
        //testHomeActivity = new Intent(this, Home.class);
        testHomeActivity = new Intent(this, IntroActivity.class);

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLoginProgressBar.setVisibility(View.VISIBLE);
                mLoginButton.setVisibility(View.GONE);
                signInGoogle();
            }
        });

        if(mAuth.getCurrentUser() != null){
            FirebaseUser user = mAuth.getCurrentUser();
            updateUI(user);
        }

    }

    private void updateUI(FirebaseUser user) {
        if(user != null){
            startActivity(testHomeActivity);
            finish();
            mLoginProgressBar.setVisibility(View.GONE);
        }
    }

    private void signInGoogle() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, GOOGLE_SIGN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == GOOGLE_SIGN){
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);

            try{

                GoogleSignInAccount account = task.getResult(ApiException.class);

                if(account != null)firebaseAuthWithGoogle(account);


            }catch (ApiException e){
                e.printStackTrace();
            }
        }
    }

    private void firebaseAuthWithGoogle(GoogleSignInAccount account) {
        Log.d("TAG","firebaseAuthWithGoogle:" + account.getId());

        AuthCredential credential = GoogleAuthProvider.getCredential(account.getIdToken(), null);
        mAuth.signInWithCredential(credential).addOnCompleteListener(this, task -> {
            if(task.isSuccessful()){
                Log.d("TAG", "sign in success");
                FirebaseUser user = mAuth.getCurrentUser();
                updateUI(user);
                finish();

            }else{
                Log.w("TAG", "failure",task.getException());
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT);
                updateUI(null);
            }
        });
    }


    //login button animation method
    public void loginButtonAnimation(){
        mLoginButton.setAnimation(mButtonAnimation);
    }

    public void transiBtn(View view){
        if(view == findViewById(R.id.loginButton)){
            Animatoo.animateFade(this);
        }
    }

}
