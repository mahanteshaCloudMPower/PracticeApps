package com.cloudmpower.practiceapps;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.rootcheckerlib.RootLib;

public class RootLiCheck extends AppCompatActivity {
    boolean udata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        ActivityManager am1;

//        ActivityManager am = (ActivityManager) getSystemService(Activity.ACTIVITY_SERVICE);

    }


    public void rootCheck(Context context) {
        udata= RootLib.INSTANCE.findBinary("su");
//        checkrootCkeck
        Log.d("App close","App close======");
        if(udata){
            Log.d("App close","App close======");
            Toast.makeText(context, "Device is rooted ", Toast.LENGTH_LONG).show();
            // Use for finish the app
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
//                    Intent intent = new Intent(getApplicationContext(), MainApplication.class);
//                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                    intent.putExtra("EXIT", true);
//                    startActivity(intent);
//                    ActivityManager am = (ActivityManager) getSystemService(Activity.ACTIVITY_SERVICE);
//Log.d("am--","am---"+am);
//                    am.killBackgroundProcesses("com.apix");
//                    finishAndRemoveTask();
//                    finishAffinity();
//                    finish();
                    android.os.Process.killProcess(android.os.Process.myPid());
                }
            }, 5000);
        }
//        else
//        {
//            Log.d("Return to main","Return to main");
//            Intent returnToMain =new Intent(this,MainApplication.class);
//            returnToMain.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//            startActivity(returnToMain);
//
//        }
    }
}

