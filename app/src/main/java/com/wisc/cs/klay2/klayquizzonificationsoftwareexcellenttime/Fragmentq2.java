package com.wisc.cs.klay2.klayquizzonificationsoftwareexcellenttime;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.String;
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
    private ImageView image;
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

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        Bundle bundleIn = null;
        if(getArguments() != null) {
            bundleIn = getArguments();
        }
        View view = inflater.inflate(R.layout.fragmentq2, container, false);

        header = (TextView)view.findViewById(R.id.header);
        questionText = (TextView)view.findViewById(R.id.questionText);
        next = (Button)view.findViewById(R.id.buttonNext);
        input = (EditText)view.findViewById(R.id.answerField);
        image = (ImageView)view.findViewById(R.id.image);


        View.OnClickListener nextClick = new View.OnClickListener(){
            public void onClick(View v){
                if(input.getText().toString().equalsIgnoreCase(answer)){
                    rightAns = true;
                }
                ansListener.answered(rightAns);

            }
            //close frag start new frag
        };

        header.setText(bundleIn.getString("header"));
        questionText.setText(bundleIn.getString("questionText"));
        image.setImageResource(bundleIn.getInt("ImageRID"));
        next.setOnClickListener(nextClick);




        return view;
    }
}
