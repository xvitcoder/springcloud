package com.xvitcoder.cloudfunction.servicetwo.core.domain.status;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderStatus {
    NEW("NEW"),
    CANCELED("CANCELED"),
    COMPLETED("COMPLETED");

    private String value;
}
