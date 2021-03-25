package com.ncu.aspected2;

import org.springframework.stereotype.Component;

@Component("xscan")
public class X {

	public void logic() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("X Logic I is " + i);
		}
	}
}