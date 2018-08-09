package com.example.BaseController;


import javax.servlet.http.HttpSession;
import java.io.Serializable;

/**
 * <p>Module: 响应实体</p>
 * <p>Description:
 * 响应前端请求的数据结构
 * json格式统一为
 * {
 * "meta": {
 * "result": "0000",
 * "message": "ok",
 * "sessionId: ""
 * },
 * "data": ...
 * }
 * </p>
 * <p>Remark: </p>
 * <p>Date: 2016年8月1日</p>
 *
 * @author yaojianxing
 * @version 0.0.1
 * <p>
 * <p> 修改历史</p>
 * <p> 序号 日期 修改人 修改原因</p>
 */
public class OfcResponse implements RestResponse {
    private static final long serialVersionUID = 1L;
    private static final String OK = "ok";
    private static final SysException EXCEPTION = new SysException("无法获取Session，最可能的原因是Controller未继承BaseController");
    /**
     * 基本数据
     */
    private Meta meta;
    /**
     * 结果数据
     */
    private Object data;

    public OfcResponse success() {
        HttpSession session = WebContextHolder.getSession();
        if (session == null) {
            throw EXCEPTION;
        }
        String sessionId = session.getId();
        this.meta = new Meta(MvcConstant.RESPONSE_CODE_SUCCESS, sessionId);
        return this;
    }

    public OfcResponse successWithSessionId(String sessionId) {
        this.meta = new Meta(MvcConstant.RESPONSE_CODE_SUCCESS, sessionId);
        return this;
    }
    @Override
    public OfcResponse success(Object data) {
        HttpSession session = WebContextHolder.getSession();
        if (session == null) {
            throw EXCEPTION;
        }
        String sessionId = session.getId();
        this.meta = new Meta(MvcConstant.RESPONSE_CODE_SUCCESS, sessionId);
        this.data = data;
        return this;
    }

    public OfcResponse failure(String message) {
        HttpSession session = WebContextHolder.getSession();
        if (session == null) {
            this.meta = new Meta(MvcConstant.RESPONSE_CODE_FAIL, message, null);
        } else {
            this.meta = new Meta(MvcConstant.RESPONSE_CODE_FAIL, message, session.getId());
        }
        return this;
    }

    public OfcResponse failure(String result, String message) {
        HttpSession session = WebContextHolder.getSession();

        if (session == null) {
            this.meta = new Meta(result, message, null);
        } else {
            this.meta = new Meta(result, message, session.getId());
        }
        return this;
    }

    public OfcResponse exceptionFail(String result, String message) {
        HttpSession session = WebContextHolder.getSession();
        if (session == null) {
            throw EXCEPTION;
        }
        String sessionId = session.getId();
        this.meta = new Meta(result, message, sessionId);
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public Object getData() {
        return data;
    }

    /**
     * <p>Module: 元数据</p>
     * <p>Description:
     * 说明返回结果的信息
     * </p>
     * <p>Remark: </p>
     * <p>Date: 2016年8月1日</p>
     *
     * @author yaojianxing
     * @version 0.0.1
     * <p>
     * <p> 修改历史</p>
     * <p> 序号 日期 修改人 修改原因</p>
     */
    class Meta implements Serializable {
        private String result;
        private String message;
        private String sessionId;

        public Meta(String result, String sessionId) {
            this.result = result;
            this.message = OK;
            this.sessionId = sessionId;
        }

        public Meta(String result, String message, String sessionId) {
            this.result = result;
            this.message = message;
            this.sessionId = sessionId;
        }

        public String getResult() {
            return result;
        }

        public String getMessage() {
            return message;
        }

        public String getSessionId() {
            return sessionId;
        }

        @Override
        public String toString() {
            return "Meta [result=" + result + ", message=" + message + ", sessionId=" + sessionId + "]";
        }
    }

    @Override
    public String toString() {
        return "RestResponse [meta=" + meta + ", data=" + data + "]";
    }
}
