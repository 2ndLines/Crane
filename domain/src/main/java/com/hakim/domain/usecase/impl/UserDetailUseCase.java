package com.hakim.domain.usecase.impl;

import com.hakim.data.entities.UserEntity;
import com.hakim.data.repository.impl.UserRepository;
import com.hakim.domain.usecase.UseCase;
import com.hakim.domain.usecase.pojo.User;

import dagger.Subcomponent;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/2/2
 * <p/>
 * Summary   :
 */
public class UserDetailUseCase implements UseCase<User> {
    private final UserRepository repository;

    public UserDetailUseCase(UserRepository repository){
        this.repository = repository;
    }

    @Override
    public Observable<User> execute(String objectId) {
        return repository.get(objectId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .map(new Func1<UserEntity, User>() {
                    @Override
                    public User call(UserEntity userEntity) {
                        return new User(userEntity);
                    }
                });
    }
}
