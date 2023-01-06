package com.ojas.spring_orm_application.dao;

import java.util.List;

import com.ojas.spring_orm_application.model.Student;
import com.ojas.spring_orm_application.model.Users;

public interface StudentDAO {
	
	public int addStudent(Student student);
	
	public Student getStudentById(int studentId);
	
	public List<Student> getAllStudents();
	
	public void updateStudent(Student student);
	
	public void deleteStudent(int studentId);
	
}
