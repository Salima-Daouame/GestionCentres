package com.example.gestioncentres;


import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Date;

public class ReserverCenter extends AppCompatActivity {
    Dialog dialog;
    Button btnRe;
    EditText name_Ass;
    EditText email_Ass;
    EditText date_debut;
    EditText date_fin;
    EditText heure_debut;
    EditText heure_fin;
    EditText description_Ass;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reserver);


        name_Ass = (EditText) findViewById(R.id.name_Ass);
        email_Ass = (EditText) findViewById(R.id.email_Ass);
        date_debut = (EditText) findViewById(R.id.date_debut);
        date_fin = (EditText) findViewById(R.id.date_fin);
        heure_debut = (EditText) findViewById(R.id.heure_debut);
        heure_fin = (EditText) findViewById(R.id.heure_fin);
        description_Ass = (EditText) findViewById(R.id.description_Ass);




        btnRe = (Button) findViewById(R.id.btnRe);

      Reservation reservation = new Reservation();


/*

        dialog = new Dialog(MainActivit4.this);
        dialog.setContentView(R.layout.popup);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.background));
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(true);
        dialog.getWindow().getAttributes().windowAnimations = R.style.animation;

        btnReserver = (Button) findViewById(R.id.btnReserver);
*/

        btnRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(ReserverCenter.this, TelechargerPdf.class);

                reservation.setDescription(description_Ass.getText().toString());
                intent.putExtra("Name", name_Ass.getText().toString()+"");
                intent.putExtra("Email", email_Ass.getText().toString()+"");
                intent.putExtra("dateDebut", date_debut.getText().toString()+"");
                intent.putExtra("dateFin", date_fin.getText().toString()+"");
                intent.putExtra("heur_debut", heure_debut.getText().toString());
                intent.putExtra("heur_fin", heure_fin.getText().toString());
                intent.putExtra("Description", description_Ass.getText().toString());;
                startActivity(intent);

            }
        });






    }
}