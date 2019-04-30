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

public class terroubi extends AppCompatActivity {

    private Button bout7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terroubi);
        bout7 = (Button) findViewById(R.id.bout7);

        bout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent palmeraie = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.terroubi.com/"));
                startActivity(palmeraie);
            }
        });
    }

}
