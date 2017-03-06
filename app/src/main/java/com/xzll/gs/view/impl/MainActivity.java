package com.xzll.gs.view.impl;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.xzll.gs.R;
import com.xzll.gs.fragment.Classification;
import com.xzll.gs.fragment.Found;
import com.xzll.gs.fragment.Home;
import com.xzll.gs.fragment.Mall;
import com.xzll.gs.fragment.Profile;
import com.xzll.gs.view.IMainActivity;
import com.zhy.autolayout.AutoLayoutActivity;

public class MainActivity extends AutoLayoutActivity implements IMainActivity,RadioGroup.OnCheckedChangeListener{
    RadioGroup group;
    RadioButton button1;
    RadioButton button2;
    RadioButton button3;
    RadioButton button4;
    RadioButton button5;
    Classification tion;
    Found found;
    Home home;
    Mall mall;
    Profile profile;
    Animation anim;
    ScaleAnimation sa;
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();
        init();
        fragmentInit();
        setlistener();
    }

    /**
     * 碎片初始化
     */
    private void fragmentInit() {
        FragmentTransaction tr = manager.beginTransaction();
        tr.add(R.id.main_replace,home);
        tr.add(R.id.main_replace,tion);
        tr.add(R.id.main_replace,found);
        tr.add(R.id.main_replace,mall);
        tr.add(R.id.main_replace,profile);
        tr.show(home);
        tr.hide(tion);
        tr.hide(found);
        tr.hide(mall);
        tr.hide(profile);
        tr.commit();
    }

    /**
     * 初始化
     */
    private void init() {
        button1.setChecked(true);
        setButtonDrawable(button1,R.drawable.home);
        setButtonDrawable(button2,R.drawable.select);
        setButtonDrawable(button3,R.drawable.gift);
        setButtonDrawable(button4,R.drawable.mall);
        setButtonDrawable(button5,R.drawable.profile);
        anim = AnimationUtils.loadAnimation(this,R.anim.buttonanim);
        sa = (ScaleAnimation) anim;
        manager = getFragmentManager();
        tion = new Classification();
        found = new Found();
        mall = new Mall();
        profile = new Profile();
        home = new Home();
    }

    /**
     * 设置drawableTop的图片大小
     * @param button
     * @param id
     */
    private void setButtonDrawable(Button button, int id){
        Drawable drawable=getResources().getDrawable(id); //获取图片
        drawable.setBounds(0, 0, 60, 60);  //设置图片参数
        button.setCompoundDrawables(null,drawable,null,null);  //设置到哪个控件的位置（）
    }

    /**
     * 设置监听
     */
    private void setlistener() {
        group.setOnCheckedChangeListener(this);
    }

    /**
     * 查找控件
     */
    private void findview() {
        group = (RadioGroup) findViewById(R.id.main_group);
        button1 = (RadioButton) findViewById(R.id.main_rb1);
        button2 = (RadioButton) findViewById(R.id.main_rb2);
        button3 = (RadioButton) findViewById(R.id.main_rb3);
        button4 = (RadioButton) findViewById(R.id.main_rb4);
        button5 = (RadioButton) findViewById(R.id.main_rb5);
    }

    /**
     * radioGroup的监听
     * @param group
     * @param checkedId
     */
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        FragmentTransaction tr = manager.beginTransaction();
        switch(checkedId){
            case R.id.main_rb1:
                button1.startAnimation(sa);
                tr.show(home);
                tr.hide(tion);
                tr.hide(found);
                tr.hide(mall);
                tr.hide(profile);
                break;
            case R.id.main_rb2:
                button2.startAnimation(sa);
                tr.show(tion);
                tr.hide(home);
                tr.hide(found);
                tr.hide(mall);
                tr.hide(profile);
                break;
            case R.id.main_rb3:
                button3.startAnimation(sa);
                tr.show(found);
                tr.hide(home);
                tr.hide(tion);
                tr.hide(mall);
                tr.hide(profile);
                break;
            case R.id.main_rb4:
                button4.startAnimation(sa);
                tr.hide(home);
                tr.hide(tion);
                tr.hide(found);
                tr.show(mall);
                tr.hide(profile);
                break;
            case R.id.main_rb5:
                button5.startAnimation(sa);
                tr.show(profile);
                tr.hide(home);
                tr.hide(tion);
                tr.hide(found);
                tr.hide(mall);
                break;
        }
        tr.commit();
    }
}
