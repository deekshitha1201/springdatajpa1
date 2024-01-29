package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Entity.Company;
import com.example.Repository.Companyrepository;

@SpringBootApplication
public class Assignment1Application implements CommandLineRunner {
@Autowired
private Companyrepository cmpr;
	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Company c=new Company();
		c.setId(1);
		c.setName("TCS");
		c.setSalary(30000);
		cmpr.save(c);
	}

}
