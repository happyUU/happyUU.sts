package org.cn.service.impl;

import org.cn.entity.Student;
import org.cn.mapper.StudentMapper;
import org.cn.service.StudentService;

public class StudentServiceImpl implements StudentService{

	private StudentMapper studentMapper;//studentMapper即为dao的接口

	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}


	@Override
	public Student queryStudentByNo(int stuNo) {
		// 调用Dao层	
		return studentMapper.queryStudentByNo(stuNo);
	}


}
