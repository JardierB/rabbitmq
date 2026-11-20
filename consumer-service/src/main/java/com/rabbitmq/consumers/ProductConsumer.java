package com.rabbitmq.consumers;

import com.commons.dtos.ProductDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import static com.commons.constants.RabbitMQConstants.QUEUE_PRODUCT_LOG;


@Log4j2
@Component
public class ProductConsumer {

    @RabbitListener(queues = {QUEUE_PRODUCT_LOG})
    public void consumerLog(ProductDTO message) {
        log.info("Consumer received a message: " + message.toString());
    }

}
