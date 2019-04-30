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

public class dior extends AppCompatActivity {

    private Button bttn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dior);
        bttn6 = (Button) findViewById(R.id.bttn6);

        bttn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dior = new Intent(Intent.ACTION_VIEW, Uri.parse("https://hoteldior.business.site/"));
                startActivity(dior);
            }
        });
    }

}
