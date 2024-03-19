package com.app.helloworldspring.model;

import java.math.BigDecimal;

public record PaymentModel(
    String key, 
    BigDecimal amount
) {
    
}
