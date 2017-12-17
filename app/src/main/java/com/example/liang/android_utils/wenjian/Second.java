package com.example.liang.android_utils.wenjian;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.liang.android_utils.R;
import com.example.myandroidutilslibrary.ConvertUtils;
import com.example.myandroidutilslibrary.FileUtils;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

/**
 * Created by liang on 2017/12/17.
 */

public class Second extends AppCompatActivity implements View.OnClickListener {
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
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;
    private Button button19;
    private Button button20;
    private Button button21;
    private Button button22;
    private Button button23;
    private Button button24;
    private Button button25;
    private Button button26;
    private Button button27;
    private Button button28;
    private Button button29;
    private Button button30;
    private Button button31;
    private Button button32;
    private Button button33;
    private Button button34;
    private Button button35;
    private Button button36;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second3);
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        button23 = (Button) findViewById(R.id.button23);
        button24 = (Button) findViewById(R.id.button24);
        button25 = (Button) findViewById(R.id.button25);
        button26 = (Button) findViewById(R.id.button26);
        button27 = (Button) findViewById(R.id.button27);
        button28 = (Button) findViewById(R.id.button28);
        button29 = (Button) findViewById(R.id.button29);
        button30 = (Button) findViewById(R.id.button30);
        button31 = (Button) findViewById(R.id.button31);
        button32 = (Button) findViewById(R.id.button32);
        button33 = (Button) findViewById(R.id.button33);
        button34 = (Button) findViewById(R.id.button34);
        button35 = (Button) findViewById(R.id.button35);
        button36 = (Button) findViewById(R.id.button36);
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
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);
        button25.setOnClickListener(this);
        button26.setOnClickListener(this);
        button27.setOnClickListener(this);
        button28.setOnClickListener(this);
        button29.setOnClickListener(this);
        button30.setOnClickListener(this);
        button31.setOnClickListener(this);
        button32.setOnClickListener(this);
        button33.setOnClickListener(this);
        button34.setOnClickListener(this);
        button35.setOnClickListener(this);
        button36.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                File file = FileUtils.getFileByPath("/storage/emulated/0/1.mp3");
                Toast.makeText(this, "file:" + file.length(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button1:
                Toast.makeText(this, "file:" + FileUtils.isFileExists("/storage/emulated/0/1.mp3"), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                boolean b = FileUtils.rename("/storage/emulated/0/1.mp3", "2.mp3");
                Toast.makeText(this, "b:" + b, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                boolean b1 = FileUtils.isDir("/storage/emulated/0");
                Toast.makeText(this, "b1:" + b1, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                boolean b2 = FileUtils.isFile("/storage/emulated/0/1.mp3");
                Toast.makeText(this, "b2:" + b2, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                boolean b3 = FileUtils.createOrExistsDir("/storage/emulated/0/好好学习");
                Toast.makeText(this, "b3:" + b3, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:
                boolean b4 = FileUtils.createOrExistsFile("/storage/emulated/0/好好学习.txt");
                Toast.makeText(this, "b4:" + b4, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button7:
                boolean b5 = FileUtils.createFileByDeleteOldFile("/storage/emulated/0/好好学习.txt");
                Toast.makeText(this, "b5:" + b5, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button8:
                boolean b6 = FileUtils.copyOrMoveDir("/storage/emulated/0/好好学习", "/storage/emulated/0/1/好好学习", true);
                Toast.makeText(this, "b6:" + b6, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button9:
                boolean b7 = FileUtils.copyOrMoveFile("/storage/emulated/0/好好学习.txt", "/storage/emulated/0/1/好好学习.txt", true);
                Toast.makeText(this, "b7:" + b7, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button10:
                boolean b8 = FileUtils.copyDir("/storage/emulated/0/1/好好学习", "/storage/emulated/0/好好学习");
                Toast.makeText(this, "b8:" + b8, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button11:
                boolean b9 = FileUtils.copyFile("/storage/emulated/0/1/好好学习.txt", "/storage/emulated/0/好好学习.txt");
                Toast.makeText(this, "b9:" + b9, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button12:
                boolean b10 = FileUtils.moveDir("/storage/emulated/0/1/好好学习", "/storage/emulated/0/好好学习");
                Toast.makeText(this, "b10:" + b10, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button13:
                boolean b11 = FileUtils.moveFile("/storage/emulated/0/1/好好学习.txt", "/storage/emulated/0/好好学习.txt");
                Toast.makeText(this, "b11:" + b11, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button14:
                boolean b12 = FileUtils.deleteDir("/storage/emulated/0/好好学习");
                Toast.makeText(this, "b12:" + b12, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button15:
                boolean b13 = FileUtils.deleteFile("/storage/emulated/0/好好学习.txt");
                Toast.makeText(this, "b13:" + b13, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button16:
                boolean b14 = FileUtils.deleteFilesInDir("/storage/emulated/0/好好学习");
                Toast.makeText(this, "b14:" + b14, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button17:
                List<File> b15 = FileUtils.listFilesInDir("/storage/emulated/0/好好学习", false);
                Toast.makeText(this, "b15:" + b15.size(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button18:
                List<File> b16 = FileUtils.listFilesInDir("/storage/emulated/0/好好学习", true);
                Toast.makeText(this, "b16:" + b16.size(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button19:
                List<File> b17 = FileUtils.listFilesInDirWithFilter("/storage/emulated/0", ".txt", false);
                Toast.makeText(this, "b17:" + b17.size(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button20:
                List<File> b18 = FileUtils.listFilesInDirWithFilter("/storage/emulated/0", ".txt");
                Toast.makeText(this, "b18:" + b18.size(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button21:
                List<File> b19 = FileUtils.listFilesInDirWithFilter("/storage/emulated/0", new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        Log.i("liu",dir+","+name);
                        if(name.equals("python心得.txt")){
                            return true;
                        }
                        return false;
                    }
                }, false);
                Toast.makeText(this, "b19:" + b19.size(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button22:
                List<File> b20 = FileUtils.listFilesInDirWithFilter("/storage/emulated/0", new FilenameFilter() {//这里是通过接口回调的
                    // 方式来进行的数据的传递
                    @Override
                    public boolean accept(File dir, String name) {
                        Log.i("mulu",dir+","+name);
                        if (dir.toString().equals("/storage/emulated/0/.data/user/0/com.yinhan.hunter.uc/assets/UI_files/NoneAttrPvP")) {
                            return true;
                        }
                        return false;
                    }
                });
                Toast.makeText(this, "b20:" + b20.size(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button23:
                List<File> b21 = FileUtils.searchFileInDir("/storage/emulated/0", "好好学习.txt");
                Toast.makeText(this, "b21:" + b21.size(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button24:
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        final boolean b22 = FileUtils.writeFileFromIS("/storage/emulated/0/好好学习.txt",
                                ConvertUtils.string2InputStream("好好学习大学知识","UTF-8"), true);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(Second.this, "b22:" + b22 + "", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }).start();
                break;
            case R.id.button25:
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        final boolean b23 = FileUtils.writeFileFromString("/storage/emulated/0/好好学习.txt", "tiantianxiangshang", true);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(Second.this, "b23:" + b23 + "", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                }).start();
                break;
            case R.id.button26:
                List<String> b24 = FileUtils.readFile2List("/storage/emulated/0/好好学习.txt", "UTF-8");
                Toast.makeText(this, "b24:" + b24.size(), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button27:
                String b25 = FileUtils.readFile2String("/storage/emulated/0/好好学习.txt", "UTF-8");
                Toast.makeText(this, "b25:" + b25, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button28:
                byte[] b26 = FileUtils.readFile2Bytes("/storage/emulated/0/好好学习.txt");
                Toast.makeText(this, "b26:" + new String(b26), Toast.LENGTH_SHORT).show();
                break;
            case R.id.button29:
                String b27 = FileUtils.getFileCharsetSimple("/storage/emulated/0/好好学习.txt");
                Toast.makeText(this, "b27:" + b27, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button30:
                int b28 = FileUtils.getFileLines("/storage/emulated/0/好好学习.txt");
                Toast.makeText(this, "b28:" + b28, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button31:
                String b29 = FileUtils.getFileSize("/storage/emulated/0/好好学习.txt");
                Toast.makeText(this, "b29:" + b29, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button32:
                String b30 = FileUtils.getFileMD5ToString("/storage/emulated/0/好好学习.txt");
                Toast.makeText(this, "b30:" + b30, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button33:
                String b31 = FileUtils.getDirName("/storage/emulated/0");
                Toast.makeText(this, "b31:" + b31, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button34:
                String b32 = FileUtils.getFileName("/storage/emulated/0/好好学习.txt");
                Toast.makeText(this, "b32:" + b32, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button35:
                String b33 = FileUtils.getFileNameNoExtension("/storage/emulated/0/好好学习.txt");
                Toast.makeText(this, "b33:" + b33, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button36:
                String b34 = FileUtils.getFileExtension("/storage/emulated/0/好好学习.txt");
                Toast.makeText(this, "b34:" + b34, Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
