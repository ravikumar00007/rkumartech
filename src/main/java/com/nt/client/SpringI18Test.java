package com.nt.client;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18Test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get message from properties file according to the Locale we submit
		Locale locale=new Locale(args[0],args[1]);
		String msg1=ctx.getMessage("wish.msg",new String[] {}, locale);
		String msg2=ctx.getMessage("bye.msg",new String[] {}, locale);
		//print the message
		System.out.println(msg1+"     "+msg2);
		
	}
}
