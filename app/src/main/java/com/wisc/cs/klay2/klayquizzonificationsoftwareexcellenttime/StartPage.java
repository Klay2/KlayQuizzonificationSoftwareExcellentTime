package com.wisc.cs.klay2.klayquizzonificationsoftwareexcellenttime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import java.util.ArrayList;
import android.app.Fragment;

//this activity can dynamically display and handle questions via filling the bundle array
//with a bundle for each question and setting theh numQuestions field.  Overkill but worth it!
public class StartPage extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);


    }


    public void startQuizz(View view) {
        Intent go = new Intent(this,QuizzActivity.class);
        startActivity(go);
        finish();

    }

}


