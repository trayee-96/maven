package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.StudentDao;
import com.cognizant.model.Student;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
    private StudentDao studentDao;
	public String insert(Student student) {
		// TODO Auto-generated method stub
		return studentDao.insert(student);
	}

	/*public StudentDao getStudentDao() {
		return studentDao;
	}*/

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public List<Student> getAll() {
		return studentDao.getAll();
	}

	public String update(Student student) {
		return studentDao.update(student);
	}

	public String delete(Student student) {
		return studentDao.delete(student);
	}

}
