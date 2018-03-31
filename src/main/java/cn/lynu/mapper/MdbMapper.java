package cn.lynu.mapper;

import cn.lynu.model.Mdb;
import cn.lynu.model.MdbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MdbMapper {
    long countByExample(MdbExample example);

    int deleteByExample(MdbExample example);

    int deleteByPrimaryKey(Integer mdbId);

    int insert(Mdb record);

    int insertSelective(Mdb record);

    List<Mdb> selectByExample(MdbExample example);

    Mdb selectByPrimaryKey(Integer mdbId);

    int updateByExampleSelective(@Param("record") Mdb record, @Param("example") MdbExample example);

    int updateByExample(@Param("record") Mdb record, @Param("example") MdbExample example);

    int updateByPrimaryKeySelective(Mdb record);

    int updateByPrimaryKey(Mdb record);

	Mdb getMdbByStudentId(String studentId);
	
	int updateColumn(Mdb mdb);
}