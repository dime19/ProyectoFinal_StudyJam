package com.example.rocket.arbolapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Decorado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_decorado);
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this,R.raw.belen);
        mediaPlayer.setVolume(100,100);
        mediaPlayer.start();
    }
}
