package com.hakim.data.repository.impl;

import com.hakim.data.entities.Friend;
import com.hakim.data.repository.Repository;

import java.util.List;

import rx.Observable;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/2/2
 * <p/>
 * Summary   :
 */
public class FriendRepository implements Repository<Friend> {

    @Override
    public Observable<Friend> get(String objectId) {
        return null;
    }

    @Override
    public Observable<List<Friend>> getList() {
        return null;
    }

    @Override
    public Observable<Boolean> updateItem(String token, String objectId, String key, Object value) {
        return null;
    }

    @Override
    public Observable<Boolean> delete(String token, String objectId) {
        return null;
    }
}
