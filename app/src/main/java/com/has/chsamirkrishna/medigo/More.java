package com.has.chsamirkrishna.medigo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class More extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
