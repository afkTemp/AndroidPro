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
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("进行提示：");
        sBuilder.append(System.currentTimeMillis());

        Toast.makeText(MainActivity.this, sBuilder.toString(), Toast.LENGTH_LONG).show();
    }
}
