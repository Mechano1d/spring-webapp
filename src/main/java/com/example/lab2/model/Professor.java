package com.example.lab2.model;

import java.util.Objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("prototype")
public class Professor {
    private int professorId;
    private String fullName;
    private String position;

    public Professor() {

    }

    public void setInfo(int professorId, String fullName, String position) {
        this.professorId = professorId;
        this.fullName = fullName;
        this.position = position;
    }
    
    @Bean
    public int getProfessorId() {
        return professorId;
    }

    @Bean
    public String professor_getFullName() {
        return fullName;
    }

    @Bean
    public String getPosition() {
        return position;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "professorId=" + professorId +
                ", fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
