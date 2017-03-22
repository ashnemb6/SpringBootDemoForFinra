package com.example.service;

import java.util.List;

import com.example.model.SemesterResult;

public interface ResultService {
	public List<SemesterResult> findAll();

	public void saveStudentResult(SemesterResult result);
}
