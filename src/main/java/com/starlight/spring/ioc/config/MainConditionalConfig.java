package com.starlight.spring.ioc.config;

import com.starlight.spring.ioc.condition.LinuxCondition;
import com.starlight.spring.ioc.condition.WindowsCondition;
import com.starlight.spring.ioc.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author xghuang
 * @date 2019/6/18
 * @time 15:24
 * @desc:
 */
@Configuration
public class MainConditionalConfig {

    @Bean("linux")
    @Conditional({LinuxCondition.class})
    public Person linuxPerson() {
        return new Person("linux",89);
    }

    @Bean("windows")
    @Conditional({WindowsCondition.class})
    public Person winPerson() {
        return new Person("windows",45);
    }
}
