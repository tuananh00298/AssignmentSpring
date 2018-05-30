package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Timeslots {
    @Id
    private int slotId;
    private String time_slot;

    public Timeslots(int slotId, String time_slot) {
        this.slotId = slotId;
        this.time_slot = time_slot;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public String getTime_slot() {
        return time_slot;
    }

    public void setTime_slot(String time_slot) {
        this.time_slot = time_slot;
    }
}
