package com.producers.configs;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    public static final String EXG_NAME_MARKETPLACE = "marketplace.direct";
    public static final String QUEUE_PRODUCT_LOG = "product.log";
    public static final String RK_PRODUCT_LOG = "product.log";

    @Bean
    public Queue queue() {
        return QueueBuilder
                .durable(QUEUE_PRODUCT_LOG)
                .build();
    }

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(EXG_NAME_MARKETPLACE, false,false);
    }

    @Bean
    public Binding binding() {
        return BindingBuilder
                .bind(queue())
                .to(directExchange())
                .with(RK_PRODUCT_LOG);
    }
}
