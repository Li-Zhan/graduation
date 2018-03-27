package cn.lynu.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lynu.model.Project;
import cn.lynu.model.Student;
import cn.lynu.model.User;
import cn.lynu.service.ProjectService;
import cn.lynu.service.StudentService;

@Controller
@RequestMapping("/studentController")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private ProjectService projectService;
	
	@ResponseBody
	@RequestMapping("/hasChooseProject")
	public Student hasChooseProject(HttpSession session,HttpServletResponse response) {
		response.setContentType("application/json;charset=utf-8");
		User user=(User) session.getAttribute("user");
		if(user!=null) {
			Student student = studentService.getStudentByUserId(user.getUserId());
			if(student!=null) {
				Project project = projectService.getProjectByStudentId(student.getStudentId());
				if(project!=null) {
					return student;
				}
			}
			return null;
		}
		return null;
	}
	
	@ResponseBody
	@RequestMapping(value="/updateProjectByStudentId/{projectId}",method=RequestMethod.PUT)
	public boolean updateProjectByStudentId(HttpSession session,@PathVariable("projectId")String projectId) {
		User user=(User) session.getAttribute("user");
		if(user!=null) {
			Student student = studentService.getStudentByUserId(user.getUserId());
			if(student!=null) {
				if(!student.getStudentId().isEmpty()) {
					return projectService.updateStudentIdByProjectId(student.getStudentId(), projectId);
				}
			}
			return false;
		}
		return false;
	}
	
	@ResponseBody
	@RequestMapping("/getUserByStudentId")
	public User getUserByStudentId(String studentId) {
		return studentService.getUserByStudentId(studentId);
	}
	
	@ResponseBody
	@RequestMapping(value="/updateProjectNum",method=RequestMethod.PUT)
	public boolean updateProjectNum(String studentId,String teacherId,String projectId) {
		return studentService.updateProjectNum(studentId,teacherId,projectId);
	}
	
	@ResponseBody
	@RequestMapping("/projectNum")
	public boolean projectNum(String studentId) {
		Student student=studentService.projectNum(studentId);
		if(student!=null) {
			if(student.getProjectNum()==1) {
				return true;
			}
		}
		return false;
	}
	
	@ResponseBody
	@RequestMapping(value="/updateNoProjectNum",method=RequestMethod.PUT)
	public boolean updateNoProjectNum(String studentId,String projectId) {
		boolean status1 = studentService.updateNoProjectNum(studentId);
		boolean status2 = projectService.updateNoStudent(projectId);
		if(status1&&status2) {
			return true;
		}
		return false;
	}
	
}
