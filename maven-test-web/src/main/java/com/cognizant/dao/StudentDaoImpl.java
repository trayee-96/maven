package com.cognizant.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	public List<Student> list = new ArrayList<Student>(
			Arrays.asList(new Student("1", "Nayan"), new Student("2", "Ayan"), new Student("3", "Sayaan")));

	public String insert(Student student) {
		for (Student st : list) {
			if (st.getId()==student.getId()) {
				return "Fail";
			}
		}
		if (list.add(student)) {
			return "SUCCESS";
		}
		return "FAIL";

	}

	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return list;
	}

	

	public String delete(Student student) {
		for (Student s1 : list) {
			if (s1.getId().equals(student.getId())) {
				list.remove(s1);
				return "SUCCESS";
			}
		}
		return "FAIL";
	}
	public String update(Student student) {
		for (Student s1 : list) {
			if (s1.getId().equals(student.getId())) {
				s1.setName(student.getName());
				return "SUCCESS";
			}
		}
		return "FAIL";
	}
}
