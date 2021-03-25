package com.ncu.javaconfig;

public class CricketCoach implements Coach{
	Fortune fortune;
	
	CricketCoach() {
		
	}
	CricketCoach(Fortune fortune) {
		this.fortune = fortune;
	}
	
	public String getRoutine() {
		return "New Routine";
	}
	public void getFortune() {
		System.out.println(fortune.getFortune());
	}
	
}
