/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.itmayiedu.com
 */
package com.itmayiedu.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import com.itmayiedu.entity.Users;

//配置缓存基本信息
@CacheConfig(cacheNames = "userCache")
public interface UserMapper {
	@Select("SELECT ID ,NAME,AGE FROM student where id=#{id}")
	//将查询的信息放入缓存中
	@Cacheable
	List<Users> getUser(@Param("id") Long id);
}
