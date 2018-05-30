package com.example.demo.Entity;

import javax.persistence.*;

@Entity
public class AttendanceSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    private String codeClass;
    @ManyToOne
    private Timeslots timeSlotId;
    private String subjectId;
    private long checkDate;
    private int status;

    public AttendanceSlot() {
    }

    public AttendanceSlot(long checkDate){
        this.checkDate = System.currentTimeMillis();
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

    public Timeslots getTimeSlotId() {
        return timeSlotId;
    }

    public void setTimeSlotId(Timeslots timeSlotId) {
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
