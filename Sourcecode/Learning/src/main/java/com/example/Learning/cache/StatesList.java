package com.example.Learning.cache;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class StatesList {
 
	
	public static List<String> stateResult=new ArrayList<String>(); 
	@Cacheable
	public List<String> getAvailableStates() { 
        System.out.print("No Cache");
		stateResult.add("IL"); 
		stateResult.add("NY");
		return stateResult;
	}
	
}
