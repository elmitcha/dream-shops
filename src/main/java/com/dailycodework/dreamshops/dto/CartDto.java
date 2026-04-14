package com.dailycodework.dreamshops.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Data
public class CartDto {
    private Long cartId;
    // private Set<CartItemDto> items = new HashSet<>();
    private Set<CartItemDto> items;
    private BigDecimal totalAmount;
}
