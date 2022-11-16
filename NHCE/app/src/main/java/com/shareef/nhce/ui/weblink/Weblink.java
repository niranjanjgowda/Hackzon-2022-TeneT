package com.shareef.nhce.ui.weblink;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.shareef.nhce.R;

public class Weblink extends Fragment {
    private ImageView im1;
    private ImageView im2;
    private ImageView im3;
    private ImageView im4;
    private ImageView im5;
    private ImageView im6;
    private ImageView im7;
    private ImageView im8;
    private ImageView im9;
    private ImageView im10;
    private ImageView im11;
    private ImageView im12;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_weblink, container, false);
        im1 = view.findViewById(R.id.im1);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1();
            }
        });
        im2 = view.findViewById(R.id.im2);
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1();
            }
        });
        im3 = view.findViewById(R.id.im3);
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1();
            }
        });
        im4 = view.findViewById(R.id.im4);
        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                d1();
            }
        });
        im5 = view.findViewById(R.id.im5);
        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1();
            }
        });
        im6 = view.findViewById(R.id.im6);
        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1();
            }
        });
        im7 = view.findViewById(R.id.im7);
        im7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g1();
            }
        });
        im8 = view.findViewById(R.id.im8);
        im8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                h1();
            }
        });
        im9 = view.findViewById(R.id.im9);
        im9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i1();
            }
        });
        im10 = view.findViewById(R.id.im10);
        im10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                j1();
            }
        });
        im11 = view.findViewById(R.id.im11);
        im11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k1();
            }
        });
        im12 = view.findViewById(R.id.im12);
        im12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                l1();
            }
        });
        return view;
    }

    private void a1() {
        Uri uri = Uri.parse("https://vtu.ac.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void b1() {
        Uri uri = Uri.parse("https://www.aicte-india.org/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void c1() {
        Uri uri = Uri.parse("http://delnet.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void d1() {
        Uri uri = Uri.parse("https://ndl.iitkgp.ac.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void e1() {
        Uri uri = Uri.parse("https://www.karnatakadigitalpubliclibrary.org/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void f1() {
        Uri uri = Uri.parse("https://nkn.gov.in/en/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void g1() {
        Uri uri = Uri.parse("https://swayam.gov.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void h1() {
        Uri uri = Uri.parse("https://nptel.ac.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void i1() {
        Uri uri = Uri.parse("https://www.vlab.co.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void j1() {
        Uri uri = Uri.parse("https://epgp.inflibnet.ac.in/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void k1() {
        Uri uri = Uri.parse("https://www.base-search.net/index.php");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    private void l1() {
        Uri uri = Uri.parse("https://www.worldcat.org/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

}