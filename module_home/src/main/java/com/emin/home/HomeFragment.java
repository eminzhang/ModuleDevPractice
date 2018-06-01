package com.emin.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.emin.common.manager.VoiceModuleManager;

/**
 * Created by eminzhang    2018/5/28
 */
public class HomeFragment extends Fragment {

    private Button mButton;

    public HomeFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
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
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        mButton = (Button)view.findViewById(R.id.btn_invoke);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //这里调用了语音模块的接口，实现了跨模块间接口调用，module_lib模块中提供接口，相应的模块实现该接口
                mButton.setText(VoiceModuleManager.getSpeakText());
            }
        });
    }

}
