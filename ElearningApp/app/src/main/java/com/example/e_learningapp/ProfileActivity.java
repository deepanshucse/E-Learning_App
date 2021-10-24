package com.example.e_learningapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;

public class ProfileActivity extends AppCompatActivity {
    public static final String TAG = "GoogleSignIn";
    TextView tvUserName;
    TextView tvUserEmail;
    ImageView userImageView;
    Button btnSignOut;
    Button btnSingOutmain;
    Button btabout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvUserName = findViewById(R.id.userName);
        tvUserEmail = findViewById(R.id.userEmail);
        userImageView = findViewById(R.id.userImage);
        btnSignOut = findViewById(R.id.btnLogout);
        btnSingOutmain = findViewById(R.id.btnLogout1);
        btabout = findViewById(R.id.about);

        SharedPreferences preferences = this.getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String userName = preferences.getString("username","");
        String userEmail = preferences.getString("useremail", "");
        String userImageUrl = preferences.getString("userPhoto","");

        tvUserName.setText(userName);
        tvUserEmail.setText(userEmail);
        Glide.with(this).load(userImageUrl).into(userImageView);

        btabout.setOnClickListener(view -> {
//            FirebaseAuth.getInstance().signOut();
            goToabout();
        });

        btnSignOut.setOnClickListener(view -> {
//            FirebaseAuth.getInstance().signOut();
            goToMainActivity();
        });
        btnSingOutmain.setOnClickListener(view -> {
            FirebaseAuth.getInstance().signOut();
            goTosignin();
        });
    }

    private void goToabout() {
        startActivity(new Intent(ProfileActivity.this, contact.class));
    }

    private void goTosignin() {
        startActivity(new Intent(ProfileActivity.this, signin.class));
    }

    private void goToMainActivity() {
        startActivity(new Intent(ProfileActivity.this, MainActivity.class));
    }
}