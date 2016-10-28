package com.example.jimmyavila.musicplayer;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the raw file that will be played
        final MediaPlayer natureSound = MediaPlayer.create(this, R.raw.nature);

        //Find the Button displaying play
        Button playButton =(Button)findViewById(R.id.play);

        //Set onClickListener so that when button id pressed the music will play
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               natureSound.start();
            }
        });

        Button pauseButton =(Button)findViewById(R.id.pause);

        pauseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                natureSound.pause();
                Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT);
            }
        });

        Button skipButton =(Button)findViewById(R.id.skipToMiddle);

        pauseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                natureSound.seekTo(1001);
                Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT);
            }
        });
    }
}
