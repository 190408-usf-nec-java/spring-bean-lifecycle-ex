package com.revature.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,
				InitializingBean, DisposableBean, BeanPostProcessor {

	@Autowired
	private MyDependency myDependency;
	
	public void destroy() throws Exception {
		System.out.println(this.getClass().getSimpleName() + " is calling destroy");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println(this.getClass().getSimpleName() + " is calling afterPropertiesSet");
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println(this.getClass().getSimpleName() + " is calling setApplicationContext");
		
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println(this.getClass().getSimpleName() + " is calling setBeanFactory");
	}

	public void setBeanName(String name) {
		System.out.println(this.getClass().getSimpleName() + " is calling setBeanName");
	}
	
}
