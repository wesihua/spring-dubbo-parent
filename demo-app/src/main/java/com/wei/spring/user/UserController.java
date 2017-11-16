package com.wei.spring.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wei.spring.domain.UserInfo;
import com.wei.spring.inter.IUserInfoService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private IUserInfoService userInfoService;
	
	@ResponseBody
	@RequestMapping("show")
	public UserInfo show() {
		UserInfo u = null;
		try {
			u = userInfoService.queryUserInfoById("1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
}
