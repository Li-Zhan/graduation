package cn.lynu.mapper;

import cn.lynu.model.MangSheng;
import cn.lynu.model.MangShengExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MangShengMapper {
    long countByExample(MangShengExample example);

    int deleteByExample(MangShengExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MangSheng record);

    int insertSelective(MangSheng record);

    List<MangSheng> selectByExample(MangShengExample example);

    MangSheng selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MangSheng record, @Param("example") MangShengExample example);

    int updateByExample(@Param("record") MangSheng record, @Param("example") MangShengExample example);

    int updateByPrimaryKeySelective(MangSheng record);

    int updateByPrimaryKey(MangSheng record);
}