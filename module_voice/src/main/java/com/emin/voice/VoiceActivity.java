package com.emin.voice;

import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.emin.common.base.BaseActivity;
import com.emin.common.utils.RouterUtils;
/**
 * Created by eminzhang    2018/5/28
 */
@Route(path = RouterUtils.VOICE_PAGE)
public class VoiceActivity extends BaseActivity {

    private VoiceFragment mVoiceFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void loadChildrenFragment() {
        mVoiceFragment = VoiceFragment.newInstance();
        addFragment(mVoiceFragment,VoiceFragment.class.toString());
    }

    @Override
    protected void onResume() {
        super.onResume();
        setTabIndex(BaseActivity.VOICE_ID);
    }
}
