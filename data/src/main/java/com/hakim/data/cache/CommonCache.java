package com.hakim.data.cache;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/2/1
 * <p/>
 * Summary   :
 */
public interface CommonCache {

    /**
     * 获取登录次数
     */
    int getLoginTimes();

    /**
     * 最近一次登录的用户的ObjectId
     */
    String getLatestLogin();

    /**
     * 登录成功后服务器返回的口令
     */
    String getSessionToken();

}
