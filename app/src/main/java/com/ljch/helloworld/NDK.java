package com.ljch.helloworld;

public class NDK {

    static {
        System.loadLibrary("MyJni");//导入生成的链接库文件
    }

    public static native String getStringFromNative();//本地方法
}
