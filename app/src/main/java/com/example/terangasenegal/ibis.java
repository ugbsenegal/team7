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

public class ibis extends AppCompatActivity {

    private Button bout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibis);
        bout2 = (Button) findViewById(R.id.bout2);

        bout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent palmeraie = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.accorhotels.com/fr/hotel-6777-ibis-dakar/index.shtml"));
                startActivity(palmeraie);
            }
        });
    }

}
