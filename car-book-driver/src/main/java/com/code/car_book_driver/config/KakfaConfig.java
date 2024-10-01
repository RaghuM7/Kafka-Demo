package com.code.car_book_driver.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import com.code.car_book_driver.constant.AppConstant;

@Configuration
public class KakfaConfig {


    @Bean
    public NewTopic topic(){
        return TopicBuilder.
        name(AppConstant.CAB_LOCATION)
        .build();
    }


}
