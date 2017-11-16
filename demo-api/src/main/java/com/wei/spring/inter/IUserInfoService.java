package com.wei.spring.inter;

import com.wei.spring.domain.UserInfo;

/**
 * 用户信息接口
 * @author weisihua
 * @date 2017年11月14日
 */
public interface IUserInfoService {

	/**
	 * 根据id查询用户信息
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	UserInfo queryUserInfoById(String userId) throws Exception;
}
