package com.wisc.cs.klay2.klayquizzonificationsoftwareexcellenttime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class StartPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
    }


    public void startQuizz(View view){
        int correctAns = 2;//which button is the correct choice
        String choice1 = "A Natural Death";
        String choice2 = "Mechanical Hand";
        String Choice3 = "Desperate Living";
        int totalCorrect = 0;//total correct answers
        String question = "Which Horse:The Band album contains the song: 'Taken by vultures'?";
        //pull up fragments record correct answers in this method

    }




}


