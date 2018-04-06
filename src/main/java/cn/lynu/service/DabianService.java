package cn.lynu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.lynu.mapper.DaBianMapper;

@Service
public class DabianService {
	
	@Autowired
	private DaBianMapper daBianMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public Integer getThisStudentScore(String studentId) {
		Integer score=daBianMapper.getThisStudentScore(studentId);
		if(score!=null) {
			return score;
		}
		return -1;
	}

}
