package com.xvitcoder.cloudfunction.serviceone.core.messaging;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderEventListener {

    private final StreamBridge streamBridge;

    @Async
    @EventListener
    public void onOrderCreatedEvent(OrderCreatedEvent event) {
        streamBridge.send("orders", MessageBuilder
                .withPayload(event)
                .setHeader("eventType", "OrderCreatedEvent")
                .build());
    }

    @Async
    @EventListener
    public void onOrderDeletedEvent(OrderDeletedEvent event) {
        streamBridge.send("orders", MessageBuilder
                .withPayload(event)
                .setHeader("eventType", "OrderDeletedEvent")
                .build());
    }
}
