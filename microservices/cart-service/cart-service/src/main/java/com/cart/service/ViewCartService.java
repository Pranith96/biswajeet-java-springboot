package com.cart.service;

import java.util.Optional;

import com.cart.entity.Cart;

public interface ViewCartService {

	Optional<Cart> viewCart(Integer cartId);

}
