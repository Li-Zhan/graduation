package cn.lynu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import cn.lynu.mapper.UserMapper;
import cn.lynu.model.User;

@Service
@Scope(value="singleton",proxyMode=ScopedProxyMode.TARGET_CLASS)
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

	@Transactional(propagation=Propagation.SUPPORTS)
	public boolean ispassword(String password, String userId) {
		User user = userMapper.selectByPrimaryKey(userId);
		if(user!=null) {
			if(password.equals(user.getUserPassword())) {
				return true;
			}
		}
		return false;
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	public boolean updateUserInfo(User user) {
		int bool = userMapper.updateByPrimaryKeySelective(user);
		if(bool>0) {
			return true;
		}
		return false;
	}
	
}
