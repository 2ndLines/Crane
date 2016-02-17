package com.hakim.data.rest.api;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/2/1
 * <p/>
 * Summary   :
 */
public interface AnnParam {
    String CLASS_USER = "users";

    String CLASS_LOGIN = "login";

    String METHOD_RESET_PASSWORD = "resetPasswordBySmsCode";

    String METHOD_UPDATE_PASSWORD = "updateUserPassword";

    String FIELD_OBJECT_ID = "objectId";

    String FIELD_SMS_CODE = "smsCode";

    String FIELD_USER_NAME = "userName";

    String FIELD_PASSWORD = "password";

    String FIELD_PASSWORD_NEW = "newPassword";
    String FIELD_PASSWORD_OLD = "oldPassword";
    String FIELD_MOBILE_PHONE_NUMBER = "mobilePhoneNumber";

}
