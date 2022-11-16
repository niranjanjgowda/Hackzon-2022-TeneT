package com.shareef.nhce;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

    public class cgpa extends AppCompatActivity
    {   EditText t1,t2,t3,pre;
        Button CONVERT;


        @Override
        protected void onCreate(Bundle savedInstanceState)
        {   super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_cgpa);

            t1 = (EditText) findViewById(R.id.t1);
            t2 = (EditText) findViewById(R.id.t2);
            t3 = (EditText) findViewById(R.id.t3);
            pre = (EditText) findViewById(R.id.pre);
            CONVERT = (Button) findViewById(R.id.CONVERT);


            CONVERT.setOnClickListener(new View.OnClickListener()
            {   @Override
            public void onClick(View v) {
                String v1 = t1.getText().toString();
                String v2 = t2.getText().toString();
                String v3 = t3.getText().toString();
                float a = Float.parseFloat(v1);
                float b = Float.parseFloat(v2);
                float c = Float.parseFloat(v3);
                double d = (c *(a+1))-(b*a);

                if(d >= 10)
                pre.setText("The CGPA cannot be achieved in the current semester");
                else
                pre.setText(d + "");

                 }
            });

        }
    }
