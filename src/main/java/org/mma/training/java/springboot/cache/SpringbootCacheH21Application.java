package org.mma.training.java.springboot.cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootCacheH21Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCacheH21Application.class, args);
	}

}
