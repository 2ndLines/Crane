package com.hakim.data.rest.api;

import com.hakim.data.entities.UserEntity;
import com.hakim.data.rest.Bmob;
import com.hakim.data.rest.RestService;

import java.util.List;
import java.util.Map;

import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/1/27
 * <p/>
 * Summary   :
 */
public interface UserApi {
    @POST(AnnParam.CLASS_USER)
    Observable<UserEntity> signup(@Body UserEntity userEntity);

    @Multipart
    @POST(AnnParam.CLASS_USER)
    Observable<UserEntity> loginAndSigninWithPhoneNumber(@Part(AnnParam.FIELD_MOBILE_PHONE_NUMBER) String phoneNumber,
                                                         @Part(AnnParam.FIELD_SMS_CODE) String smsCode);

    @FormUrlEncoded
    @GET(AnnParam.CLASS_LOGIN)
    Observable<UserEntity> loginWithPassword(@Field(AnnParam.FIELD_USER_NAME) String username,
                                             @Field(AnnParam.FIELD_PASSWORD) String password);

    @FormUrlEncoded
    @GET(AnnParam.CLASS_LOGIN)
    Observable<UserEntity> loginWithSmsCode(@Field(AnnParam.FIELD_MOBILE_PHONE_NUMBER) String phoneNumber,
                                            @Field(AnnParam.FIELD_SMS_CODE) String smsCode);

    @FormUrlEncoded
    @PUT(AnnParam.CLASS_USER + "/{" + AnnParam.FIELD_OBJECT_ID + "}")
    Observable<UserEntity> updateUser(@Header(RestService.X_BMOB_SESSION_TOKEN_LABEL) String sessionToken,
                                      @Path(AnnParam.FIELD_OBJECT_ID) String objectId,
                                      @FieldMap Map<String, ?> value);

    @DELETE(AnnParam.CLASS_USER + "/{" + AnnParam.FIELD_OBJECT_ID + "}")
    Observable<String> deleteUser(@Header(RestService.X_BMOB_SESSION_TOKEN_LABEL) String sessionToken,
                                  @Path(Bmob.LABEL_OBJECT_ID) String objectId);

    @GET(AnnParam.CLASS_USER + "/{" + AnnParam.FIELD_OBJECT_ID + "}")
    Observable<UserEntity> getUser(@Path(Bmob.LABEL_OBJECT_ID) String objectId);

    @GET(AnnParam.CLASS_USER)
    Observable<List<UserEntity>> userList();

    @PUT(AnnParam.METHOD_RESET_PASSWORD + "/{" + AnnParam.FIELD_SMS_CODE + "}")
    Observable<String> resetPasswordBySmsCode(@Path(Bmob.LABEL_SMS_CODE) String smsCode);

    @Multipart
    @PUT(AnnParam.METHOD_UPDATE_PASSWORD + "/{" + AnnParam.FIELD_OBJECT_ID + "}")
    Observable<String> updatePassword(@Part(Bmob.LABEL_OLD_PASSWORD) String oldPassword,
                                      @Part(Bmob.LABEL_NEW_PASSWORD) String newPassword,
                                      @Path(Bmob.LABEL_OBJECT_ID) String objectId);

    @POST(AnnParam.CLASS_USER)
    Observable<UserEntity> loginWith3rdAccount(@Body String authDataJson);
}
