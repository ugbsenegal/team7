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

public class hotel_auberge extends AppCompatActivity {

    private Button buttonhotel_auberge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_auberge);
        buttonhotel_auberge = (Button) findViewById(R.id.buttonhotel_auberge);

        buttonhotel_auberge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bang = new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.jumia.com/fr-fr/senegal/o8128/auberge-au-carrefour-des-amis-dakar"));
                startActivity(bang);
            }
        });
    }

}
