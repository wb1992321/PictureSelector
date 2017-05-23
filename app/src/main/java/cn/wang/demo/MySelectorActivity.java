package cn.wang.demo;

import cn.wang.img.selector.activitys.SelecPictureActivity;
import cn.wang.img.selector.adapters.BaseSelectPictureAdapter;
import cn.wang.img.selector.adapters.SelectPictureAdapter;

/**
 * author : wangshuai Created on 2017/5/23
 * email : wangs1992321@gmail.com
 */
public class MySelectorActivity extends SelecPictureActivity {


    @Override
    protected BaseSelectPictureAdapter getAdapter() {
        return new SelectPictureAdapter(this,maxSize);
    }
}
