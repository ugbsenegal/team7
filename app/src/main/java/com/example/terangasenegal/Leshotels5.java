package com.example.terangasenegal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class Leshotels5 extends AppCompatActivity {

    private ImageView amaryllis;
    private ImageView bougainvill;
    private ImageView casa;
    private ImageView flamboy;
    private ImageView lamatin;
    private ImageView rhino;
    private ImageView royam_hotel;
    private ImageView salyplage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leshotels5);
        this.amaryllis = (ImageView) findViewById(R.id.amaryllis);

        amaryllis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),amaryllis.class);
                startActivity(otherActivity);

            }
        });

        this.bougainvill = (ImageView) findViewById(R.id.bougainvill);

        bougainvill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),bougainvill.class);
                startActivity(otherActivity);

            }
        });

        this.casa = (ImageView) findViewById(R.id.casa);

        casa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),casa.class);
                startActivity(otherActivity);

            }
        });

        this.flamboy = (ImageView) findViewById(R.id.flamboy);

        flamboy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),flamboy.class);
                startActivity(otherActivity);

            }
        });

        this.lamatin = (ImageView) findViewById(R.id.lamatin);

        lamatin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),lamatin.class);
                startActivity(otherActivity);

            }
        });

        this.rhino = (ImageView) findViewById(R.id.rhino);

        rhino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),rhino.class);
                startActivity(otherActivity);

            }
        });

        this.royam_hotel = (ImageView) findViewById(R.id.royam_hotel);

        royam_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),royam_hotel.class);
                startActivity(otherActivity);

            }
        });

        this.salyplage = (ImageView) findViewById(R.id.salyplage);

        salyplage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),salyplage.class);
                startActivity(otherActivity);

            }
        });
    }

}
