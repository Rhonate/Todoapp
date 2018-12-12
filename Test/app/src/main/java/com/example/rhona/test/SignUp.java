package com.example.rhona.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    Button submit;
    EditText email, phone, name, password;
    String theemail, thephone, thename, thepassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //submit  button
        email=(EditText)findViewById(R.id.email);
        phone=(EditText)findViewById(R.id.phone);
        name=(EditText)findViewById(R.id.name);
        password=(EditText)findViewById(R.id.password);

        submit=(Button)findViewById(R.id.submitbtn);
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                theemail=email.getText().toString();
                thephone=phone.getText().toString();
                thename=name.getText().toString();
                thepassword=password.getText().toString();

                if (theemail.length()>0){
                    if (thephone.length()>0){
                        if (thename.length()>0){
                            if (thepassword.length()>0){
                                Toast.makeText(SignUp.this, "Successfully Submitted", Toast.LENGTH_LONG).show(); //a toast

                                Intent submit = new Intent(SignUp.this, SignIn.class);
                                startActivity(submit);

                                finish();
                            }
                            else {
                                Toast.makeText(SignUp.this, "Password Required", Toast.LENGTH_LONG).show();
                            }
                        }
                        else {
                            Toast.makeText(SignUp.this, "Name Required", Toast.LENGTH_LONG).show();
                        }
                    }
                    else {
                        Toast.makeText(SignUp.this, "Phone Required", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(SignUp.this, "Email Required", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
