package com.example.demo.Model;

import com.example.demo.Entity.AttendanceSlot;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AttendanceSlotModel extends PagingAndSortingRepository<AttendanceSlot, Integer> {
}
