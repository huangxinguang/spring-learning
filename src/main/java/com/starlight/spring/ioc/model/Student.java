package com.starlight.spring.ioc.model;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author xghuang
 * @date 2019/6/18
 * @time 10:13
 * @desc:
 */
public class Student implements BeanNameAware ,InitializingBean ,DisposableBean {
    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getAge() {
        return age;
    }

    public Student setAge(String age) {
        this.age = age;
        return this;
    }

    public void initMethod() {
        System.out.println("init method");
    }

    public void destroyMethod() {
        System.out.println("destroy method");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
        System.out.println("create student bean...");
    }

    public Student() {
        System.out.println("create student bean...");
    }

    public void play() {
        System.out.println("student play...");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("调用bean的setBeanName");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用afterPropertiesSet之后方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("调用DisposableBean--distory");
    }
}
