package com.emin.tel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by eminzhang    2018/5/29
 */

public class TelFragment extends Fragment {

    public TelFragment() {
        // Required empty public constructor
    }

    public static TelFragment newInstance() {
        TelFragment fragment = new TelFragment();
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
        return inflater.inflate(R.layout.fragment_tel, container, false);
    }

}
