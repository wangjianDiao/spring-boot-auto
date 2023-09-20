package org.example.springspi.config;

import org.example.springspi.wjmybatis.WjMyBatisTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WjAutoConfiguration {

    @Bean
    public  WjAutoConfiguration createWjAutoConfigurationBean(){
        return new WjAutoConfiguration();
    }

    @Bean
    @ConditionalOnWj // 是否自动装配取决于 OnWjCondition 的返回值
    public WjMyBatisTemplate createWjMyBatisTemplate(){
        return new WjMyBatisTemplate();
    }
}
