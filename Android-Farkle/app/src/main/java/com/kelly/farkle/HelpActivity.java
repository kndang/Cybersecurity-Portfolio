package com.kelly.farkle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        TextView overview = (TextView) findViewById(R.id.overviewTV);
        TextView h2p = (TextView) findViewById(R.id.h2pTV);
        TextView winning = (TextView) findViewById(R.id.winningTV);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}
