package com.xzll.gs.view.impl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.xzll.gs.R;

public class Login_Activity extends AppCompatActivity implements View.OnClickListener {
    private EditText login_name,login_pass;
    private Button login_btn1,login_btn3,login_btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        initdate();
    }
    private void initdate() {
        findView();
        login_btn1.setOnClickListener(this);
        login_btn2.setOnClickListener(this);
        login_btn3.setOnClickListener(this);
    }
    private void findView() {
        login_name = (EditText) findViewById(R.id.login_name);
        login_pass = (EditText) findViewById(R.id.login_pass);
        login_btn1 = (Button) findViewById(R.id.login_btn1);
        login_btn2 = (Button) findViewById(R.id.login_btn2);
        login_btn3 = (Button) findViewById(R.id.login_btn3);
    }
    @Override
    public void onClick(View v) {
            switch (v.getId()){
                case R.id.login_btn1:
                    finish();
                    break;
                case R.id.login_btn2:
                    Login();
                    break;
                case R.id.login_btn3:
                    LoginWeixin();
                    break;
            }
    }
    private void LoginWeixin() {

    }
    private void Login() {
        if(TextUtils.isEmpty(login_name.getText().toString().trim())){
            login_name.setError("帐号输入不能为空");
            login_name.requestFocus();
        }else if(TextUtils.isEmpty(login_pass.getText().toString().trim())){
            login_pass.setError("密码输入不能为空");
            login_pass.requestFocus();
        }else {
            Toast.makeText(Login_Activity.this,"登录成功",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Login_Activity.this,MainActivity.class);
            startActivity(intent);
        }
    }
}
