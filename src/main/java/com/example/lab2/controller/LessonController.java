package com.example.lab2.controller;

import com.example.lab2.model.Lesson;
import com.example.lab2.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class LessonController {
    @Autowired
    LessonService lessonService;

    @GetMapping("/all-lessons")
    public String getAllLessons(Model model) {
        List<Lesson> lessons = lessonService.findAll();
        model.addAttribute("lessons", lessons);
        return "lessons-page";
    }
}
