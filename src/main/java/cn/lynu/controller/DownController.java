package cn.lynu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.lynu.model.Down;
import cn.lynu.service.DownService;

@Controller
@RequestMapping("/downController")
public class DownController {
	
	@Autowired
	private DownService downService;
	
	@ResponseBody
	@RequestMapping(value="/getSubDown",method=RequestMethod.GET)
	public PageInfo getSubDown(int pageNum,int pageSize,int navigatePages) {
		PageHelper.startPage(pageNum, pageSize);
		List<Down> list = downService.getAllDown();
		return new PageInfo<>(list, navigatePages);
	}

}
