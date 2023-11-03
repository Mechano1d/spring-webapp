package com.example.lab2.model;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("prototype")
public class Mark {
    private int markId;
    private int studentId;
    private int lessonId;
    private LocalDate date;
    private int mark;

    public Mark() {}

    public void setInfo(int markId, int studentId, int lessonId, LocalDate date, int mark) {
        this.markId = markId;
        this.studentId = studentId;
        this.lessonId = lessonId;
        this.date = date;
        this.mark = mark;
    }
    
    @Bean
    public int getMarkId() { 
    	return markId; 
    }

    @Bean
    public int mark_getStudentId() {
        return studentId;
    }

    @Bean
    public int mark_getLessonId() {
        return lessonId;
    }

    @Bean
    public LocalDate getDate() {
        return date;
    }

    @Bean
    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "markId=" + markId +
                ", studentId=" + studentId +
                ", lessonId=" + lessonId +
                ", date=" + date +
                ", mark=" + mark +
                '}';
    }
}
