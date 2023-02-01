package com.example.gestioncentres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);

        // How to show activity sometimes second  and go to another activity
        Handler handl= new Handler() ;
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                handl.post(new Runnable() {
                    @Override
                    public void run() {
                        Intent inten1 = new Intent(MainActivity.this, Login_compte.class);
                        startActivity(inten1);
                    }
                });
            }
        };

        Timer timer = new Timer();
        timer.schedule(timerTask, 2000);//Wait 2 seconds then run the timer
    }
}