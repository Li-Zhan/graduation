package cn.lynu.mapper;

import cn.lynu.model.TeacherType;
import cn.lynu.model.TeacherTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherTypeMapper {
    long countByExample(TeacherTypeExample example);

    int deleteByExample(TeacherTypeExample example);

    int deleteByPrimaryKey(Integer teacherTypeId);

    int insert(TeacherType record);

    int insertSelective(TeacherType record);

    List<TeacherType> selectByExample(TeacherTypeExample example);

    TeacherType selectByPrimaryKey(Integer teacherTypeId);

    int updateByExampleSelective(@Param("record") TeacherType record, @Param("example") TeacherTypeExample example);

    int updateByExample(@Param("record") TeacherType record, @Param("example") TeacherTypeExample example);

    int updateByPrimaryKeySelective(TeacherType record);

    int updateByPrimaryKey(TeacherType record);
}