package com.example.smallwhite.basics;import java.util.HashMap;/** * @author: yangqiang * @create: 2021-04-09 16:44 */public class Test {    public static void main(String[] args) {        System.out.println(2.0-1.1);        Integer value = 1;        String value2 = "1";        HashMap<Object, Object> map = new HashMap<>();        foo(value);        foo(value2);        foo(map);        System.out.println(value);        System.out.println(value2);        System.out.println(map);    }    public static void foo(Integer value){        value = 100;    }    public static void foo(String value){        value = "100";    }    public static void foo(HashMap map){        map.put("1",1);    }}