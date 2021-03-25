package com.ncu.LoanManagment;

import java.util.Random;

public class Generate implements IGenerate {

	@Override
	public String generate(Sourcing sc) {
		Random rn = new Random();
		String appNum = sc.getPhoneNum().get(0) + Integer.toString(rn.nextInt(10000));
		return appNum;

	}

	@Override
	public double trueIncome(QuickData qd) {
		// TODO Auto-generated method stub
		double trueIncome;

		trueIncome = (qd.getIncome() + qd.getAssetValue()) - qd.getLiabilityValue();

		return trueIncome;
	}

}
