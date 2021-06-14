package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreTeamA += score;
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreTeamB += score;
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    public void add3pointsA(View view) {
        displayForTeamA(3);
    }

    public void add2pointsA(View view) {
        displayForTeamA(2);
    }

    public void addFreeThrowA(View view) {
        displayForTeamA(1);
    }

    public void add3pointsB(View view) {
        displayForTeamB(3);
    }

    public void add2pointsB(View view) {
        displayForTeamB(2);
    }

    public void addFreeThrowB(View view) {
        displayForTeamB(1);
    }

    public void resetScore(View view) {
       scoreTeamA = 0;
       scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}