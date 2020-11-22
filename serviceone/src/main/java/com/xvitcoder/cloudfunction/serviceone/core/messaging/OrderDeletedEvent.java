package com.xvitcoder.cloudfunction.serviceone.core.messaging;

import com.xvitcoder.cloudfunction.serviceone.core.domain.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDeletedEvent {
    private Order order;
}
