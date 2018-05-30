package com.example.demo.Model;

import com.example.demo.Entity.StudentClass;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentClassModel extends PagingAndSortingRepository<StudentClass, String> {
}
