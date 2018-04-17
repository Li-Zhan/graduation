package cn.lynu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lynu.model.DaBian;
import cn.lynu.model.Project;
import cn.lynu.model.Student;
import cn.lynu.model.User;
import cn.lynu.service.DabianService;
import cn.lynu.service.StudentService;

@Controller
@RequestMapping("/dabianController")
public class DabianController {
	
	@Autowired
	private DabianService dabianService;
	@Autowired
	private StudentService studentService;
	
	@ResponseBody
	@RequestMapping("/getThisStudentScore")
	public Integer getThisStudentScore(HttpSession session) {
		User user=(User) session.getAttribute("user");
		if(user!=null) {
			Student student = studentService.getStudentByUserId(user.getUserId());
			if(student!=null) {
				return dabianService.getThisStudentScore(student.getStudentId());
			}
		}
		return -1;
	}
	
	@ResponseBody
	@RequestMapping(value="/insertOrUpdate",method=RequestMethod.POST)
	public boolean insertOrUpdate(DaBian daBian) {
		if(daBian.getId()==null) {
			return dabianService.insertDabian(daBian);
		}else {
			return dabianService.updateDabian(daBian);
		}
	}
	
}
