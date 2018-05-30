package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AttendanceSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    private String codeClass;
    private int timeSlotId;
    private String subjectId;
    private long checkDate;
    private int status;

    public AttendanceSlot() {
    }

    public AttendanceSlot(long checkDate){
        this.checkDate = System.currentTimeMillis();
    }
    public AttendanceSlot(String codeClass, int timeSlotId, String subjectId, long checkDate, int status) {
        this.codeClass = codeClass;
        this.timeSlotId = timeSlotId;
        this.subjectId = subjectId;
        this.checkDate = checkDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeClass() {
        return codeClass;
    }

    public void setCodeClass(String codeClass) {
        this.codeClass = codeClass;
    }

    public int getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(int timeSlotId) {
        this.timeSlotId = timeSlotId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public long getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(long checkDate) {
        this.checkDate = checkDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
