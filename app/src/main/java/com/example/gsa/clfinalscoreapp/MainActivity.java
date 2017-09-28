package com.example.gsa.clfinalscoreapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.gsa.clfinalscoreapp.R.id.teama;
import static com.example.gsa.clfinalscoreapp.R.id.teamb;

public class MainActivity extends AppCompatActivity {
    private TextView TeamaScore;
    private TextView TeambScore;
    private TextView PossTeama;
    private TextView PossTeamb;
    private TextView OffTeama;
    private TextView OffTeamb;
    private TextView YellowTeama;
    private TextView YellowTeamb;
    private TextView RedTeama;
    private TextView RedTeamb;
    private TextView FoulTeama;
    private TextView FoulTeamb;
    private TextView AttemptTeama;
    private TextView AttemptTeamb;

    public int teama = 0;
    public int teamb = 0;
    public int poss1 = 0;
    public int poss2 = 0;
    public int TotPoss = 100;
    public int offside1 = 0;
    public int offside2 = 0;
    public int yellow1 = 0;
    public int yellow2 = 0;
    public int red1 = 0;
    public int red2 = 0;
    public int foul1 = 0;
    public int foul2 = 0;
    public int attempt1 = 0;
    public int attempt2 = 0;

    private Button TeamaPoss;
    private Button Teama;
    private Button Teamb;
    private Button TeambPoss;
    private Button TeamaOffside;
    private Button TeambOffside;
    private Button TeamaYellow;
    private Button TeambYellow;
    private Button TeamaRed;
    private Button TeambRed;
    private Button TeamaFoul;
    private Button TeambFoul;
    private Button TeamaAttempt;
    private Button TeambAttempt;
    private Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TeamaScore = (TextView) findViewById(R.id.teama_score_view);
        TeambScore = (TextView) findViewById(R.id.teamb_score_view);
        Teama = (Button) findViewById(R.id.goal1);
        Teamb = (Button) findViewById(R.id.goal2);

        PossTeama = (TextView) findViewById(R.id.teama_poss);
        PossTeamb = (TextView) findViewById(R.id.teamb_poss);
        TeamaPoss = (Button) findViewById(R.id.possession1);
        TeambPoss = (Button) findViewById(R.id.possession2);

        OffTeama = (TextView) findViewById(R.id.teama_offside);
        OffTeamb = (TextView) findViewById(R.id.teamb_offside);
        TeamaOffside = (Button) findViewById(R.id.offside1);
        TeambOffside = (Button) findViewById(R.id.offside2);

        YellowTeama = (TextView) findViewById(R.id.teama_yellow);
        YellowTeamb = (TextView) findViewById(R.id.teamb_yellow);
        TeamaYellow = (Button) findViewById(R.id.yellow1);
        TeambYellow = (Button) findViewById(R.id.yellow2);

        RedTeama = (TextView) findViewById(R.id.teama_red);
        RedTeamb = (TextView) findViewById(R.id.teamb_red);
        TeamaRed = (Button) findViewById(R.id.red1);
        TeambRed = (Button) findViewById(R.id.red2);

        FoulTeama = (TextView) findViewById(R.id.teama_foul);
        FoulTeamb = (TextView) findViewById(R.id.teamb_foul);
        TeamaFoul = (Button) findViewById(R.id.foul1);
        TeambFoul = (Button) findViewById(R.id.foul2);

        AttemptTeama = (TextView) findViewById(R.id.teama_attempt);
        AttemptTeamb = (TextView) findViewById(R.id.teamb_attempt);
        TeamaAttempt = (Button) findViewById(R.id.attempt1);
        TeambAttempt = (Button) findViewById(R.id.attempt2);
        reset = (Button) findViewById(R.id.reset);

