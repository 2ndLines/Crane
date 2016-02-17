package com.hakim.bmob.presenter;

import android.text.TextUtils;

import com.hakim.bmob.views.SplashView;
import com.hakim.data.cache.CommonCache;
import com.hakim.domain.usecase.impl.UserDetailUseCase;
import com.hakim.domain.usecase.pojo.User;

import javax.inject.Inject;

import rx.Subscription;
import rx.functions.Action1;
import rx.subscriptions.CompositeSubscription;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/2/2
 * <p/>
 * Summary   :
 */
public class SplashPresenter implements Presenter {
    private SplashView splashView;
    @Inject
    private UserDetailUseCase userDetailUseCase;
    @Inject
    private CommonCache cache;
    private final CompositeSubscription subscription = new CompositeSubscription();

    @Inject
    public SplashPresenter() {

    }

    public void setView(SplashView view){
        this.splashView = view;
    }

    @Override
    public void onCreate() {
        splashView.showWelcomePage();
        loadDataInBackground();
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {
        if(subscription.hasSubscriptions()){
            subscription.unsubscribe();
        }
    }

    private void loadDataInBackground() {
        String objectId = cache.getLatestLogin();
        if(TextUtils.isEmpty(objectId)){
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            splashView.showGuidePage();
        }else {
            Subscription sub1 = userDetailUseCase.execute(objectId)
                    .subscribe(new Action1<User>() {
                        @Override
                        public void call(User user) {
                            splashView.showHomePage();
                        }
                    });
            subscription.add(sub1);

        }

    }


}
