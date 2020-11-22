package com.xvitcoder.cloudfunction.serviceone.core.domain;

import com.xvitcoder.cloudfunction.serviceone.core.domain.status.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private Long productId;
    private OrderStatus status;
}
