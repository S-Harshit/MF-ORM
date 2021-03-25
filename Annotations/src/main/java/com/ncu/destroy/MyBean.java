package com.ncu.destroy;

import java.util.Random;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyBean implements DisposableBean {
	Random ran = new Random();
	private int rand = ran.nextInt(10);
	public MyBean() {
	System.out.println("MyBean instance created id = " + rand);
	}

	@PreDestroy
	private void shutdown() {
		System.out.println("Shutdown All Resources");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy "+ this.rand);
	}
}