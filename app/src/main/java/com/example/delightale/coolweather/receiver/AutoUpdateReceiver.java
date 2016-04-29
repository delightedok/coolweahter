package com.example.delightale.coolweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.delightale.coolweather.service.AutoUpdateService;

/**
 * Created by delighTale on 29/4/2016.
 */
public class AutoUpdateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent){
        Intent i=new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }

}
