package com.hakim.bmob;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.core.ImagePipelineConfig;

/**
 * Author    ：	Hakim Shi
 * E-Mail    :  hakim.shi@qq.com
 * CreatedAt ：	2016/2/1
 * <p/>
 * Summary   :
 */
public class DemoApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        initializeFresco();
    }


    private void initializeFresco(){
        Fresco.initialize(this);
    }
}
