package com.example.smallwhite.java8;/** * @author: yangqiang * @create: 2021-03-05 10:33 */public class FunctionInterfaceImpl {    FunctionInterface anInterface;    public FunctionInterfaceImpl(FunctionInterface anInterface) {        this.anInterface = anInterface;    }    public String getString(String name){        return anInterface.method(name);    }}