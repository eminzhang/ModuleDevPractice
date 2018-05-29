package com.emin.ext;

import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.emin.common.base.BaseActivity;
import com.emin.common.utils.RouterUtils;

/**
 * Created by eminzhang    2018/5/29
 */

@Route(path = RouterUtils.EXT_PAGE)
public class ExtActivity extends BaseActivity {

    private ExtFragment mExtFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void loadChildrenFragment() {
        mExtFragment = ExtFragment.newInstance();
        addFragment(mExtFragment,ExtFragment.class.toString());
    }

    @Override
    protected void onResume() {
        super.onResume();
        setTabIndex(BaseActivity.EXT_ID);
    }
}
