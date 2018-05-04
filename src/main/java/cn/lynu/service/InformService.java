package cn.lynu.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import cn.lynu.mapper.InformMapper;
import cn.lynu.model.Inform;

@Service
@Scope(value="singleton",proxyMode=ScopedProxyMode.TARGET_CLASS)
public class InformService {
	
	@Autowired
	private InformMapper informMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Inform> getAllInfrom(){
		return informMapper.selectTitleAndId();
	}

	@Transactional(propagation=Propagation.SUPPORTS)
	public Inform getSubInformById(int informId) {
		return informMapper.selectByPrimaryKey(informId);
	}

}
