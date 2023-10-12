package com.example.lab2.service;

import com.example.lab2.model.Professor;
import com.example.lab2.repository.ProfessorRepository;
import com.example.lab2.repository.stubs.ProfessorRepositoryStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfessorService {
    /* private ProfessorRepository professorRepository; -- to add later

    example of dependency injection through constructor
    @Autowired
    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    } -- to add later
    */

    private final ProfessorRepositoryStub professorRepository;

    public ProfessorService(ProfessorRepositoryStub professorRepository) {
        this.professorRepository = professorRepository;
    }

    public Professor findById(int id) {
        return professorRepository.findById(id);
    }

    public Professor findByFullName(String fullName) {
        return professorRepository.findByFullName(fullName);
    }

    public List<Professor> findAll() {
        return professorRepository.findAll();
    }

    public void createProfessor(Professor professor) {
        professorRepository.createProfessor(professor);
    }

    public void updateProfessor(Professor professor) {
        professorRepository.updateProfessor(professor);
    }

    public void deleteById(int id) {
        professorRepository.deleteById(id);
    }
}
