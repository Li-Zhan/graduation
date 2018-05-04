package cn.lynu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import cn.lynu.mapper.DaBianMapper;
import cn.lynu.model.DaBian;

@Service
@Scope(value="singleton",proxyMode=ScopedProxyMode.TARGET_CLASS)
public class DabianService {
	
	@Autowired
	private DaBianMapper daBianMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public Integer getThisStudentScore(String studentId) {
		DaBian daBian = daBianMapper.getThisStudentScore(studentId);
		if(daBian!=null) {
			return daBian.getDabianScore();
		}
		return -1;
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public boolean insertDabian(DaBian daBian) {
		if(daBianMapper.insertSelective(daBian)>0) {
			return true;
		}
		return false;
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public boolean updateDabian(DaBian daBian) {
		if(daBianMapper.updateByPrimaryKeySelective(daBian)>0) {
			return true;
		}
		return false;
	}

}
