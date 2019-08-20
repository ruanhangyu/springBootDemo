/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.itmayiedu.api.controller;

import java.util.List;

import com.itmayiedu.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmayiedu.ehcache.MapEhcaChe;
import com.itmayiedu.entity.Users;
import com.itmayiedu.service.UserService;
@RestController
public class IndexControoller {
	@Autowired
	private UserService userService;
	@Autowired
	private RedisService redisService;

	@RequestMapping("/getUser")
	public List<Users> getUser(Long id) {
		return userService.getUser(id);
	}

	@RequestMapping("/setString")
	public String setString(String key, String object) {
		redisService.set(key, object, 60l);
		return "success";
	}

	@RequestMapping("/get")
	public String get(String key) {
		return redisService.getString(key);
	}

}
