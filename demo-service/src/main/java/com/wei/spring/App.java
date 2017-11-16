package com.wei.spring;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	//String[] resources = new String[] {};
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml","demo-provider.xml");
        ctx.start();
        System.out.println("启动demo-service成功...");
        //System.in.read(); // 按任意键退出
        synchronized (App.class) {
			while(true) {
				App.class.wait();
			}
		}
    }
}
