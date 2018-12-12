package com.example.rhona.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    Button loginbtn, signupbtn; //initializing the buttons
EditText email, password;
    String theEmail, thePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        //sign up button
        signupbtn=(Button)findViewById(R.id.signupbtn);
        signupbtn.setOnClickListener(new View.OnClickListener(){

            @Override
        public void onClick(View v){
                Intent signup=new Intent(SignIn.this, SignUp.class);
                startActivity(signup);

                finish();
            }
        });

        //login button
        email=(EditText)findViewById(R.id.emailtxt);
        password=(EditText)findViewById(R.id.passwdtxt);

        loginbtn=(Button)findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                theEmail=email.getText().toString();
                thePassword=password.getText().toString();

                if (theEmail.length()>0){
                    if (thePassword.length()>0){

                        if (theEmail.contentEquals("test@gmail.com")){
                            if (thePassword.contentEquals("1234")){

                                Intent login=new Intent(SignIn.this, CreateContent.class);
                                startActivity(login);

                                finish();

                            }
                            else{
                                Toast.makeText(SignIn.this, "Incorrect Password",Toast.LENGTH_LONG).show();
                            }

                        }
                        else{
                            Toast.makeText(SignIn.this, "Incorrect Email",Toast.LENGTH_LONG).show();
                        }
                    }
                    else{
                        Toast.makeText(SignIn.this, "Please enter your password",Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(SignIn.this, "Please enter your email",Toast.LENGTH_LONG).show();
                }
            }
        });
}
}
