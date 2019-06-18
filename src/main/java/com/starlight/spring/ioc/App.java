package com.starlight.spring.ioc;

import com.starlight.spring.ioc.config.MainConditionalConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConditionalConfig.class);
        String[] beansName = applicationContext.getBeanDefinitionNames();
        for(String beanName: beansName) {
            System.out.println(beanName);
        }

       // Person person = (Person)applicationContext.getBean("person");
       // System.out.println(person);
        //Student student = (Student)applicationContext.getBean("student");
        //student.play();

        applicationContext.close();

    }
}
