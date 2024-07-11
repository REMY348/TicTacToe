package com.TicTacToeProject.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;

public class Leaderboard extends AppCompatActivity {

    String currentUsername;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        Intent intent = getIntent();
        currentUsername = intent.getStringExtra("username");

        // Find the TextView and set the username
        TextView welcomeTextView = findViewById(R.id.welcomeTextView);
        welcomeTextView.setText("Welcome \n" + currentUsername);

        Button openchartButton = findViewById(R.id.OpenChartButton);
        openchartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Leaderboard.this, LeaderboardChart.class);
                startActivity(intent);
            }
        });

        Button openrecordtableButton = findViewById(R.id.OpenRecordTableButton);
        openrecordtableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Leaderboard.this, LeaderboardRecordTable.class);
                startActivity(intent);
            }
        });

        Button UserProfileButton = findViewById(R.id.LeaderboardBackButton);
        UserProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Leaderboard.this, Home.class);
                intent.putExtra("username", currentUsername); // Pass the username to UserProfile
                startActivity(intent);
            }
        });

        // Add more code as needed for other functionality or UI setup
    }
}
