/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.cgb.com
 */
package com.cgb.api.controller.index;

import com.cgb.ruan.entity.Student;
import com.cgb.ruan.service.StudentService;
import com.cgb.youxianqi.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.plugin2.util.SystemUtil;

import javax.transaction.Transactional;
import java.net.SocketPermission;
import java.util.Map;

@Controller
public class IndexControoller {

	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;

	@RequestMapping("/index/sayHello")
	public String sayHello(Map<String, Object> map){
		map.put("name","美丽的天使...");
		return "index";
	}

	@RequestMapping("/index/add")
	@ResponseBody
	@Transactional
	public String add(String name,int age){
		int i = studentService.addStudent(name, age);
		System.out.println("添加学生成功"+i);
		//int a=1/0;
		int i1 = teacherService.addTeacher(name, age);
		System.out.println("添加老师成功"+i1);
		return "success";
	}
}
