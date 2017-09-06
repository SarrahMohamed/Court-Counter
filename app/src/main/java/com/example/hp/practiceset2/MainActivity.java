package com.example.hp.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA1(View view) {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamA2(View view) {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamA3(View view) {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamA(int scoreTeamA )
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }
    public void displayForTeamB(int scoreTeamA )
    {
        TextView scoreView = (TextView) findViewById(R.id.team_B_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }
    public void displayForTeamB1(View view) {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    public void displayForTeamB2(View view) {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    public void displayForTeamB3(View view) {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View view)
    {
        scoreTeamB=0;
        scoreTeamA=0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);

    }
}
