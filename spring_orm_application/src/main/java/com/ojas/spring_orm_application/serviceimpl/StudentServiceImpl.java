package com.ojas.spring_orm_application.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ojas.spring_orm_application.dao.StudentDAO;
import com.ojas.spring_orm_application.model.Student;
import com.ojas.spring_orm_application.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO dao;

	public int addStudent(Student student) {
		return dao.addStudent;
	}

	public Student getStudentById(int studentId) {
		// TODO Auto-generated method stub
		return dao.getStudentById(studentId);
	}

	@Override
	public List<Product> getAllStudent() {
		// TODO Auto-generated method stub
		return dao.getAllStudent();
	}

	@Override
	public void updateStudent(Student student) {

		dao.updateStudent(student);

	}

	@Override
	public void deleteStudent(int studentId) {

		dao.deleteStuduent(studentId);
	}

}