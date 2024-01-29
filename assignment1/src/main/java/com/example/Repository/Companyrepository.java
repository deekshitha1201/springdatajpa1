package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Company;

public interface Companyrepository extends JpaRepository<Company, Integer> {

}
