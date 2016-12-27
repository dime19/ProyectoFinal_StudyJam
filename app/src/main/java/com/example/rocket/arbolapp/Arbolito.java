package com.example.rocket.arbolapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Arbolito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_arbolito);

    }
    public void decora(View v){
        Intent intent = new Intent(getApplicationContext(),Decorado.class);
        startActivity(intent);
    }

}
