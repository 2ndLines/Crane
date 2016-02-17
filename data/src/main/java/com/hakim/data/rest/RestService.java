package com.hakim.data.rest;

import com.hakim.data.rest.interceptor.HttpLoggingInterceptor;
import com.hakim.data.rest.interceptor.NetworkInterceptor;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.RxJavaCallAdapterFactory;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/1/27
 * <p/>
 * Summary   :
 */
public final class RestService {
    private static final int API_VERSION = 1;
    private static final String API_URL = "https://api.bmob.cn/" + API_VERSION + "/";
    public static final String X_BMOB_SESSION_TOKEN_LABEL = "X-Bmob-Session-Token";


    public static <T> T createApi(Class<T> clazz) {
        Retrofit retrofit = getRetrofit();
        return retrofit.create(clazz);
    }

    private static Retrofit getRetrofit() {
        return new Retrofit.Builder()
                .baseUrl(API_URL)
                .client(buildClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    private static OkHttpClient buildClient() {
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BASIC);
        return new OkHttpClient().newBuilder()
                .addInterceptor(loggingInterceptor)
                .addNetworkInterceptor(new NetworkInterceptor())
                .build();
    }

}
