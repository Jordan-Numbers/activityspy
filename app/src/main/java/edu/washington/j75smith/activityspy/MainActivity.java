package edu.washington.j75smith.activityspy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String message = "onCreate event fired";
        Log.i("activityspy", message);
        if(savedInstanceState != null){
            Log.i("activityspy", savedInstanceState.toString());
        }
    }

    @Override
    protected void onStart(){
        super.onStart();
        String message = "onStart event fired";
        Log.i("activityspy", message);
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        String message = "onRestart event fired";
        Log.i("activityspy", message);
    }

    @Override
    protected void onResume(){
        super.onResume();
        String message = "onResume event fired";
        Log.i("activityspy", message);
    }

    @Override
    protected void onPause(){
        super.onPause();
        String message = "onPause event fired";
        Log.i("activityspy", message);
    }

    @Override
    protected void onStop(){
        super.onStop();
        String message = "onStop event fired";
        Log.i("activityspy", message);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        String messageOne = "onDestroy event fired";
        Log.i("activityspy", messageOne);
        String messageTwo = "we're going down, Captain!";
        Log.e("activityspy", messageTwo);
    }
}
