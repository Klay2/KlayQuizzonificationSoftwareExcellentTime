package com.wisc.cs.klay2.klayquizzonificationsoftwareexcellenttime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class StartPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
    }


    public void startQuizz(View view){
        Bundle question1 = new Bundle();
        int correctAns = 2;//which button is the correct choice
        question1.putInt("correctAns", 2);
        String choice1 = "A Natural Death";
        question1.putString("choice1", choice1);
        String choice2 = "Mechanical Hand";
        question1.putString("choice2",choice2);
        String choice3 = "Desperate Living";
        question1.putString("choice3",choice3);
        int totalCorrect = 0;//total correct answers
        String question = "Which Horse:The Band album contains the song: 'Taken by vultures'?";
        question1.putString("question", question);
        Intent getQuestion1 = new Intent(this,Fragmentq1.class);
        getQuestion1.putExtra("Question", question1);
        getQuestion1.putExtra("totalCorrect", totalCorrect);
        startActivity(getQuestion1);
        //pull up fragments record correct answers in this method

    }




}


