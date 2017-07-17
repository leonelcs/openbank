package br.com.openbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan
@EnableSwagger2
public class OpenBankMobilePocApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenBankMobilePocApplication.class, args);
	}
}
