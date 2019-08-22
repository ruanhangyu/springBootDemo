/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.cgb.com
 */
package com.cgb.ruan.service;

import java.util.List;

import com.cgb.ruan.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private StudentMapper studentMapper;

	public int addStudent(String name,Integer age) {
		return studentMapper.addStudent(name,age);
	}

}
