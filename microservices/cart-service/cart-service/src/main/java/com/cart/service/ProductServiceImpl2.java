package com.cart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.dto.ProductDto;
import com.cart.gateway.ProductClient;

import lombok.extern.slf4j.Slf4j;

@Service("service2")
@Slf4j
public class ProductServiceImpl2 implements ProductService {

	@Autowired
	ProductClient productClient;

	@Override
	public ProductDto getProductById(Integer productId) throws Exception {
		log.info("Product client triggered for getProductById");
		return productClient.getProductById(productId);
	}

	@Override
	public void updateProductStockQuantity(ProductDto product) throws Exception {
		log.info("Product client triggered for updateProductStockQuantity");
		productClient.updateProductStockQuantity(product);
	}

	@Override
	public List<ProductDto> getAllProducts() throws Exception {
		log.info("Product client triggered for getAllProducts");
		return productClient.getAllProducts();
	}

}
