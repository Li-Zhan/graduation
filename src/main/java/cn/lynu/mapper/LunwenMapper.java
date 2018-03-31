package cn.lynu.mapper;

import cn.lynu.model.Lunwen;
import cn.lynu.model.LunwenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LunwenMapper {
    long countByExample(LunwenExample example);

    int deleteByExample(LunwenExample example);

    int deleteByPrimaryKey(Integer lunwenId);

    int insert(Lunwen record);

    int insertSelective(Lunwen record);

    List<Lunwen> selectByExample(LunwenExample example);

    Lunwen selectByPrimaryKey(Integer lunwenId);

    int updateByExampleSelective(@Param("record") Lunwen record, @Param("example") LunwenExample example);

    int updateByExample(@Param("record") Lunwen record, @Param("example") LunwenExample example);

    int updateByPrimaryKeySelective(Lunwen record);

    int updateByPrimaryKey(Lunwen record);

	Lunwen getLunwenBySid(String studentId);

}