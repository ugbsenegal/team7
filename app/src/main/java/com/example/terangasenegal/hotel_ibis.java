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

public class hotel_ibis extends AppCompatActivity {

    private Button buttonhotel_ibis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_ibis);
        buttonhotel_ibis = (Button) findViewById(R.id.buttonhotel_ibis);

        buttonhotel_ibis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bang = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.accorhotels.com/fr/hotel-8092-ibis-de-haan/index.shtml"));
                startActivity(bang);
            }
        });
    }

}
