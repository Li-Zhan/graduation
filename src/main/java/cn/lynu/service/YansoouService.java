package cn.lynu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.lynu.mapper.YansouTeamMapper;
import cn.lynu.model.YansouTeam;

@Service
public class YansoouService {
	
	@Autowired
	private YansouTeamMapper yansouTeamMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public YansouTeam selectYanSouInfoByid(Integer yansouTeamId) {
		return yansouTeamMapper.selectYanSouInfoByid(yansouTeamId);
	}

}
