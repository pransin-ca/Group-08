package com.example.group_08;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

public class Dashboard extends AppCompatActivity {

    private ImageView navHome, navChat, navSubjects, navGrades, navSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        navHome          = findViewById(R.id.navHome);
        navChat          = findViewById(R.id.navChat);
        navSubjects      = findViewById(R.id.navSubjects);
        navGrades        = findViewById(R.id.navGrades);
        navSchedule      = findViewById(R.id.navSchedule);

        navGrades.setOnClickListener(v -> {
            startActivity(new Intent(Dashboard.this, Grades.class));
        });

        navSchedule.setOnClickListener(view -> {
            startActivity(new Intent(Dashboard.this, Schedule.class));
        });
    }
}