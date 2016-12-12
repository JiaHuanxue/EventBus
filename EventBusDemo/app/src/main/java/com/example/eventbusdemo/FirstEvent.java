package com.example.eventbusdemo;

/**
 * Created by 贾焕雪 on 2016-12-12.
 */
public class FirstEvent {

    private String mMsg;
//创建有参方法和get方法
    public FirstEvent(String mMsg) {
        this.mMsg = mMsg;
    }

    public String getMsg() {
        return mMsg;
    }
}
