package com.starlight.spring.ioc.config;

import com.starlight.spring.ioc.model.Student;
import com.starlight.spring.ioc.processor.MyBeanProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xghuang
 * @date 2019/6/18
 * @time 10:12
 * @desc:
 */
@Configuration
@ComponentScan(value = "com.starlight.spring.ioc")
public class BeanCycleConfig {

    @Bean(initMethod = "initMethod",destroyMethod = "destroyMethod")
    public Student student() {
        return new Student("张三丰","23");
    }

    @Bean
    public MyBeanProcessor myBeanProcessor() {
        return new MyBeanProcessor();
    }

}
