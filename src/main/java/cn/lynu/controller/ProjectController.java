package cn.lynu.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.lynu.model.Project;
import cn.lynu.service.ProjectService;

@Controller
@RequestMapping("/projectController")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@ResponseBody
	@RequestMapping(value="/getProjectListByTeacherId",method=RequestMethod.GET)
	public PageInfo<Project> getProjectListByTeacherId(@RequestParam(required=true)String teacherId,
			  @RequestParam(defaultValue="1")int pageNum,@RequestParam(defaultValue="8")int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		List<Project> list = projectService.getProjectListByTeacherId(teacherId);
		return new PageInfo<>(list);
	}

}
