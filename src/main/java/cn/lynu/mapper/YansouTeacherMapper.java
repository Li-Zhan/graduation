package cn.lynu.mapper;

import cn.lynu.model.YansouTeacher;
import cn.lynu.model.YansouTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YansouTeacherMapper {
    long countByExample(YansouTeacherExample example);

    int deleteByExample(YansouTeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YansouTeacher record);

    int insertSelective(YansouTeacher record);

    List<YansouTeacher> selectByExample(YansouTeacherExample example);

    YansouTeacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YansouTeacher record, @Param("example") YansouTeacherExample example);

    int updateByExample(@Param("record") YansouTeacher record, @Param("example") YansouTeacherExample example);

    int updateByPrimaryKeySelective(YansouTeacher record);

    int updateByPrimaryKey(YansouTeacher record);
    
    YansouTeacher selectTeacherInfoByYansouTeamId(Integer yansouTeamId);
    
    YansouTeacher selectYansouTeacherByTeacherId(String teacherId);
}