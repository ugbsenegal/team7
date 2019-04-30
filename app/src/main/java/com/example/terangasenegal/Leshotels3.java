package com.example.terangasenegal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class Leshotels3 extends AppCompatActivity {

    private ImageView hotel_auberge;
    private ImageView hotel_ibis;
    private ImageView hotel_la_voile_dor;
    private ImageView hotel_monaco_plage;
    private ImageView zeina;
    private ImageView axa;
    private ImageView residence_ndongo_fall;
    private ImageView villa_rosa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leshotels3);
        this.hotel_auberge = (ImageView) findViewById(R.id.hotel_auberge);

        hotel_auberge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),hotel_auberge.class);
                startActivity(otherActivity);

            }
        });

        this.hotel_ibis = (ImageView) findViewById(R.id.hotel_ibis);

        hotel_ibis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),hotel_ibis.class);
                startActivity(otherActivity);

            }
        });

        this.hotel_la_voile_dor = (ImageView) findViewById(R.id.hotel_la_voile_dor);

        hotel_la_voile_dor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),hotel_la_voile_dor.class);
                startActivity(otherActivity);
            }
        });

        this.hotel_monaco_plage = (ImageView) findViewById(R.id.hotel_monaco_plage);

        hotel_monaco_plage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),hotel_monaco_plage.class);
                startActivity(otherActivity);
            }
        });

        this.zeina = (ImageView) findViewById(R.id.zeina);

        zeina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),zeina.class);
                startActivity(otherActivity);
            }
        });

        this.axa = (ImageView) findViewById(R.id.axa);

        axa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),axa.class);
                startActivity(otherActivity);
            }
        });

        this.residence_ndongo_fall = (ImageView) findViewById(R.id.residence_ndongo_fall);

        residence_ndongo_fall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),residence_ndongo_fall.class);
                startActivity(otherActivity);
            }
        });

        this.villa_rosa = (ImageView) findViewById(R.id.villa_rosa);

        villa_rosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),villa_rosa.class);
                startActivity(otherActivity);
            }
        });
    }

}
