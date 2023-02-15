package com.example.gestioncentres;


import static com.example.gestioncentres.R.id.name_Ass;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.os.Environment;
import android.os.FileUriExposedException;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Comment;
import org.w3c.dom.DOMConfiguration;
import org.w3c.dom.DOMException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.EntityReference;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;
import org.w3c.dom.Text;
import org.w3c.dom.UserDataHandler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

public class TelechargerPdf extends AppCompatActivity {

    TextView name, email, dateDebut, dateFin, heureDebut, heureFin, description;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
