package com.example.utkarsh.fragmentworking;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    SecondFrag blankFragment2 = new SecondFrag();
    TextView textView;
    Button btn;
    boolean flag =false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn =findViewById(R.id.button);

         textView = findViewById(R.id.txtclick);

         btn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 if(flag == false) {
                     textView.setText("clicked");
                     textView.setTextColor(Color.GREEN);
                     flag = true;
                 }
                 else
                 {
                     textView.setText("click button");
                     textView.setTextColor(Color.RED);
                     flag =false;
                 }
             }
         });

    }




}
