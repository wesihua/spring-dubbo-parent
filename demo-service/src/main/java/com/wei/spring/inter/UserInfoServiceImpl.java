package com.wei.spring.inter;

import org.springframework.stereotype.Service;

import com.wei.spring.domain.UserInfo;

@Service("userInfoService")
public class UserInfoServiceImpl implements IUserInfoService {

	public UserInfo queryUserInfoById(String userId) throws Exception {
		
		UserInfo info = new UserInfo();
		info.setPassword("123");
		info.setUserId("1");
		info.setUsername("demo");
		return info;
	}

}
