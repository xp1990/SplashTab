package com.avanti.splashtab.activities;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.avanti.splashtab.R;

/**
 * Created by emichniak on 27/01/2015.
 */
public class MainActivity extends BaseActivity {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if(toolbar != null) {
            Log.i(TAG,"Toolbar wasn't null");
            setSupportActionBar(toolbar);
        }else{
            Log.e(TAG,"Toolbar was null");
        }
    }
}
