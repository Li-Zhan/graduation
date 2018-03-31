package cn.lynu.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.lynu.model.Ktbg;
import cn.lynu.service.KtbgService;

@Controller
@RequestMapping("/ktbgController")
public class KtbgController {
	
	@Autowired
	private KtbgService ktbgService;
	
	@ResponseBody
	@RequestMapping(value="/insertSelective",method=RequestMethod.POST)
	public boolean insertSelective(Ktbg ktbg) {
		return ktbgService.insertSelective(ktbg);
	}
	
	@ResponseBody
	@RequestMapping("/getKtbgByStudentId")
	public Ktbg getKtbgByStudentId(String studentId,HttpServletResponse response) {
		response.setContentType("application/json;charset=utf-8");
		Ktbg ktbg = ktbgService.getKtbgByStudentId(studentId);
		if(ktbg!=null) {
			return ktbg;
		}
		return new Ktbg();
	}
	
	@ResponseBody
	@RequestMapping(value="/updateColumn",method=RequestMethod.PUT)
	public boolean updateColumn(Ktbg ktbg) {
		return ktbgService.updateColumn(ktbg);
	}
	
	@RequestMapping("/gotoTktbg")
	public ModelAndView gotoTktbg(@RequestParam(required=true)String studentId) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("/teacher/tktbg.html?studentId="+studentId);
		return modelAndView;
	}
	
	@ResponseBody
	@RequestMapping("/getKtbgStatus")
	public Ktbg getKtbgStatus(String ktbgId) {
		return ktbgService.getKtbgStatus(ktbgId);
	}
	
	@ResponseBody
	@RequestMapping(value="/updateByPrimaryKeySelective",method=RequestMethod.POST)
	public boolean updateByPrimaryKeySelective(Ktbg ktbg) {
		return ktbgService.updateByPrimaryKeySelective(ktbg);
	}
	
}
