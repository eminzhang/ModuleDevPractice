package com.emin.common.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.alibaba.android.arouter.launcher.ARouter;
import com.emin.common.R;
import com.emin.common.utils.RouterUtils;

/**
 * Created by eminzhang    2018/5/28
 */
public abstract class BaseActivity extends AppCompatActivity{
    private String TAG = "BaseActivity";
    private RadioGroup mRgTab;
    private RadioButton mRbMedia;
    private RadioButton mRbVoice;
    private RadioButton mRbTel;
    private RadioButton mRbExt;

    public static final int MEDIA_ID = 1;
    public static final int VOICE_ID = 2;
    public static final int TEL_ID = 3;
    public static final int EXT_ID = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        initViews();
    }

    public void initViews(){
        mRgTab = findViewById(R.id.rg_tab);
        mRbMedia = findViewById(R.id.rb_home);
        mRbVoice = findViewById(R.id.rb_voice);
        mRbTel = findViewById(R.id.rb_tel);
        mRbExt = findViewById(R.id.rb_ext);
        mRgTab.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Log.d(TAG,"onCheckedChanged : id " +  checkedId);
                switchTab(checkedId);
            }
        });
        //switchTab(R.id.rb_home);
        loadChildrenFragment();
    }

    public void setTabIndex(int tabIndex){
        switch (tabIndex){
            case MEDIA_ID:
                mRbMedia.setChecked(true);
                Log.d(TAG,"mRbMedia");
                break;
            case VOICE_ID:
                mRbVoice.setChecked(true);
                Log.d(TAG,"mRbVoice");
                break;
            case TEL_ID:
                mRbTel.setChecked(true);
                Log.d(TAG,"mRbTel");
                break;
            case EXT_ID:
                mRbExt.setChecked(true);
                Log.d(TAG,"mRbExt");
                break;
            default:break;
        }
    }

    public void switchTab(int checkedId){
        if (checkedId == R.id.rb_home) {
            ARouter.getInstance().build(RouterUtils.HOME_PAGE).navigation();
        }else if(checkedId == R.id.rb_voice){
            ARouter.getInstance().build(RouterUtils.VOICE_PAGE).navigation();
        }else if(checkedId == R.id.rb_tel){
            ARouter.getInstance().build(RouterUtils.TEL_PAGE).navigation();
        }else if(checkedId == R.id.rb_ext){
            ARouter.getInstance().build(RouterUtils.EXT_PAGE).navigation();
        }
    }

    //子类实现
    protected void loadChildrenFragment(){}

    public void addFragment(Fragment fragment, String tag) {
        FragmentManager fm = getSupportFragmentManager();
        Fragment fg = fm.findFragmentByTag(tag);
        if (fg != null) {
            Log.d(TAG, "addFragment: " + fragment + " replace fg: " + fg);
            fm.beginTransaction().replace(R.id.ll_main, fragment, tag).commit();
        } else {
            Log.d(TAG, "addFragment: " + fragment);
            fm.beginTransaction().add(R.id.ll_main, fragment, tag).commit();
        }
    }
}
