package com.projetTrans.prjetTrans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PrjetTransApplication {
	public static void main(String[] args) {
		SpringApplication.run(PrjetTransApplication.class, args);
	}
}
