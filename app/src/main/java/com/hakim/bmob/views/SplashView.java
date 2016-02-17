package com.hakim.bmob.views;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/2/2
 * <p/>
 * Summary   :
 */
public interface SplashView extends MvpView {

    /**
     * 显示欢迎界面
     */
    void showWelcomePage();

    /**
     * 显示用户向导
     */
    void showGuidePage();

    /**
     * 显示主界面
     */
    void showHomePage();

}

