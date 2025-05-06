package com.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.dto.ProductDto;
import com.cart.entity.Cart;
import com.cart.service.AddCartService;
import com.cart.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RefreshScope
@Slf4j
@RequestMapping("/cart")
public class AddCartController {

	@Autowired
	AddCartService addCartService;
	
	@Qualifier("service1")
	@Autowired
	ProductService productService;

	@PostMapping(value = "/add")
	public ResponseEntity<Cart> addCart(@RequestBody Cart cart) throws Exception {
		return ResponseEntity.ok(addCartService.addCart(cart));
	}
	
	@GetMapping("/getproductdetails")
	public ResponseEntity<List<ProductDto>> getAllProducts() throws Exception {
		List<ProductDto> products= productService.getAllProducts();
		return ResponseEntity.status(HttpStatus.OK).body(products);
	}

	@GetMapping("/add/product")
	public ResponseEntity<ProductDto> addProduct(@RequestBody ProductDto product) {

		String url = "http://localhost:9091/product/add";
//		Product product = new Product();
//		product.setProductCode("678tyu");
//		product.setPricePerItem(450.0);
//		product.setProductName("mobile");
//		product.setStockQuantity(30);
		ProductDto productDetails = null;//restTemplate.postForObject(url, product, Product.class);

		return ResponseEntity.status(HttpStatus.OK).body(productDetails);
	}

	@GetMapping("/delete/product")
	public ResponseEntity<String> deleteProduct() {

		String url = "http://localhost:9091/product/delete/{productId}";
		Integer productId = 2;
	//	restTemplate.delete(url, productId);
		return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
	}
}
