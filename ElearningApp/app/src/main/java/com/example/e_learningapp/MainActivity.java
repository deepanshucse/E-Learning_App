package com.example.e_learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    ImageView ibackend;
    ImageView ifrontend;
    ImageView ijava;
    ImageView ireact;
    Button iprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibackend = findViewById(R.id.backend);
        ifrontend = findViewById(R.id.frontend);
        ijava = findViewById(R.id.java);
        ireact = findViewById(R.id.react);
        iprofile = findViewById(R.id.profile);


        ibackend.setOnClickListener(view -> {
//            FirebaseAuth.getInstance().signOut();
            goTocourse2();
        });
        ifrontend.setOnClickListener(view -> {
            FirebaseAuth.getInstance().signOut();
            goTocourse1();
        });
        ijava.setOnClickListener(view -> {
            FirebaseAuth.getInstance().signOut();
            goTocourse2();
        });
        ireact.setOnClickListener(view -> {
            FirebaseAuth.getInstance().signOut();
            goTocourse1();
        });
        iprofile.setOnClickListener(view -> {
            FirebaseAuth.getInstance().signOut();
            goTosignin();
        });
    }

    private void goTosignin() {
        startActivity(new Intent(MainActivity.this, ProfileActivity.class));
    }

    private void goTocourse2() {
        startActivity(new Intent(MainActivity.this, course2.class));
    }

    private void goTocourse1() {
        startActivity(new Intent(MainActivity.this, course1.class));
    }
}