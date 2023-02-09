package com.example.gestioncentres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CodeRecup extends AppCompatActivity {
   Button  click4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.code_recup);

        click4 = findViewById(R.id.B1tn0);
        click4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View v ){
                Intent myIntent = new Intent(CodeRecup.this, PassWordChange.class);
                startActivity(myIntent);
            }
        });
    }
}
