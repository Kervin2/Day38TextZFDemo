package com.panfengyu.day38textzfdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alipay.sdk.pay.demo.PayDemoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void MyClick(View view) {
        //

        Intent intent = new Intent(MainActivity.this, PayDemoActivity.class);
        intent.putExtra("name","羊肉串");
        intent.putExtra("price","0.01");
       startActivity(intent);
        finish();
    }
}
