package com.example.smallwhite.entity;import io.swagger.annotations.Scope;import lombok.AllArgsConstructor;import lombok.Data;import lombok.NoArgsConstructor;import org.springframework.stereotype.Component;/** * @author: yangqiang * @create: 2020-05-18 17:38 */@Data@AllArgsConstructorpublic class testClass {    private int key;    @Override    public int hashCode() {        return 64*key+1;    }}