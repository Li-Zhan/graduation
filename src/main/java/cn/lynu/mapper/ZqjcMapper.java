package cn.lynu.mapper;

import cn.lynu.model.Zqjc;
import cn.lynu.model.ZqjcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZqjcMapper {
    long countByExample(ZqjcExample example);

    int deleteByExample(ZqjcExample example);

    int deleteByPrimaryKey(Integer zqjcId);

    int insert(Zqjc record);

    int insertSelective(Zqjc record);

    List<Zqjc> selectByExample(ZqjcExample example);

    Zqjc selectByPrimaryKey(Integer zqjcId);

    int updateByExampleSelective(@Param("record") Zqjc record, @Param("example") ZqjcExample example);

    int updateByExample(@Param("record") Zqjc record, @Param("example") ZqjcExample example);

    int updateByPrimaryKeySelective(Zqjc record);

    int updateByPrimaryKey(Zqjc record);

	Zqjc getzqjcByStudentId(String studentId);
}