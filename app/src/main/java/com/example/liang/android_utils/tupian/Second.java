package com.example.liang.android_utils.tupian;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.liang.android_utils.R;
import com.example.myandroidutilslibrary.utils.ImageUtils;
import com.example.myandroidutilslibrary.utils.SDCardUtils;

/**
 * Created by liang on 2017/12/16.
 */

public class Second extends AppCompatActivity {
    private ImageView imageView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second1);
        imageView = (ImageView) findViewById(R.id.imageview);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        final boolean t = ImageUtils.save(ImageUtils.toRound(BitmapFactory.decodeResource(getResources(), R.drawable.beijngpng)), SDCardUtils.getSDPath() + "/tu.png"
                                , Bitmap.CompressFormat.PNG);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(Second.this, "t:" + t, Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }).start();
            }
        });

        /************关于图片的相关操作*************/
        imageView.setImageBitmap(ImageUtils.toRound(BitmapFactory.decodeResource(getResources(), R.drawable.beijngpng)));
        // 将图片变成圆形
        //imageView.setImageBitmap(ImageUtils.toRoundCorner(BitmapFactory.decodeResource(getResources(),R.drawable.beijngpng),60f));
        // 将图片的四个角变成圆形，即圆角矩形
        //imageView.setImageBitmap(ImageUtils.addReflection(BitmapFactory.decodeResource(getResources(),R.drawable.beijngpng),200));
        // 在图片的底部添加倒影
        //imageView.setImageBitmap(ImageUtils.fastBlur(MainActivity.this,BitmapFactory.decodeResource(getResources(),R.drawable.
        // beijngpng),0.6f,60f));将图片模糊
        //imageView.setImageBitmap(ImageUtils.addFrame(ImageUtils.fastBlur(MainActivity.this, BitmapFactory.decodeResource(
        // getResources(),R.drawable.beijngpng),0.6f,60f),30, Color.GREEN));//给图片加个边框
        //imageView.setImageBitmap(ImageUtils.addTextWatermark(BitmapFactory.decodeResource(getResources(),R.drawable.beijngpng),
        // "我出品",100,Color.RED,333,88));//给图片加水印,可以通过addImageWatermark给图片添加图片水印
        //imageView.setImageBitmap(ImageUtils.toAlpha(BitmapFactory.decodeResource(getResources(),R.drawable.beijngpng)));//图片变成黑色的了
        //imageView.setImageBitmap(ImageUtils.toGray(BitmapFactory.decodeResource(getResources(),R.drawable.beijngpng)));//图片变成灰色的了
        //imageView.setImageBitmap(ImageUtils.compressBySampleSize(BitmapFactory.decodeResource(getResources(),R.drawable.beijngpng),2));//图片压缩

        //BarUtil.setColor(MainActivity.this, Color.GREEN);//改变状态栏的颜色
        //BarUtil.setTranslucent(MainActivity.this);//适用于图片作为背景的界面,此时需要图片填充到状态栏
    }
}
