/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.cgb.com
 */
package com.cgb.youxianqi.mapper;

import com.cgb.youxianqi.entity.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;


public interface TeacherMapper {
	@Select("select id ,name,age from teacher where id=#{id}")
	List<Teacher> getTeacher(@Param("id") Long id);

	@Insert("insert into teacher values(null,#{name},#{age})")
	int addTeacher(@Param("name") String name, @Param("age") Integer age);
}
