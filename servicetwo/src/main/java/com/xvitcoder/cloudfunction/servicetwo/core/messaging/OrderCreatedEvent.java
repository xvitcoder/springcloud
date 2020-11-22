package com.xvitcoder.cloudfunction.servicetwo.core.messaging;

import com.xvitcoder.cloudfunction.servicetwo.core.domain.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCreatedEvent {
    private Order order;
}
