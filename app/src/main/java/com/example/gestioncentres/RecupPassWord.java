package com.example.gestioncentres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RecupPassWord extends AppCompatActivity {
  Button click3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.recup_password);
        click3 = findViewById(R.id.B1);
        click3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View v ){
                Intent myIntent3 = new Intent(RecupPassWord.this, CodeRecup.class);
                startActivity(myIntent3);
            }
        });
    }


    }

