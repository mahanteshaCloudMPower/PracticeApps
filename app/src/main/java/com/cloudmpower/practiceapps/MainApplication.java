package com.cloudmpower.practiceapps;


import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

//        Intent check =new Intent(this, RootLiCheck.class);
//        check.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(check);
        RootLiCheck act=new RootLiCheck();
        Context context =getBaseContext();
        act.rootCheck(context);

    }


    //    prevent screen recording and screen shot while app running time
    private void setupActivityListener() {

// check with build version
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {
                @Override
                public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                    activity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);            }
                @Override
                public void onActivityStarted(Activity activity) {
                }
                @Override
                public void onActivityResumed(Activity activity) {

                }
                @Override
                public void onActivityPaused(Activity activity) {

                }
                @Override
                public void onActivityStopped(Activity activity) {
                }
                @Override
                public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                }
                @Override
                public void onActivityDestroyed(Activity activity) {
                }
            });
        }
    }
}
