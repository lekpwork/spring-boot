package com.example.BaseController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间: 2018/5/7 </div>
 *
 * @author lekp
 * @since 1.0
 */
public class WebContextHolder {
    //ThreadLocal为变量在每个线程中都创建了一个副本，那么每个线程可以访问自己内部的副本变量
    private static ThreadLocal<HttpServletRequest> httpServletRequestThreadLocal=new ThreadLocal<>();
    private static ThreadLocal<HttpServletResponse> httpServletResponseThreadLocal=new ThreadLocal<>();
    private static ThreadLocal<HttpSession> httpSessionThreadLocal=new ThreadLocal<>();

    public static HttpServletRequest getRequest() {
        return httpServletRequestThreadLocal.get();
    }

    public static void setRequest(HttpServletRequest request) {
        httpServletRequestThreadLocal.set(request);
    }

    public static HttpServletResponse getResponse() {
        return httpServletResponseThreadLocal.get();
    }

    public static void setResponse(HttpServletResponse response) {
        httpServletResponseThreadLocal.set(response);
    }

    public static void setHttpSession(HttpSession session){
        httpSessionThreadLocal.set(session);
    }

    public static HttpSession getSession(){
        return httpSessionThreadLocal.get();
    }
}
