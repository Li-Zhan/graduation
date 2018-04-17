package cn.lynu.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.lynu.model.Student;
import cn.lynu.model.Teacher;
import cn.lynu.model.User;
import cn.lynu.model.YansouTeacher;
import cn.lynu.model.YansouTeam;
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
	
	@ResponseBody
	@RequestMapping("/findTeacher")
	public Teacher findTeacher(HttpSession session) {
		User user = (User) session.getAttribute("user");
		if(user!=null) {
			Teacher teacher = teacherService.findTeacherByUserId(user.getUserId());
			if(teacher!=null) {
				Teacher teacherPlus = teacherService.findTeacherByTeacherId(teacher.getTeacherId());
				if(teacherPlus!=null) {
					return teacherPlus;
				}
			}
		}
		return null;
	}
	
	@ResponseBody
	@RequestMapping("/getStudentByTeacherId")
	public List<Student> getStudentByTeacherId(HttpSession session){
		User user = (User) session.getAttribute("user");
		if(user!=null) {
			Teacher teacher = teacherService.findTeacherByUserId(user.getUserId());
			if(teacher!=null) {
				return teacherService.getStudentByTeacherId(teacher.getTeacherId());
			}
		}
		return null;
	}
	
	@ResponseBody
	@RequestMapping("/getStudentByTeacherId2")
	public List<Student> getStudentByTeacherId2(HttpSession session){
		User user = (User) session.getAttribute("user");
		if(user!=null) {
			Teacher teacher = teacherService.findTeacherByUserId(user.getUserId());
			if(teacher!=null) {
				return teacherService.getStudentByTeacherId2(teacher.getTeacherId());
			}
		}
		return null;
	}
	
	@ResponseBody
	@RequestMapping(value="/updateTeacherInfo",method=RequestMethod.POST)
	public boolean updateTeacherInfo(Teacher teacher,
			@RequestParam(value="portrait",required=false)MultipartFile portrait,HttpServletRequest request) {
		if(portrait!=null&&portrait.getSize()>0) {
			if(portrait.getSize()>(10*1024*1024)) {
				return false;
			}
			String filename=portrait.getOriginalFilename();
			String dbPath=request.getServletContext().getContextPath()+"/portrait/"+teacher.getUser().getUserId();
			String basePath=request.getServletContext().getRealPath("/portrait/"+teacher.getUser().getUserId());
			new File(basePath).mkdir();
        	File portraitFile=new File(basePath,filename);
        	try {
				portrait.transferTo(portraitFile);
				teacher.getUser().setUserPortrait(dbPath+"/"+filename);
				return teacherService.updateTeacherInfo(teacher);
			} catch (Exception e) {
				e.printStackTrace();
			} 
        	
		}
		return teacherService.updateTeacherInfo(teacher);
	}
	
	@ResponseBody
	@RequestMapping("/getTeacherYansouInfo")
	public YansouTeam getTeacherYansouInfo(HttpSession session){
		User user = (User) session.getAttribute("user");
		if(user!=null) {
			Teacher teacher = teacherService.findTeacherByUserId(user.getUserId());
			if(teacher!=null) {
				return teacherService.getTeacherYansouInfo(teacher.getTeacherId());
			}
		}
		return null;
	}
	
	@ResponseBody
	@RequestMapping("/thisTeacherisLeader")
	public YansouTeacher thisTeacherisLeader(HttpSession session){
		User user = (User) session.getAttribute("user");
		if(user!=null) {
			return teacherService.thisTeacherisLeader(user);
		}
		return null;
	}
	
	@ResponseBody
	@RequestMapping("/getYansouTeamStu")
	public PageInfo<Student> getYansouTeamStu(HttpSession session,
			@RequestParam(defaultValue="1")int pageNum,	@RequestParam(defaultValue="8")int pageSize){
		User user = (User) session.getAttribute("user");
		if(user!=null) {
			Teacher teacher = teacherService.findTeacherByUserId(user.getUserId());
			if(teacher!=null) {
				PageHelper.startPage(pageNum, pageSize);
				List<Student> list = teacherService.getYansouTeamStu(teacher.getTeacherId());
				return new PageInfo<Student>(list);
			}
		}
		return null;
	}

}
