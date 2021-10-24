package com.example.e_learningapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class course1 extends AppCompatActivity {
    Button bc;
    RelativeLayout vt1;
    RelativeLayout vt2;
    RelativeLayout vt3;
    RelativeLayout vt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course1);

        vt1 = findViewById(R.id.v1);
        vt2 = findViewById(R.id.v2);
        vt3 = findViewById(R.id.v3);
        vt4 = findViewById(R.id.v4);
        bc = findViewById(R.id.back);


        vt1.setOnClickListener(view -> {
//            FirebaseAuth.getInstance().signOut();
            goTovc1v1();
        });
        vt2.setOnClickListener(view -> {
            FirebaseAuth.getInstance().signOut();
            goToc1v2();
        });
        vt3.setOnClickListener(view -> {
            FirebaseAuth.getInstance().signOut();
            goToc1v3();
        });
        vt4.setOnClickListener(view -> {
            FirebaseAuth.getInstance().signOut();
            goToc1v4();
        });
        bc.setOnClickListener(view -> {
            FirebaseAuth.getInstance().signOut();
            goTomain();
        });
    }

    private void goTomain() {
        startActivity(new Intent(course1.this, MainActivity.class));
    }

    private void goToc1v4() {
        startActivity(new Intent(course1.this, c1v4.class));
    }

    private void goToc1v3() {
        startActivity(new Intent(course1.this, c1v3.class));
    }

    private void goToc1v2() {
        startActivity(new Intent(course1.this, c1v2.class));
    }

    private void goTovc1v1() {
        startActivity(new Intent(course1.this, c1v1.class));
    }
}