package cn.lynu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.lynu.model.Lunwen;
import cn.lynu.service.LunwenService;

@Controller
@RequestMapping("/lunwenController")
public class LunwenController {
	
	@Autowired
	private LunwenService lunwenService;
	
	@RequestMapping("/gotoTstudentlunwen")
	public ModelAndView gotoTstudentlunwen(String studentId) {
		return new ModelAndView("/teacher/tstudentlunwen.html?studentId="+studentId);
	}
	
	@ResponseBody
	@RequestMapping("/getLunwenBySid")
	public Lunwen getLunwenBySid(String studentId) {
		Lunwen lunwen = lunwenService.getLunwenBySid(studentId);
		if(lunwen!=null) {
			return lunwen;
		}
		return new Lunwen();
	}
	
	@ResponseBody
	@RequestMapping(value="/upLunwenBySid",method=RequestMethod.PUT)
	public boolean upLunwenBySid(Lunwen lunwen) {
		return lunwenService.upLunwenBySid(lunwen);
	}

}
