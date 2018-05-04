package cn.lynu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import cn.lynu.mapper.MdbMapper;
import cn.lynu.model.Mdb;

@Service
@Scope(value="singleton",proxyMode=ScopedProxyMode.TARGET_CLASS)
public class MdbService {
	
	@Autowired
	private MdbMapper mdbMapper;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean insertSelective(Mdb mdb) {
		if(mdbMapper.insertSelective(mdb)>0) {
			return true;
		}
		return false;
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public Mdb getMdbByStudentId(String studentId) {
		return mdbMapper.getMdbByStudentId(studentId);
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean updateColumn(Mdb mdb) {
		if(mdbMapper.updateColumn(mdb)>0) {
			return true;
		}
		return false;
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public boolean updateColumnById(Mdb mdb) {
		if(mdbMapper.updateByPrimaryKeySelective(mdb)>0) {
			return true;
		}
		return false;
	}

}
