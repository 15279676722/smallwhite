package com.example.smallwhite.entity;import com.example.smallwhite.mybatis.entity.Babyimage;import lombok.Data;import lombok.NoArgsConstructor;import java.util.*;/** * @author: yangqiang * @create: 2021-01-05 11:21 */@NoArgsConstructor@Datapublic class Baby {    public String id;    public String name;    public List<Babyimage> image;    public Baby(String id, String name) {        this.id = id;        this.name = name;    }}