package com.example.liang.android_utils.string;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.liang.android_utils.R;
import com.example.myandroidutilslibrary.StringUtils;

/**
 * Created by liang on 2017/12/18.
 */

public class Second extends AppCompatActivity {
    private TextView textView;
    private StringBuffer stringBuffer;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second5);
        textView= (TextView) findViewById(R.id.textView);
        stringBuffer=new StringBuffer();
        stringBuffer.append("单个汉字转成ASCII码:"+ StringUtils.oneCn2ASCII("梁")+"\n");
        stringBuffer.append("单个汉字转成拼音:"+ StringUtils.oneCn2PY("梁")+"\n");
        stringBuffer.append("获得第一个汉字首字母:"+ StringUtils.getPYFirstLetter("梁")+"\n");
        stringBuffer.append("中文转拼音:"+ StringUtils.cn2PY("梁晓强")+"\n");
        textView.setText(stringBuffer);
    }
}
