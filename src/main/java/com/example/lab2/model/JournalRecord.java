package com.example.lab2.model;

import java.time.LocalDate;

public class JournalRecord {
    private final int studentId;
    private String fullName;
    private final LocalDate birthday;
    private boolean isFullTimeEducationForm;

    public JournalRecord(int studentId, String fullName, LocalDate birthday, boolean fullTimeEducationForm) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.birthday = birthday;
        this.isFullTimeEducationForm = fullTimeEducationForm;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public boolean isFullTimeEducationForm() {
        return isFullTimeEducationForm;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFullTimeEducationForm(boolean isFullTimeEducationForm) {
        this.isFullTimeEducationForm = isFullTimeEducationForm;
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

