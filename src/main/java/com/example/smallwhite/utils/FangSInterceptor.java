package com.example.smallwhite.utils;/** * @author: yangqiang * @create: 2021-02-20 16:29 */import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Component;import org.springframework.web.method.HandlerMethod;import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;import javax.servlet.http.HttpServletRequest;import javax.servlet.http.HttpServletResponse;import java.io.OutputStream;@Componentpublic class FangSInterceptor extends HandlerInterceptorAdapter {    @Autowired    private RedisService redisService;    @Override    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {        //判断请求是否属于方法的请求        if(handler instanceof HandlerMethod){            HandlerMethod hm = (HandlerMethod) handler;            //获取方法中的注解,看是否有该注解            AccessLimit accessLimit = hm.getMethodAnnotation(AccessLimit.class);            if(accessLimit == null){                return true;            }            int seconds = accessLimit.seconds();            int maxCount = accessLimit.maxCount();            boolean login = accessLimit.needLogin();            String key = request.getRequestURI();            //如果需要登录            if(login){                //获取登录的session进行判断                //.....                key+=""+"1";  //这里假设用户是1,项目中是动态获取的userId            }            //从redis中获取用户访问的次数            Object o = redisService.get(key);            Integer count = o==null?null:Integer.valueOf((String)o);            if(count == null){                //第一次访问                redisService.set(key,"1",seconds);            }else if(count < maxCount){                //加1                redisService.incr(key,1);            }else{                //超出访问次数                render(response,"超出访问次数"); //这里的CodeMsg是一个返回参数                return false;            }        }        return true;    }    private void render(HttpServletResponse response, String cm)throws Exception {        response.setContentType("application/json;charset=UTF-8");        OutputStream out = response.getOutputStream();        out.write(cm.getBytes("UTF-8"));        out.flush();        out.close();    }}