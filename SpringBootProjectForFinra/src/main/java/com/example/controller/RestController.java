package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.AggregatedResult;
import com.example.model.Student;
import com.example.service.StudentDetailService;
import com.google.gson.Gson;

@Controller
public class RestController {

	@Autowired
	StudentDetailService studentDetailService;

	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String showResultPage() {
		return "result";
	}

	@RequestMapping(value = "/showStudentDetails/{dataToSend}")
	public @ResponseBody String showResults(@PathVariable String dataToSend) {
		// System.out.println(dataToSend+"AAAYOOOO");
		Object[] students = studentDetailService.getListOfStudents(dataToSend);
		Object[] o = (Object[]) students[0];
		List<AggregatedResult> ar = new ArrayList<>();
		for (Object os : students) {
			Object[] innerObj = (Object[]) os;
			AggregatedResult res = new AggregatedResult();
			res.setSerialNumber((Integer) innerObj[0]);
			res.setName((String) innerObj[1]);
			res.setDepartment((String) innerObj[2]);
			res.setAverage((Double) innerObj[3]);

			ar.add(res);
		}

		Integer stu = (Integer) o[0];
		System.out.println("fsfds" + stu);
		Gson gson = new Gson();
		String a = gson.toJson(ar);
		return a;

	}
}
