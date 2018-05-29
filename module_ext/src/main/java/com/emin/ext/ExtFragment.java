package com.emin.ext;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by eminzhang    2018/5/29
 */

public class ExtFragment extends Fragment {
    public ExtFragment() {
        // Required empty public constructor
    }
    public static ExtFragment newInstance() {
        ExtFragment fragment = new ExtFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ext, container, false);
    }

}
