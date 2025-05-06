package com.cart.gateway;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;

import com.cart.dto.ProductDto;

import feign.HeaderMap;
import feign.Param;
import feign.RequestLine;

//Fiegn client
public interface ProductAPIGateway {

	@RequestLine("GET /get/{productId}")
	ProductDto getProductById(@Param("productId") Integer productId);

	@RequestLine("PUT /update/details")
	void updateProductStockQuantity(@RequestBody ProductDto product, @HeaderMap Map<String, Object> header);

	@RequestLine("GET /get")
	List<ProductDto> getAllProducts();
}
