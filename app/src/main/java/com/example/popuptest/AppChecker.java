package com.example.popuptest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class AppChecker extends Service {

    @Override
   public IBinder onBind(Intent arg0){
       // TODO
       return null;
   }
   @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        //This service will run until stopped
       Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
        return START_STICKY;
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }
}
