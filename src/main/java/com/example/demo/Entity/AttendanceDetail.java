package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AttendanceDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int attendanceSlotId;
    private String codeStudent;
    private long checkTime;
    private int status;

    public AttendanceDetail(long checkTime){
        this.checkTime = System.currentTimeMillis();
    }

    public AttendanceDetail(int attendanceSlotId, String codeStudent, long checkTime, int status) {
        this.attendanceSlotId = attendanceSlotId;
        this.codeStudent = codeStudent;
        this.checkTime = checkTime;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAttendanceSlotId() {
        return attendanceSlotId;
    }

    public void setAttendanceSlotId(int attendanceSlotId) {
        this.attendanceSlotId = attendanceSlotId;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public long getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(long checkTime) {
        this.checkTime = checkTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
