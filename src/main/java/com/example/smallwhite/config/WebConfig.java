package com.example.smallwhite.config;import org.springframework.web.WebApplicationInitializer;import javax.servlet.*;/** * @author: yangqiang * @create: 2020-04-15 11:03 */public class WebConfig implements WebApplicationInitializer {    @Override    public void onStartup(ServletContext servletContext) throws ServletException {        DispatcherServlet dispatcherServlet = new DispatcherServlet();        ServletRegistration.Dynamic appServlet = servletContext.addServlet("appServlet", (Servlet) dispatcherServlet);        appServlet.addMapping("/");        appServlet.setMultipartConfig(                new MultipartConfigElement("/tmp/spittr/uploads")        );    }}