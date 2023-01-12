package com.ojas.spring_orm_application.service;

import java.util.List;

import com.ojas.spring_orm_application.model.Student;

public interface StudentService {

		
		public int addStudent(Student student);

		public Student getStudentById(int studentId);

		public List<Student> getAllStudent();

		public void updateStudent(Student student);

		public void deleteStudent(int studentId);
		


}
