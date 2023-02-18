package com.example.gestioncentres;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;

public class ReserverCenter extends AppCompatActivity {
    //Dialog dialog;
    Button btnRe;
    EditText name_Ass;
    public EditText email_Ass;
    EditText date_debut;
    EditText date_fin;
    EditText heure_debut;
    EditText heure_fin;
    EditText description_Ass;
    DatabaseReference ref1; //for connection with firebase database;
    FirebaseStorage storage1;
    FirebaseAuth mAuth1;
    //Button button1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.reserver);


        name_Ass = findViewById(R.id.name_Ass);
        email_Ass = findViewById(R.id.email_Ass);
        date_debut = findViewById(R.id.date_debut);
        date_fin =  findViewById(R.id.date_fin);
        heure_debut = findViewById(R.id.heure_debut);
        heure_fin =  findViewById(R.id.heure_fin);
        description_Ass = findViewById(R.id.description_Ass);

        btnRe = (Button) findViewById(R.id.btnRe);
        Reservation reservation = new Reservation();


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
                intent.putExtra("Description", description_Ass.getText().toString());
                startActivity(intent);

            }
        });

        mAuth1=FirebaseAuth.getInstance();
        ref1= FirebaseDatabase.getInstance().getReference().child("Reservations");
        btnRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertReservationData();
            }
        });


    }
    public  void insertReservationData(){
        String name=name_Ass.getText().toString();
        String email=email_Ass.getText().toString();
        String datedebut=date_debut.getText().toString();
        String datefin=date_fin.getText().toString();
        String heuredebut=heure_debut.getText().toString();
        String heurefin=heure_fin.getText().toString();
        String description=description_Ass.getText().toString();


        Reservation reservations = new Reservation(name,email,datedebut,datefin,heuredebut,heurefin,description);
        ref1.push().setValue(reservations); // push: add data of any ass create her compte
        Toast.makeText(ReserverCenter.this,"Successful",Toast.LENGTH_LONG).show();

    }
}