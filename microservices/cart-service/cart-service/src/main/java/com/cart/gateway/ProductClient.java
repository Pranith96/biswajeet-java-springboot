package com.cart.gateway;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PutExchange;

import com.cart.dto.ProductDto;

// springboot internal
public interface ProductClient {

	@GetExchange("/get/{productId}")
	ProductDto getProductById(@PathVariable("productId") Integer productId);

	@PutExchange("/update/details")
	void updateProductStockQuantity(@RequestBody ProductDto product);

	@GetExchange("/get")
	List<ProductDto> getAllProducts();
}
