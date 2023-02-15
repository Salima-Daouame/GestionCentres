package com.example.gestioncentres;

import static com.example.gestioncentres.R.id.cardRecommended1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Item_centre extends AppCompatActivity {
    ConstraintLayout card1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.item_centre);
        card1 =(ConstraintLayout)findViewById(R.id.cardRecommended1);
        card1.setOnClickListener(v1 -> {
            Intent myIntent01 = new Intent(Item_centre.this, Detail.class);
            startActivity(myIntent01);

        });
     /*   b02 = (TextView)findViewById(R.id.info1); //
        b02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View v1 ){
                Intent myIntent1 = new Intent(Item_centre.this, Detail.class);
                startActivity(myIntent1);

            }
        });*/

    }
}

