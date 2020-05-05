package com.liuencier.consumer.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: SpringCloudLearningCi
 * @description:
 * @author: liuenci
 * @create: 2020-05-03 10:58
 **/
@Configuration
public class CierRule {

    @Bean
    public IRule iRule() {
        return new RandomRule();
    }
}
