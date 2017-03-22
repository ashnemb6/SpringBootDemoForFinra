package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.AggregatedResult;
import com.example.model.Student;

@Repository
public interface StudentDetailsRepository extends JpaRepository<AggregatedResult, Integer> {

	@Query("select s.serialNumber, s.name, s.department, avg(r.percentage) from Student s left join SemesterResult r on s.serialNumber = r.serialNumber where s.department=:dataToSend  Group by s.serialNumber")
	public Object[] listOfStudentDetails(@Param("dataToSend") String dataToSend);

}