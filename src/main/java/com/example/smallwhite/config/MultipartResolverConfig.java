package com.example.smallwhite.config;import org.springframework.context.annotation.Bean;import org.springframework.context.annotation.Configuration;import org.springframework.web.multipart.MultipartResolver;import org.springframework.web.multipart.support.StandardServletMultipartResolver;/** * @author: yangqiang * @create: 2020-05-15 16:25 */@Configurationpublic class MultipartResolverConfig {    @Bean    public MultipartResolver multipartResolver(){        return new StandardServletMultipartResolver();    }}