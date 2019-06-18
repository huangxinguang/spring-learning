package com.starlight.spring.ioc;

import com.starlight.spring.ioc.config.MainConditionalConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xghuang
 * @date 2019/6/18
 * @time 15:37
 * @desc:
 */
public class MainConditional {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConditionalConfig.class);
        String[] beansName = applicationContext.getBeanDefinitionNames();
        for(String beanName: beansName) {
            System.out.println(beanName);
        }
        applicationContext.close();

    }
}
