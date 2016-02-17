package com.hakim.data.rest.interceptor;

import com.hakim.data.rest.Bmob;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/1/27
 * <p/>
 * Summary   :
 */
public class NetworkInterceptor implements Interceptor {


    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        request.newBuilder()
                .addHeader(Bmob.LABEL_CONTENT_TYPE, Bmob.CONTENT_TYPE_VALUE)
                .addHeader(Bmob.LABEL_APPLICATION_ID, Bmob.APPLICATION_ID_VALUE)
                .addHeader(Bmob.LABEL_REST_API_KEY, Bmob.REST_API_KEY_VALUE)
                .build();
        return chain.proceed(request);
    }
}
