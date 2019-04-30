package com.example.terangasenegal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class LesHotel1 extends AppCompatActivity {

    private ImageView im1;
    private ImageView im2;
    private ImageView im3;
    private ImageView im4;
    private ImageView im5;
    private ImageView im6;
    private ImageView im7;
    private ImageView im8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les_hotel1);
        this.im1 = (ImageView) findViewById(R.id.im1);

        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),siki1.class);
                startActivity(otherActivity);
            }
        });

        this.im2 = (ImageView) findViewById(R.id.im2);

        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),Pointe.class);
                startActivity(otherActivity);
            }
        });

        this.im3 = (ImageView) findViewById(R.id.im3);

        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),Palmeraie.class);
                startActivity(otherActivity);
            }
        });

        this.im4 = (ImageView) findViewById(R.id.im4);

        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),Poste.class);
                startActivity(otherActivity);
            }
        });

        this.im5 = (ImageView) findViewById(R.id.im5);

        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),sindone.class);
                startActivity(otherActivity);
            }
        });

        this.im6 = (ImageView) findViewById(R.id.im6);

        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),dior.class);
                startActivity(otherActivity);
            }
        });

        this.im7 = (ImageView) findViewById(R.id.im7);

        im7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),tour.class);
                startActivity(otherActivity);
            }
        });

        this.im8 = (ImageView) findViewById(R.id.im8);

        im8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),bang1.class);
                startActivity(otherActivity);
            }
        });

    }

}
