package com.emin.common.base;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by eminzhang    2018/5/28
 */
public class BaseApplication extends Application {
    private static final boolean DEBUG = true;
    private static Context mContext;

    public static Context getAppContext(){
        return mContext;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        if (DEBUG) {
            //开启InstantRun之后，一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
        mContext = getAppContext();
    }
}
