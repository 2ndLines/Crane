package com.hakim.domain.usecase.pojo;

import com.hakim.data.entities.UserEntity;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/2/1
 * <p/>
 * Summary   :
 */
public class User {
    private String username;

    private String password;

    private String nickname;

    private String token;

    private String avatar;

    public User(){
        //Empty constructor
    }

    public User(UserEntity user){
        setUsername(user.username());
        setPassword(user.password());
        setToken(user.sessionToken());
        setAvatar(user.avatar());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
