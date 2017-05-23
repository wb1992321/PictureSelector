package cn.wang.img.selector.adapters;

import android.content.Context;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import cn.wang.adapter.bases.BaseAdapter;
import cn.wang.adapter.bases.ViewHolder;
import cn.wang.img.selector.R;
import cn.wang.img.selector.Utils.DateUtils;
import cn.wang.img.selector.Utils.ToastUtils;
import cn.wang.img.selector.db.PictureEvent;
import cn.wang.img.selector.models.DateModel;
import cn.wang.img.selector.models.PictureModel;
import cn.wang.img.selector.views.MyCheckTextView;
import cn.wang.img.selector.views.PictureStagger;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * author : wangshuai Created on 2017/5/16
 * email : wangs1992321@gmail.com
 */
public class SelectPictureAdapter extends BaseSelectPictureAdapter{


    public SelectPictureAdapter(Context context, int maxSize) {
        super(context, maxSize);
    }

    protected void picture(int position, View convertView) {
        ImageView ivImage = ViewHolder.getView(convertView, R.id.iv_image);
        CheckBox cbSel = ViewHolder.getView(convertView, R.id.cb_sel);
        View vChecked = ViewHolder.getView(convertView, R.id.v_checked);
        PictureModel model = (PictureModel) getItem(position);
        RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) convertView.getLayoutParams();
        if (params == null) {
            params = new RecyclerView.LayoutParams(paddingleft + imageSize, imageSize);
        }
        params.width = paddingleft + imageSize;
        params.height = imageSize;
        params.topMargin = paddingleft;
        convertView.setLayoutParams(params);

        if (TextUtils.isEmpty(model.getPhotoId())) {
            cbSel.setVisibility(View.GONE);
            vChecked.setVisibility(View.GONE);
            Glide.with(getContext())
                    .load(R.drawable.ic_photo_select_camera)
                    .crossFade()
                    .into(ivImage);
        } else {
            Glide.with(getContext())
                    .load(model.getLocalPath())
                    .crossFade(100).into(ivImage);
            cbSel.setOnCheckedChangeListener(null);
            cbSel.setTag(position);
            cbSel.setChecked(selPicIds.contains(model.getPhotoId()) || selDate.contains(model.getDayTime()));
            cbSel.setOnCheckedChangeListener(this);
            vChecked.setVisibility(cbSel.isChecked() ? View.VISIBLE : View.GONE);
        }
    }


}
