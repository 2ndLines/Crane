package com.hakim.data.entities;

import android.database.Cursor;

import com.hakim.data.db.Db;

import auto.parcel.AutoParcel;
import rx.functions.Func1;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/1/27
 * <p/>
 * Summary   :
 */
@AutoParcel
public abstract class UserEntity {

    public static final String _ID = "_id";
    public static final String OBJECT_ID = "object_id";
    public static final String USER_NAME = "user_name";
    public static final String PASSWORD = "_password";
    public static final String PHONE = "_phone";
    public static final String NICK_NAME = "nick_name";
    public static final String AVATAR = "_avatar";
    public static final String SESSION_TOKEN = "session_token";

    public abstract String objectId();
    public abstract String username();
    public abstract String password();
    public abstract String phone();
    public abstract String nickname();
    public abstract String avatar();
    public abstract String sessionToken();

    public static Func1<Cursor, UserEntity> MAPPER = new Func1<Cursor, UserEntity>() {
        @Override
        public UserEntity call(Cursor cursor) {
            String objectId = Db.getString(cursor, OBJECT_ID);
            String username = Db.getString(cursor, USER_NAME);
            String password = Db.getString(cursor, PASSWORD);
            String phone = Db.getString(cursor, PHONE);
            String nickname = Db.getString(cursor, NICK_NAME);
            String avatar = Db.getString(cursor, AVATAR);
            String sessionToken = Db.getString(cursor, SESSION_TOKEN);
            return builder().objectId(objectId)
                    .username(username)
                    .password(password)
                    .phone(phone)
                    .nickname(nickname)
                    .avatar(avatar)
                    .sessionToken(sessionToken)
                    .build();
        }
    } ;

    static Builder builder(){
        return new AutoParcel_UserEntity.Builder();
    }

    @AutoParcel.Builder
    public interface Builder{
        Builder objectId(String s);
        Builder username(String s);
        Builder password(String s);
        Builder phone(String s);
        Builder nickname(String s);
        Builder avatar(String s);
        Builder sessionToken(String s);
        UserEntity build();
    }

}
