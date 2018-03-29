package cn.lynu.controller;


import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lynu.model.WorkTime;
import cn.lynu.service.WorkTimeService;

@Controller
@RequestMapping("/workTimeController")
public class WorkTimeController {
	
	@Autowired
	private WorkTimeService workTimeService;
	
	@ResponseBody
	@RequestMapping("/getWorkTime")
	public WorkTime getWorkTime(String date,HttpServletResponse response) {
		response.setContentType("application/json;charset=utf-8");
		WorkTime workTime = workTimeService.getWorkTime(date);
		return workTime;
	}

}
