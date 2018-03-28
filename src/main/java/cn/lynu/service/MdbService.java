package cn.lynu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.lynu.mapper.MdbMapper;
import cn.lynu.model.Mdb;

@Service
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

}
