package com.example.surji.databasedemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {


    EditText et1update, et2update;
    Button butupdate;
    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);

        et1update = v.findViewById(R.id.et1update);
        et2update = v.findViewById(R.id.et2update);
        butupdate = v.findViewById(R.id.but1update);


        butupdate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return v;
    }

}
