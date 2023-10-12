package com.example.lab2.repository;

import com.example.lab2.model.Mark;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  MarkRepository extends CrudRepository<Mark, Integer> {
}
