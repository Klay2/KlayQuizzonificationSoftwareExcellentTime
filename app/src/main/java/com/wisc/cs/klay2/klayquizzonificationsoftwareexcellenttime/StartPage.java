package com.wisc.cs.klay2.klayquizzonificationsoftwareexcellenttime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import java.util.ArrayList;

//this activity can dynamically display and handle questions via filling the bundle array
//with a bundle for each question and setting theh numQuestions field.  Overkill but worth it!
public class StartPage extends AppCompatActivity {

    int correct;
    int  numQuestions;
    ArrayList<Bundle> qBundles = new ArrayList<Bundle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        correct = 0;
        numQuestions = 2;

        //question type int for a bundle,  0 = text, 1 = picture
        //bundles are hard coded, and added to array list. add code to get bundles from elsewhere
        Bundle question1 = new Bundle();
        question1.putInt("qType",0);
        question1.putInt("correctAns", 2);
        String choice1 = "A Natural Death";
        question1.putString("choice1", choice1);
        String choice2 = "Mechanical Hand";
        question1.putString("choice2",choice2);
        String choice3 = "Desperate Living";
        question1.putString("choice3", choice3);
        String question = "Which Horse:The Band album contains the song: 'Taken by vultures'?";
        question1.putString("questionText", question);
        qBundles.add(question1);

        Bundle question2 = new Bundle();
        question2.putInt("qType",1);
        question2.putString("correctAns", "boogiepop phantom");
        question2.putString("questionText", "From which early 2000's psychological horror anime is this image?");
        question2.putint("ImageRID", image);//TODO:image resource id
        qBundles.add(question2);

    }


    public void startQuizz(View view){

        int totalCorrect = 0;//total correct answers

        Intent getQuestion1 = new Intent(this,Fragmentq1.class);
        getQuestion1.putExtra("Question", question1);
        getQuestion1.putExtra("totalCorrect", totalCorrect);
        startActivity(getQuestion1);
        //pull up fragments record correct answers in this method

    }




}


