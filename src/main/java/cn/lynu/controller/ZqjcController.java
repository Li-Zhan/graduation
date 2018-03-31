package cn.lynu.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.lynu.model.Zqjc;
import cn.lynu.service.ZqjcService;

@Controller
@RequestMapping("/zqjcController")
public class ZqjcController {
	
	@Autowired
	private ZqjcService zqjcService;
	
	@ResponseBody
	@RequestMapping(value="/insertSelective",method=RequestMethod.POST)
	public boolean insertSelective(Zqjc zqjc) {
		return zqjcService.insertSelective(zqjc);
	}
	
	@ResponseBody
	@RequestMapping("/getzqjcByStudentId")
	public Zqjc getzqjcByStudentId(String studentId,HttpServletResponse response) {
		response.setContentType("application/json;charset=utf-8");
		Zqjc zqjc = zqjcService.getzqjcByStudentId(studentId);
		if(zqjc!=null) {
			return zqjc;
		}
		return new Zqjc();
	}
	
	@RequestMapping("/gotoTzqjc")
	public ModelAndView gotoTzqjc(@RequestParam(required=true)String studentId) {
		return new ModelAndView("/teacher/tzqjc.html?studentId="+studentId);
	}
	
	@ResponseBody
	@RequestMapping(value="/updateByPrimaryKeySelective",method=RequestMethod.PUT)
	public boolean updateByPrimaryKeySelective(Zqjc zqjc) {
		return zqjcService.updateByPrimaryKeySelective(zqjc);
	}

}
