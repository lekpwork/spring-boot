package com.example.login.controller;

import com.example.BaseController.BaseController;
import com.example.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间:2018/9/19</div>
 *
 * @author lekp
 * @since 1.0
 */
@RestController
@RequestMapping("login")
public class LoginController extends BaseController {

    @Autowired
    private LoginService loginService;

    @PostMapping("doLogin")
    public void doLogin(){
        this.getSession().getId();
        loginService.doLogin();
    }
}
