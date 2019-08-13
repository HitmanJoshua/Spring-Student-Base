package com.hunter;

//import java.io.Console;

//import java.util.ArrayList;
//import java.util.List;

//import javax.servlet.http.HttpServletRequest;
//import javax.validation.Valid;
//import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping(path = "/studentForm")
	public String showStudentForm() {
		return "addStudent";
	}

	@RequestMapping(path = "/processAddStudent")
	public String processStudentFormV3() {
		

		

		
		
		
		return "home";
	}

	@RequestMapping(path = "/studentForm2")
	public String showStudentForm2() {
		return "studentDetails";
	}

}
