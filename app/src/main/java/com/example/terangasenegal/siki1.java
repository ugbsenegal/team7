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

public class siki1 extends AppCompatActivity {

    private Button bttn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siki1);
        bttn1 = (Button) findViewById(R.id.bttn1);

        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siki1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hotelsenegal.net/"));
                startActivity(siki1);
            }
        });
    }

}
