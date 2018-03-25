package cn.lynu.mapper;

import cn.lynu.model.Down;
import cn.lynu.model.DownExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DownMapper {
    long countByExample(DownExample example);

    int deleteByExample(DownExample example);

    int deleteByPrimaryKey(Integer downId);

    int insert(Down record);

    int insertSelective(Down record);

    List<Down> selectByExample(DownExample example);

    Down selectByPrimaryKey(Integer downId);

    int updateByExampleSelective(@Param("record") Down record, @Param("example") DownExample example);

    int updateByExample(@Param("record") Down record, @Param("example") DownExample example);

    int updateByPrimaryKeySelective(Down record);

    int updateByPrimaryKey(Down record);
}