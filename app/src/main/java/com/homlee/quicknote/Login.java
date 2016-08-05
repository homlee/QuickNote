package com.homlee.quicknote;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by homlee on 7/25/2016.
 */
public class Login extends Activity  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void onResume(){
        super.onResume();

    }
}
