package com.example.lab2.repository.stubs;

import com.example.lab2.model.JournalRecord;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class JournalRecordRepositoryStub {
    private static List<JournalRecord> records = new ArrayList<JournalRecord>();

    static {
        JournalRecord record1 = new JournalRecord();
        record1.setInfo(1, "Ivan Tolkunov", LocalDate.of(2001, 7, 7),true);
        
        JournalRecord record2 = new JournalRecord();
        record2.setInfo(2, "Alina Lytovchenko", LocalDate.of(2004, 6, 20),true);
        
        JournalRecord record3 = new JournalRecord();
        record3.setInfo(3, "Maksym Bidnyi", LocalDate.of(2004, 2, 20),true);
        
        JournalRecord record4 = new JournalRecord();
        record4.setInfo(4, "Matylda Starzynska", LocalDate.of(1999, 5, 29),true);
        
        JournalRecord record5 = new JournalRecord();
        record5.setInfo(5, "Anna Ivasishyna", LocalDate.of(2004, 2, 23),true);

        records.add(record1);
        records.add(record2);
        records.add(record3);
        records.add(record4);
        records.add(record5);
    }

    public JournalRecord findById(int id) {
        return  records.stream()
                .filter(s -> s.getStudentId() == id)
                .findFirst()
                .orElse(null);
    }

    public JournalRecord findByFullName(String fullName) {
        return records.stream()
                .filter(s -> s.getFullName().equals(fullName))
                .findFirst()
                .orElse(null);
    }

    public List<JournalRecord> findAll() {
        return records;
    }

    public void createRecord(JournalRecord student) {
        records.add(student);
    }

    public void updateRecord(JournalRecord student) {
        JournalRecord studentToUpdate = records.stream()
                .filter(s -> s.getStudentId() == student.getStudentId())
                .findAny().orElse(null);
        if(studentToUpdate != null) {
            studentToUpdate.setFullName(student.getFullName());
            studentToUpdate.setFullTimeEducationForm(student.isFullTimeEducationForm());
        }
    }

    public void deleteById(int id) {
        records.removeIf(s -> s.getStudentId() == id);
    }
}
