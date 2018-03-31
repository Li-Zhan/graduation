package cn.lynu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.lynu.mapper.StudentMapper;
import cn.lynu.mapper.TeacherMapper;
import cn.lynu.mapper.UserMapper;
import cn.lynu.model.Project;
import cn.lynu.model.Student;
import cn.lynu.model.Teacher;

@Service
public class TeacherService {
	
	@Autowired
	private TeacherMapper teacherMapper;
	@Autowired
	private StudentMapper studentMapper;
	@Autowired
	private UserMapper userMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Teacher> getSubTeacher(){
		return teacherMapper.getAllTeacher();
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Teacher> findTeacherByTeacherName(String teacherName){
		return teacherMapper.findTeacherByTeacherName(teacherName);
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public Teacher findTeacherAndProject(String teacherId) {
		return teacherMapper.findTeacherAndProject(teacherId);
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public Teacher findTeacherByUserId(String userId) {
		return teacherMapper.findTeacherByUserId(userId);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Student> getStudentByTeacherId(String teacherId) {
		return studentMapper.getStudentByTeacherId(teacherId);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public Teacher findTeacherByTeacherId(String teacherId) {
		return teacherMapper.findTeacherByTeacherId(teacherId);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public boolean updateTeacherInfo(Teacher teacher) {
		int bool1 = teacherMapper.updateByPrimaryKeySelective(teacher);
		int bool2 = userMapper.updateByPrimaryKeySelective(teacher.getUser());
		if(bool1>0&&bool2>0) {
			return true;
		}
		return false;
	}

}
