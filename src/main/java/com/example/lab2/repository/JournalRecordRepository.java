package com.example.lab2.repository;

import com.example.lab2.model.JournalRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JournalRecordRepository extends CrudRepository<JournalRecord, Integer> {
    JournalRecord findByFullName(String fullName);
}
