package com.example.lab2.service;

import com.example.lab2.model.Mark;
import com.example.lab2.repository.MarkRepository;
import com.example.lab2.repository.stubs.MarkRepositoryStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class MarkService {
    /* private MarkRepository markRepository;

    example of dependency injection through constructor
    @Autowired
    public MarkService(MarkRepository markRepository) {
        this.markRepository = markRepository;
    } -- to add later
    */

    private final MarkRepositoryStub markRepository;

    public MarkService(MarkRepositoryStub markRepository) {
        this.markRepository = markRepository;
    }

    public Mark findById(int id) {
        return  markRepository.findById(id);
    }

    public List<Mark> findAll() {
        return markRepository.findAll();
    }

    public void createMark(Mark mark) {
        markRepository.createMark(mark);
    }

    public void deleteById(int id) {
        markRepository.deleteById(id);
    }
}
