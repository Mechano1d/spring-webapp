package com.example.lab2.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("prototype")
public class Lesson {
    private int lessonId;
    private String subjectName;
    private int professorId;
    private String weekDay;
    private int classNumber;

    public Lesson() {}
    
    public void setInfo(int lessonId, String subjectName, int professorId, String weekDay, int classNumber) {
        this.lessonId = lessonId;
        this.professorId = professorId;
        this.subjectName = subjectName;
        this.weekDay = weekDay;
        this.classNumber = classNumber;
    }

    @Bean
    public int getLessonId() {
        return lessonId;
    }

    @Bean
    public int lesson_getProfessorId() {
        return professorId;
    }

    @Bean
    public String getSubjectName() {
        return subjectName;
    }

    @Bean
    public int getClassNumber() {
        return classNumber;
    }

    public String getWeekDay() {
        return weekDay;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonId=" + lessonId +
                ", subjectName='" + subjectName + '\'' +
                ", professorId=" + professorId +
                ", weekDay='" + weekDay + '\'' +
                ", classNumber=" + classNumber +
                '}';
    }
}
