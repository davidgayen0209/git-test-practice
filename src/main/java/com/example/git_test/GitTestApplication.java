package com.example.git_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class GitTestApplication {

	public String purchase(@PathVariable String userName,@PathVariable double amount,
						   @PathVariable String productName){
		return "Hi"+ userName + "Order for" + productName + "with amount" + amount + "stored successfully";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitTestApplication.class, args);
	}

}
