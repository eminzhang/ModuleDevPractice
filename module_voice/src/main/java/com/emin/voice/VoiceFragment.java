package com.emin.voice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by eminzhang    2018/5/28
 */
public class VoiceFragment extends Fragment {

    public VoiceFragment() {
        // Required empty public constructor
    }

    public static VoiceFragment newInstance() {
        VoiceFragment fragment = new VoiceFragment();
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
        return inflater.inflate(R.layout.fragment_voice, container, false);
    }

}
