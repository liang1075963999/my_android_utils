package com.example.liang.android_utils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.liang.android_utils.tupian.Second;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button tuPian;
    private Button dongHua;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tuPian= (Button) findViewById(R.id.button2);
        dongHua= (Button) findViewById(R.id.button3);
        tuPian.setOnClickListener(this);
        dongHua.setOnClickListener(this);
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
            default:
                break;
        }
    }
}
