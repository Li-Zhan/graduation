package cn.lynu.mapper;

import cn.lynu.model.ProjectFrom;
import cn.lynu.model.ProjectFromExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectFromMapper {
    long countByExample(ProjectFromExample example);

    int deleteByExample(ProjectFromExample example);

    int deleteByPrimaryKey(Integer projectFromId);

    int insert(ProjectFrom record);

    int insertSelective(ProjectFrom record);

    List<ProjectFrom> selectByExample(ProjectFromExample example);

    ProjectFrom selectByPrimaryKey(Integer projectFromId);

    int updateByExampleSelective(@Param("record") ProjectFrom record, @Param("example") ProjectFromExample example);

    int updateByExample(@Param("record") ProjectFrom record, @Param("example") ProjectFromExample example);

    int updateByPrimaryKeySelective(ProjectFrom record);

    int updateByPrimaryKey(ProjectFrom record);
}