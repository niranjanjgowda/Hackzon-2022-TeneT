package com.shareef.nhce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Developer extends AppCompatActivity {
    private ImageView iq1;
    private ImageView iq2;
    private ImageView iq3;
    private ImageView iq4;
    private ImageView iq5;
    private ImageView iq6;
    private ImageView iq7;
    private ImageView iq8;
    private ImageView iq9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Profile Page");
    }
}