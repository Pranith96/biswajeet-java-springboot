package com.cart.util;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import feign.Feign;
import feign.Logger.Level;
import feign.Retryer;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.slf4j.Slf4jLogger;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ClientBuilder<T> {

	public T getClient(Class<T> instance, @NonNull String rootUrl) {
		return Feign.builder()
				.retryer(new Retryer.Default(100L, TimeUnit.SECONDS.toMillis(1L), 3))
				.encoder(new GsonEncoder())
				.decoder(new GsonDecoder())
				.logger(new Slf4jLogger(instance))
				.logLevel(Level.FULL)
				.target(instance, rootUrl);
	}
}
