package com.example.smallwhite.designpatterns.builder;/** * @author: yangqiang * @create: 2021-02-22 11:36 */public class Test {    public static void main(String[] args) {        Course.CourseBuilder builder = new Course.CourseBuilder().addName("设计模式").addMeans("教程资料").addNote("课堂笔记").addHomework("课后作业");        System.out.println(builder.build());    }}