package com.example.lab2.repository.stubs;

import com.example.lab2.model.Professor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProfessorRepositoryStub {
    private static List<Professor> professors = new ArrayList<Professor>();

    static {
        Professor professor1 = new Professor();
        professor1.setInfo(1, "Svitlana Proskura", "Dean");
        
        Professor professor2 = new Professor();
        professor2.setInfo(2, "Yaroslav Kornaga", "Professor");
        
        Professor professor3 = new Professor();
        professor3.setInfo(3, "Yevgeniy Vovk", "Professor");
        
        Professor professor4 = new Professor();
        professor4.setInfo(4, "Yuliia Kuliasha", "Professor");
        
        Professor professor5 = new Professor();
        professor5.setInfo(5, "Volodymyr Popenko", "Professor");
        
        professors.add(professor1);
        professors.add(professor2);
        professors.add(professor3);
        professors.add(professor4);
        professors.add(professor5);
    }

    public Professor findById(int id) {
        return  professors.stream()
                .filter(prof -> prof.getProfessorId() == id)
                .findFirst()
                .orElse(null);
    }

    public Professor findByFullName(String fullName) {
        return professors.stream()
                .filter(prof -> prof.getFullName().equals(fullName))
                .findFirst()
                .orElse(null);
    }

    public List<Professor> findAll() {
        return professors;
    }

    public void createProfessor(Professor professor) {
        professors.add(professor);
    }

    public void updateProfessor(Professor professor) {
        Professor profToUpdate = professors.stream()
                .filter(prof -> prof.getProfessorId() == professor.getProfessorId())
                .findAny().orElse(null);
        if(profToUpdate != null) {
            profToUpdate.setFullName(professor.getFullName());
            profToUpdate.setPosition(professor.getPosition());
        }
    }

    public void deleteById(int id) {
        professors.removeIf(prof -> prof.getProfessorId() == id);
    }
}
