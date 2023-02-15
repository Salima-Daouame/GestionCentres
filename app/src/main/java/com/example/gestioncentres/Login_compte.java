package com.example.gestioncentres;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login_compte extends AppCompatActivity {
   TextView click2;
    TextView b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.login);

        b2 = findViewById(R.id.B2);
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View v1 ){
                startActivity(new Intent(Login_compte.this,ReserverCenter.class));
            }
        });
        click2 = (TextView)findViewById(R.id.forgetText); //
        click2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View v1 ){
                Intent myIntent2 = new Intent(Login_compte.this, RecupPassWord.class);
                startActivity(myIntent2);
            }
        });
        b1 = (TextView)findViewById(R.id.info1); //
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View v1 ){
                Intent myIntent3 = new Intent(Login_compte.this, CompteCreation.class);
                startActivity(myIntent3);

            }
        });


    }
}
