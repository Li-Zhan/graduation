package cn.lynu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lynu.model.Mdb;
import cn.lynu.service.MdbService;

@Controller
@RequestMapping("/mdbController")
public class MdbController {
	
	@Autowired
	private MdbService mdbService;
	
	@ResponseBody
	@RequestMapping(value="/insertSelective",method=RequestMethod.POST)
	public boolean insertSelective(Mdb mdb) {
		return mdbService.insertSelective(mdb);
	}
	
	@ResponseBody
	@RequestMapping("/getMdbByStudentId")
	public Mdb getMdbByStudentId(String studentId) {
		Mdb mdb=mdbService.getMdbByStudentId(studentId);
		if(mdb!=null) {
			return mdb;
		}
		return new Mdb();
	}
	
	@ResponseBody
	@RequestMapping(value="/updateColumn",method=RequestMethod.PUT)
	public boolean updateColumn(Mdb mdb) {
		return mdbService.updateColumn(mdb);
	}

}
