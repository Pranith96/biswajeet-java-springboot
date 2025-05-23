package com.cart.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.entity.Cart;
import com.cart.service.ViewCartService;

@RestController
@RequestMapping("/cart")
public class ViewCartController {

	@Autowired
	ViewCartService myCartService;

	@GetMapping(value = "/mycart/{cartId}")
	public ResponseEntity<Cart> viewCart(@PathVariable("cartId") Integer cartId) throws Exception {

		Optional<Cart> responseCartItem = myCartService.viewCart(cartId);

		if (!responseCartItem.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseCartItem.get());
		} else {
			return ResponseEntity.status(HttpStatus.OK).body(responseCartItem.get());
		}

	}
	
	@GetMapping(value = "/get")
	public ResponseEntity<String> getCart() {

		return ResponseEntity.status(HttpStatus.OK).body("acessed cart service");

	}
}