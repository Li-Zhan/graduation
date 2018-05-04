package cn.lynu.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import cn.lynu.model.Lunwen;
import cn.lynu.model.Student;
import cn.lynu.model.User;
import cn.lynu.service.LunwenService;
import cn.lynu.service.StudentService;
import cn.lynu.util.Utils;

@Controller
@RequestMapping("/lunwenController")
public class LunwenController {
	
	@Autowired
	private LunwenService lunwenService;
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/gotoTstudentlunwen")
	public String gotoTstudentlunwen(String studentId) {
		return "redirect:http://localhost:8080/graduation/teacher/tstudentlunwen.html?studentId="+studentId;
	}
	
	@ResponseBody
	@RequestMapping("/getLunwenBySid")
	public Lunwen getLunwenBySid(String studentId,HttpSession session) {
		if(studentId!=null&&!studentId.isEmpty()) {
			Lunwen lunwen = lunwenService.getLunwenBySid(studentId);
			if(lunwen!=null) {
				return lunwen;
			}
		}else {
			User user = (User) session.getAttribute("user");
    		if(user!=null) {
    			Student student = studentService.getStudentByUserId(user.getUserId());
    			Lunwen lunwen = lunwenService.getLunwenBySid(student.getStudentId());
    			if(lunwen!=null) {
    				return lunwen;
    			}
    		}
		}
		return new Lunwen();
	}
	
	@ResponseBody
	@RequestMapping(value="/upLunwenBySid",method=RequestMethod.PUT)
	public boolean upLunwenBySid(Lunwen lunwen) {
		return lunwenService.upLunwenBySid(lunwen);
	}
	
	@ResponseBody
	@RequestMapping(value="/upload_lunwen",method=RequestMethod.POST)
    public boolean saveProduct(@RequestParam(value="lunwen",required=true)MultipartFile lunwen,
    		@RequestParam("userId")String userId,HttpServletRequest request) {
        if(lunwen!=null&&lunwen.getSize()>0) {
        	if(lunwen.getSize()>(10*1024*1024)) {
        		return false;
        	}
        	String filename = lunwen.getOriginalFilename();
        	String basePath=request.getServletContext().getRealPath("/WEB-INF/lunwen/"+userId);
        	new File(basePath).mkdir();
        	File lunewenFile=new File(basePath,filename);
        	try {
        		HttpSession session = request.getSession();
        		User user = (User) session.getAttribute("user");
        		if(user!=null) {
        			Student student = studentService.getStudentByUserId(userId);
        			Lunwen lw=new Lunwen();
        			lw.setLunwenDate(new Date());
        			lw.setLunwenName(filename);
        			lw.setLunwenPath(basePath+"/"+filename);
        			lunwenService.insertOrUpdate(student.getStudentId(),lw);
        		}else {
					return false;
				}
        		//相同文件会覆盖
        		lunwen.transferTo(lunewenFile);
        		return true;
        	} catch (Exception e) {
        		e.printStackTrace();
        	} 
        }
        return false;
    }
	
	 @RequestMapping("/downloadResource")
	 public @ResponseBody void downloadResource(HttpServletResponse response,
			 HttpServletRequest request,String studentId) throws Exception {
	     if(studentId==null||studentId.isEmpty()) {
	    	 return;
	     }
	     Lunwen lunwen = lunwenService.getLunwenBySid(studentId);
	     if(lunwen==null) {
	    	 return;
	     }
		 String dataDir=lunwen.getLunwenPath();
	     String fileName=lunwen.getLunwenName();
		 Path path=Paths.get(dataDir);
		 if(Files.exists(path)) {
			response.setContentType("application/octet-stream");
			response.addHeader("Content-Disposition", "attachment;filename="+Utils.filenameEncoding(fileName, request));
			try {
				Files.copy(path, response.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		 }
		return;
	  }

}
