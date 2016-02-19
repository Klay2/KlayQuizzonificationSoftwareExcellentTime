package com.wisc.cs.klay2.klayquizzonificationsoftwareexcellenttime;

import android.app.Fragment;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by klay2 on 2/19/16.
 */
public class Fragmentq2 extends Fragment {
    private TextView header;
    private TextView questionText;
    private EditText input;
    private String answer;
    private Button next;
    private boolean rightAns;
    OnAnsweredListener ansListener;

    public Fragmentq2(){

    }

    public interface OnAnsweredListener{
        public void answered(boolean correct);
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if(getArguments() != null) {
            Bundle bundleIn = getArguments();
            answer = bundleIn.getString("correctAns");
            ansListener = (OnAnsweredListener)getActivity();
        }


    }
}
