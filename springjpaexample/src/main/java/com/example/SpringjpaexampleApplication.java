package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jpa.student;
import com.example.repository.studentrepository;

@SpringBootApplication
public class SpringjpaexampleApplication implements CommandLineRunner {
	private studentrepository sr;

	public SpringjpaexampleApplication(studentrepository sr) {
		super();
		this.sr = sr;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringjpaexampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		student s=new student();
		s.setName("deekshu");
		s.setCity("srikakulam");
		sr.save(s);
		s.setName("purnima");
		s.setCity("vijayanagaram");	
		sr.save(s);
		Boolean status=sr.existsById(6);
		System.out.println(status);
		sr.deleteById(7);
		sr.findById(10);
		
		
	}

}
