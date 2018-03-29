package com.example.surji.databasedemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

public class UpdateActivity extends AppCompatActivity {

    CheckBox cb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        cb = findViewById(R.id.cbupdate);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frag, new Fragment1());
        ft.commit();

        cb.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cb.isChecked()) {
                    FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.add(R.id.frag, new Fragment2());
                    ft.commit();
                    cb.setVisibility(View.GONE);
                }
            }
        });


    }
}
