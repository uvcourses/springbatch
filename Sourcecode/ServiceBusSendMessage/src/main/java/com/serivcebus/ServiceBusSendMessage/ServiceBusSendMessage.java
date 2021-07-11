package com.serivcebus.ServiceBusSendMessage;

import java.util.concurrent.CountDownLatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class ServiceBusSendMessage {

	public static void main(String[] args) {
		SpringApplication.run(ServiceBusSendMessage.class, args); 
		    CountDownLatch countdownLatch = new CountDownLatch(1);
		    
	}

}
