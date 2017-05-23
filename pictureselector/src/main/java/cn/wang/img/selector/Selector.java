package cn.wang.img.selector;

import android.content.Context;

import com.raizlabs.android.dbflow.config.FlowConfig;
import com.raizlabs.android.dbflow.config.FlowManager;

/**
 * author : wangshuai Created on 2017/5/23
 * email : wangs1992321@gmail.com
 */
public class Selector {

    public static void init(Context context){
        FlowManager.init(new FlowConfig.Builder(context.getApplicationContext()).build());
    }

}
