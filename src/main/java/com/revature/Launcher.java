package com.revature;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.revature.beans.MyBean;

public class Launcher {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.revature.beans");
		MyBean myBean = context.getBean(MyBean.class);
		context.getBeanFactory().destroyBean(myBean);
	}
}
