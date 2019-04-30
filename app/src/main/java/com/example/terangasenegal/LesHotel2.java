package com.example.terangasenegal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class LesHotel2 extends AppCompatActivity {

    private ImageView pullman;
    private ImageView ibis;
    private ImageView novotel;
    private ImageView niwa;
    private ImageView madou;
    private ImageView castel;
    private ImageView terroubi;
    private ImageView marin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les_hotel2);
        this.pullman = (ImageView) findViewById(R.id.pullman);

        pullman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),pullman.class);
                startActivity(otherActivity);
            }
        });

        this.ibis = (ImageView) findViewById(R.id.ibis);

        ibis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),ibis.class);
                startActivity(otherActivity);
            }
        });

        this.novotel = (ImageView) findViewById(R.id.novotel);

        novotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),novotel.class);
                startActivity(otherActivity);
            }
        });

        this.niwa = (ImageView) findViewById(R.id.niwa);

        niwa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),niwa.class);
                startActivity(otherActivity);
            }
        });

        this.madou = (ImageView) findViewById(R.id.madou);

        madou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),madou.class);
                startActivity(otherActivity);
            }
        });

        this.castel = (ImageView) findViewById(R.id.castel);

        castel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),castel.class);
                startActivity(otherActivity);
            }
        });

        this.terroubi = (ImageView) findViewById(R.id.terroubi);

        terroubi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),terroubi.class);
                startActivity(otherActivity);
            }
        });

        this.marin = (ImageView) findViewById(R.id.marin);

        marin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),marin.class);
                startActivity(otherActivity);
            }
        });
    }

}
