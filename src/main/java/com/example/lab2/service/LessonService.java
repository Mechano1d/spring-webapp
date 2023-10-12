package com.example.lab2.service;

import com.example.lab2.repository.stubs.LessonRepositoryStub;
import org.springframework.stereotype.Service;
import com.example.lab2.model.Lesson;

import java.util.List;

@Service
public class LessonService {
    // private LessonRepository lessonRepository; -- to add later

    /* example of dependency injection through constructor
    @Autowired
    public LessonService(LessonRepository lessonRepository){
        this.lessonRepository = lessonRepository;
    } -- to add later
     */

    private final LessonRepositoryStub lessonRepository;

    public LessonService(LessonRepositoryStub lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public Lesson findById(int id) {
        return  lessonRepository.findById(id);
    }

    public List<Lesson> findAll() {
        return lessonRepository.findAll();
    }

    public void createLesson(Lesson lesson) {
        lessonRepository.createLesson(lesson);
    }

    public void deleteById(int id) {
        lessonRepository.deleteById(id);
    }
}
