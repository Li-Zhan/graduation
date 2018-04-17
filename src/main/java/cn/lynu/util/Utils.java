package cn.lynu.util;

import java.util.UUID;
import org.springframework.util.DigestUtils;

public class Utils {
	
	public static String getUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	public static String md5(String password) {
		return DigestUtils.md5DigestAsHex(password.getBytes());
	}

}
