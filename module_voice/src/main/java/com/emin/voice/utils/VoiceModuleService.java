package com.emin.voice.utils;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.emin.common.base.BaseApplication;
import com.emin.common.interfaces.IVoiceModuleService;
import com.emin.common.utils.RouterUtils;

/**
 * Created by eminzhang    2018/6/1
 */
@Route(path = RouterUtils.VOICE_START_SPEAK)
public class VoiceModuleService implements IVoiceModuleService {
    @Override
    public String getSpeakText() {
        return "Hello world";
    }

    @Override
    public void init(Context context) {}
}
