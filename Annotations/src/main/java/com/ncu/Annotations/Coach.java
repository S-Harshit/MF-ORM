package com.ncu.Annotations;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tc")
public class Coach implements ICoach {

	

	@Override
	public void getDailyW() {
		// TODO Auto-generated method stub
		System.out.println("Workout");
	}
	
	@Autowired	 
	public void getDailyFortune(Ifortune f) {
		// TODO Auto-generated method stub
		try {
			f.getFortune();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

