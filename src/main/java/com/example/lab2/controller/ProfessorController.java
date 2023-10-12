package com.example.lab2.controller;

import com.example.lab2.model.Professor;
import com.example.lab2.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProfessorController {
    @Autowired
    ProfessorService professorService;

    @GetMapping("/all-profs")
    public String getAllProfs(Model model) {
        List<Professor> professors = professorService.findAll();
        model.addAttribute("professors", professors);
        return "profs-page";
    }
}
