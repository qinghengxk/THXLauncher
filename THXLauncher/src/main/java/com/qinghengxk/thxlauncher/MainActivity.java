package com.qinghengxk.thxlauncher;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
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


    @SuppressLint("InflateParams")
    public void account_add(View view) {

        View dialogView = getLayoutInflater().inflate(R.layout.account_add, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("新建账户")
                .setView(dialogView)
                .create()
                .show();
    }

}