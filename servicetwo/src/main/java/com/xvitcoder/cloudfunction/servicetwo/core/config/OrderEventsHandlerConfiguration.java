package com.xvitcoder.cloudfunction.servicetwo.core.config;

import com.xvitcoder.cloudfunction.servicetwo.core.messaging.OrderCreatedEvent;
import com.xvitcoder.cloudfunction.servicetwo.core.messaging.OrderDeletedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Slf4j
@Configuration
public class OrderEventsHandlerConfiguration {

    @Bean
    public Consumer<OrderCreatedEvent> onOrderCreatedEvent() {
        return event -> log.info("New order created: {}", event);
    }

    @Bean
    public Consumer<OrderDeletedEvent> onOrderDeletedEvent() {
        return event -> log.info("Existing order deleted: {}", event);
    }
}
