package com.shareef.nhce;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class percentange extends AppCompatActivity
{   EditText t1,pre;
    Button CONVERT;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {   super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_percentange);

        t1 = (EditText) findViewById(R.id.t1);
        pre = (EditText) findViewById(R.id.pre);
        CONVERT = (Button) findViewById(R.id.CONVERT);


        CONVERT.setOnClickListener(new View.OnClickListener()
        {   @Override
        public void onClick(View v) {
            String v1 = t1.getText().toString();
            float a = Float.parseFloat(v1);

            double c = ( a - 0.75 ) * 10;
            pre.setText(c + "%"); }
        });

    }
}
