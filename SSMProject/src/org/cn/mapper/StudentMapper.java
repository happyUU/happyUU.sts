package org.cn.mapper;

import org.cn.entity.Student;

public interface StudentMapper {
	public void addStudent(Student student);
	Student queryStudentByNo(int stuNo);
}
