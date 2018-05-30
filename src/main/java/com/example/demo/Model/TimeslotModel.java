package com.example.demo.Model;

import com.example.demo.Entity.Timeslots;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface TimeslotModel extends PagingAndSortingRepository<Timeslots, Integer> {
    @Override
    Optional<Timeslots> findById(Integer integer);
}
