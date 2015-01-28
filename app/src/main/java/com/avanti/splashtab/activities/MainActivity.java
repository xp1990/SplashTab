package com.avanti.splashtab.activities;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.avanti.splashtab.R;

/**
 * Created by emichniak on 27/01/2015.
 */
public class MainActivity extends BaseActivity {

    private String[] planets = {"Jupiter","Saturn","Mercury"};
    DrawerLayout drawerLayout;
    ListView drawerList;
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
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        drawerLayout.setStatusBarBackground(R.color.primary_dark_material_light);

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(
                this,  drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close
        );

        drawerLayout.setDrawerListener(drawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        drawerToggle.syncState();

        drawerList = (ListView) findViewById(R.id.left_drawer);
        drawerList.setAdapter(new ArrayAdapter<>(this, R.layout.drawer_list_item, planets));

        drawerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i(TAG,"Drawer item clicked");
            }
        });

    }
}
