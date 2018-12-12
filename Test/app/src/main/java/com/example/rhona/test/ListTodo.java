package com.example.rhona.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ListTodo extends AppCompatActivity {

    Button Android;
    EditText trying;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_todo);

        //Learn Android Button
        Android=(Button)findViewById(R.id.androidbtn);
        Android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent content = new Intent(ListTodo.this, Content.class);
                startActivity(content);

                finish();
            }
        });

    }
}
