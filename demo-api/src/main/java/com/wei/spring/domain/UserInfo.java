package com.wei.spring.domain;

import java.io.Serializable;

/**
 * 用户对象
 * @author weisihua
 * @date 2017年11月14日
 */
public class UserInfo implements Serializable {

	private static final long serialVersionUID = -1727652258584915434L;
	/*
	 * 编号
	 */
	private String userId;
	/*
	 * 用户名
	 */
	private String username;
	
	/*
	 * 密码
	 */
	private String password;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
