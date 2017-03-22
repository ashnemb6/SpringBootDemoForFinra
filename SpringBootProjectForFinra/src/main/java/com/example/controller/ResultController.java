package com.example.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.model.SemesterResult;
import com.example.model.Student;
import com.example.service.ResultService;
import com.example.service.StudentService;

@Controller
public class ResultController {

	@Autowired
	ResultService resultService;

	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/add_result_student", method = RequestMethod.GET)
	public String showResultPage(Model model) {
		List<Student> students = studentService.findAll();
		model.addAttribute("students", students);
		model.addAttribute(new SemesterResult());
		return "add_result_student";
	}

	@RequestMapping(value = "/addResult", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("semesterResult") SemesterResult semesterResult,
			final RedirectAttributes redirectAttributes) {
		semesterResult.setStudent(studentService.findStudentById(semesterResult.getSerialNumber()));
		resultService.saveStudentResult(semesterResult);
		return "redirect:/add_result_student";
	}
}
