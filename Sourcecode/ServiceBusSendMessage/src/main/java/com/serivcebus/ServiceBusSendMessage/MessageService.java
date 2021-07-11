package com.serivcebus.ServiceBusSendMessage;

import org.springframework.stereotype.Component;

import com.azure.messaging.servicebus.ServiceBusClientBuilder;
import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusSenderClient;

@Component
public class MessageService {
 
	
	public boolean sendMessage(String message) { 
		
		String connectionString = "Endpoint=sb://emailname.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=xWWus0In2LfqmMT1WKOAVnEtaPwzNpnrOz0sRXrNhiw=";
		 String queueName = "emailqueue";   
		 
		 ServiceBusSenderClient senderClient = new ServiceBusClientBuilder()
		            .connectionString(connectionString)
		            .sender()
		            .queueName(queueName)
		            .buildClient();

		    // send one message to the queue
		    senderClient.sendMessage(new ServiceBusMessage(message)); 
		    System.out.println("Sent a single message to the queue: " + queueName); 
		    return true;
	}
	
}
