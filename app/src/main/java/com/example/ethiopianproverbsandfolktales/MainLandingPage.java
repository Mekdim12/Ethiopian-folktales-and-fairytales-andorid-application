package com.example.ethiopianproverbsandfolktales;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

public class MainLandingPage extends AppCompatActivity {
    private AlphaAnimation buttonClick = new AlphaAnimation(1F, 0.4F);
    ImageView imageView;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_landing_page);
        imageView = (ImageView) findViewById(R.id.menuBarIcon);

        imageView.setBackgroundColor(getResources().getColor(android.R.color.transparent));

        buttonClick.setDuration(500);
        buttonClick.setRepeatCount(1);
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                imageView.startAnimation(buttonClick);
                return false;
            }
        });



    }
}