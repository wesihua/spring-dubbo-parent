package com.wei.spring;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wei.spring.domain.UserInfo;
import com.wei.spring.inter.IUserInfoService;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	//String[] resources = new String[] {};
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml","demo-consumer.xml");
        ctx.start();
        System.out.println("启动demo-app成功...");
        IUserInfoService userInfoService = (IUserInfoService) ctx.getBean("userInfoService");
        UserInfo userInfo = userInfoService.queryUserInfoById("");
        System.out.println(userInfo.getUsername());
        synchronized (App.class) {
			while(true) {
				App.class.wait();
			}
		}
    }
}
