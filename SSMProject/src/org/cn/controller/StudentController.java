package org.cn.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.cn.entity.Student;
import org.cn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("controller")
@Controller//StudentController加入IOC容器
public class StudentController {
	
	//控制器依赖于Service
	
	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping("queryStudentByNo/{stuNo}")
	public String queryStudentByNo(@PathVariable("stuNo") Integer stuNo,HashMap<String,Object> map) {
		Student student=studentService.queryStudentByNo(stuNo);
		
		ArrayList list = new ArrayList(); 
		list.add(student);
		map.put("student", student);
		
		return "result";
	}
	
	
}
