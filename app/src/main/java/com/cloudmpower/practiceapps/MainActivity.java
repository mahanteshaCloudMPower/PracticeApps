package com.cloudmpower.practiceapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String name ="mahantesha";
    int age=28;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent check =new Intent(this, RootLiCheck.class);
        startActivity(check);


        //Check Device Details
//        String details = DeviceDetails.INSTANCE.getDeviceId(this);
//        Log.d("Device Details - ",details);

        // Creating a shared pref object with a file name "MySharedPref" in private mode
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        SharedPreferences.Editor myEdit = sharedPreferences.edit();

        // write all the data entered by the user in SharedPreference and apply
        myEdit.putString("name", name);
        myEdit.putInt("age", Integer.parseInt(String.valueOf(age)));
        myEdit.commit();



        // Fetching the stored data from the SharedPreference
        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        String s1 = sh.getString("name", "");
        int a = sh.getInt("age", 0);

        // Setting the fetched data in the EditTexts
        Log.d("name","name "+s1);

        Log.d("name"," age "+a);
    }
}