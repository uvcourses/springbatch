package com.example.Learning.cache;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
 


@Service
public class StudentService 
{ 
	
	@Autowired 
	CacheManager cacheManager;  
	
    @Cacheable(cacheNames="student")
    public Student getStudentByID(String id) 
    {
        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
 
        return new Student(id,"Yuvaraj" ,"V");
    } 
    
    public Collection<String> getCacheName() { 
    	return cacheManager.getCacheNames();
    } 
    
    @Scheduled(fixedRate = 6000)
    public void evictAllCaches() { 
    	 System.out.println("Your Cache cleared");
    	cacheManager.getCacheNames().clear();
    }
    
}