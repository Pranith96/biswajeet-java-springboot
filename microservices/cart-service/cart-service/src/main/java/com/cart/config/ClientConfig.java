package com.cart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import com.cart.gateway.ProductClient;

@Configuration
public class ClientConfig<T> {

	@Bean
	public ProductClient productClient() {
		RestClient restClient = RestClient.builder().baseUrl("http://localhost:9090/product").build();
		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient))
				.build();
		return factory.createClient(ProductClient.class);

	}

//	@Bean
//	public UserClient userClient() {
//		RestClient restClient = RestClient.builder().baseUrl("http://localhost:9090/user").build();
//		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient))
//				.build();
//		return factory.createClient(UserClient.class);
//
//	}
	
//	@Bean
//	public T productClient() {
//		RestClient restClient = RestClient.builder().baseUrl("http://localhost:9090/product").build();
//		HttpServiceProxyFactory factory = HttpServiceProxyFactory.builderFor(RestClientAdapter.create(restClient))
//				.build();
//		return factory.createClient(T.class);
//
//	}
}
