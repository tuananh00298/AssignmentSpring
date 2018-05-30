package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentClass {
    @Id
    private int id;
    private String codeStudentId;
    private String codeClassId;
    private long createdAt;
    private int status;


    public StudentClass(long createdAt) {
        this.createdAt = System.currentTimeMillis();
    }

    public StudentClass(String codeStudentId, String codeClassId, long createdAt, int status) {
        this.codeStudentId = codeStudentId;
        this.codeClassId = codeClassId;
        this.createdAt = createdAt;
        this.status = status;
    }

    public String getCodeStudentId() {
        return codeStudentId;
    }

    public void setCodeStudentId(String codeStudentId) {
        this.codeStudentId = codeStudentId;
    }

    public String getCodeClassId() {
        return codeClassId;
    }

    public void setCodeClassId(String codeClassId) {
        this.codeClassId = codeClassId;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
