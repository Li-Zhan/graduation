package cn.lynu.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import cn.lynu.model.Down;
import cn.lynu.service.DownService;
import cn.lynu.util.Utils;

@Controller
@RequestMapping("/downController")
public class DownController {
	
	@Autowired
	private DownService downService;
	
	@ResponseBody
	@RequestMapping(value="/getSubDown",method=RequestMethod.GET)
	public PageInfo getSubDown(@RequestParam(defaultValue="1")int pageNum,
			@RequestParam(defaultValue="6")int pageSize,@RequestParam(defaultValue="1")int navigatePages) {
		PageHelper.startPage(pageNum, pageSize);
		List<Down> list = downService.getAllDown();
		return new PageInfo<>(list, navigatePages);
	}
	
	 @RequestMapping("/downloadResource")
	 public @ResponseBody String downloadResource(HttpSession session,HttpServletResponse response,
	            HttpServletRequest request,@RequestParam(required=true)String fileName) throws Exception {
	     if(fileName==null||fileName=="") {
	    	 return null;
	     }   
		 String dataDir=request.getServletContext().getRealPath("/WEB-INF/file");
	     Path path=Paths.get(dataDir, fileName);
	     if(Files.exists(path)) {
	            response.setContentType("application/octet-stream");
		        response.addHeader("Content-Disposition", "attachment;filename="+Utils.filenameEncoding(fileName, request));
	            try {
	                Files.copy(path, response.getOutputStream());
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	        return null;
	  }
	 
}
