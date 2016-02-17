package com.hakim.domain.usecase;

import rx.Observable;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/2/2
 * <p/>
 * Summary   :
 */
public interface UseCase<DATA> {

    Observable<DATA> execute(String objectId);

}
