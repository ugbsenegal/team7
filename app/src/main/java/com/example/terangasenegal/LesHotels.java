package com.example.terangasenegal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class LesHotels extends AppCompatActivity {

    private ImageView djoudj;
    private ImageView cap;
    private ImageView diamarek;
    private ImageView siki;
    private ImageView zebrazar;
    private ImageView dada;
    private ImageView mermoz;
    private ImageView bang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_les_hotels);

        this.djoudj = (ImageView) findViewById(R.id.djoudj);

        djoudj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),djoudj.class);
                startActivity(otherActivity);

            }
        });

        this.cap = (ImageView) findViewById(R.id.cap);

        cap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),cap.class);
                startActivity(otherActivity);

            }
        });

        this.diamarek = (ImageView) findViewById(R.id.diamarek);

        diamarek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),diamarek.class);
                startActivity(otherActivity);
            }
        });

        this.siki = (ImageView) findViewById(R.id.siki);

        siki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),siki.class);
                startActivity(otherActivity);
            }
        });

        this.zebrazar = (ImageView) findViewById(R.id.zebrazar);

        zebrazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),zebrazar.class);
                startActivity(otherActivity);
            }
        });

        this.dada = (ImageView) findViewById(R.id.dada);

        dada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),dada.class);
                startActivity(otherActivity);
            }
        });

        this.mermoz = (ImageView) findViewById(R.id.mermoz);

        mermoz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),mermoz.class);
                startActivity(otherActivity);
            }
        });

        this.bang = (ImageView) findViewById(R.id.bang);

        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(),bang.class);
                startActivity(otherActivity);
            }
        });
    }

}
