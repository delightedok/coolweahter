package com.example.delightale.coolweather.util;

/**
 * Created by delighTale on 28/4/2016.
 */
public interface HttpCallbackListener {

    void onFinish(String response);
    void onError(Exception e);

}
