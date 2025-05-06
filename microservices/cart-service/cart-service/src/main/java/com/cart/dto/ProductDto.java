package com.cart.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDto {

	private Integer productId;
	private String productCode;
	private String productName;
	private Integer stockQuantity;
	private Double pricePerItem;
}
