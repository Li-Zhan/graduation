package cn.lynu.controller;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		if(ktbg.getKtbgId()==null) {
			return ktbgService.insertSelective(ktbg);
		}else {
			return ktbgService.updateColumn(ktbg);
		}
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
	public String gotoTktbg(@RequestParam(required=true)String studentId) {
		return "redirect:http://localhost:8080/graduation/teacher/tktbg.html?studentId="+studentId;
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
