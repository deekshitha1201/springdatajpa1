package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.student;

public interface studentrepository extends JpaRepository<student, Integer> {

}
