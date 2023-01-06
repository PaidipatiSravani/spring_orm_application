package com.ojas.spring_orm_application.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ojas.spring_orm_application.model.Student;
@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	public int addStudent(Student student) {
		int i=(int) hibernateTemplate.save(student);
		return i;
	}

	@Override
	public Student getStudentById(int studentId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Student.class, studentId);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Student.class);
	}

	@Override
	public void updateStudent(Student student) {
		Student s = getStudentById(student.getStudentId());
		s.setStudentName(student.getStudentName());
		s.setStudentAddress(student.getStudentAddress());
		hibernateTemplate.update(s);
	}

	@Override
	public void deleteStudent(int studentId) {
		// TODO Auto-generated method stub
	 hibernateTemplate.delete(Student.class);
	}

}
