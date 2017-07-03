package ru.javabegin.springboot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class TestbootApplication {

	@Autowired
	private MainController mainController;

	@PostConstruct
	public void init(){
		mainController.showData();
	}

	public static void main(String[] args) {
		SpringApplication.run(TestbootApplication.class, args);
	}
}
