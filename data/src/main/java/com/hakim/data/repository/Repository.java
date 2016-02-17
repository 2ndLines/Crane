package com.hakim.data.repository;

import java.util.List;

import rx.Observable;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/2/1
 * <p/>
 * Summary   :
 */
public interface Repository<DATA> {

    Observable<DATA> get(String objectId);

    Observable<List<DATA>> getList();

    Observable<Boolean> updateItem(String token, String objectId, String key, Object value);

    Observable<Boolean> delete(String token, String objectId);

}
