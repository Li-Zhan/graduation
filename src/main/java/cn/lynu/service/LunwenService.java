package cn.lynu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.lynu.mapper.LunwenMapper;
import cn.lynu.model.Lunwen;

@Service
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

}
