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
public class Fragment2 extends Fragment {


    EditText et11update, et12update, et13update;
    Button but12update;
    public Fragment2() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment2, container, false);

        et11update = v.findViewById(R.id.et11update);
        et12update = v.findViewById(R.id.et12update);
        et13update = v.findViewById(R.id.et13update);

        but12update = v.findViewById(R.id.but12update);

        but12update.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabase md = new MyDatabase(getContext());
                md.doUpdate(et11update.getText().toString(),Long.parseLong(et12update.getText().toString()),et13update.getText().toString());
            }
        });

        return v;
    }

}
