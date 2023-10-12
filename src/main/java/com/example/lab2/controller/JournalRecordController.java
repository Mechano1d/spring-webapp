package com.example.lab2.controller;

import com.example.lab2.model.JournalRecord;
import com.example.lab2.service.JournalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class JournalRecordController {
    @Autowired
    JournalRecordService journalRecordService;

    @GetMapping("/all-records")
    public String getAllLessons(Model model) {
        List<JournalRecord> records = journalRecordService.findAll();
        model.addAttribute("records", records);
        return "records-page";
    }
}
