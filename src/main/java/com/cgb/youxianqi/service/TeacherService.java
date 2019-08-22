/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.cgb.com
 */
package com.cgb.youxianqi.service;

import com.cgb.youxianqi.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
	@Autowired
	private TeacherMapper teacherMapper;

	public int addTeacher(String name,Integer age) {
		return teacherMapper.addTeacher(name,age);
	}

}
