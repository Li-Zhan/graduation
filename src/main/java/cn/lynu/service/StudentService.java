package cn.lynu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.lynu.mapper.StudentMapper;
import cn.lynu.model.Student;
import cn.lynu.model.User;

@Service
public class StudentService {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public Student getStudentByUserId(String userId) {
		return studentMapper.getStudentByUserId(userId);
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public User getUserByStudentId(String studentId) {
		return studentMapper.getUserByStudentId(studentId);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public boolean updateProjectNum(String studentId,String teacherId,String projectId) {
		return studentMapper.updateProjectNum(studentId,teacherId,projectId);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public Student projectNum(String studentId) {
		return studentMapper.getStudentByStudentId(studentId);
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public boolean updateNoProjectNum(String studentId) {
		return studentMapper.updateNoProjectNum(studentId);
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public Student getStuAndProject(String studentId) {
		return studentMapper.getStuAndProject(studentId);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public Student getStuAndProjectAndTeacher(String studentId) {
		return studentMapper.getStuAndProjectAndTeacher(studentId);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public boolean updateTeacherId(String teacherId, String studentId) {
		return studentMapper.updateTeacherId(teacherId,studentId);
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public int thisTeacherUndefinedStudentNum(String teacherId) {
		return studentMapper.thisTeacherUndefinedStudentNum(teacherId);
	}
}
