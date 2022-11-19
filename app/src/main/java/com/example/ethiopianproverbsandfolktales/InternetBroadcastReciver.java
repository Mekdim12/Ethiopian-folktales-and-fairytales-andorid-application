package com.example.ethiopianproverbsandfolktales;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.Toast;

public class InternetBroadcastReciver extends BroadcastReceiver {
    private Dialog dialog;
    @Override
    public void onReceive(Context context, Intent intent) {
        String status = CheckInternet.getNetworkInfo(context);
        if(status.equals("connected")){
            if(dialog != null){
                dialog.dismiss();
            }

        }else if(status.equals("disconnected")){
            dialog = new Dialog(context);
            dialog.setContentView(R.layout.custome_dialoge_for_connection_off);

            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            dialog.setCancelable(false); //Optional

            dialog.show();


        }
    }
}
