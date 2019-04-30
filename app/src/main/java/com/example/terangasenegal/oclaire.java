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

public class oclaire extends AppCompatActivity {

    private Button buttonoclaire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oclaire);
        buttonoclaire = (Button) findViewById(R.id.buttonoclaire);

        buttonoclaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bang = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.oclairdelune.dk/"));
                startActivity(bang);
            }
        });
    }

}
