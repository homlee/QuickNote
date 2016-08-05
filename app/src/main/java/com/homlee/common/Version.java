package com.homlee.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import com.homlee.utils.StringHelper;

/**
 * Created by homlee on 8/3/2016.
 */
public class Version {


    private  int mCode;
    private  String mName;
    private  String mDescription;
    private int ignoreCode;

    private Context mContext;

    public Version(Context appContext)
    {
         this.mContext = appContext;
        try {
            PackageInfo packInfo = appContext.getPackageManager().getPackageInfo(
                    appContext.getPackageName(), 0);
            mCode = packInfo.versionCode;
            mName = packInfo.versionName;
            if(!StringHelper.isNullOrEmpty(mName) && !mName.startsWith("V") && !mName.startsWith("v")){
                mName = "V" + mName;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("DeBugInfo", e.getMessage());
        }
    }

    public String getName() {
        return mName;
    }

    public int getCode() {
        return mCode;
    }

}


