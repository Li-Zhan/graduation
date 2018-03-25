package cn.lynu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.lynu.mapper.DownMapper;
import cn.lynu.model.Down;

@Service
public class DownService {
	
	@Autowired
	private DownMapper downMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Down> getAllDown(){
		return downMapper.selectByExample(null);
	}

}
