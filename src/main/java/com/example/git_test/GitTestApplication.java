package com.example.git_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class GitTestApplication {

	@PostMapping("/purchase")
	public String purchase(@RequestBody Order order){
		return "Hi"+ order.getUserName() + "Order for" + order.getProductName() + "with amount" + order.getPrice() + "stored successfully";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitTestApplication.class, args);
	}

}
