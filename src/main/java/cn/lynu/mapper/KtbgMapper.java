package cn.lynu.mapper;

import cn.lynu.model.Ktbg;
import cn.lynu.model.KtbgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KtbgMapper {
    long countByExample(KtbgExample example);

    int deleteByExample(KtbgExample example);

    int deleteByPrimaryKey(Integer ktbgId);

    int insert(Ktbg record);

    int insertSelective(Ktbg record);

    List<Ktbg> selectByExample(KtbgExample example);

    Ktbg selectByPrimaryKey(Integer ktbgId);

    int updateByExampleSelective(@Param("record") Ktbg record, @Param("example") KtbgExample example);

    int updateByExample(@Param("record") Ktbg record, @Param("example") KtbgExample example);

    int updateByPrimaryKeySelective(Ktbg record);

    int updateByPrimaryKey(Ktbg record);
    
    Ktbg getKtbgByStudentId(String studentId);
    
    int updateColumn(Ktbg ktbg);
}