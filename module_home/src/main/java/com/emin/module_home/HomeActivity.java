package com.emin.module_home;

import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.emin.common.base.BaseActivity;
import com.emin.common.utils.RouterUtils;

/**
 * Created by eminzhang    2018/5/28
 */
@Route(path = RouterUtils.HOME_PAGE)
public class HomeActivity extends BaseActivity{

    private HomeFragment mHomeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void loadChildrenFragment() {
        mHomeFragment = HomeFragment.newInstance();
        addFragment(mHomeFragment,HomeFragment.class.toString());
    }

    @Override
    protected void onResume() {
        super.onResume();
        setTabIndex(BaseActivity.MEDIA_ID);
    }
}
