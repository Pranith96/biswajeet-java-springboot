package com.cart.gateway;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.dto.ProductDto;
import com.cart.exceptions.BusinessException;
import com.cart.util.ClientBuilder;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductApi {

	private final static String rootUrl = "http://localhost:9090/product";

	@Autowired
	ClientBuilder<ProductAPIGateway> cleintBuilder;

	public ProductDto getProductById(Integer productId) throws Exception {
		try {
		ProductAPIGateway productAPIGateway = cleintBuilder.getClient(ProductAPIGateway.class, rootUrl);
		log.info(String.format("product API gateway details with details {} "), productAPIGateway);
		return productAPIGateway.getProductById(productId);
		} catch (BusinessException ex) {
			throw new Exception(String.format("Exception occurred while fetching product details from product service with product id %s", productId, ex.getMessage(),ex));
		}
	}

	public void updateProductStockQuantity(ProductDto product) throws Exception {
		try {
			Map<String, Object> header = Map.of("Content-Type","application/json", "Accept", "application/json");
			ProductAPIGateway productAPIGateway = cleintBuilder.getClient(ProductAPIGateway.class, rootUrl);
			log.info(String.format("product API gateway details with details {} "), productAPIGateway);
			 productAPIGateway.updateProductStockQuantity(product, header);
			} catch (BusinessException ex) {
				throw new Exception(String.format("Exception occurred while updating product details from product service with product id %s", product.getProductId(), ex.getMessage(),ex));
			}
	}

	public List<ProductDto> getAllProducts() throws Exception {
		try {
			ProductAPIGateway productAPIGateway = cleintBuilder.getClient(ProductAPIGateway.class, rootUrl);
			log.info(String.format("product API gateway details with details {} "), productAPIGateway);
			return productAPIGateway.getAllProducts();
			} catch (BusinessException ex) {
				throw new Exception(String.format("Exception occurred while fetching all the product details from product service ", ex.getMessage(),ex));
			}
	}

}
