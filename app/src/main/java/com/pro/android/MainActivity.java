package com.pro.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // --

        Toast.makeText(MainActivity.this, System.currentTimeMillis() + "", Toast.LENGTH_LONG).show();


        // 测试更新内容
        //

        // 测试提交内容
    }
}
