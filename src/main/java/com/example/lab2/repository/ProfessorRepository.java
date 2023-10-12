package com.example.lab2.repository;

import com.example.lab2.model.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Integer> {
    Professor findByFullName(String fullName);
}
