package com.example.group_08;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

public class Quizzes extends AppCompatActivity {

    private ImageView navHome, navChat, navSubjects, navGrades, navSchedule;
    private Button viewMoreQuizButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizzes);

        navHome            = findViewById(R.id.navHome);
        navChat            = findViewById(R.id.navChat);
        navSubjects        = findViewById(R.id.navSubjects);
        navGrades          = findViewById(R.id.navGrades);
        navSchedule        = findViewById(R.id.navSchedule);
        viewMoreQuizButton = findViewById(R.id.viewMoreQuizButton);

        navHome.setOnClickListener(view -> {
            startActivity(new Intent(Quizzes.this, Dashboard.class));
        });

        navGrades.setOnClickListener(v -> {
            startActivity(new Intent(Quizzes.this, Grades.class));
        });

        navSchedule.setOnClickListener(view -> {
            startActivity(new Intent(Quizzes.this, Schedule.class));
        });

        viewMoreQuizButton.setOnClickListener(v -> {
            Toast.makeText(Quizzes.this, "Loading more quizzes...", Toast.LENGTH_SHORT).show();
        });
    }
}
