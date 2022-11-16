package com.shareef.nhce.ui.about;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.shareef.nhce.R;

public class AboutFragment extends Fragment {
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        image1 = view.findViewById(R.id.image1);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                face();
            }
        });
        image2 = view.findViewById(R.id.image2);
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                twi();
            }
        });
        image3 = view.findViewById(R.id.image3);
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                link();
            }
        });
        image4 = view.findViewById(R.id.image4);
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ins();
            }
        });
        image5 = view.findViewById(R.id.image5);
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                you();
            }
        });


        return view;
    }


    private void ins() {
        Uri uri = Uri.parse("https://www.instagram.com/nhce.official/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    private void face() {
        Uri uri = Uri.parse("https://www.facebook.com/nhceofficial/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    private void link() {
        Uri uri = Uri.parse("https://www.linkedin.com/school/9230770/admin/");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    private void twi() {
        Uri uri = Uri.parse("https://twitter.com/NHCEOfficial");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
    private void you() {
        Uri uri = Uri.parse("https://www.youtube.com/c/NHEIBangalore");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }

}