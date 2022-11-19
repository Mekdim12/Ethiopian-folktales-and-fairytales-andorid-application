package com.example.ethiopianproverbsandfolktales;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class EntrancePage extends AppCompatActivity {
    private static final int PERMISSION_REQUEST = 1;
    BroadcastReceiver broadcastReceiver = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrance_page);
        broadcastReceiver = new InternetBroadcastReciver();

//        InternetStatus();
        Thread thread = new Thread( new implementingAPouaseTillItChecksTheConnection(getApplicationContext()));
        thread.start();



    }

   public void InternetStatus(){
        registerReceiver(broadcastReceiver, new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(broadcastReceiver);
    }


    class implementingAPouaseTillItChecksTheConnection implements  Runnable{
        Context context = null;
        implementingAPouaseTillItChecksTheConnection( Context context){
            this.context = context;
        }

        @Override
        public void run() {
            ContextCompat.getMainExecutor(context).execute(()  -> {
                        int counter = 0;


                        while(counter <= 5 && !(CheckInternet.getNetworkInfo(context).equals("connected"))){
                            try{
                                Thread.sleep(500);
                            }catch(Exception e){}


                            counter += 1;
                        }
                if( !(CheckInternet.getNetworkInfo(context).equals("connected"))) {
                    InternetStatus();
                }else{
                    InternetStatus();
                    startActivity(new Intent(EntrancePage.this,MainLandingPage.class));

                }

            });





            }

    }
}


