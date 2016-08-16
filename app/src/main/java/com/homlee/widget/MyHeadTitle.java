package com.homlee.widget;

/**
 * Created by homlee on 8/9/2016.
 */

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;


public class MyHeadTitle extends FrameLayout {

    private int mStyle = -1;

    public MyHeadTitle(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyHeadTitle(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.init(attrs);
    }

    private void init(AttributeSet attrs) {
        try {

        } catch (Throwable e) {
            // Log.e("MyHeadTitle", "", e);
            e.printStackTrace();
        }
    }
}

