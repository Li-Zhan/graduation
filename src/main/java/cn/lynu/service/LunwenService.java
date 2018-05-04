package cn.lynu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import cn.lynu.mapper.LunwenMapper;
import cn.lynu.model.Lunwen;

@Service
@Scope(value="singleton",proxyMode=ScopedProxyMode.TARGET_CLASS)
public class LunwenService {
	
	@Autowired
	private LunwenMapper lunwenMapper;

	@Transactional(propagation=Propagation.SUPPORTS)
	public Lunwen getLunwenBySid(String studentId) {
		return lunwenMapper.getLunwenBySid(studentId);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public boolean upLunwenBySid(Lunwen lunwen) {
		if(lunwenMapper.updateByPrimaryKeySelective(lunwen)>0) {
			return true;
		}
		return false;
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean insertOrUpdate(String studentId,Lunwen lw) {
		Lunwen lunwen=lunwenMapper.getLunwenBySid(studentId);
		if(lunwen!=null) {
			lunwen.setLunwenDate(lw.getLunwenDate());
			lunwen.setLunwenName(lw.getLunwenName());
			lunwen.setLunwenPath(lw.getLunwenPath());
			lunwenMapper.updateByPrimaryKeySelective(lunwen);
			return true;
		}else {
			lw.setStudentId(studentId);
			lunwenMapper.insertSelective(lw);
			return true;
		}
	}

}
