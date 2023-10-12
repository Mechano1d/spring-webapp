package com.example.lab2.controller;

import com.example.lab2.model.Mark;
import com.example.lab2.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class MarkController {
    @Autowired
    MarkService markService;

    @GetMapping("/all-marks")
    public String getAllMarks(Model model) {
        List<Mark> marks = markService.findAll();
        model.addAttribute("marks", marks);
        return "marks-page";
    }
}
