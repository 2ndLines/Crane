package com.hakim.data.rest;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/1/27
 * <p/>
 * Summary   :
 */
public interface Bmob {

    /**
     * The label of Content-Type
     */
    String LABEL_CONTENT_TYPE = "Content-Type";
    /**
     * The label of Application id
     */
    String LABEL_APPLICATION_ID = "X-Bmob-Application-Id";
    /**
     * The label of Rest Api key
     */
    String LABEL_REST_API_KEY = "X-Bmob-REST-API-Key";

    /**
     * The label of object id
     */
    String LABEL_OBJECT_ID = "objectId";
    /**
     * The label of mobile phone number
     */
    String LABEL_MOBILE_PHONE_NUMBER = "mobilePhoneNumber";
    /**
     * The label of Username
     */
    String LABEL_USER_NAME = "username";

    /**
     * The label of password
     */
    String LABEL_PASSWORD = "password";

    /**
     * The label of old password
     */
    String LABEL_OLD_PASSWORD = "oldPassword";
    /**
     * The label of new password
     */
    String LABEL_NEW_PASSWORD = "newPassword";
    /**
     * The label of SMS code
     */
    String LABEL_SMS_CODE = "smsCode";
    /**
     * The label of nickname
     */
    String LABEL_NICKNAME = "nickname";

    /**
     * The label of file name
     */
    String LABEL_FILE_NAME = "fileName";

    /**
     * Default value Content-Type
     */
    String CONTENT_TYPE_VALUE = "application/json; charset=utf-8";

    /**
     * Default value of application id
     */
    String APPLICATION_ID_VALUE = "0ffec9cd4c983b115feb16d62f174bba";

    /**
     * Default value of REST api key
     */
    String REST_API_KEY_VALUE = "56dc36a45300205e34913d64403b2ac3";

    String ITEM_FIELD = "";

}
