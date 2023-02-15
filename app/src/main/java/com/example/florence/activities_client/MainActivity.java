package com.example.florence.activities_client;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.florence.R;
import com.example.florence.fragments.HomeFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;

    private void initializareComponente()
    {
        configNavigation();
        navigationView=findViewById(R.id.nav_view);
        //select option
        navigationView.setNavigationItemSelectedListener(getNavigationItemSelectedListener());

        SharedPreferences sp;
        sp = getSharedPreferences("sharedPref", MODE_PRIVATE);
        String firstName=sp.getString("firstName","");
        String lastName=sp.getString("lastName","");
        String email=sp.getString("email","");

        View headerView = navigationView.getHeaderView(0);
        TextView tvHeaderName = headerView.findViewById(R.id.nav_header_username);
        tvHeaderName.setText(firstName+" "+lastName);

        TextView tvHeaderEmail = headerView.findViewById(R.id.nav_header_email_user);
        tvHeaderEmail.setText(email);

    }

    private NavigationView.OnNavigationItemSelectedListener getNavigationItemSelectedListener(){
        return new NavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId()==R.id.main_nav_home){
                    Log.i("MainActivity", "Home is selected");
                } else Log.i("MainActivity", "Contact is selected");

                if(item.getItemId()==R.id.main_nav_home)
                {
                    getSupportFragmentManager().beginTransaction().replace(R.id.main_frame_container, new HomeFragment()).commit();
                }
                drawerLayout.closeDrawer(GravityCompat.START);
                Toast.makeText(getApplicationContext(), "Optiunea "+item.getTitle(), Toast.LENGTH_SHORT).show();
                return true;
            }
        };
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializareComponente();
    }

    private void configNavigation() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }
}