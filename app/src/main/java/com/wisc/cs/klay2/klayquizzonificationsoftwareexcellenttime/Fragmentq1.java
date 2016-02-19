package com.wisc.cs.klay2.klayquizzonificationsoftwareexcellenttime;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
public class Fragmentq1 extends Fragment {




    private TextView header;
    private TextView questionText;
    private RadioButton button1;
    private RadioButton button2;
    private RadioButton button3;
    private Button next;
    private int correctAns;
    boolean rightAns;
    OnAnsweredListener ansListener;

    public Fragmentq1(){
    }

    public interface OnAnsweredListener{
        public void answered(boolean coorect);
    }


    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if(getArguments() != NULL) {
            Bundle bundleIn = getArguments();
            correctAns = bundleIn.getInt("correctAns");
            ansListener = (OnAnsweredListener)getActivity();
        }


    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        Bundle bundleIn = NULL;
        if(getArguments() != NULL) {
             bundleIn = getArguments();
        }
        View view = inflater.inflate(R.layout.fragmentq1, container, false);

        header = view.findViewById(R.id.header);
        questionText = view.findViewById(R.id.questionText);
        button1 = view.findViewById(R.id.buttonAns1);
        button2 = view.findViewById(R.id.buttonAns2);
        button3 = view.findViewById(R.id.buttonAns3);
        next = view.findViewById(R.id.buttonNext);
        View.OnClickListener button1Click = new View.OnClickListener(){
            public void onClick(View v){
                if(correctAns == 1){
                    rightAns = true;
                }
                else{
                    rightAns = false;
                }

            }
            //close frag start new frag
        };

        View.OnClickListener button2Click = new View.OnClickListener(){
            public void onClick(View v){
                if(correctAns == 2){
                    rightAns = true;
                }
                else {
                    rightAns = false;
                }
            }
            //close frag start new frag
        };

        View.OnClickListener button3Click = new View.OnClickListener(){
            public void onClick(View v){
                if(correctAns == 3){
                    rightAns = true;
                }
                else{
                    rightAns = false;
                }

            }
            //close frag start new frag
        };

        View.OnClickListener nextClick = new View.OnClickListener(){
            public void onClick(View v){
                ansListener.answered(rightAns);
            }
        };
        header.setText(bundleIn.getString("header"));
        questionText.setText(bundleIn.getString("questionText"));
        button1.setText(bundleIn.getString("choice1"));
        button2.setText(bundleIn.getString("choice2"));
        button3.setText(bundleIn.getString("choice3"));

        button1.setOnClickListener(button1Click);
        button2.setOnClickListener(button2Click);
        button3.setOnClickListener(button3Click);
        next.setOnClickListener(nextClick);



        return view;

    }

    public void onViewCreated(View view, Bundle savedInstanceState){
        super.onViewCreated(view,savedInstanceState);

        //handle logic.  need onclick listener to dynamically handle which button is correct


    }

}
