package com.example.smallwhite.algorithm.V0;import com.example.smallwhite.mybatis.entity.Baby;import com.example.smallwhite.utils.GetDemoObject;import java.util.Arrays;import java.util.HashMap;import java.util.List;import java.util.Map;import java.util.concurrent.CyclicBarrier;import java.util.stream.Collectors;/** * @author: yangqiang * @create: 2021-04-21 10:41 */public class Test {    public static void main(String[] args) {        List<Baby> objectList = GetDemoObject.getObjectList(Baby.class, 10);        List<String> collect = objectList.stream().map(item -> item.getId()).collect(Collectors.toList());        System.out.println(collect);    }}