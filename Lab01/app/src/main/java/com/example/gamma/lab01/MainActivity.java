package com.example.gamma.lab01;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View view){

        Intent i = new Intent(this, ActivityTwo.class);
        EditText mail = (EditText) findViewById(R.id.email);
        String Email = mail.getText().toString();
        EditText pass = (EditText) findViewById(R.id.clave);
        String Clave = pass.getText().toString();
        if(Email.contains("@"))
        {
            Context context = getApplicationContext();
            CharSequence text = "datos validos";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

            getSharedPreferences();

            startActivity(i);
        }
        else
        {
            Context context = getApplicationContext();
            CharSequence text = "Ingrese un mail valido";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

    }



}
