package com.example.smallwhite.designpatterns.mediator.V2;/** * @author: yangqiang * @create: 2021-03-01 21:01 */public class Operator extends TeamMember {    public Operator(String name) {        super(name);        this.role = TeamMember.OP;    }    @Override    public void dailyWork() {        System.out.println("我是一个运维，保证系统稳定运行，如果有线上bug及时回滚，话说开发人员写的程序真不稳定。");    }}