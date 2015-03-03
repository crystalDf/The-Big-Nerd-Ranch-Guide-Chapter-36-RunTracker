package com.star.runtracker;


import android.support.v4.app.Fragment;

public class RunMapActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new RunMapFragment();
    }
}
