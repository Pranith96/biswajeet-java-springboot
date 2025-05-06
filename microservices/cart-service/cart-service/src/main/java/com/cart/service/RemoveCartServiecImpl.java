package com.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cart.repository.CartRepository;

@Service
public class RemoveCartServiecImpl implements RemoveCartService {

	@Autowired
	CartRepository cartRepository;

	@Transactional
	@Override
	public String removeItemFromCart(Integer itemId) {
		cartRepository.deleteById(itemId);
		return "Item deleted Successfully";
	}
}
