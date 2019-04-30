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

public class hotel_monaco_plage extends AppCompatActivity {

    private Button buttonhotel_monaco_plage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_monaco_plage);
        buttonhotel_monaco_plage = (Button) findViewById(R.id.buttonhotel_monaco_plage);

        buttonhotel_monaco_plage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bang = new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.jumia.com/fr-fr/senegal/o5501/hotel-monaco-plage-dakar"));
                startActivity(bang);
            }
        });
    }

}
