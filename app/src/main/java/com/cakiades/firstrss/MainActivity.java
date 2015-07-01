package com.cakiades.firstrss;

import android.os.Bundle;;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

/**
 * This app was developed as a personal learning acivity.
 * <P>
 * Specifically, the goal was to switch between fragments containing
 * NewItems from RSS feeds
 * <P>
 * This functionality is to be imported into the com.cakiades.viacomhomework
 * example
 *
 */
public class MainActivity extends Activity {

    @Override

    /**
     * Standard "onCreate" method
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    /**
     * This method switches between fragments
     */

    public void selectFrag(View view) {
        Fragment fr;

        if(view == findViewById(R.id.button2)) {
            fr = new FragmentTwo();

        }else {
            fr = new FragmentOne();
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fr);
        fragmentTransaction.commit();

    }

}
