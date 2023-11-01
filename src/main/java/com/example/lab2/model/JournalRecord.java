package com.example.lab2.model;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("prototype")
public class JournalRecord {
    private int studentId;
    private String fullName;
    private LocalDate birthday;
    private boolean isFullTimeEducationForm;

    public JournalRecord() {}
    
    
//    public JournalRecord(int studentId, String fullName, LocalDate birthday, boolean fullTimeEducationForm) {
//        this.studentId = studentId;
//        this.fullName = fullName;
//        this.birthday = birthday;
//        this.isFullTimeEducationForm = fullTimeEducationForm;
//    }
    
    //Setter injection 
    
    public void setStudentId(int studentId) {
    	this.studentId = studentId;
    }
    
    public void setFullName(String fullName) {
    	this.fullName = fullName;
    }
    
    public void setBirthday(LocalDate birthday) {
    	this.birthday = birthday;
    }

    public boolean isFullTimeEducationForm() {
        return isFullTimeEducationForm;
    }

    public void setFullTimeEducationForm(boolean isFullTimeEducationForm) {
        this.isFullTimeEducationForm = isFullTimeEducationForm;
    }
    
    
    //Bean methods

    @Bean
    public int getStudentId() {
        return studentId;
    }

    @Bean
    public String getFullName() {
        return fullName;
    }

    @Bean
    public LocalDate getBirthday() {
        return birthday;
    }



    @Override
    public String toString() {
        return "JournalRecord{" +
                "studentId=" + studentId +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", isFullTimeEducationForm=" + isFullTimeEducationForm +
                '}';
    }
}

