package com.example.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.Cache;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.Query;
import javax.persistence.SynchronizationType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.AggregatedResult;
import com.example.model.Student;
import com.example.repository.StudentDetailsRepository;
import com.example.service.StudentDetailService;

@Service
public class StudentDetailServiceImpl implements StudentDetailService {

	@Autowired
	StudentDetailsRepository studentDetailRepository;

	@Override
	public Object[] getListOfStudents(String dataToSend) {
		return studentDetailRepository.listOfStudentDetails(dataToSend);
	}

}
