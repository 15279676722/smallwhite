package com.example.smallwhite.designpatterns.flyweight;import lombok.extern.slf4j.Slf4j;/** * 享元模式 * @author: yangqiang * @create: 2021-02-24 10:58 */@Slf4jpublic class Test {    public static void main(String[] args) throws InterruptedException {         ActivityController activityController = new ActivityController();        for (int idx = 0; idx < 10; idx++) {            Long req = 10001L;            Activity activity = activityController.queryActivityInfo(req);            log.info("测试结果：{} {}", req,activity.toString());            Thread.sleep(1200);        }    }}