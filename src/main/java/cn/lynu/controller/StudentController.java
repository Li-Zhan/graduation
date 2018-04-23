package cn.lynu.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.lynu.model.Project;
import cn.lynu.model.Student;
import cn.lynu.model.User;
import cn.lynu.service.ProjectService;
import cn.lynu.service.StudentService;
import cn.lynu.util.WordUtils;

@Controller
@RequestMapping("/studentController")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	@Autowired
	private ProjectService projectService;
	
	@ResponseBody
	@RequestMapping("/hasChooseProject")
	public Student hasChooseProject(HttpSession session,HttpServletResponse response) {
		response.setContentType("application/json;charset=utf-8");
		User user=(User) session.getAttribute("user");
		if(user!=null) {
			Student student = studentService.getStudentByUserId(user.getUserId());
			if(student!=null) {
				Project project = projectService.getProjectByStudentId(student.getStudentId());
				if(project!=null) {
					return student;
				}
			}
		}
		return new Student();
	}
	
	@ResponseBody
	@RequestMapping(value="/updateProjectByStudentId/{projectId}",method=RequestMethod.PUT)
	public boolean updateProjectByStudentId(HttpSession session,@PathVariable("projectId")String projectId) {
		User user=(User) session.getAttribute("user");
		if(user!=null) {
			Student student = studentService.getStudentByUserId(user.getUserId());
			if(student!=null) {
				if(!student.getStudentId().isEmpty()) {
					return projectService.updateStudentIdByProjectId(student.getStudentId(), projectId);
				}
			}
		}
		return false;
	}
	
	@ResponseBody
	@RequestMapping(value="/updateTeacherId")
	public boolean updateTeacherId(HttpSession session,String teacherId) {
		User user=(User) session.getAttribute("user");
		if(user!=null) {
			Student student = studentService.getStudentByUserId(user.getUserId());
			if(student!=null) {
				return studentService.updateTeacherId(teacherId,student.getStudentId());
			}
		}
		return false;
	}
	
	@ResponseBody
	@RequestMapping("/getUserByStudentId")
	public User getUserByStudentId(String studentId) {
		return studentService.getUserByStudentId(studentId);
	}
	
	@ResponseBody
	@RequestMapping(value="/updateProjectNum",method=RequestMethod.PUT)
	public boolean updateProjectNum(String studentId,String teacherId,String projectId) {
		return studentService.updateProjectNum(studentId,teacherId,projectId);
	}
	
	@ResponseBody
	@RequestMapping("/projectNum")
	public boolean projectNum(String studentId) {
		Student student=studentService.projectNum(studentId);
		if(student!=null) {
			if(student.getProjectNum()==1) {
				return true;
			}
		}
		return false;
	}
	
	@ResponseBody
	@RequestMapping(value="/updateNoProjectNum",method=RequestMethod.PUT)
	public boolean updateNoProjectNum(String studentId,String projectId) {
		boolean status1 = studentService.updateNoProjectNum(studentId);
		boolean status2 = projectService.updateNoStudent(projectId);
		if(status1&&status2) {
			return true;
		}
		return false;
	}
	
	@ResponseBody
	@RequestMapping("/getStuAndProject")
	public Student getStuAndProject(HttpSession session,HttpServletResponse response,String studentId) {
		if(studentId!=null&&studentId!="") {
			return studentService.getStuAndProject(studentId);
		}
		User user=(User) session.getAttribute("user");
		if(user!=null) {
			Student student = studentService.getStudentByUserId(user.getUserId());
			if(student!=null) {
				if(student.getProjectId()!=null&&student.getProjectId()!=0) {
					Student newStu = studentService.getStuAndProject(student.getStudentId());
					return newStu;
				}
			}
		}
		return new Student();
	}
	
	
	@ResponseBody
	@RequestMapping("/getStuAndProjectAndTeacher")
	public Student getStuAndProjectAndTeacher(HttpSession session,HttpServletResponse response) {
		User user=(User) session.getAttribute("user");
		if(user!=null) {
			Student student = studentService.getStudentByUserId(user.getUserId());
			if(student!=null) {
				if(student.getProjectId()!=null&&student.getProjectId()!=0) {
					Student newStu = studentService.getStuAndProjectAndTeacher(student.getStudentId());
					return newStu;
				}
			}
		}
		return new Student();
	}
	
	@ResponseBody
	@RequestMapping("/getStudentAndKtbgBySid")
	public Student getStudentAndKtbgBySid(String studentId) {
		return studentService.getStudentAndKtbgBySid(studentId);
	}
	
	@ResponseBody
	@RequestMapping("/getStudentAndZqjcBySid")
	public Student getStudentAndZqjcBySid(String studentId) {
		return studentService.getStudentAndZqjcBySid(studentId);
	}
	
	@ResponseBody
	@RequestMapping("/findStudent")
	public Student findStudent(HttpSession session) {
		User user=(User) session.getAttribute("user");
		if(user!=null) {
			Student student = studentService.getStudentByUserId(user.getUserId());
			if(student!=null) {
				return student;
			}
		}
		return null;
	}
	
	@RequestMapping("/gotoTstudentscore")
	public String gotoTstudentscore(@RequestParam(required=true)String studentId) {
		return "redirect:http://localhost:8080/graduation/teacher/tstudentscore.html?studentId="+studentId;
	}
	
	@ResponseBody
	@RequestMapping(value="/updateScore",method=RequestMethod.PUT)
	public boolean updateScore(Student student) {
		return studentService.updateStudent(student);
	}
	
	@ResponseBody
	@RequestMapping("/getThisStudentScore")
	public Integer getThisStudentScore(HttpSession session) {
		User user=(User) session.getAttribute("user");
		if(user!=null) {
			Student student = studentService.getStudentByUserId(user.getUserId());
			if(student!=null) {
				return studentService.getThisStudentScore(student.getStudentId());
			}
		}
		return -1;
	}
	
	@ResponseBody
	@RequestMapping("/getStudentAndMdbBySid")
	public Student getStudentAndMdbBySid(String studentId) {
		return studentService.getStudentAndMdbBySid(studentId);
	}
	
	//下载开题报告
	@ResponseBody
	@RequestMapping(value="/downKtbg",method=RequestMethod.GET)
	public void downKtbg(HttpSession session,
			HttpServletRequest request,HttpServletResponse response,
			String studentId) {
		if(studentId!=null&&!studentId.isEmpty()) {
			Student stuAndKtbg = studentService.getStudentAndKtbgBySid(studentId);
			Map<String, Object> map=new HashMap<>();
			map.put("user", stuAndKtbg.getUser());
			map.put("classInfo", stuAndKtbg.getClassInfo());
			map.put("project", stuAndKtbg.getProject());
			map.put("ktbg", stuAndKtbg.getKtbg());
			try {
				 WordUtils.exportMillCertificateWord(request,response,map,"开题报告.ftl","开题报告.doc");  
			} catch (IOException e) {
				e.printStackTrace();
			}
			return;
		}else {
			User user=(User) session.getAttribute("user");
			if(user!=null) {
				Student student = studentService.getStudentByUserId(user.getUserId());
				if(student!=null) {
					if(student.getProjectId()!=null&&student.getProjectId()!=0) {
						Student stuAndKtbg = studentService.getStudentAndKtbgBySid(student.getStudentId());
						Map<String, Object> map=new HashMap<>();
						map.put("user", stuAndKtbg.getUser());
						map.put("classInfo", stuAndKtbg.getClassInfo());
						map.put("project", stuAndKtbg.getProject());
						map.put("ktbg", stuAndKtbg.getKtbg());
						try {
							WordUtils.exportMillCertificateWord(request,response,map,"开题报告.ftl","开题报告.doc");  
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
			return;
		}
	}
	
	//下载免答辩
	@ResponseBody
	@RequestMapping(value="/downMdb",method=RequestMethod.GET)
	public void downMdb(HttpSession session,
			HttpServletRequest request,HttpServletResponse response,
			String studentId) {
		if(studentId!=null&&!studentId.isEmpty()) {
			Student stuAndMdb = studentService.getStudentAndMdbBySid(studentId);
			Map<String, Object> map=new HashMap<>();
			map.put("user", stuAndMdb.getUser());
			map.put("classInfo", stuAndMdb.getClassInfo());
			map.put("project", stuAndMdb.getProject());
			map.put("mdb", stuAndMdb.getMdb());
			map.put("teacher", stuAndMdb.getTeacher());
			try {
				 WordUtils.exportMillCertificateWord(request,response,map,"免答辩申请表.ftl","免答辩申请表.doc");  
			} catch (IOException e) {
				e.printStackTrace();
			}
			return;
		}else {
			User user=(User) session.getAttribute("user");
			if(user!=null) {
				Student student = studentService.getStudentByUserId(user.getUserId());
				if(student!=null) {
					if(student.getProjectId()!=null&&student.getProjectId()!=0) {
						Student stuAndMdb = studentService.getStudentAndMdbBySid(student.getStudentId());
						Map<String, Object> map=new HashMap<>();
						map.put("user", stuAndMdb.getUser());
						map.put("classInfo", stuAndMdb.getClassInfo());
						map.put("project", stuAndMdb.getProject());
						map.put("mdb", stuAndMdb.getMdb());
						map.put("teacher", stuAndMdb.getTeacher());
						try {
							WordUtils.exportMillCertificateWord(request,response,map,"免答辩申请表.ftl","免答辩申请表.doc");  
						} catch (IOException e) {
							e.printStackTrace();
						}
						return;
					}
				}
			}
		}
	}
	
	//下载中期检查
	@ResponseBody
	@RequestMapping(value="/downZqjc",method=RequestMethod.GET)
	public void downZqjc(HttpSession session,
			HttpServletRequest request,HttpServletResponse response,
			String studentId) {
		if(studentId!=null&&!studentId.isEmpty()) {
			Student stuAndZqjc = studentService.getStudentAndZqjcBySid(studentId);
			Map<String, Object> map=new HashMap<>();
			map.put("user", stuAndZqjc.getUser());
			map.put("project", stuAndZqjc.getProject());
			map.put("zqjc", stuAndZqjc.getZqjc());
			map.put("teacher", stuAndZqjc.getTeacher());
			try {
				 WordUtils.exportMillCertificateWord(request,response,map,"中期检查表.ftl","中期检查表.doc");  
			} catch (IOException e) {
				e.printStackTrace();
			}
			return;
		}else {
			User user=(User) session.getAttribute("user");
			if(user!=null) {
				Student student = studentService.getStudentByUserId(user.getUserId());
				if(student!=null) {
					if(student.getProjectId()!=null&&student.getProjectId()!=0) {
						Student stuAndZqjc = studentService.getStudentAndZqjcBySid(student.getStudentId());
						Map<String, Object> map=new HashMap<>();
						map.put("user", stuAndZqjc.getUser());
						map.put("project", stuAndZqjc.getProject());
						if(stuAndZqjc.getZqjc()!=null) {
							map.put("zqjc", stuAndZqjc.getZqjc());
						}else {
							map.put("zqjc", null);
						}
						map.put("teacher", stuAndZqjc.getTeacher());
						try {
							WordUtils.exportMillCertificateWord(request,response,map,"中期检查表.ftl","中期检查表.doc");  
						} catch (IOException e) {
							e.printStackTrace();
						}
						return;
					}
				}
			}
		}
	}
	
}
