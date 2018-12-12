package com.example.rhona.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewTodo extends AppCompatActivity {

    Button back, save;
    EditText title, content;
    String thetitle, thecontent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_todo);

        //back button
        back=(Button)findViewById(R.id.gobackbtn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(NewTodo.this, CreateContent.class);
                startActivity(back);

                finish();
            }
        });

        //save button
        title=(EditText)findViewById(R.id.tasktitle);
        content=(EditText)findViewById(R.id.Content);

        save=(Button)findViewById(R.id.savebtn);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                thetitle=title.getText().toString();
                thecontent=content.getText().toString();

                if (thetitle.length()>0){
                    if (thecontent.length()>0){
                        Toast.makeText(NewTodo.this, "Successfully saved", Toast.LENGTH_SHORT).show();
                        title.getText().clear();
                        content.getText().clear();
                    }
                    else{
                        Toast.makeText(NewTodo.this, "Please enter content", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(NewTodo.this, "Please enter the Task Title", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
