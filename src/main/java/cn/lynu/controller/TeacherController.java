package cn.lynu.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.lynu.model.Teacher;
import cn.lynu.model.User;
import cn.lynu.service.TeacherService;

@Controller
@RequestMapping("/teacherController")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherService;
	
	@ResponseBody
	@RequestMapping(value="/getSubTeacher",method=RequestMethod.GET)
	public PageInfo<Teacher> getSubTeacher(@RequestParam(defaultValue="1")int pageNum,@RequestParam(defaultValue="8")int pageSize){
		PageHelper.startPage(pageNum, pageSize);
		List<Teacher> list = teacherService.getSubTeacher();
		return new PageInfo<Teacher>(list);
	}
	
	@ResponseBody
	@RequestMapping(value="/findTeacherByTeacherName",method=RequestMethod.GET)
	public PageInfo<Teacher> findTeacherByTeacherName(String teacherName,HttpServletResponse response,
			@RequestParam(defaultValue="1")int pageNum,@RequestParam(defaultValue="8")int pageSize){
		response.setContentType("application/json");
		PageHelper.startPage(pageNum, pageSize);
		List<Teacher> list = teacherService.findTeacherByTeacherName(teacherName);
		return new PageInfo<>(list);
	}
	
	@ResponseBody
	@RequestMapping("/findTeacherAndProject")
	public Teacher findTeacherAndProject(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if(user!=null) {
			Teacher teacher = teacherService.findTeacherByUserId(user.getUserId());
			if(teacher!=null) {
				Teacher teacherPlus = teacherService.findTeacherAndProject(teacher.getTeacherId());
				if(teacherPlus!=null) {
					return teacherPlus;
				}
			}
		}
		return null;
	}

}
