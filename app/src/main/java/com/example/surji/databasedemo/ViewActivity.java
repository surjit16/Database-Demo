package com.example.surji.databasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewActivity extends AppCompatActivity {



    ListView lvsearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);


        lvsearch = findViewById(R.id.lvsearch);

        MyDatabase md = new MyDatabase(getApplicationContext());
        ArrayList<String> al = md.showValues();
        ArrayAdapter<String> ad = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,al);

        lvsearch.setAdapter(ad);
    }


}
