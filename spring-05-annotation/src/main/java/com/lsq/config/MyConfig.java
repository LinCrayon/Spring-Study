package com.lsq.config;

import com.lsq.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author linshengqian
 */
@Configuration
@Import(MyConfig01.class)
public class MyConfig {
    @Bean
    public Dog dog(){
        return new Dog();
    }
}
