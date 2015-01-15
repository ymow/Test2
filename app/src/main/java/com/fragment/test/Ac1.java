package com.fragment.test;

import android.support.v7.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Ymow on 15/1/14.
 */
public class Ac1 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment1);
//        requestWindowFeature(Window.FEATURE_ACTION_BAR);
//        getActionBar().setTitle("123");
        ActionBar aaa =getsupportActiobBar();
//
        aaa.setDisplayHomeAsUpEnabled(true);
    }
}
