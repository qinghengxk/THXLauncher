package com.qinghengxk.thxlauncher;

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

    public void add_account(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("新建账户")
                .create()
                .show();
    }
}