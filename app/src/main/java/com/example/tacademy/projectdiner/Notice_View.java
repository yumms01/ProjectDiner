package com.example.tacademy.projectdiner;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tacademy on 2016-02-22.
 */
public class Notice_View extends FrameLayout {

    public Notice_View(Context context) {
        super(context);
        init();
    }

    ImageView iconView;
    TextView nameView;
    Notice_Item notice;

    public interface OnImageClickListener {
        public void onImageClick(Notice_View view, Notice_Item notice);
    }

    OnImageClickListener mImageClickListener;

    public void setOnImageClickListener(OnImageClickListener listener) {
        mImageClickListener = listener;
    }



    private void init() {
        inflate(getContext(), R.layout.view_main_notice, this);
        iconView = (ImageView)findViewById(R.id.image_icon);
        nameView = (TextView)findViewById(R.id.text_name);

        iconView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mImageClickListener != null) {
                    mImageClickListener.onImageClick(Notice_View.this, notice);
                }
            }
        });
    }

    public void setData(Notice_Item n) {
        notice = n;
        if (n.getIcon() != null) {
            iconView.setImageDrawable(n.getIcon());
        } else {
            iconView.setImageResource(R.mipmap.ic_launcher);
        }
        nameView.setText(n.getName());
    }

}
