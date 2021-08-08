package com.example.thecricketscorer;

        import android.os.Bundle;

        import androidx.appcompat.app.AppCompatActivity;

        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import com.example.thecricketscorer.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int scoreTeamA;
    int scoreTeamB;
    int wicketTeamA;
    int wicketTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addOneForTeamA = findViewById(R.id.buttona1Run);
        Button addTwoForTeamA = findViewById(R.id.buttona2Runs);
        Button addThreeForTeamA = findViewById(R.id.buttona3Runs);
        Button addSixForTeamA = findViewById(R.id.buttona4Runs);
        Button addFourForTeamA = findViewById(R.id.buttona6Runs);
        Button addWicketForTeamA = findViewById(R.id.buttonaWicket);
        Button addOneForTeamB = findViewById(R.id.buttonb1Run);
        Button addTwoForTeamB = findViewById(R.id.buttonb2Runs);
        Button addThreeForTeamB = findViewById(R.id.buttonb3Runs);
        Button addFourForTeamB = findViewById(R.id.buttonb4Runs);
        Button addSixForTeamB = findViewById(R.id.buttonb6Runs);
        Button addWicketForTeamB = findViewById(R.id.buttonbWicket);

        addOneForTeamA.setOnClickListener(this);
        addTwoForTeamA.setOnClickListener(this);
        addThreeForTeamA.setOnClickListener(this);
        addFourForTeamA.setOnClickListener(this);
        addSixForTeamA.setOnClickListener(this);
        addWicketForTeamA.setOnClickListener(this);
        addOneForTeamB.setOnClickListener(this);
        addTwoForTeamB.setOnClickListener(this);
        addThreeForTeamB.setOnClickListener(this);
        addFourForTeamB.setOnClickListener(this);
        addSixForTeamB.setOnClickListener(this);
        addWicketForTeamB.setOnClickListener(this);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamaWicket(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_wicket);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team b.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeambWicket(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_wicket);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketTeamA = 0;
        wicketTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForTeamaWicket(wicketTeamA);
        displayForTeambWicket(wicketTeamB);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //Increase the score for Team A.
            case R.id.buttona1Run:
                scoreTeamA += 1;
                displayForTeamA(scoreTeamA);
                break;

            case R.id.buttona2Runs:
                scoreTeamA +=  2;
                displayForTeamA(scoreTeamA);
                break;

            case R.id.buttona3Runs:
                scoreTeamA +=  3;
                displayForTeamA(scoreTeamA);
                break;

            case R.id.buttona4Runs:
                scoreTeamA +=  4;
                displayForTeamA(scoreTeamA);
                break;

            case R.id.buttona6Runs:
                scoreTeamA +=  6;
                displayForTeamA(scoreTeamA);
                break;

            //Increase the wicket for Team A.
            case R.id.buttonaWicket:
                wicketTeamA +=  1;
                displayForTeamaWicket(wicketTeamA);
                break;

            //Increase the score for Team B.
            case R.id.buttonb1Run:
                scoreTeamB +=  1;
                displayForTeamB(scoreTeamB);
                break;

            case R.id.buttonb2Runs:
                scoreTeamB +=  2;
                displayForTeamB(scoreTeamB);
                break;

            case R.id.buttonb3Runs:
                scoreTeamB +=  3;
                displayForTeamB(scoreTeamB);
                break;

            case R.id.buttonb4Runs:
                scoreTeamB +=  4;
                displayForTeamB(scoreTeamB);
                break;

            case R.id.buttonb6Runs:
                scoreTeamB +=  6;
                displayForTeamB(scoreTeamB);
                break;

            //Increase the wicket for Team A.
            case R.id.buttonbWicket:
                wicketTeamB +=  1;
                displayForTeambWicket(wicketTeamB);
                break;

        }
    }
}