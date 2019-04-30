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

public class residence_ndongo_fall extends AppCompatActivity {

    private Button buttonresidence_ndongo_fall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_residence_ndongo_fall);
        buttonresidence_ndongo_fall = (Button) findViewById(R.id.buttonresidence_ndongo_fall);

        buttonresidence_ndongo_fall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bang = new Intent(Intent.ACTION_VIEW, Uri.parse("https://travel.jumia.com/fr-fr/senegal/o3753/residence-ndongo-fall-dakar"));
                startActivity(bang);
            }
        });
    }

}
