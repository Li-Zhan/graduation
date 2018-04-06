package cn.lynu.mapper;

import cn.lynu.model.Project;
import cn.lynu.model.Teacher;
import cn.lynu.model.TeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    long countByExample(TeacherExample example);

    int deleteByExample(TeacherExample example);

    int deleteByPrimaryKey(String teacherId);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    List<Teacher> selectByExample(TeacherExample example);

    Teacher selectByPrimaryKey(String teacherId);

    int updateByExampleSelective(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByExample(@Param("record") Teacher record, @Param("example") TeacherExample example);

    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
    
    List<Teacher> getAllTeacher();
    
    Teacher findTeacherByTeacherId(String teacherId);
    
    List<Teacher> findTeacherByTeacherName(@Param("teacherName")String teacherName);
    
    Teacher findTeacherAndProject(String teacherId);
    
    Teacher findTeacherByUserId(String userId);

	boolean addProjectAfter(String teacherId);

}