package com.example.FinalTask;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	@Autowired
	StudentRepo strep;
	 
	@GetMapping("/get")
	public ResponseEntity<List<Student>> getStudents(){
		return new ResponseEntity<>(strep.findAll(),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public String addStudents(@RequestBody Student student) {
		strep.save(student);
		return "Added";
	}
	

}
