package com.example.terangasenegal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class Leshotels4 extends AppCompatActivity {

    private ImageView archotel;
    private ImageView corniche;
    private ImageView vdn;
    private ImageView oclaire;
    private ImageView phare;
    private ImageView onomo;
    private ImageView international;
    private ImageView radisson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leshotels4);
        this.archotel = (ImageView) findViewById(R.id.archotel);

        archotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),archotel.class);
                startActivity(otherActivity);

            }
        });

        this.corniche = (ImageView) findViewById(R.id.corniche);

        corniche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),corniche.class);
                startActivity(otherActivity);

            }
        });

        this.vdn = (ImageView) findViewById(R.id.vdn);

        vdn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),vdn.class);
                startActivity(otherActivity);

            }
        });

        this.oclaire = (ImageView) findViewById(R.id.oclaire);

        oclaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),oclaire.class);
                startActivity(otherActivity);

            }
        });

        this.phare = (ImageView) findViewById(R.id.phare);

        phare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),phare.class);
                startActivity(otherActivity);

            }
        });

        this.onomo = (ImageView) findViewById(R.id.onomo);

        onomo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),onomo.class);
                startActivity(otherActivity);

            }
        });

        this.international = (ImageView) findViewById(R.id.international);

        international.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),international.class);
                startActivity(otherActivity);

            }
        });

        this.radisson = (ImageView) findViewById(R.id.radisson);

        radisson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),radisson.class);
                startActivity(otherActivity);

            }
        });

    }

}
