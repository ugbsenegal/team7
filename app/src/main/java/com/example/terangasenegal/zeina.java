package com.example.terangasenegal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class zeina extends AppCompatActivity {

    private Button buttonzeina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zeina);
        buttonzeina = (Button) findViewById(R.id.buttonzeina);

        buttonzeina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bang = new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.jumia.com/fr-fr/senegal/o3702/residence-zeina-dakar"));
                startActivity(bang);
            }
        });
    }

}
