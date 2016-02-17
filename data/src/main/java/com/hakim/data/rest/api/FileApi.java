package com.hakim.data.rest.api;


import com.hakim.data.entities.CloudFile;

import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/1/27
 * <p/>
 * Summary   :
 */
public interface FileApi {

    /**
     * Upload a file into bmob cloud
     *
     * @param contentType 文件类型，参考http://tool.oschina.net/commons
     * @param fileName
     * @param data
     * @return
     */
    @POST("files/{fileName}")
    Observable<CloudFile> upload(@Header("Content-type")String contentType,
                                 @Path("fileName")String fileName,
                                 @Body String data);

    /**
     * delete a file in bmob cloud
     *
     * @param url
     * @return
     */
    @DELETE("files/{url}")
    Observable<String> delete(@Path("url") String url);

}
