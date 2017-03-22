package com.example.serviceImpl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.easymock.EasyMock;
import org.junit.Test;

import com.example.model.Student;
import com.example.repository.StudentRepository;

public class StudentServiceImplTest {
@Test
public void testStudentServiceImpl(){
	StudentServiceImpl serviceImpl = new StudentServiceImpl();
	List<Student> list = new ArrayList<Student>();
	Student s1 = new Student();
	list.add(s1);
	list.add(s1);
	list.add(s1);
	list.add(s1);
	StudentRepository mockObject = 	EasyMock.createMock(StudentRepository.class);
	serviceImpl.studentRepository = mockObject;
	EasyMock.expect(mockObject.findAll()).andReturn(list).anyTimes();
	EasyMock.replay(mockObject);
	serviceImpl.findAll();
	assertEquals(4,serviceImpl.findAll().size());
	EasyMock.verify(mockObject);
	
}
}
