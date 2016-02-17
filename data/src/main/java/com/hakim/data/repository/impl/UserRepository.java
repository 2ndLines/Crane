package com.hakim.data.repository.impl;

import com.hakim.data.entities.UserEntity;
import com.hakim.data.repository.Repository;
import com.hakim.data.rest.RestService;
import com.hakim.data.rest.api.UserApi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.Observable;
import rx.functions.Func1;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/2/1
 * <p/>
 * Summary   :
 */
public class UserRepository implements Repository<UserEntity> {
    private static final String SUCCESS = "ok";

    private final UserApi userApi;

    public UserRepository() {
        userApi = RestService.createApi(UserApi.class);
    }

    @Override
    public Observable<UserEntity> get(String objectId) {
        return userApi.getUser(objectId);
    }

    @Override
    public Observable<List<UserEntity>> getList() {
        return userApi.userList();
    }

    @Override
    public Observable<Boolean> updateItem(String token, String objectId, String key, Object value) {
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put(key, value);
        return userApi.updateUser(token, objectId, fieldMap)
                .map(new Func1<UserEntity, Boolean>() {
                    @Override
                    public Boolean call(UserEntity userEntity) {
                        return userEntity != null;
                    }
                });
    }

    @Override
    public Observable<Boolean> delete(String token, String objectId) {
        return userApi.deleteUser(token, objectId)
                .map(new Func1<String, Boolean>() {
                    @Override
                    public Boolean call(String s) {
                        return null;
                    }
                });

    }
}
