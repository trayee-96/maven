package com.cognizant.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.model.Student;
import com.cognizant.service.StudentService;

@Controller
public class AppController {
	@Autowired
	private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String sayHello() {
		return "hello";
	}

	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String insertPage() {
		return "insert";
	}

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insert(HttpServletRequest request) {
		String id = request.getParameter("id");
		// System.out.println(id);
		String name = request.getParameter("name");
		Student s = new Student(id, name);
		String res = studentService.insert(s);
		System.out.println(s);
		request.setAttribute("anindita", res);
		return "insert";
	}

	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String updatePage() {
		return "update";
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(HttpServletRequest request) {
		String id = request.getParameter("id");
		// System.out.println(id);
		String name = request.getParameter("name");
		Student s = new Student(id, name);
		String res = studentService.update(s);
		System.out.println(s);
		request.setAttribute("anindita", res);
		return "update";
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String deletePage() {
		return "delete";
	}

	@RequestMapping(value = "delete", method = RequestMethod.POST)
	public String delete(HttpServletRequest request) {
		String id = request.getParameter("id");
		// String name=request.getParameter("name");
		Student s = new Student(id);
		String res = studentService.delete(s);
		System.out.println(s);
		request.setAttribute("msg", res);

		return "delete";

	}

	@RequestMapping(value = "getAll", method = RequestMethod.GET)
	public String getAll(HttpServletRequest request) {
		List<Student> list = studentService.getAll();
		request.setAttribute("Students", list);
		return "getAll";

	}
}
