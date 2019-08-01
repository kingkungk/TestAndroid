package com.kingkung.testandroid;

import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvTest = findViewById(R.id.tv_test);
//        tvTest.setBackgroundDrawable(getResources().getDrawable(R.drawable.bg_panel_btn));

        ImageView ivTest = findViewById(R.id.iv_test);
        BitmapDrawable drawable = (BitmapDrawable) getResources().getDrawable(R.mipmap.ic_hongbao);
        ivTest.setImageDrawable(new TestDrawable(drawable.getBitmap()));
    }
}
