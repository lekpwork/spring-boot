package com.example.test.controller;

import com.example.BaseController.BaseController;
import com.example.BaseController.OfcResponse;
import com.example.Log.LogUtil;
import com.example.frm.aop.TestAOP;
import com.example.model.data.UserDO;
import com.example.model.mapper.UserDOMapper;
import com.example.test.vo.People;
import com.example.test.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * <div style="font-weight: 900">说明:</div>
 * <p>
 * <div style="font-weight: 900">创建时间: 2018/5/1 </div>
 *
 * @author lekp
 * @since 1.0
 */
@RestController
public class TestResource extends BaseController{
    @Autowired
    private People people;
    @Autowired
    private UserDOMapper userDOMapper;

    /**
     * spring调用配置文件练习
     */
    @GetMapping("/resource")
    @TestAOP
    public void test(@RequestParam String name,String age){
        LogUtil.debug("name:"+name);
        LogUtil.debug("age:"+age);
        String path=this.getRequest().getContextPath();
        LogUtil.debug("上下文"+path);
        LogUtil.debug("开始--------------");
        System.out.println(people.getAge());
        System.out.println(people.getSex());
        System.out.println(people.getName());
        UserDO userDO=userDOMapper.selectByPrimaryKey(2);
        LogUtil.debug(userDO.getEmail());
        LogUtil.debug("结束--------------");
    }

    @GetMapping("/getPeople")
    public OfcResponse getPeople(){
        OfcResponse ofcResponse=new OfcResponse();
        Student student=new Student();
        student.setName("lkp");
        student.setAge("1");
        return ofcResponse.success(student);
    }
}
