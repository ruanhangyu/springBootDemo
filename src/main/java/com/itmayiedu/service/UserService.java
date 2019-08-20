/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.itmayiedu.service;

import java.util.List;

import com.itmayiedu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itmayiedu.entity.Users;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public List<Users> getUser(Long id) {
		return userMapper.getUser(id);
	}

}
