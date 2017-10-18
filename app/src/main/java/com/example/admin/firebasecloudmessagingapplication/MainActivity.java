package com.example.admin.firebasecloudmessagingapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        if( intent.getStringExtra("key") != null )
            Log.d(TAG, "onCreate: " + intent.getStringExtra("key"));

        //in the notifications section on firebase, make new message, under advanced options, set
        //the tile and custom data, close the app. The message should show as a notification.
    }
}
