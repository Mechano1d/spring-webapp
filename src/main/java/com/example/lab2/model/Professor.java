package com.example.lab2.model;

import java.util.Objects;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Professor {
    private final int professorId;
    private String fullName;
    private String position;

    public Professor(int professorId, String fullName, String position) {
        this.professorId = professorId;
        this.fullName = fullName;
        this.position = position;
    }

    public int getProfessorId() {
        return professorId;
    }

    public String getFullName() {
        return fullName;
    }

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
