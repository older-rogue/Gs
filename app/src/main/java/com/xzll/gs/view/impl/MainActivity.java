package com.xzll.gs.view.impl;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.xzll.gs.R;
import com.xzll.gs.view.IMainActivity;

public class MainActivity extends AppCompatActivity implements IMainActivity,RadioGroup.OnCheckedChangeListener{
    RadioGroup group;
    RadioButton button1;
    RadioButton button2;
    RadioButton button3;
    RadioButton button4;
    RadioButton button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();
        init();
        setlistener();
    }

    private void init() {
        button1.setChecked(true);
        Drawable drawable=getResources().getDrawable(R.drawable.home); //获取图片
        drawable.setBounds(0, 0, 80, 80);  //设置图片参数
        button1.setCompoundDrawables(null,drawable,null,null);  //设置到哪个控件的位置（）

        Drawable drawable1=getResources().getDrawable(R.drawable.gift); //获取图片
        drawable1.setBounds(0, 0, 80, 80);  //设置图片参数
        button2.setCompoundDrawables(null,drawable1,null,null);  //设置到哪个控件的位置（）

        Drawable drawable2=getResources().getDrawable(R.drawable.mall); //获取图片
        drawable2.setBounds(0, 0, 80, 80);  //设置图片参数
        button3.setCompoundDrawables(null,drawable2,null,null);  //设置到哪个控件的位置（）

        Drawable drawable3=getResources().getDrawable(R.drawable.select); //获取图片
        drawable3.setBounds(0, 0, 80, 80);  //设置图片参数
        button4.setCompoundDrawables(null,drawable3,null,null);  //设置到哪个控件的位置（）

        Drawable drawable4=getResources().getDrawable(R.drawable.profile); //获取图片
        drawable4.setBounds(0, 0, 80, 80);  //设置图片参数
        button5.setCompoundDrawables(null,drawable4,null,null);  //设置到哪个控件的位置（）

    }

    private void setlistener() {
        group.setOnCheckedChangeListener(this);
    }

    private void findview() {
        group = (RadioGroup) findViewById(R.id.main_group);
        button1 = (RadioButton) findViewById(R.id.main_rb1);
        button2 = (RadioButton) findViewById(R.id.main_rb2);
        button3 = (RadioButton) findViewById(R.id.main_rb3);
        button4 = (RadioButton) findViewById(R.id.main_rb4);
        button5 = (RadioButton) findViewById(R.id.main_rb5);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

    }
}
