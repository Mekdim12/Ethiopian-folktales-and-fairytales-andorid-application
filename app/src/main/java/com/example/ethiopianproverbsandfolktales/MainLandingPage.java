package com.example.ethiopianproverbsandfolktales;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;



public class MainLandingPage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.4F);
    ImageView imageView;
    private DrawerLayout drawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_landing_page);

        Toolbar toolbar = findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);




        drawerLayout = findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.opeingndrawer,R.string.closeDrawer);

        NavigationView navigationView = findViewById(R.id.topnavigation);
        navigationView.setNavigationItemSelectedListener(this);


        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        if( savedInstanceState == null ) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new fg_main_spalsh_screen()).commit();
            navigationView.setCheckedItem(R.id.home_item);
        }



    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.home_item:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new fg_main_spalsh_screen()).commit();
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
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}