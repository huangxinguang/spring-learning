package com.starlight.spring.ioc.processor;

import com.starlight.spring.ioc.model.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author xghuang
 * @date 2019/6/18
 * @time 10:24
 * @desc:
 */
public class MyBeanProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof Student || beanName.equals("student")) {
            System.out.println("beforInitialization..---"+beanName);
            ((Student)bean).setName("王五");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof Student || beanName.equals("student")) {
            System.out.println("afterInitialization..---"+beanName);
        }
        return bean;
    }
}
