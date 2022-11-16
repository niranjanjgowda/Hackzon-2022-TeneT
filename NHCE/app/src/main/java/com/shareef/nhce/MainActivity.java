package com.shareef.nhce;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;


import java.util.Objects;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView bottomNavigationView;
    private NavController navController;

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        navController = Navigation.findNavController(this, R.id.frame_layout);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigation_view);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.start, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(this);

        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return true;

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.navigation_developer:
                startActivity(new Intent(this, Developer.class));
                break;
            case R.id.navigation_eLibrary:
                startActivity(new Intent(this, ELibrary.class));
                break;
            case R.id.navigation_share:
                String url = "https://drive.google.com/file/d/1PUlR4L6J4pU6nWdfyXk7WXqu32HZROsv/view";

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                break;
            case R.id.navigation_results:
                startActivity(new Intent(this, Results.class));
                break;
            case R.id.navigation_website:
                startActivity(new Intent(this, Website.class));
                break;
            case R.id.navigation_blog:
                startActivity(new Intent(this, blog.class));
                break;
            case R.id.navigation_campusview:
                startActivity(new Intent(this, scholarship.class));
                break;
            case R.id.navigation_gallery1:
                startActivity(new Intent(this, gallery.class));
                break;
            case R.id.navigation_feedback:
                startActivity(new Intent(this, feedback.class));
                break;
            case R.id.navigation_pc:
                startActivity(new Intent(this, percentange.class));
                break;
            case R.id.navigation_cgpac:
                startActivity(new Intent(this, cgpa.class));
                break;
            case R.id.navigation_imc:
                startActivity(new Intent(this, internalmark.class));
                break;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else

            super.onBackPressed();
    }

}