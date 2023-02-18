package com.example.gestioncentres;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;



public class Dashboard extends AppCompatActivity {
    //drawer menu

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView menuBtn;
    //rec_adapter adapter  ;
    ArrayList<centre_profil> arrayList = new ArrayList<>();
    RecyclerView rec; ////

    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.dashboard);

        rec = findViewById(R.id.rec);
        rec.setLayoutManager(new LinearLayoutManager(this));

        arrayList.add(new centre_profil(R.drawable.testlo , "centre tiznit", "Female, 5 Months","Tiznit"));
        arrayList.add(new centre_profil(R.drawable.salma , "Lilia", "Female, 5 Months","Tiznit"));
        arrayList.add(new centre_profil(R.drawable.picture , "culture", "Female, 5 Months","Tiznit"));
        arrayList.add(new centre_profil(R.drawable.sal , "Blend", "Female, 5 Months","Tiznit"));
        arrayList.add(new centre_profil(R.drawable.cent , "lala mira", "Female, 5 Months","Tiznit"));
        arrayList.add(new centre_profil(R.drawable.google , "l'institus", "Female, 5 Months","Tiznit"));

        ModelRecycleView modelRecycleView =  new ModelRecycleView(this,arrayList);
        rec.setAdapter(modelRecycleView);
     //   adapter = new rec_adapter(li);
     //   rec = findViewById(R.id.rec);
     //  rec.setAdapter(adapter);
        GridLayoutManager g = new GridLayoutManager(Dashboard.this , 1);
        rec.setLayoutManager(g);
    //    rec.setLayoutManager(new LinearLayoutManager(this));

        //menu hooks
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView= findViewById(R.id.navigation_view);
        menuBtn= findViewById(R.id.menuBtn);

        menuBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("RtlHardcoded")
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(Gravity.LEFT,true);
            }
        });


    }
}
