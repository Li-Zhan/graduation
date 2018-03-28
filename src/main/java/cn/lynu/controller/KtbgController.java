package cn.lynu.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

}
