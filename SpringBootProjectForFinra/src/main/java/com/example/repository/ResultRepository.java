package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.SemesterResult;

@Repository
public interface ResultRepository extends CrudRepository<SemesterResult, Integer> {

}
