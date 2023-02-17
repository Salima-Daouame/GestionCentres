package com.example.gestioncentres;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TelechargerPdf extends AppCompatActivity {

    TextView name, email, dateDebut, dateFin, heureDebut, heureFin, description;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.telechargerpdf);

        name = (TextView) findViewById(R.id.name);
        email = (TextView) findViewById(R.id.email);
        dateDebut = (TextView) findViewById(R.id.dateDebut);
        dateFin = (TextView) findViewById(R.id.dateFin);

        heureDebut = (TextView) findViewById(R.id.heureDebut);
        heureFin = (TextView) findViewById(R.id.heureFin);


        description = (TextView) findViewById(R.id.description);

        Intent intent = getIntent();
        name.setText(intent.getStringExtra("Name"));
        email.setText(intent.getStringExtra("Email"));
        dateDebut.setText(String.valueOf(intent.getStringExtra("dateDebut")));
        dateFin.setText(String.valueOf(intent.getStringExtra("dateFin")));
        heureDebut.setText(String.valueOf(intent.getStringExtra("heur_debut"))+"H");
        heureFin.setText(String.valueOf(intent.getStringExtra("heur_fin"))+"H");
        //heureFin.setText(""+intent.getStringExtra("Heur_fin"));

        description.setText(intent.getStringExtra("Description"));




    }
}
