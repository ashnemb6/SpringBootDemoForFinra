package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.SemesterResult;
import com.example.repository.ResultRepository;
import com.example.service.ResultService;

@Service
@Transactional
public class ResultServiceImpl implements ResultService {

	@Autowired
	ResultService resultService;

	@Autowired
	ResultRepository resultRepository;

	@Override
	public List<SemesterResult> findAll() {
		return (List<SemesterResult>) resultRepository.findAll();
	}

	@Override
	public void saveStudentResult(SemesterResult result) {
		resultRepository.save(result);

	}

}
