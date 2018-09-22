package com.example.utkarsh.fragmentworking;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFirst extends Fragment {

  public FragmentFirst()
    {

    }

  //  FragmentClickListener fragmentClickListener;
    Button btnClick;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragmentfirst, container, false);

        btnClick = view.findViewById(R.id.button);

        btnClick.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getActivity(), "testss", Toast.LENGTH_SHORT).show();

           //    fragmentClickListener.click();


           }
       });




        return view;
    }

    /*@Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (!(context instanceof FragmentClickListener)) throw new AssertionError();
         fragmentClickListener = (FragmentClickListener) context;
    }*/

    /*public interface FragmentClickListener{
        public void click();

    }*/

}
