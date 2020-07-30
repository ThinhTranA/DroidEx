package com.visualsharp.androidme.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.visualsharp.androidme.R;
import com.visualsharp.androidme.data.AndroidImageAssets;


public class MasterListFragment extends Fragment {



    public MasterListFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);
        GridView gridView = (GridView) rootView.findViewById(R.id.images_grid_view);

        MasterListAdapter mAdapter = new MasterListAdapter(getContext(), AndroidImageAssets.getAll());

        gridView.setAdapter(mAdapter);

        return rootView;
    }
}