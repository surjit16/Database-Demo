package com.example.surji.databasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class DeleteActivity extends AppCompatActivity {

    EditText etdelete;
    Button butdelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        etdelete = findViewById(R.id.etdelete);

        butdelete = findViewById(R.id.butdelete);

        butdelete.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabase md = new MyDatabase(getApplicationContext());
                md.doDelete(etdelete.getText().toString());
            }
        });
    }
}
