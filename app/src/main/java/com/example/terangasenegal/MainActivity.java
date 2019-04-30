package com.example.terangasenegal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView monument;
    private ImageView saly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.img = (ImageView) findViewById(R.id.img);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),Details.class);
                startActivity(otherActivity);
            }
        });

        this.image1 = (ImageView) findViewById(R.id.image1);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),Details1.class);
                startActivity(otherActivity);
            }
        });

        this.image2 = (ImageView) findViewById(R.id.image2);

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),Details2.class);
                startActivity(otherActivity);
            }
        });

        this.image3 = (ImageView) findViewById(R.id.image3);

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),Details3.class);
                startActivity(otherActivity);
            }
        });

        this.monument = (ImageView) findViewById(R.id.monument);

        monument.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),Details4.class);
                startActivity(otherActivity);
            }
        });

        this.saly = (ImageView) findViewById(R.id.saly);

        saly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),Details5.class);
                startActivity(otherActivity);
            }
        });
    }
}

