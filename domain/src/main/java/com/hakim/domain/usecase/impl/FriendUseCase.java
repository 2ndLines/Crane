package com.hakim.domain.usecase.impl;

import com.hakim.data.entities.Friend;
import com.hakim.domain.usecase.UseCase;

import rx.Observable;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/2/2
 * <p/>
 * Summary   :
 */
public class FriendUseCase implements UseCase<Friend> {
    @Override
    public Observable<Friend> execute(String objectId) {
        return null;
    }
}
