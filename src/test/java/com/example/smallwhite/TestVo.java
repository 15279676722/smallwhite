package com.example.smallwhite;import lombok.Data;import org.springframework.boot.context.properties.ConfigurationProperties;import org.springframework.context.annotation.PropertySource;import org.springframework.stereotype.Component;/** * @author: yangqiang * @create: 2020-04-09 11:11 */@Component@PropertySource("classpath:application.properties")@ConfigurationProperties("test")@Datapublic class TestVo {    private String name;    private Integer sex;    private String type;}