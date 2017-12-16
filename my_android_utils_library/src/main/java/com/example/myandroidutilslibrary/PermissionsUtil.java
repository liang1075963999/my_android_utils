package com.example.myandroidutilslibrary;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

/**
 * Created by liang on 2017/12/10.
 */

public class PermissionsUtil {
    public static void applyPermissions(Context context,String permission){//参数permission：Manifest.permission.CALL_PHONE
        if(ContextCompat.checkSelfPermission(context, permission)!= PackageManager.PERMISSION_GRANTED)//checkSelfPermission返回的结果如果是0表示同意，1表示禁止
        {
            ActivityCompat.requestPermissions((Activity) context,new String[]{permission},1);//当调用requestPermissions时，系统会自动创建一个对话框
        }else {

        }
    }
}
