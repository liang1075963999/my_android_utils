package com.example.liang.android_utils.riqi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.liang.android_utils.R;
import com.example.myandroidutilslibrary.DateUtil;

/**
 * Created by liang on 2017/12/17.
 */

public class Second extends AppCompatActivity {
    private TextView textView;
    private StringBuilder stringBuilder;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second2);
        textView= (TextView) findViewById(R.id.textView);
        stringBuilder=new StringBuilder();
        stringBuilder.append("获取当前日期:"+ DateUtil.getCurrentDate()+"\n");
        stringBuilder.append("获取明天的日期:"+ DateUtil.getTomorrowDate()+"\n");
        stringBuilder.append("获取当前日期字符串:"+ DateUtil.getCurrentDateString()+"\n");
        stringBuilder.append("获取当前年:"+ DateUtil.getCurrentYear()+"\n");
        stringBuilder.append("获取当前月:"+ DateUtil.getCurrentMonth()+"\n");
        stringBuilder.append("获取当前日:"+ DateUtil.getCurrentDay()+"\n");
        Log.i("xinxi",stringBuilder.toString());
        /*输出结果为：
        获取当前日期:20171217
        获取明天的日期:20171218
        获取当前日期字符串:2017年12月17日
        获取当前年:2017
        获取当前月:11
        获取当前日:17*/
        textView.setText(stringBuilder);
    }
}
