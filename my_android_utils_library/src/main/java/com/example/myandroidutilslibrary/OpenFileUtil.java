package com.example.myandroidutilslibrary;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by liang on 2017/12/10.
 */

public class OpenFileUtil {
    public static void openFile(Activity activity){
        Intent intent=new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("*/*");
        intent.addCategory(intent.CATEGORY_OPENABLE);
        activity.startActivityForResult(intent, 1);
    }
    public static void openFile(Activity activity,String leixing){//参数leixing：如*/*,video/*,audio/*,file/*等
        Intent intent=new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType(leixing);
        intent.addCategory(intent.CATEGORY_OPENABLE);
        activity.startActivityForResult(intent, 1);
    }
}
