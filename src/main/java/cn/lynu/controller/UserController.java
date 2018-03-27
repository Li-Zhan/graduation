package cn.lynu.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lynu.model.User;
import cn.lynu.service.UserService;

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
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(HttpSession session,String randStr,String account,String password) {
		String randStr2=(String) session.getAttribute("randStr");
			if(randStr2.equals(randStr)) {
				User user = userService.login(account, password);
				if(user!=null) {
					if(2==user.getUserRoles()) {
						session.setAttribute("user", user);
						return "student/sindex.jsp";
					}
					if(1==user.getUserRoles()) {
						session.setAttribute("user", user);
						return "teacher/tindex.jsp";
					}
				}
			}else {
				return "randStrError";
			}
		return "passwordError";
	}
	
}
