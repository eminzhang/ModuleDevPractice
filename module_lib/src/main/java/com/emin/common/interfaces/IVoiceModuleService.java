package com.emin.common.interfaces;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * Created by eminzhang    2018/6/1
 */
public interface IVoiceModuleService extends IProvider{
    String getSpeakText();
}
