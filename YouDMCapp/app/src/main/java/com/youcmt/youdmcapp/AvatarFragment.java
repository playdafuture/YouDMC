package com.youcmt.youdmcapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Stanislav Ostrovskii on 11/22/2018.
 * Copyright 2018 youcmt.com team. All rights reserved.
 */
public class AvatarFragment extends Fragment {
    private ImageView mAvatarNone;
    private ImageView mAvatarOne;
    private ImageView mAvatarTwo;
    private ImageView mAvatarThree;
    private ImageView mAvatarFour;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_avatar, container, false);
        mAvatarNone = view.findViewById(R.id.avatar_none);
        mAvatarNone = view.findViewById(R.id.avatar_none);
        mAvatarNone = view.findViewById(R.id.avatar_none);
        mAvatarNone = view.findViewById(R.id.avatar_none);
        return view;
    }
}