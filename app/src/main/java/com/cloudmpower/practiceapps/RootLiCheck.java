package com.cloudmpower.practiceapps;

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
        Log.d("RootlibCheck","RootlibCheck======");

        udata= RootLib.INSTANCE.findBinary("su");
        Log.d("mainactivity","mahi----"+udata);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("App close","App close======");
//        Toast.makeText(getBaseContext(), "Device is rooted ", Toast.LENGTH_LONG).show();
        if(udata){
            Log.d("App close","App close======");
            Toast.makeText(getBaseContext(), "Device is rooted ", Toast.LENGTH_LONG).show();

            // Use for finish the app
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    finishAffinity();
                }
            }, 5000);
        }else
        {
            Log.d("Return to main","Return to main");
            Intent returnToMain =new Intent(this,MainActivity.class);
            returnToMain.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(returnToMain);
        }
    }

}

