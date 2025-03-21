package me.dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"me.dio.domain.model.repository"})
@EntityScan(basePackages = {"me.dio.domain.model"})
public class SantanderDevWeek2025Application {
	public static void main(String[] args) {
		SpringApplication.run(SantanderDevWeek2025Application.class, args);
	}
}