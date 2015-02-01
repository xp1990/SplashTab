package com.avanti.splashtab.activities;

import android.os.Bundle;

import com.avanti.splashtab.R;
import com.avanti.splashtab.fragments.DrawerFragment;

import it.neokree.materialnavigationdrawer.MaterialNavigationDrawer;
import it.neokree.materialnavigationdrawer.elements.MaterialSection;

/**
 * Created by xp on 01/02/15.
 */
public class NavigationDrawer extends MaterialNavigationDrawer {

    @Override
    public void init(Bundle savedInstanceState) {
        this.setDrawerHeaderImage(R.drawable.mat2);

        MaterialSection section = newSection("Section 1", DrawerFragment.newInstance("Test", "One"));

        this.addSection(section);
    }
}