package com.cognizant.dao;

import java.util.List;

import com.cognizant.model.Student;

public interface StudentDao {
public String insert(Student student);
public List<Student> getAll();
public String update(Student student);
public String delete(Student student);
}
