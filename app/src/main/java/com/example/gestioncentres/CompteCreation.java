package com.example.gestioncentres;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.StorageTask;
import com.hbb20.CountryCodePicker;
import com.mikhaellopez.circularimageview.CircularImageView;


public class CompteCreation extends AppCompatActivity {

    CircularImageView profil;
    ImageView cam;
       Button click1;
       private CountryCodePicker ccp;
       private EditText editPhoneNumber;
       private ImageView img_Check;
       EditText textInputEmail;
       EditText nameAss,codeAss,NumTele,EmailAss,AdrsAss,ModPass,ConfModpass;
       ImageView  image_ur;
       Button btn;  //This is  button  declaration
        DatabaseReference ref; //for connection with firebase database;
       FirebaseStorage storage;
       FirebaseAuth mAuth;
       Uri ImageUri;
       StorageTask uploadTaask;
         StorageReference storageProfileRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.creation_compte);
        textInputEmail = findViewById(R.id.email);
      click1 = findViewById(R.id.B1tn0);
        click1.setOnClickListener(v -> {
            Intent myIntent01 = new Intent(CompteCreation.this, Login_compte.class);
          startActivity(myIntent01);
        });

        //******************

        //********
        ccp=findViewById(R.id.ccp);
        editPhoneNumber=findViewById(R.id.edit_phone_number);

        img_Check=findViewById(R.id.img_check);


        // Attach CarrierNumber editText to CCP.
        ccp.registerCarrierNumberEditText(editPhoneNumber);
        ccp.setPhoneNumberValidityChangeListener(new CountryCodePicker.PhoneNumberValidityChangeListener(){
             @Override
            public void onValidityChanged(boolean isValidNumber){
                 if(isValidNumber){
                     img_Check.setImageResource(R.drawable.ic_valide);
                 }else{
                     img_Check.setImageResource(R.drawable.ic_novalidation);
                 }
             }

        });
         image_ur=findViewById(R.id.ImageViewId);
         cam=findViewById(R.id.add_img);
        nameAss=findViewById(R.id.name);
        codeAss=findViewById(R.id.code);
        NumTele=findViewById(R.id.edit_phone_number);
        EmailAss=findViewById(R.id.email);
        AdrsAss=findViewById(R.id.adress);
        ModPass=findViewById(R.id.password);
        ConfModpass=findViewById(R.id.repassword);
        btn=findViewById(R.id.B1tn0);

//*****
        mAuth=FirebaseAuth.getInstance();
         ref=FirebaseDatabase.getInstance().getReference().child("Assouciations");
        storageProfileRef=FirebaseStorage.getInstance().getReference().child("Profile pic");

      /*  cam.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                startActivity(new Intent(CompteCreation.this,));
            }
        });*/


         btn.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View view) {
                 insertAssouciationsData();
             }
         });
    }

    private void insertAssouciationsData(){
        String Nam=nameAss.getText().toString();
        String Cod=codeAss.getText().toString();
        String numTl=NumTele.getText().toString();
        String eml=EmailAss.getText().toString();
        String adrs=AdrsAss.getText().toString();
        String mp1=ModPass.getText().toString();
        String cfmp1=ConfModpass.getText().toString();
       // String image_url1=image_ur;


        Assouciations assouciations = new Assouciations(Nam,Cod,numTl,eml,adrs,mp1,cfmp1);

        ref.push().setValue(assouciations); // push: add data of any ass create her compte
        Toast.makeText(CompteCreation.this,"Successful",Toast.LENGTH_LONG).show();
    }
}


