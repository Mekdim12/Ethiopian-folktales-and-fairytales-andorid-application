package com.example.ethiopianproverbsandfolktales;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.navigation.NavigationView;

public class activity_First_option_menu extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.4F);
    ImageView imageView;
    private DrawerLayout drawerLayout;
    ImageButton right_navigationDrawer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_first_option_menu);

        Toolbar toolbar = findViewById(R.id.myToolbar);
        right_navigationDrawer = findViewById(R.id.right_menu_navigation_drawer_hamburger);

        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawerLayout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.opeingndrawer,R.string.closeDrawer);

        NavigationView navigationView = findViewById(R.id.topnavigation);
        navigationView.setNavigationItemSelectedListener(this);

//        drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();

        if( savedInstanceState == null ) {
           getSupportFragmentManager().beginTransaction().replace(R.id.first_main_fragmentContainer, new fg_first_option_menu()).commit();

           //             navigationView.setCheckedItem(R.id.home_item);
        }


        right_navigationDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(drawerLayout.isDrawerOpen(GravityCompat.END)){
                    drawerLayout.closeDrawer(GravityCompat.END);
                }else{
                    drawerLayout.openDrawer(GravityCompat.END);
                }
            }
        });
    }


    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.END)){
            drawerLayout.closeDrawer(GravityCompat.END);
        }else{
            super.onBackPressed();
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.home_item:
                startActivity(new Intent(activity_First_option_menu.this, MainLandingPage.class));
                overridePendingTransition(0,0);
                break;
            case R.id.result_statics_item:
                break;
            case R.id.favorites_item:
                break;
            case R.id.update_item:
                break;
            case R.id.setting_item:
                break;
            case  R.id.about_item:
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.END);
        return true;
    }




}
