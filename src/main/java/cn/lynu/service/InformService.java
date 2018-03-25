package cn.lynu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.lynu.mapper.InformMapper;
import cn.lynu.model.Inform;
import cn.lynu.model.InformExample;

@Service
public class InformService {
	
	@Autowired
	private InformMapper informMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Inform> getAllInfrom(){
		return informMapper.selectByExample(new InformExample());
	}

}
