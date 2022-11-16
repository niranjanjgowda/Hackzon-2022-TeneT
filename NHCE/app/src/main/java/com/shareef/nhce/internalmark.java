package com.shareef.nhce;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

    public class internalmark extends AppCompatActivity
    {   EditText t1,t2,t3,t4,t5,t6,t7,pre;
        Button CONVERT;


        @Override
        protected void onCreate(Bundle savedInstanceState)
        {   super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_internal);

            t1 = (EditText) findViewById(R.id.t1);
            t2 = (EditText) findViewById(R.id.t2);
            t3 = (EditText) findViewById(R.id.t3);
            t4 = (EditText) findViewById(R.id.t4);
            t5 = (EditText) findViewById(R.id.t5);
            t6 = (EditText) findViewById(R.id.t6);
            t7 = (EditText) findViewById(R.id.t7);
            pre = (EditText) findViewById(R.id.pre);
            CONVERT = (Button) findViewById(R.id.CONVERT);


            CONVERT.setOnClickListener(new View.OnClickListener()
            {   @Override
            public void onClick(View v) {
                String v1 = t1.getText().toString();
                String v2 = t2.getText().toString();
                String v3 = t3.getText().toString();
                String v4 = t4.getText().toString();
                String v5 = t5.getText().toString();
                String v6 = t6.getText().toString();
                String v7 = t7.getText().toString();
                float a = Float.parseFloat(v1);
                float b = Float.parseFloat(v2);
                float c = Float.parseFloat(v3);
                float d = Float.parseFloat(v4);
                float e = Float.parseFloat(v5);
                float f = Float.parseFloat(v6);
                float g = Float.parseFloat(v7);

                float h=(a+b+c)/3;
                double j =h+d+e+f+g;
                pre.setText(j + ""); }
            });

        }
    }
