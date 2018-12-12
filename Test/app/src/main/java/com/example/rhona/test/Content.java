package com.example.rhona.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Content extends AppCompatActivity {

    Button update, close, delete;
    TextView title, message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        //update button
        update=(Button)findViewById(R.id.updatebtn);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent update = new Intent(Content.this, NewTodo.class);
                startActivity(update);

                finish();
            }
        });

        //close button
        close=(Button)findViewById(R.id.closebtn);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent close = new Intent(Content.this, ListTodo.class);
                startActivity(close);

                finish();
            }
        });

        //delete button
        title=(TextView)findViewById(R.id.titletxt);
        message=(TextView)findViewById(R.id.contenttxt);

        delete=(Button)findViewById(R.id.deletebtn);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                title.setText("");
                message.setText("");

                Intent close = new Intent(Content.this, ListTodo.class);
                startActivity(close);
                finish();
            }
        });
    }
}
