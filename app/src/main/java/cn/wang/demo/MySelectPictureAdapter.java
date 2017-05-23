package cn.wang.demo;

import android.content.Context;
import android.view.View;

import cn.wang.img.selector.adapters.BaseSelectPictureAdapter;

/**
 * author : wangshuai Created on 2017/5/23
 * email : wangs1992321@gmail.com
 */
public class MySelectPictureAdapter extends BaseSelectPictureAdapter {
    public MySelectPictureAdapter(Context context, int maxSize) {
        super(context, maxSize);
    }

    @Override
    protected void picture(int position, View convertView) {

    }
}
