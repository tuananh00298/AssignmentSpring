package com.example.demo.Model;

import com.example.demo.Entity.AttendanceDetail;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AttendanceDetailModel extends PagingAndSortingRepository<AttendanceDetail, Integer> {
}
