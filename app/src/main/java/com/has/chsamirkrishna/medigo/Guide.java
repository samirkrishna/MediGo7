package com.has.chsamirkrishna.medigo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Guide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
