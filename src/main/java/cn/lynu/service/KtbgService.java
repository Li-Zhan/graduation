package cn.lynu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.lynu.mapper.KtbgMapper;
import cn.lynu.model.Ktbg;

@Service
public class KtbgService {
	
	@Autowired
	private KtbgMapper ktbgMapper;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean insertSelective(Ktbg ktbg) {
		if(ktbgMapper.insertSelective(ktbg)>0) {
			return true;
		}
		return false;
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public Ktbg getKtbgByStudentId(String studentId) {
		return ktbgMapper.getKtbgByStudentId(studentId);
	}

}
