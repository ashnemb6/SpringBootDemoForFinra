package com.example.model;

import static org.junit.Assert.*;

import org.apache.hadoop.mapred.gethistory_jsp;
import org.junit.Before;
import org.junit.Test;

import scala.annotation.meta.setter;

public class StudentTest {
	Student obj;
	@Before
	public void setUp(){	
		 obj = new Student();
		
	}

	@Test
	public void testStudent(){
		obj.setDepartment("123");
		assertEquals("123", obj.getDepartment());
	}
	
}
