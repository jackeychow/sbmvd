package com.zhj.sb.sbmvd.service;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;
import com.zhj.sb.sbmvd.entity.Student;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author Jc
 * @since 2018-10-09
 */
public interface IStudentService extends IService<Student> {

    List<Student> selectStudentPage(Integer pagenum, Integer pagesize);
    
    Student selectStudentByUsername(String username);
	
}
