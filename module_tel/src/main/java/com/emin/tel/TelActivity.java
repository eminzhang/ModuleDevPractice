package com.emin.tel;

import android.os.Bundle;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.emin.common.base.BaseActivity;
import com.emin.common.utils.RouterUtils;
/**
 * Created by eminzhang    2018/5/29
 */

@Route(path = RouterUtils.TEL_PAGE)
public class TelActivity extends BaseActivity {

    private TelFragment mTelFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void loadChildrenFragment() {
        mTelFragment = TelFragment.newInstance();
        addFragment(mTelFragment,TelFragment.class.toString());
    }

    @Override
    protected void onResume() {
        super.onResume();
        setTabIndex(BaseActivity.TEL_ID);
    }
}
