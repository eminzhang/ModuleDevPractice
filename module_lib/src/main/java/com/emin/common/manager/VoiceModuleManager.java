package com.emin.common.manager;

import com.alibaba.android.arouter.launcher.ARouter;
import com.emin.common.interfaces.IVoiceModuleService;

/**
 * Created by eminzhang    2018/6/1
 */
public class VoiceModuleManager {
    public static String getSpeakText(){
        IVoiceModuleService iVoiceModuleService = ARouter.getInstance().navigation(IVoiceModuleService.class);
        if(iVoiceModuleService != null){
            return iVoiceModuleService.getSpeakText();
        }
        return "";
    }
}
