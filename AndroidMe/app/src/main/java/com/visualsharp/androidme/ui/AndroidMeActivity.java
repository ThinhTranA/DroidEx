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
        headFragment.setListIndex(1);

        BodyPartFragment bodyFragment = new BodyPartFragment();

        bodyFragment.setImageIds(AndroidImageAssets.getBodies());
        bodyFragment.setListIndex(1);

        BodyPartFragment legFragment = new BodyPartFragment();

        legFragment.setImageIds(AndroidImageAssets.getLegs());
        legFragment.setListIndex(1);


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