package com.example.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.model.Student;
import com.example.service.StudentService;

import org.springframework.ui.Model;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/add_student_info", method = RequestMethod.GET)
	public String showStudentPage(Model model) {
		model.addAttribute(new Student());
		return "add_student_info";
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") Student student, final RedirectAttributes redirectAttributes) {
		studentService.saveStudent(student);
		return "redirect:/add_student_info";
	}

}
