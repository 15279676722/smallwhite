package com.example.smallwhite.controller;import org.springframework.stereotype.Controller;import org.springframework.ui.Model;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.RequestParam;/** * @author: yangqiang * @create: 2020-09-22 14:30 */@Controllerpublic class StartController {    @GetMapping("/login")    public String login(Model model, @RequestParam(value = "error",required = false) String error){        if(error !=null){            model.addAttribute("error","用户名或密码错误");        }        return "forward:/login.html";    }//    @PostMapping("/doLogin")//    public String doLogin(){//        System.out.println("1");//        return "doLogin";//    }}