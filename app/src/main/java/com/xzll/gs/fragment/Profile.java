package com.xzll.gs.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xzll.gs.R;

/**
 * 我的碎片
 */

public class Profile extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view  = LayoutInflater.from(getActivity()).inflate(R.layout.profile_fragment,null);
        return view;
    }
}
