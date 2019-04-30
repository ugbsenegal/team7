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

public class radisson extends AppCompatActivity {

    private Button buttonradisson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radisson);
        buttonradisson = (Button) findViewById(R.id.buttonradisson);

        buttonradisson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bang = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.radissonblu.com/en/hotel-dakar?facilitatorId=CSOSEO&csref=org_gmb_sk_en_sn_ho_DKRZH"));
                startActivity(bang);
            }
        });
    }

}
