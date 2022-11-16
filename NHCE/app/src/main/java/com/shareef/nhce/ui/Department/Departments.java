package com.shareef.nhce.ui.Department;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.shareef.nhce.R;

public class Departments extends Fragment {
    private TextView txt1;
    private TextView txt2;
    private TextView txt3;
    private TextView txt4;
    private TextView txt5;
    private TextView txt6;
    private TextView txt7;
    private TextView txt8;
    private TextView txt9;
    private TextView txt10;
    private TextView txt11;
    private TextView txt12;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_department, container, false);
        txt1 = view.findViewById(R.id.txt1);
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a();
            }
        });
        txt2 = view.findViewById(R.id.txt2);
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b();
            }
        });
        txt3 = view.findViewById(R.id.txt3);
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c();
            }
        });
        txt4 = view.findViewById(R.id.txt4);
        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d();
            }
        });
        txt5 = view.findViewById(R.id.txt5);
        txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e();
            }
        });
        txt6 = view.findViewById(R.id.txt6);
        txt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f();
            }
        });
        txt7 = view.findViewById(R.id.txt7);
        txt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g();
            }
        });
        txt8 = view.findViewById(R.id.txt8);
        txt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h();
            }
        });
        txt9 = view.findViewById(R.id.txt9);
        txt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i();
            }
        });
        txt10 = view.findViewById(R.id.txt10);
        txt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j();
            }
        });
        txt11 = view.findViewById(R.id.txt11);
        txt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k();
            }
        });
        txt12 = view.findViewById(R.id.txt12);
        txt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l();
            }
        });
        return view;
    }
    private void a() {
        Uri uri = Uri.parse("https://newhorizonindia.edu/nhengineering/automobile-engineering/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    private void b() {
        Uri uri = Uri.parse("https://newhorizonindia.edu/nhengineering/bsh/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    private void c() {
        Uri uri = Uri.parse("https://newhorizonindia.edu/nhengineering/department-of-civil-engineering/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    private void d() {
        Uri uri = Uri.parse("https://newhorizonindia.edu/nhengineering/computer-engineering/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    private void e() {
        Uri uri = Uri.parse("https://newhorizonindia.edu/nhengineering/department-of-computer-science-engineering/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    private void f() {
        Uri uri = Uri.parse("https://newhorizonindia.edu/nhengineering/artificial-intelligence-machine-learning/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    private void g() {
        Uri uri = Uri.parse("https://newhorizonindia.edu/nhengineering/department-of-electrical-and-electronics-engineering/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    private void h() {
        Uri uri = Uri.parse("https://newhorizonindia.edu/nhengineering/department-of-electronics-and-communication-engineering/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    private void i() {
        Uri uri = Uri.parse("https://newhorizonindia.edu/nhengineering/information-science-engineering/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    private void j() {
        Uri uri = Uri.parse("https://newhorizonindia.edu/nhengineering/mechanical-engineering/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    private void k() {
        Uri uri = Uri.parse("https://newhorizonindia.edu/nhengineering/mca/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    private void l() {
        Uri uri = Uri.parse("https://newhorizonindia.edu/nhengineering/mba/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

}