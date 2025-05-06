package com.cart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.entity.Cart;
import com.cart.repository.CartRepository;

@Service
public class ViewCartServiceImpl implements ViewCartService {
	@Autowired
	CartRepository cartRepository;

	@Override
	public Optional<Cart> viewCart(Integer cartId) {
		Optional<Cart> viewCartresponse = cartRepository.findById(cartId);
		return viewCartresponse;
	}
}
