package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Companies;

public interface companyrepository extends JpaRepository<Companies, Integer> {

}
