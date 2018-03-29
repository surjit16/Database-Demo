package com.example.surji.databasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText etname, etmob,etemail;
    Button butsave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        etname = findViewById(R.id.et11);
        etmob = findViewById(R.id.et12);
        etemail = findViewById(R.id.et13);

        butsave = findViewById(R.id.but11);

        butsave.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

              MyDatabase md = new MyDatabase(getApplicationContext());
              md.insertValues(etname.getText().toString(),Long.parseLong(etmob.getText().toString()), etemail.getText().toString());

              finish();
            }
        });

    }


}
