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

public class castel extends AppCompatActivity {

    private Button bout6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_castel);
        bout6 = (Button) findViewById(R.id.bout6);

        bout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent palmeraie = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.villacogelsgoree.com/goree-senegal/Villa_Castel.html"));
                startActivity(palmeraie);
            }
        });
    }

}
