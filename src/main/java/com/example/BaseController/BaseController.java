package com.example.BaseController;

import org.springframework.web.bind.annotation.ModelAttribute;

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
public class BaseController {
    /**
     * 框架引入request和response
     * ModelAttribute：初始化
     */
    @ModelAttribute
    public void setReqAndRes(HttpServletRequest request, HttpServletResponse response){
        WebContextHolder.setRequest(request);
        WebContextHolder.setResponse(response);
        WebContextHolder.setHttpSession(request.getSession());
    }

    public HttpServletRequest getRequest(){
        HttpServletRequest request=WebContextHolder.getRequest();
        if (request==null){
            throw new SysException("请检查该类是否集成BaseController");
        }
        return request;
    }

    public HttpServletResponse getResponse(){
        HttpServletResponse response=WebContextHolder.getResponse();
        if (response==null){
            throw new SysException("请检查该类是否集成BaseController");
        }
        return response;
    }

    public HttpSession getSession(){
        HttpSession session=WebContextHolder.getSession();
        if (session==null){
            throw new SysException("请检查该类是否集成BaseController");
        }
        return session;
    }

    public OfcResponse success() {
        return new OfcResponse().success();
    }

    public OfcResponse successWithSessionId(String sessionId) {
        return new OfcResponse().successWithSessionId(sessionId);
    }

    public OfcResponse success(Object data) {
        return new OfcResponse().success(data);
    }

    public OfcResponse failure(String message) {
        return new OfcResponse().failure(message);
    }

    public OfcResponse failure(String result, String message) {
        return new OfcResponse().failure(result,message);
    }
}
