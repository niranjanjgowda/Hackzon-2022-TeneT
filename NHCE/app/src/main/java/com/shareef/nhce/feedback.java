package com.shareef.nhce;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class feedback extends AppCompatActivity {
    EditText etfb;
    Button btsend;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate((savedInstanceState));
        setContentView(R.layout.activity_feedback);
        String etto="shareefmottath@gmail.com";
        String etsub="app feedback";
        etfb=findViewById(R.id.t1);
        btsend=findViewById(R.id.send);

        btsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW
                        , Uri.parse("mailto:" + etto));
                intent.putExtra(Intent.EXTRA_SUBJECT, etsub);
                intent.putExtra(Intent.EXTRA_SUBJECT, etfb.getText().toString());
                startActivity(intent);
            }


        });

    }
}
