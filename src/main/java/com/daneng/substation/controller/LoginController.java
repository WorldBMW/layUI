package com.daneng.substation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginController {
//    @PostMapping(value ="/user/login")
//    public String login(@RequestParam("username")String username,
//                        @RequestParam("password")String password){
//        if(username=="admin" && password=="123456"){
//            return "login";
//        }else{
//            return "error";
//        }
//    }
@RequestMapping(value ="/login")
public String login(){

    return "login";

}
    @RequestMapping(value ="/index")
    public String index(){

        return "index";

    }
    @RequestMapping(value ="/home")
    public String home(){

        return "homes";

    }
    @RequestMapping("logout")
    public String logout(){
       // logger.info("退出系统");
//        Subject subject = SecurityUtils.getSubject();
//        subject.logout(); // shiro底层删除session的会话信息
        return "redirect:login";
    }


}
