package com.wisc.cs.klay2.klayquizzonificationsoftwareexcellenttime;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

/**
 * Created by klay2 on 2/19/16.
 */
public class QuizzActivity extends AppCompatActivity implements Fragmentq1.OnAnsweredListener,Fragmentq2.OnAnsweredListener {



    private int displayed;//number of questions displayed
    private int correct;// number of correct answers
    private int  numQuestions;//total number of questions
    private ArrayList<Bundle> qBundles = new ArrayList<Bundle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizzactivity);
        correct = 0;
        numQuestions = 2;
        displayed = 0;
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
        question1.putString("header", "Question:  1");
        qBundles.add(question1);

        Bundle question2 = new Bundle();
        question2.putInt("qType",1);
        question2.putString("correctAns", "boogiepop phantom");
        question2.putString("questionText", "From which early 2000's psychological horror anime is this image?");
        question2.putInt("ImageRID", R.drawable.vaporwaverei);//TODO:image resource id
        question2.putString("header","FINAL QUESTION");
        qBundles.add(question2);

        Fragment q1;


        if(qBundles.get(0).getInt("qtype") == 0) {//its a text question so use Fragmentq1
            q1 = new Fragmentq1();

        }else{
            q1 = new Fragmentq2();
        }

        q1.setArguments(qBundles.get(0));
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container,q1)
                .addToBackStack(null)
                .commit();

    }




    public void answered(boolean rightAns){
        Fragment next;
        if(rightAns == true){correct++;}
        displayed++;
        if(displayed == numQuestions){// have displayed all the questions so call final screen

        }else{//get and handle next question
            if(qBundles.get(displayed).getInt("qtype") == 0) {//its a text question so use Fragmentq1
                next = new Fragmentq1();

            }else{
                next = new Fragmentq2();
            }

            next.setArguments(qBundles.get(displayed));
            getFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container,next)
                    .addToBackStack(null)//maybe add to backstack? i dunno
                    .commit();


        }

    }

}
