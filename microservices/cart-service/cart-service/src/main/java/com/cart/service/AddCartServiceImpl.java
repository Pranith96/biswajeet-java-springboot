package com.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cart.dto.ProductDto;
import com.cart.entity.Cart;
import com.cart.exceptions.BusinessException;
import com.cart.repository.CartRepository;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Transactional
public class AddCartServiceImpl implements AddCartService {

	@Qualifier("service2")
	@Autowired
	ProductService productService;

	@Autowired
	CartRepository cartRepository;

	@Override
	public Cart addCart(Cart item) throws Exception {
		int productId = item.getProductId();
		ProductDto product = productService.getProductById(productId);
		log.info(String.format("product response for product id %s is %s", productId, product));

		Cart response = null;

		if (product.getStockQuantity() > 0 && item.getQuantity() <= product.getStockQuantity()) {
		
			double totalPrice = item.getQuantity() * product.getPricePerItem();
			item.setTotalPrice(totalPrice);
			response = cartRepository.save(item);
			if (response == null) {
				throw new BusinessException("Order not proccessed");
			}
			updateProductRecords(product, item);
		} else {
			throw new Exception(String.format("Insufficient quantity for product id %s", productId));
		}

		return response;
	}

	private void updateProductRecords(ProductDto product, Cart item) throws Exception {
		Integer updatedStockQuantity = product.getStockQuantity() - item.getQuantity();
		product.setStockQuantity(updatedStockQuantity);
		productService.updateProductStockQuantity(product);
	}

}
