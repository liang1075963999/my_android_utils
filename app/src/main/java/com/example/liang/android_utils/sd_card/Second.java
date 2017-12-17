package com.example.liang.android_utils.sd_card;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.liang.android_utils.R;
import com.example.myandroidutilslibrary.SDCardUtils;

/**
 * Created by liang on 2017/12/17.
 */

public class Second extends AppCompatActivity implements View.OnClickListener{
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second4);
        button= (Button) findViewById(R.id.button);
        button1= (Button) findViewById(R.id.button1);
        button2= (Button) findViewById(R.id.button2);
        button3= (Button) findViewById(R.id.button3);
        button4= (Button) findViewById(R.id.button4);
        button5= (Button) findViewById(R.id.button5);
        button6= (Button) findViewById(R.id.button6);
        button7= (Button) findViewById(R.id.button7);
        button8= (Button) findViewById(R.id.button8);
        button9= (Button) findViewById(R.id.button9);
        button10= (Button) findViewById(R.id.button10);
        button11= (Button) findViewById(R.id.button11);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                boolean b= SDCardUtils.isMounted();
                Toast.makeText(this, "b:" + b, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button1:
                String s=SDCardUtils.getSDPath();
                Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                String s1=SDCardUtils.getSDCardPath();
                Toast.makeText(this, s1, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                String s2=SDCardUtils.getSDTotalSize(getApplicationContext());
                Toast.makeText(this, s2, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                String s3=SDCardUtils.getSDAvailableSize(getApplicationContext());
                Toast.makeText(this, s3, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                String s4=SDCardUtils.getRomTotalSize(getApplicationContext());
                Toast.makeText(this, s4, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                String s5=SDCardUtils.getRomAvailableSize(getApplicationContext());
                Toast.makeText(this, s5, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button7:
                String s6=SDCardUtils.getSDCardAllSize(getApplicationContext());
                Toast.makeText(this, s6, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button8:
                String s7=SDCardUtils.getSDCardBaseDir();
                Toast.makeText(this, s7, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button9:
                boolean s8=SDCardUtils.saveFileIntoSDCard(new byte[]{1,2,3,4,5},"","新字节文件");
                Toast.makeText(this, s8+"", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button10:
                byte[] s9=SDCardUtils.getFileFromSDCard("/storage/emulated/0/perflog.txt");
                Toast.makeText(this, new String(s9), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button11:
                String s10=SDCardUtils.getMemoryInfo(getBaseContext());
                Toast.makeText(this,s10, Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
