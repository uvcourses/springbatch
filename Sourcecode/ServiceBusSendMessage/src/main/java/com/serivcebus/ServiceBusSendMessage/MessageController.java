package com.serivcebus.ServiceBusSendMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController { 
	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/sendEmail")
	public boolean sendMessage(@RequestParam String input) {  
		
		System.out.println("::::::::::::::: " + input);
		
		return messageService.sendMessage(input);
		
	} 

}
