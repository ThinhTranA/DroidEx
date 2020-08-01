package com.visualsharp.androidme.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.visualsharp.androidme.R;
import com.visualsharp.androidme.data.AndroidImageAssets;

public class AndroidMeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_me);

        if(savedInstanceState == null) {


        BodyPartFragment headFragment = new BodyPartFragment();

        headFragment.setImageIds(AndroidImageAssets.getHeads());
        // Get the correct index to access in the array of head images from the intent
        // Set the default value to 0
        int headIndex = getIntent().getIntExtra("headIndex", 0);
        headFragment.setListIndex(headIndex);

        BodyPartFragment bodyFragment = new BodyPartFragment();

        bodyFragment.setImageIds(AndroidImageAssets.getBodies());
        int bodyIndex = getIntent().getIntExtra("bodyIndex", 0);
        bodyFragment.setListIndex(bodyIndex);

        BodyPartFragment legFragment = new BodyPartFragment();

        legFragment.setImageIds(AndroidImageAssets.getLegs());
        int legIndex = getIntent().getIntExtra("legIndex", 0);
        legFragment.setListIndex(legIndex);


        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.head_container, headFragment)
                .commit();

        fragmentManager.beginTransaction()
                .add(R.id.body_container, bodyFragment)
                .commit();

        fragmentManager.beginTransaction()
                .add(R.id.leg_container, legFragment)
                .commit();

        }
    }
}