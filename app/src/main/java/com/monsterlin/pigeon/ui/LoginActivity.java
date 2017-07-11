package com.monsterlin.pigeon.ui;

import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.monsterlin.pigeon.R;
import com.monsterlin.pigeon.base.BaseActivity;
import com.monsterlin.pigeon.common.AppManager;
import com.monsterlin.pigeon.utils.ToastUtils;

/**
 * @author : monsterLin
 * @version : 1.0
 * @email : monster941025@gmail.com
 * @github : https://github.com/monsterLin
 * @time : 2017/7/9
 * @desc : 登陆界面
 */
public class LoginActivity extends BaseActivity {

    private TextInputLayout mUserNameWrapper, mUserPassWrapper;
    private EditText mEdtUserName, mEdtUserPass;
    private Button mBtnLogin;
    private TextView mTvRegister, mTvForgetPass;
    private ImageView mIvAbout;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initViews() {
        mUserNameWrapper = findView(R.id.login_userNameWrapper);
        mUserPassWrapper = findView(R.id.login_userPassWrapper);

        mEdtUserName = findView(R.id.login_edt_userName);
        mEdtUserPass = findView(R.id.login_edt_userPass);

        mUserNameWrapper.setHint("飞鸽号／手机号");
        mUserPassWrapper.setHint("密码");

        mBtnLogin = findView(R.id.login_btn);
        mTvRegister = findView(R.id.login_tv_register);
        mTvForgetPass = findView(R.id.login_tv_forgetPass);

        mIvAbout = findView(R.id.login_iv_about);

    }

    @Override
    public void initListener() {
        setOnClick(mBtnLogin);
        setOnClick(mTvRegister);
        setOnClick(mTvForgetPass);
        setOnClick(mIvAbout);
    }

    @Override
    public void initData() {
        AppManager.getAppManager().addActivity(this);
    }

    @Override
    public void processClick(View v) {
        switch (v.getId()) {
            case R.id.login_btn:
                ToastUtils.showToast(this, "这是一个自定义的边框和底色的提示框");
                break;
            case R.id.login_tv_register:
                nextActivity(RegisterActivity.class);
                break;
            case R.id.login_tv_forgetPass:
                nextActivity(ForgetPassActivity.class);
                break;
            case R.id.login_iv_about:
                nextActivity(AboutActivity.class);
                break;
        }
    }
}
