package cn.lynu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.lynu.mapper.ProjectMapper;
import cn.lynu.model.Project;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectMapper projectMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Project> getProjectListByTeacherId(String teacherId){
		return projectMapper.getProjectListByTeacherId(teacherId);
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public Project getProjectByStudentId(String studentId) {
		return projectMapper.getProjectByStudentId(studentId);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean updateStudentIdByProjectId(String studentId,String projectId) {
		return projectMapper.updateProjectByStudentId(studentId, projectId);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public boolean updateNoStudent(String projectId) {
		return projectMapper.updateNoStudent(projectId);
	}

}
