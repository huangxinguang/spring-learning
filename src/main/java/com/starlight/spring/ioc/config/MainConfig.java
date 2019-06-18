package com.starlight.spring.ioc.config;

import com.starlight.spring.ioc.model.Person;
import org.springframework.context.annotation.*;

/**
 * @author xghuang
 * @date 2019/6/18
 * @time 9:15
 * @desc:
 */
@Configuration
@ComponentScan(value = "com.starlight.spring.ioc")
public class MainConfig {

    @Bean("person")
    @Lazy
    @Scope(value = "singleton")
    public Person person2() {
        Person person = new Person();
        person.setUsername("JAR");
        person.setAge(12);
        return person;
    }
}
