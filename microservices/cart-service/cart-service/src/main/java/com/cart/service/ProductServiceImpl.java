package com.cart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.dto.ProductDto;
import com.cart.gateway.ProductApi;

import lombok.extern.slf4j.Slf4j;

@Service("service1")
@Slf4j
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductApi productAPI;
		
	@Override
	public ProductDto getProductById(Integer productId) throws Exception {
		log.info("Product API triggered for getProductById");
		return productAPI.getProductById(productId);
	}

	@Override
	public void updateProductStockQuantity(ProductDto product) throws Exception {
		log.info("Product API triggered for updateProductStockQuantity");
		productAPI.updateProductStockQuantity(product);
	}

	@Override
	public List<ProductDto> getAllProducts() throws Exception {
		log.info("Product API triggered for getAllProducts");
		return productAPI.getAllProducts();
	}

}
