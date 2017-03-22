package com.example.service;

import java.util.List;

import com.example.model.AggregatedResult;
import com.example.model.Student;

public interface StudentDetailService {
	public Object[] getListOfStudents(String dataToSend);
}
