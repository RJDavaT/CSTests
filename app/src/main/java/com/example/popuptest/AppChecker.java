package com.example.popuptest;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import java.util.Iterator;
import java.util.List;

public class AppChecker extends Service {

    @Override
   public IBinder onBind(Intent arg0){
       // TODO
       return null;
   }
   @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        //This service will run until stopped


       if(isAppRunning(AppChecker.this, "com.example.popuptes")){
           Toast.makeText(this, "Yes", Toast.LENGTH_LONG).show();
       } else{
           Toast.makeText(this, "No", Toast.LENGTH_LONG).show();
       }
        return START_STICKY;
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }


    public static boolean isAppRunning(final Context context, final String packageName) {
        final ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        final List<ActivityManager.RunningAppProcessInfo> procInfos = activityManager.getRunningAppProcesses();
        if (procInfos != null)
        {
            for (final ActivityManager.RunningAppProcessInfo processInfo : procInfos) {
                if (processInfo.processName.equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
