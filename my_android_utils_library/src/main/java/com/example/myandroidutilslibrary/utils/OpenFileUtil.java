package com.example.myandroidutilslibrary.utils;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by liang on 2017/12/10.
 */

public class OpenFileUtil {
    /**
     * 打开手机的文件管理器
     * @param activity
     */
    public static void openFile(Activity activity){
        openFile(activity,"*/*");
    }

    /**
     * 根据特殊的要求打开文件管理器，如只显示图片
     * @param activity
     * @param leixing  如video/*,audio/*,file/*等
     */
    public static void openFile(Activity activity,String leixing){//参数leixing：如*/*,video/*,audio/*,file/*等
        Intent intent=new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType(leixing);
        intent.addCategory(intent.CATEGORY_OPENABLE);
        activity.startActivityForResult(intent, 1);
    }
}
