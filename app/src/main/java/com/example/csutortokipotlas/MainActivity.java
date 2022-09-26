package com.example.csutortokipotlas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout layout;
    private EditText beker;
    private Button kBGomb;
    private Button nBGomb;
    private Button szinvaltoG;
    private TextView szinvaltoSz;
    private Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        nBGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szinvaltoSz.setInputType(3);
                szinvaltoSz.setText(beker.getText());
            }
        }
        );

        kBGomb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szinvaltoSz.setInputType(0);
                szinvaltoSz.setText(beker.getText());
            }
        }
        );

        szinvaltoG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szinvaltoSz.setText(beker.getText());
                int red = rnd.nextInt(256);
                int green = rnd.nextInt(256);
                int blue = rnd.nextInt(256);
                szinvaltoSz.setBackgroundColor(Color.rgb(red, green, blue));
                if ((red+green+blue) > 450){
                    szinvaltoSz.setTextColor(Color.BLACK);
                }else{
                    szinvaltoSz.setTextColor(Color.WHITE);
                }
            }
        }
        );

    }

    private void init(){
        layout = findViewById(R.id.layout);
        beker = findViewById(R.id.beker);
        kBGomb = findViewById(R.id.kBGomb);
        nBGomb = findViewById(R.id.nBGomb);
        szinvaltoG = findViewById(R.id.szinvaltoG);
        szinvaltoSz = findViewById(R.id.szinvaltoSz);
    }
}