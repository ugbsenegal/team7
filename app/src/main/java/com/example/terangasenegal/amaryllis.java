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

public class amaryllis extends AppCompatActivity {

    private Button buttonamaryllis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amaryllis);
        buttonamaryllis = (Button) findViewById(R.id.buttonamaryllis);

        buttonamaryllis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bang = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.lesamaryllishotel.com/"));
                startActivity(bang);
            }
        });
    }

}
