package com.example.utkarsh.fragmentworking;

import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFrag extends Fragment {



    public SecondFrag() {
    }


   TextView txt_click;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.secondfrag, container, false);

        txt_click = view.findViewById(R.id.txtclick);

        txt_click.setTextColor(Color.RED);
        return view;
    }

   /* public void setTextViewText(String value){
        txt_click.setText(value);
    }

    public TextView getTextView1(){
        return txt_click;
    }
*/


}
