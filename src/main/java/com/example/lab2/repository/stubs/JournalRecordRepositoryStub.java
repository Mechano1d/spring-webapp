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
        record1.setStudentId(1);
        record1.setFullName("Ivan Tolkunov");
        record1.setBirthday(LocalDate.of(2001, 7, 7));
        record1.setFullTimeEducationForm(true);
        
        JournalRecord record2 = new JournalRecord();
        record2.setStudentId(2);
        record2.setFullName("Alina Lytovchenko");
        record2.setBirthday(LocalDate.of(2004, 6, 20));
        record2.setFullTimeEducationForm(true);
        
        JournalRecord record3 = new JournalRecord();
        record3.setStudentId(3);
        record3.setFullName("Maksym Bidnyi");
        record3.setBirthday(LocalDate.of(2004, 2, 20));
        record3.setFullTimeEducationForm(true);
        
        JournalRecord record4 = new JournalRecord();
        record4.setStudentId(4);
        record4.setFullName("Matylda Starzynska");
        record4.setBirthday(LocalDate.of(1999, 5, 29));
        record4.setFullTimeEducationForm(true);
        
        JournalRecord record5 = new JournalRecord();
        record5.setStudentId(5);
        record5.setFullName("Anna Ivasishyna");
        record5.setBirthday(LocalDate.of(2004, 2, 23));
        record5.setFullTimeEducationForm(true);
        
        
//        JournalRecord record2 = new JournalRecord(2, "Alina Lytovchenko", LocalDate.of(2004, 6, 20),true);
//        JournalRecord record3 = new JournalRecord(3, "Maksym Bidnyi", LocalDate.of(2004, 2, 20),true);
//        JournalRecord record4 = new JournalRecord(4, "Matylda Starzynska", LocalDate.of(1999, 5, 29),true);
//        JournalRecord record5 = new JournalRecord(5, "Anna Ivasishyna", LocalDate.of(2004, 2, 23),true);
        records.add(record1);
        records.add(record2);
        records.add(record3);
        records.add(record4);
        records.add(record5);
    }

    //@Bean
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
