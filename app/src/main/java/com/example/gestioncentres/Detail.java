package com.example.gestioncentres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Detail extends AppCompatActivity {
     ImageView imageview;
     TextView textview1,textview2,textview3,textview4,textview5,textview6,textview7;
      Button click01;
      TextView detl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.detail);

           // setSupportActionBar().hide();


          detl=findViewById(R.id.detail);

          detl.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  startActivity(new Intent(Detail.this,Popup_Detail.class));
              }
          });


        imageview = findViewById(R.id.imageView);
        textview1 = findViewById(R.id.txt);
        textview2 = findViewById(R.id.number_tele) ;
        textview3 = findViewById(R.id.number_salle);
        textview4 = findViewById(R.id.equipment);
        textview5 = findViewById(R.id.wifi);
        textview6 = findViewById(R.id.datas);
        textview7 = findViewById(R.id.ord);

        Intent intent = getIntent();
        String name = intent.getExtras().getString("name");
        String tele = intent.getExtras().getString("loc");
        String salle = intent.getExtras().getString("desc");
        String equip = intent.getExtras().getString("equip");
        String wifi = intent.getExtras().getString("wifi");
        String datas = intent.getExtras().getString("datas");
        String pc = intent.getExtras().getString("pc");
        int image = intent.getExtras().getInt("flag");

        textview1.setText(name);
        textview2.setText(tele);
        textview3.setText(salle);
        textview4.setText(equip);
        textview5.setText(wifi);
        textview6.setText(datas);
        textview7.setText(pc);
        imageview.setImageResource(image);


        click01 = findViewById(R.id.res_btn); //
        click01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick( View v1 ){
                Intent myIntent1 = new Intent(Detail.this, Login_compte.class);
                startActivity(myIntent1);

            }
        });
    }
}
