package com.example.group_08;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

public class Dashboard extends AppCompatActivity {

    private ImageView navHome, navChat, navSubjects, navGrades, navSchedule;
    private TextView gradesBackground, scheduleBackground, quizzesBackground, subjectBackground, editProfileOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        navHome           = findViewById(R.id.navHome);
        navChat           = findViewById(R.id.navChat);
        navSubjects       = findViewById(R.id.navSubjects);
        navGrades         = findViewById(R.id.navGrades);
        navSchedule       = findViewById(R.id.navSchedule);
        gradesBackground  = findViewById(R.id.gradesBackground);
        scheduleBackground = findViewById(R.id.scheduleBackground);
        quizzesBackground = findViewById(R.id.quizzesBackground);
        subjectBackground = findViewById(R.id.subjectBackground);
        editProfileOption = findViewById(R.id.editProfileOption);

        gradesBackground.setOnClickListener(v -> {
            startActivity(new Intent(Dashboard.this, Grades.class));
        });

        navGrades.setOnClickListener(v -> {
            startActivity(new Intent(Dashboard.this, Grades.class));
        });

        scheduleBackground.setOnClickListener(view -> {
            startActivity(new Intent(Dashboard.this, Schedule.class));
        });

        navSchedule.setOnClickListener(view -> {
            startActivity(new Intent(Dashboard.this, Schedule.class));
        });

        quizzesBackground.setOnClickListener(v -> {
            startActivity(new Intent(Dashboard.this, Quizzes.class));
        });

        editProfileOption.setOnClickListener(v -> {
            startActivity(new Intent(Dashboard.this, ProfileEditor.class));
        });
    }
}
