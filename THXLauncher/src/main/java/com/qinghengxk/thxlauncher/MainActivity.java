package com.qinghengxk.thxlauncher;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    //右侧菜单即功能awa
    //跳转游戏
    public void games(View view) {
        startActivity(new Intent(this, GamesActivity.class));
    }
    //跳转下载
    public void download(View view) {
        startActivity(new Intent(this, DownloadActivity.class));
    }
    //跳转设置
    public void setting(View view) {
        startActivity(new Intent(this, SetActivity.class));
    }
    //跳转关于
    public void about(View view) {
        startActivity(new Intent(this, AboutActivity.class));
    }



    //左侧账户添加和查看/删除
    //添加
    @SuppressLint("InflateParams")
    public void account_add(View view) {

        View dialogView = getLayoutInflater().inflate(R.layout.account_add, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("新建账户")
                .setView(dialogView)
                .create()
                .show();
    }
    //查看和删除
    @SuppressLint("InflateParams")
    public void choose_account(View view) {

        View dialogView =  getLayoutInflater().inflate(R.layout.choose_account, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("选择账户/删除")
                .setView(dialogView)
                .create()
                .show();
    }
}