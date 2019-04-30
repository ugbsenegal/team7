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

public class vdn extends AppCompatActivity {

    private Button buttonvdn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vdn);
        buttonvdn = (Button) findViewById(R.id.buttonvdn);

        buttonvdn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bang = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hotelvdn.sn/"));
                startActivity(bang);
            }
        });
    }

}
