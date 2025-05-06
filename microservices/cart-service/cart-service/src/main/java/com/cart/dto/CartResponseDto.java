package com.cart.dto;

import lombok.Data;

@Data
public class CartResponseDto {

	private Integer cartId;
	private Integer quantity;
	private Integer productId;
	private Double itemPrice;
}
