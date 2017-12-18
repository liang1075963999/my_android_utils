package com.example.liang.android_utils.system;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.liang.android_utils.R;
import com.example.myandroidutilslibrary.SystemUtil;

/**
 * Created by liang on 2017/12/18.
 */

public class Second extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second6);
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                boolean b=SystemUtil.isWifiConnected(getApplication());
                Toast.makeText(this, "b:" + b, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button1:
                boolean b1=SystemUtil.isMobileNetworkConnected(getApplication());
                Toast.makeText(this, "b1:" + b1, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                boolean b2=SystemUtil.isNetworkConnected(getApplication());
                Toast.makeText(this, "b2:" + b2, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                SystemUtil.copyToClipBoard(Second.this,"保存文字到剪贴了，哈哈哈哈哈哈");
                break;
            default:
                break;
        }
    }
}
