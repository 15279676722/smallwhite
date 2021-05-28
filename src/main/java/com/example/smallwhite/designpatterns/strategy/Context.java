package com.example.smallwhite.designpatterns.strategy;import java.math.BigDecimal;/** * @author: yangqiang * @create: 2021-03-02 20:17 */public class Context<T> {    private ICouponDiscount<T> couponDiscount;    public Context(ICouponDiscount<T> couponDiscount) {        this.couponDiscount = couponDiscount;    }    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {        return couponDiscount.discountAmount(couponInfo, skuPrice);    }}