package com.ashish.dev.safetyapp0228b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class form2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_form2);
    }
}
