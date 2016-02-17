package com.hakim.bmob.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.hakim.bmob.presenter.SplashPresenter;
import com.hakim.bmob.ui.HomeActivity;
import com.hakim.bmob.ui.views.BaseActivity;
import com.hakim.bmob.views.SplashView;

import javax.inject.Inject;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/2/1
 * <p/>
 * Summary   :
 */
public class SplashActivity extends BaseActivity implements SplashView{
    @Inject
    private SplashPresenter splashPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        splashPresenter.setView(this);
        splashPresenter.onCreate();
    }

    @Override
    protected void onResume() {
        super.onResume();
        splashPresenter.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        splashPresenter.onDestroy();
    }

    @Override
    public void showWelcomePage() {
        getSupportFragmentManager().beginTransaction()
                .replace(android.R.id.content, new FragmentWelcome())
                .commit();
    }

    @Override
    public void showGuidePage() {
        getSupportFragmentManager().beginTransaction()
                .replace(android.R.id.content, new FragmentUserGuide())
                .commit();
    }

    @Override
    public void showHomePage() {
        startActivity(new Intent(this, HomeActivity.class));
    }

    @Override
    public Context getContext() {
        return this.getApplicationContext();
    }
}


