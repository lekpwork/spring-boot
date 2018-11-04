package com.example.login.service;

import com.example.Log.LogUtil;
import org.springframework.stereotype.Service;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间:2018/9/19</div>
 *
 * @author lekp
 * @since 1.0
 */
@Service
public class LoginServiceImpl implements LoginService{
    @Override
    public void doLogin() {
        LogUtil.debug("doLogin");
    }
}
