package com.brainyi.fruitfresh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author ahao
 */
@SpringBootApplication
@EnableOpenApi
@MapperScan("com.brainyi.fruitfresh.mapper")
public class FruitFreshApplication {
	public static void main(String[] args) {
		SpringApplication.run(FruitFreshApplication.class, args);
	}
}
