package com.example.smallwhite.designpatterns.template;import lombok.extern.slf4j.Slf4j;/** * @author: yangqiang * @create: 2021-03-02 20:32 */@Slf4jpublic class Test {    public static void main(String[] args) {        NetMall netMall = new JDNetMall("1000001","*******");        String base64 = netMall.generateGoodsPoster("https://item.jd.com/100008348542.html");        log.info("测试结果：{}", base64);    }}