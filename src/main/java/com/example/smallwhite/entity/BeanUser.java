package com.example.smallwhite.entity;import com.example.smallwhite.utils.GetDemoObject;import com.example.smallwhite.utils.JdbcUtil;import lombok.AllArgsConstructor;import lombok.Data;import lombok.ToString;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Component;import org.springframework.transaction.annotation.Propagation;import org.springframework.transaction.annotation.Transactional;/** * @author: yangqiang * @create: 2020-11-11 11:22 */@Data@Component("beanUser")@AllArgsConstructor@ToStringpublic class BeanUser {    private String id;    private BeanUsers beanUsers;    @Autowired    JdbcUtil jdbcUtil;    @Autowired    BeanUser beanUser;    @Override    public String toString() {        return "";    }    public BeanUser() {    }    @Transactional    public void test(){        jdbcUtil.insert(GetDemoObject.getObjectList(BabyImage.class,1));        System.out.println("test");        beanUser.test2();        throw new NullPointerException();    }    @Transactional(propagation = Propagation.NEVER)    public void test2(){        jdbcUtil.insert(GetDemoObject.getObjectList(BabyImage.class,1));        System.out.println("test");        throw new NullPointerException();    }}