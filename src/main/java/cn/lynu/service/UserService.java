package cn.lynu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.lynu.mapper.UserMapper;
import cn.lynu.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public boolean isUser(String account) {
		User user = userMapper.isUser(account);
		if(user!=null) {
			return true;
		}
		return false;
	}
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public User login(String account,String password) {
		return userMapper.login(account, password);
	}
}
