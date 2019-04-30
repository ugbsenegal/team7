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

public class royam_hotel extends AppCompatActivity {

    private Button buttonroyam_hotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_royam_hotel);
        buttonroyam_hotel = (Button) findViewById(R.id.buttonroyam_hotel);

        buttonroyam_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bang = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.au-senegal.com/royam-hotel,647.html"));
                startActivity(bang);
            }
        });
    }

}
