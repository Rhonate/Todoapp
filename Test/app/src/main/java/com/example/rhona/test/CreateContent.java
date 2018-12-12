package com.example.rhona.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateContent extends AppCompatActivity {

    Button CreateTodo, ListTodo, Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_content);

        //back button
        Back=(Button)findViewById(R.id.backbtn);
        Back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent back = new Intent(CreateContent.this, SignIn.class);
                startActivity(back);

                finish();
            }
        });

       //createtodo button
        CreateTodo=(Button)findViewById(R.id.createbtn);
        CreateTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent create = new Intent(CreateContent.this, NewTodo.class);
                startActivity(create);

                finish();

            }
        });

        //listtodo button
        ListTodo=(Button)findViewById(R.id.Listbtn);
        ListTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent list = new Intent(CreateContent.this, com.example.rhona.test.ListTodo.class);
                startActivity(list);

                finish();
            }
        });
    }
}
