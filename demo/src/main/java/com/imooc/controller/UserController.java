package com.imooc.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.User;

//@Controller
@RestController     //@RestController =@Controller+@ResponseBody
@RequestMapping("/user")
public class UserController {

@RequestMapping("/getUser")
//@ResponseBody
public User getUser() {
	User u=new User();
	u.setName("imooc");
	u.setPassword("imooc");
	u.setAge(20);
	u.setBirthday(new Date());
    u.setDesc("Hello");
	return u;
  
}

@RequestMapping("/getUserJson")
@ResponseBody
public IMoocJSONResult getUserJson() {
	User u=new User();
	u.setName("imooc");
	u.setPassword("imooc");
	u.setAge(18);
	u.setBirthday(new Date());
	u.setDesc("Hello");
	return IMoocJSONResult.ok(u);//获得200状态
  
}

}
