package com.example.group_08;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

public class Schedule extends AppCompatActivity {

    private ImageView navHome, navChat, navSubjects, navGrades, navSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        navHome          = findViewById(R.id.navHome);
        navChat          = findViewById(R.id.navChat);
        navSubjects      = findViewById(R.id.navSubjects);
        navGrades        = findViewById(R.id.navGrades);
        navSchedule      = findViewById(R.id.navSchedule);

        navHome.setOnClickListener(view -> {
            startActivity(new Intent(Schedule.this, Dashboard.class));
        });

        navGrades.setOnClickListener(v -> {
            startActivity(new Intent(Schedule.this, Grades.class));
        });
    }
}