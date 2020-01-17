package com.mezan.pccontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button Music,Shutdown,Restart;
    TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Music = findViewById(R.id.music);
        Shutdown = findViewById(R.id.shutdown);
        Restart = findViewById(R.id.restart);
        Result = findViewById(R.id.result);

        Music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Client music = new Client("music");
                music.execute();
            }
        });

        Shutdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Client music = new Client("shutdown");
                music.execute();
            }
        });
        Restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Client music = new Client("restart");
                music.execute();
            }
        });
    }
}
