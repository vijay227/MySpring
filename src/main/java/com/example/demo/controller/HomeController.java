package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.student.Student;

@Controller
public class HomeController {

	@RequestMapping("home")
	public ModelAndView home(Student std) {
		System.out.println("in home");
		ModelAndView mv =new ModelAndView();
		mv.addObject("obj",std);
		mv.setViewName("home.jsp");
		return mv;
	}
}
