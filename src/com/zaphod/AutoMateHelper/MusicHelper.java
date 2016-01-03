package com.zaphod.AutoMateHelper;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;

import java.lang.Override;

public class MusicHelper extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onResume() {

        super.onResume();
        Intent launch = new Intent ("com.bitspice.automate.MUSIC_SCREEN");
        sendBroadcast(launch);
        finish();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    
}
