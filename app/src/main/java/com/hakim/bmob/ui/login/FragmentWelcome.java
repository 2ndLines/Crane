package com.hakim.bmob.ui.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.facebook.drawee.view.SimpleDraweeView;
import com.hakim.bmob.R;
import com.hakim.bmob.ui.views.BaseFragment;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/2/1
 * <p/>
 * Summary   :
 */
public class FragmentWelcome extends BaseFragment {
    @Bind(R.id.iv_splash)
    SimpleDraweeView splashView;
    @Bind(R.id.progressbar)
    ProgressBar progressBar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_splash, container, false);
        ButterKnife.bind(this, layout);

        return layout;
    }
}
