package com.visualsharp.androidme.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.visualsharp.androidme.R;
import com.visualsharp.androidme.data.AndroidImageAssets;

public class BodyPartFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

        imageView.setImageResource(AndroidImageAssets.getHeads().get(0));

        return rootView;
    }
}