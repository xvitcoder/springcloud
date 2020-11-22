package com.xvitcoder.cloudfunction.serviceone.core.service;

import com.xvitcoder.cloudfunction.serviceone.core.domain.Order;
import com.xvitcoder.cloudfunction.serviceone.core.domain.status.OrderStatus;
import com.xvitcoder.cloudfunction.serviceone.core.messaging.OrderCreatedEvent;
import com.xvitcoder.cloudfunction.serviceone.core.messaging.OrderDeletedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final ApplicationEventPublisher publisher;

    private Order findOrderById(Long orderId) {
        return new Order(orderId, 123L, OrderStatus.COMPLETED);
    }

    public Order createOrder(Order order) {
        order.setId(1L);

        // Store order in DB
        // ...


        // Publish OrderCreatedEvent
        publisher.publishEvent(new OrderCreatedEvent(order));

        return order;
    }

    public void deleteOrder(Long orderId) {
        Order order = findOrderById(orderId);

        // Delete order from DB
        // ...

        // Publish OrderDeletedEvent
        publisher.publishEvent(new OrderDeletedEvent(order));
    }
}
