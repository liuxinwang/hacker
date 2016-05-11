package com.hackerhome.www.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
	public ApplicationContext getContext(){
		String conf = "spring.xml";
		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
		return ac;
		
	}
}
