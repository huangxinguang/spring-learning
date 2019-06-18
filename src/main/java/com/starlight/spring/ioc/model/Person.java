package com.starlight.spring.ioc.model;

/**
 * @author xghuang
 * @date 2019/6/18
 * @time 9:16
 * @desc:
 */
public class Person {

    private String username;

    private Integer age;

    public Person() {
        System.out.println("create person...");
    }

    public Person(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public Person setUsername(String username) {
        this.username = username;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
