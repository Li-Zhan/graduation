package cn.lynu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import cn.lynu.mapper.KtbgMapper;
import cn.lynu.model.Ktbg;

@Service
@Scope(value="singleton",proxyMode=ScopedProxyMode.TARGET_CLASS)
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
	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean updateColumn(Ktbg ktbg) {
		if(ktbgMapper.updateColumn(ktbg)>0) {
			return true;
		}
		return false;
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public Ktbg getKtbgStatus(String ktbgId) {
		return ktbgMapper.selectByPrimaryKey(Integer.valueOf(ktbgId));
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public boolean updateByPrimaryKeySelective(Ktbg ktbg) {
		if(ktbgMapper.updateByPrimaryKeySelective(ktbg)>0) {
			return true;
		}
		return false;
	}

}
