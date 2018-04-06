package cn.lynu.mapper;

import cn.lynu.model.YansouTeam;
import cn.lynu.model.YansouTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YansouTeamMapper {
    long countByExample(YansouTeamExample example);

    int deleteByExample(YansouTeamExample example);

    int deleteByPrimaryKey(Integer yansouTeamId);

    int insert(YansouTeam record);

    int insertSelective(YansouTeam record);

    List<YansouTeam> selectByExample(YansouTeamExample example);

    YansouTeam selectByPrimaryKey(Integer yansouTeamId);
    
    YansouTeam selectYanSouInfoByid(Integer yansouTeamId);

    int updateByExampleSelective(@Param("record") YansouTeam record, @Param("example") YansouTeamExample example);

    int updateByExample(@Param("record") YansouTeam record, @Param("example") YansouTeamExample example);

    int updateByPrimaryKeySelective(YansouTeam record);

    int updateByPrimaryKey(YansouTeam record);
}