        /**(TeamA)Score
         * This method is called when the GOAL BUTTON for TeamA is clicked.
         * Here, for every click, one additional point is added to the GOAL SCORE TEXTVIEW.
         */
        Teama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teama = teama + 1;
                TeamaScore.setText(teama + "");
            }
        });
        /**(TeamB)Score
         * This method is called when the GOAL BUTTON for TeamB is clicked.
         * Here, for every click, one additional point is added to the GOAL SCORE TEXTVIEW.
         */
        Teamb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamb = teamb + 1;
                TeambScore.setText(teamb + "");
            }
        });
        /**(TeamA)Possession
         * * This method is called when the POSSESSION BUTTON for TeamA is clicked.
         * Here, for every click, FIVE PERCENT additional point is added to the TeamA POSSESSION TEXTVIEW.
         * Moreso, TeamB's possession would be changed as well since it is a function of percentage.
         */
        TeamaPoss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                poss1 = poss1 + 5;
                PossTeama.setText(poss1 + "%");
                PossTeamb.setText((poss2 = TotPoss - poss1) + "%");
            }
        });
        /**(TeamB)Possession
         * This method is called when the POSSESSION BUTTON for TeamB is clicked.
         * Here, for every click, FIVE PERCENT additional point is added to the Egypt POSSESSION TEXTVIEW.
         * Moreso, TeamA's possession would be changed as well since it is a function of percentage.
         */
        TeambPoss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                poss2 = poss2 + 5;
                PossTeamb.setText(poss2 + "%");
                PossTeama.setText((poss1 = TotPoss - poss2) + "%");
            }
        });
        /**(TeamA)Offside
         * This method is called when the OFFSIDE BUTTON for TeamA is clicked.
         * Here, for every click, one additional point is added to the OFFSIDE TEXTVIEW.
         */
        TeamaOffside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                offside1 = offside1 + 1;
                OffTeama.setText(offside1 + "");
            }
        });
        /**(TeamB)Offside
         * This method is called when the OFFSIDE BUTTON for TeamB is clicked.
         * Here, for every click, one additional point is added to the OFFSIDE CARD TEXTVIEW.
         */
        TeambOffside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                offside2 = offside2 + 1;
                OffTeamb.setText(offside2 + "");
            }
        });
        /**(TeamA)Yellow Card
         * This method is called when the YELLOW CARD BUTTON for TeamA is clicked.
         * Here, for every click, one additional point is added to the YELLOW CARD TEXTVIEW.
         */
        TeamaYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yellow1 = yellow1 + 1;
                YellowTeama.setText(yellow1 + "");
            }
        });
        /**(TeamB)Yellow Card
         * This method is called when the YELLOW CARD BUTTON for TeamB is clicked.
         * Here, for every click, one additional point is added to the YELLOW CARD TEXTVIEW.
         */
        TeambYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yellow2 = yellow2 + 1;
                YellowTeamb.setText(yellow2 + "");
            }
        });
        /**(TeamA)Red Card
         * This method is called when the RED CARD BUTTON for TeamA is clicked.
         * Here, for every click, one additional point is added to the RED CARD TEXTVIEW.
         */
        TeamaRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                red1 = red1 + 1;
                RedTeama.setText(red1 + "");
            }
        });
        /**(TeamB)Red Card
         * This method is called when the RED CARD BUTTON for TeamB is clicked.
         * Here, for every click, one additional point is added to the RED CARD TEXTVIEW.
         */
        TeambRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                red2 = red2 + 1;
                RedTeamb.setText(red2 + "");
            }
        });
        /**(TeamA)Foul
         * This method is called when the FOUL BUTTON for TeamA is clicked.
         * Here, for every click, one additional point is added to the FOUL TEXTVIEW.
         */
        TeamaFoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foul1 = foul1 + 1;
                FoulTeama.setText(foul1 + "");
            }
        });
        /**(TeamA)Foul
         * * This method is called when the FOUL BUTTON for TeamA is clicked.
         * Here, for every click, one additional point is added to the FOUL TEXTVIEW.
         */
        TeambFoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foul2 = foul2 + 1;
                FoulTeamb.setText(foul2 + "");
            }
        });
        /**(TeamA) Attempt
         * * This method is called when the GOAL ATTEMPT BUTTON for TeamA is clicked.
         * Here, for every click, one additional point is added to the GOAL ATTEMPT TEXTVIEW.
         */
        TeamaAttempt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attempt1 = attempt1 + 1;
                AttemptTeama.setText(attempt1 + "");
            }
        });
        /**(TeamB)Attempt
         * This method is called when the GOAL ATTEMPT BUTTON for TeamB is clicked.
         * Here, for every click, one additional point is added to the GOAL ATTEMPT TEXTVIEW.
         */
        TeambAttempt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                attempt2 = attempt2 + 1;
                AttemptTeamb.setText(attempt2 + "");
            }
        });
        /**
         * This method is called when the RESET BUTTON is clicked.
         * Here, all the parameters is set to zero.
         */
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teama = 0;
                TeamaScore.setText(teama + "");
                teamb = 0;
                TeambScore.setText(teamb + "");
                poss1 = 0;
                PossTeama.setText(poss1 + "%");
                poss2 = 0;
                PossTeamb.setText(poss2 + "%");
                offside1 = 0;
                OffTeama.setText(offside1 + "");
                offside2 = 0;
                OffTeamb.setText(offside2 + "");
                yellow1 = 0;
                YellowTeama.setText(yellow1 + "");
                yellow2 = 0;
                YellowTeamb.setText(yellow2 + "");
                red1 = 0;
                RedTeama.setText(red1 + "");
                red2 = 0;
                RedTeamb.setText(red2 + "");
                foul1 = 0;
                FoulTeama.setText(foul1 + "");
                foul2 = 0;
                FoulTeamb.setText(foul2 + "");
                attempt1 = 0;
                AttemptTeama.setText(attempt1 + "");
                attempt2 = 0;
                AttemptTeamb.setText(attempt2 + "");
            }
        });
    }
}