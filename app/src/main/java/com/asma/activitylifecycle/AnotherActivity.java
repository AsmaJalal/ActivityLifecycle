package com.asma.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class AnotherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Log.e("onCreate ------ ", "AnotherActivity: onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart ------ ", "AnotherActivity: onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume ------ ", "AnotherActivity: onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause ------ ", "AnotherActivity: onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop ------ ", "AnotherActivity: onStop()");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy ------ ", "AnotherActivity: onDestroy()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart ------ ", "AnotherActivity: onRestart()");

    }

}
