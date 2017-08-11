package com.zhuoxin.zhang.jnidemo;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("demo");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public native String getStrFromJNI();
    public void callCMethod(View v){
        String mStrFromJNI = getStrFromJNI();
        Toast.makeText(this,mStrFromJNI,Toast.LENGTH_SHORT).show();
    }
}
