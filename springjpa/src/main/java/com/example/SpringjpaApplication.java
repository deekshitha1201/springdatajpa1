package com.example;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Entity.Employee;
import com.example.Repository.Employeerepository;

@SpringBootApplication
public class SpringjpaApplication implements CommandLineRunner  {
	private Employeerepository empr;

	public static void main(String[] args) {
		SpringApplication.run(SpringjpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Employee> s=empr.findAll();
		s.forEach((p)->{
			System.out.println(p.getName());
			System.out.println(p.getAge());
			System.out.println("welcome");
		} );
		
		
		
	}

	public SpringjpaApplication(Employeerepository empr) {
		super();
		this.empr = empr;
	}

}
