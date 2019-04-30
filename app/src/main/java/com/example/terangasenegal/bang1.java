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

public class bang1 extends AppCompatActivity {

    private Button bttn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bang1);
        bttn8 = (Button) findViewById(R.id.bttn8);

        bttn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bang1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.hotelmamecoumbabang.sn/"));
                startActivity(bang1);
            }
        });
    }

}
