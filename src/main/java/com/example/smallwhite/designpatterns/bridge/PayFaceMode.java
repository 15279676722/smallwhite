package com.example.smallwhite.designpatterns.bridge;import lombok.extern.slf4j.Slf4j;/** * 人脸识别支付 * @author: yangqiang * @create: 2021-02-24 10:36 */@Slf4jpublic class PayFaceMode implements IPayMode{    @Override    public boolean security(String uId) {        log.info("人脸支付，风控校验脸部识别");        return true;    }}