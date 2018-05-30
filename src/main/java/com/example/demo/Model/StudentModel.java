package com.example.demo.Model;

import com.example.demo.Entity.Students;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StudentModel extends PagingAndSortingRepository<Students, String> {
}
