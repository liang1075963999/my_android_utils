package com.example.liang.android_utils;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.liang.android_utils.tupian.Second;
import com.example.myandroidutilslibrary.PermissionsUtil;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button tuPian;
    private Button dongHua;
    private Button riQi;
    private Button wenJian;
    private Button sd;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PermissionsUtil.applyPermissions(MainActivity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        tuPian= (Button) findViewById(R.id.button2);
        dongHua= (Button) findViewById(R.id.button3);
        riQi= (Button) findViewById(R.id.button4);
        wenJian= (Button) findViewById(R.id.button5);
        sd= (Button) findViewById(R.id.button6);
        tuPian.setOnClickListener(this);
        dongHua.setOnClickListener(this);
        riQi.setOnClickListener(this);
        wenJian.setOnClickListener(this);
        sd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                intent=new Intent(MainActivity.this, Second.class);
                startActivity(intent);
                break;
            case R.id.button3:
                intent=new Intent(MainActivity.this, com.example.liang.android_utils.donghua.Second.class);
                startActivity(intent);
                break;
            case R.id.button4:
                intent=new Intent(MainActivity.this, com.example.liang.android_utils.riqi.Second.class);
                startActivity(intent);
                break;
            case R.id.button5:
                intent=new Intent(MainActivity.this, com.example.liang.android_utils.wenjian.Second.class);
                startActivity(intent);
                break;
            case R.id.button6:
                intent=new Intent(MainActivity.this, com.example.liang.android_utils.sd_card.Second.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
