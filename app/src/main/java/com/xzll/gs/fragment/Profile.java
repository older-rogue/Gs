package com.xzll.gs.fragment;

import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xzll.gs.R;

/**
 * 我的碎片
 */

public class Profile extends Fragment implements View.OnClickListener{
    TextView setting;
    Button login;
    Button bt1;
    Button bt2;
    Button bt3;
    Button bt4;
    Button bt5;
    LinearLayout lin1;
    LinearLayout lin2;
    LinearLayout lin3;
    LinearLayout lin4;
    LinearLayout lin5;
    LinearLayout lin6;
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view  = LayoutInflater.from(getActivity()).inflate(R.layout.profile_fragment,null);
        init();
        setListener();
        changeDrawable();
        return view;
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
    private void setListener() {
        setting.setOnClickListener(this);
        login.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        lin1.setOnClickListener(this);
        lin2.setOnClickListener(this);
        lin3.setOnClickListener(this);
        lin4.setOnClickListener(this);
        lin5.setOnClickListener(this);
        lin6.setOnClickListener(this);
    }

    /**
     * 初始化控件
     */
    private void init() {
        setting = (TextView) view.findViewById(R.id.profile_setting);
        login = (Button) view.findViewById(R.id.profile_login);
        bt1 = (Button) view.findViewById(R.id.profile_bt1);
        bt2 = (Button) view.findViewById(R.id.profile_bt2);
        bt3 = (Button) view.findViewById(R.id.profile_bt3);
        bt4 = (Button) view.findViewById(R.id.profile_bt4);
        bt5 = (Button) view.findViewById(R.id.profile_bt5);
        lin1 = (LinearLayout) view.findViewById(R.id.profile_lin1);
        lin2 = (LinearLayout) view.findViewById(R.id.profile_lin2);
        lin3 = (LinearLayout) view.findViewById(R.id.profile_lin3);
        lin4 = (LinearLayout) view.findViewById(R.id.profile_lin4);
        lin5 = (LinearLayout) view.findViewById(R.id.profile_lin5);
        lin6 = (LinearLayout) view.findViewById(R.id.profile_lin6);
    }
/**
 * 改变图片的大小
 */
    private void changeDrawable(){
        setButtonDrawable(bt1,R.drawable.ic_pay);
        setButtonDrawable(bt2,R.drawable.ic_send);
        setButtonDrawable(bt3,R.drawable.ic_get);
        setButtonDrawable(bt4,R.drawable.ic_comment);
        setButtonDrawable(bt5,R.drawable.ic_after);
    }
    /**
     * 监听方法
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.profile_setting:

                break;
            case R.id.profile_login:

                break;
            case R.id.profile_bt1:

                break;
            case R.id.profile_bt2:

                break;
            case R.id.profile_bt3:

                break;
            case R.id.profile_bt4:

                break;
            case R.id.profile_bt5:

                break;
            case R.id.profile_lin1:

                break;
            case R.id.profile_lin2:

                break;
            case R.id.profile_lin3:

                break;
            case R.id.profile_lin4:

                break;
            case R.id.profile_lin5:

                break;
            case R.id.profile_lin6:

                break;
        }

    }
}
