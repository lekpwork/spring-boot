package com.example.BaseController;

import java.io.Serializable;

/**
 * Description:<br>
 * REST接口返回数据接口<br>
 * Remark:<br>
 * <br>
 * Date:2017/6/5
 *
 * @author yaojianxing
 * @version 0.0.1
 */
public interface RestResponse extends Serializable {
    RestResponse success(Object object);
}
