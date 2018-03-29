package com.example.surji.databasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    EditText etsearch;
    Button bsearch;
    ListView lvsearch;

    MyDatabase md;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        etsearch = findViewById(R.id.etsearch);

        bsearch = findViewById(R.id.butsearch);

        lvsearch = findViewById(R.id.lvsearch1);

        bsearch.setVisibility(View.GONE);

        md = new MyDatabase(getApplicationContext());
/*
       bsearch.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View view) {
               MyDatabase md = new MyDatabase(getApplicationContext());
               ArrayList<String> al = md.searchName(etsearch.getText().toString());
                ArrayAdapter ad = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,al);

               lvsearch.setAdapter(ad);
           }
       });*/

       etsearch.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

               ArrayList<String> al = md.searchName(charSequence.toString());
               ArrayAdapter ad = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,al);

               lvsearch.setAdapter(ad);

              // ad.getFilter().filter(charSequence);
           }

           @Override
           public void afterTextChanged(Editable editable) {

           }
       });
    }
}
