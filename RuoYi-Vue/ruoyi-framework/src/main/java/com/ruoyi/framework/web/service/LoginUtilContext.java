package com.ruoyi.framework.web.service;


/**
 * 获取登录类型工具类，根据登录不同的接口使用不同的实现类进行认证
 *  @author  jingc
 */
public class LoginUtilContext {

    //登录类型上下文变量
    private static  ThreadLocal<String>  loginThreadLocal = new ThreadLocal<>();

    public static void setLoginType(String loginType) {
        loginThreadLocal.set(loginType);
    }

    public static String getLoginType(){
       return loginThreadLocal.get();
    }

    public static void removeType() {
        loginThreadLocal.remove();
    }
 }
