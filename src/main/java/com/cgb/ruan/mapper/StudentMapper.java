/**
 * 功能说明:
 * 功能作者:
 * 创建日期:
 * 版权归属:每特教育|蚂蚁课堂所有 www.cgb.com
 */
package com.cgb.ruan.mapper;

import com.cgb.ruan.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;


public interface StudentMapper {
	@Select("select id ,name,age from student where id=#{id}")
	List<Student> getStudent(@Param("id") Long id);

	@Insert("insert into student values(null,#{name},#{age})")
	int addStudent(@Param("name") String name, @Param("age") Integer age);
}
