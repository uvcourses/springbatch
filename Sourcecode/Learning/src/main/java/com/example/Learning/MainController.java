package com.example.Learning;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Learning.cache.StatesList;
import com.example.Learning.cache.Student;
import com.example.Learning.cache.StudentService;

@RestController
public class MainController {
	@Autowired
	private static StatesList stateList;

	@Autowired
	StudentService studentService;

	@RequestMapping("/greetings")
	public String getMessage() {

		return "Hello";

	}

	@RequestMapping("/getAvailableStates")
	public List<String> getStates() {
		return stateList.getAvailableStates();
	}

	@RequestMapping("/student/{id}")
	public Student findStudentById(@PathVariable String id) {
		System.out.println("Searching by ID  : " + id);

		Student s = studentService.getStudentByID(id);

		return s;
	}

	@RequestMapping("/student/cacheName")
	public Collection<String> getCacheNames() {
		System.out.println("getCacheNames");

		return studentService.getCacheName();

	}
}
