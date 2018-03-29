package com.example.surji.databasedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addContact(View view) {
        Intent i = new Intent(MainActivity.this,AddActivity.class);
        startActivity(i);
    }

    public void viewContact(View view) {
        Intent i = new Intent(this,ViewActivity.class);
        startActivity(i);
    }

    public void updateContact(View view) {
        Intent i = new Intent(this,UpdateActivity.class);
        startActivity(i);
    }

    public void searchContact(View view) {
        Intent i = new Intent(this,SearchActivity.class);
        startActivity(i);
    }

    public void deleteContact(View view) {
        Intent i = new Intent(this,DeleteActivity.class);
        startActivity(i);
    }
}
