package com.example.BaseController;

/**
 * <p>
 * Module: frm-springMVC
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Remark:
 * </p>
 *
 * @author yaojianxing
 * @version 2017年1月18日上午11:57:44
 * <p>
 * 修改历史
 * </p>
 * <p>
 * 序号 日期 修改人 修改原因
 * </p>
 */
public class MvcConstant {
    private MvcConstant() {
    }

    /**
     * 响应正确代码
     */
    public static final String RESPONSE_CODE_SUCCESS = "SUCCESS";
    /**
     * 响应错误代码
     */
    public static final String RESPONSE_CODE_FAIL = "FAIL";
    /**
     * 操作需登录时未登陆
     */
    public static final String RESPONSE_CODE_AUTH_ERROR = "AUTH_ERROR";
    /**
     * 用户未绑定手机
     */
    public static final String RESPONSE_CODE_NOT_BIND = "NOT_BIND_ERROR";
    /**
     * 业务异常商品未找到
     */
    public static final String RESPONSE_CODE_GOODS_NOT_FOUND = "GOODS_NOT_FOUND";


}
