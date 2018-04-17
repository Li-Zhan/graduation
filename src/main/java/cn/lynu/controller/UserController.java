package cn.lynu.controller;

import java.io.File;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import cn.lynu.model.User;
import cn.lynu.service.UserService;
import cn.lynu.util.Utils;

@Controller
@RequestMapping("/userController")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping(value="/isuser",method=RequestMethod.POST)
	public boolean isUser(String account) {
		return userService.isUser(account);
	}
	
	@ResponseBody
	@RequestMapping(value="/ispassword",method=RequestMethod.POST)
	public boolean ispassword(@RequestParam("password")String password,HttpSession session) {
		User user = (User) session.getAttribute("user");
		if(user!=null) {
			return userService.ispassword(Utils.md5(password),user.getUserId());
		}
		return false;
	}
	
	@ResponseBody
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(HttpSession session,String randStr,String account,String password) {
		String randStr2=(String) session.getAttribute("randStr");
			if(randStr2!=null&&randStr2.equals(randStr)) {
				password=Utils.md5(password);
				User user = userService.login(account, password);
				if(user!=null) {
					if(2==user.getUserRoles()) {
						session.setAttribute("user", user);
						return "student/sindex.html";
					}
					if(1==user.getUserRoles()) {
						session.setAttribute("user", user);
						return "teacher/tindex.html";
					}
				}
			}else {
				return "randStrError";
			}
		return "passwordError";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("user");
		return "redirect:/login.html";
	}
	
	
	@ResponseBody
	@RequestMapping(value="/updateInfo",method=RequestMethod.POST)
	public boolean updateStudentInfo(User user,
			@RequestParam(value="portrait",required=false)MultipartFile portrait,HttpServletRequest request) {
		if(portrait!=null&&portrait.getSize()>0) {
			if(portrait.getSize()>(10*1024*1024)) {
				return false;
			}
			String filename=portrait.getOriginalFilename();
			String dbPath=request.getServletContext().getContextPath()+"/portrait/"+user.getUserId();
			String basePath=request.getServletContext().getRealPath("/portrait/"+user.getUserId());
			new File(basePath).mkdir();
        	File portraitFile=new File(basePath,filename);
        	try {
				portrait.transferTo(portraitFile);
				user.setUserPortrait(dbPath+"/"+filename);
				return userService.updateUserInfo(user);
			} catch (Exception e) {
				e.printStackTrace();
			} 
        	
		}
		return userService.updateUserInfo(user);
	}
	
	@ResponseBody
	@RequestMapping(value="/updatePwd",method=RequestMethod.PUT)
	public boolean updateStudentPwd(User user,HttpSession session) {
		String password=user.getUserPassword();
		if(password!=null&&!password.isEmpty()) {
			user.setUserPassword(Utils.md5(password));
			boolean bool = userService.updateUserInfo(user);
			if(bool==true) {
				session.removeAttribute("user");
				return true;
			}
		}
		return false;
	}
	
	
}
