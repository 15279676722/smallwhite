package com.example.smallwhite.utils;/** * @author: yangqiang * @create: 2021-02-20 16:29 */import java.lang.annotation.Retention;import java.lang.annotation.Target;import static java.lang.annotation.ElementType.METHOD;import static java.lang.annotation.RetentionPolicy.RUNTIME;@Retention(RUNTIME)@Target(METHOD)public @interface AccessLimit {    int seconds();    int maxCount();    boolean needLogin()default true;}