package com.avanti.splashtab.activities;


import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;

import com.avanti.splashtab.R;

/**
 * Created by emichniak on 26/01/2015.
 */
public abstract class BaseActivity extends ActionBarActivity {

    public final String TAG = this.getClass().getCanonicalName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
