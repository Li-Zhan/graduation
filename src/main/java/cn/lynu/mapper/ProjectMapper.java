package cn.lynu.mapper;

import cn.lynu.model.Project;
import cn.lynu.model.ProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectMapper {
    long countByExample(ProjectExample example);

    int deleteByExample(ProjectExample example);

    int deleteByPrimaryKey(Integer projectId);

    int insert(Project record);

    int insertSelective(Project record);

    List<Project> selectByExample(ProjectExample example);

    Project selectByPrimaryKey(Integer projectId);
    
    Project selectProjectAndFromByPid(Integer projectId);

    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
    
    int noChooseProject(String teacherId);
    
    List<Project> getProjectListByTeacherId(String teacherId);
    
    Project getProjectByStudentId(String studentId);
    
    boolean updateProjectByStudentId(@Param("studentId")String studentId,@Param("projectId")String projectId);
    
    List<Project> getProjectAndStudent(String teacher_id);

	boolean updateNoStudent(String projectId);

	int getCountProjectNum();

	int thisTeacherYesProjectNum(String teacherId);

	List<Project> getProjectByTeacherId(String teacherId);

}