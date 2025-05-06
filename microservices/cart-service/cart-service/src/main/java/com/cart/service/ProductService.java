package com.cart.service;

import java.util.List;

import com.cart.dto.ProductDto;

public interface ProductService {

	ProductDto getProductById(Integer productId) throws Exception;

	void updateProductStockQuantity(ProductDto product) throws Exception;

	List<ProductDto> getAllProducts() throws Exception;

}
