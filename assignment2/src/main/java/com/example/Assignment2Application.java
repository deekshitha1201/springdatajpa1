package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Entity.Companies;
import com.example.repository.companyrepository;

@SpringBootApplication
public class Assignment2Application implements CommandLineRunner {
@Autowired
private companyrepository cmpr;
	public static void main(String[] args) {
		SpringApplication.run(Assignment2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Companies c=new Companies();
		c.setId(1);
		c.setName("amazon");
		c.setSalary(35000);
		Companies c1=new Companies();
		c1.setId(2);
		c1.setName("amazon");
		c1.setSalary(35000);
		cmpr.saveAll(List.of(c,c1));
		cmpr.deleteById(2);
		
		
	}

}
