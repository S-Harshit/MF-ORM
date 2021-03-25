package com.ncu.LoanManagment;

public class Scoring implements IScoring {

	double trueIncome;

	int age;

	double min = 500000d;

	double agemin = 20;

	@Override
	public void setInfo(Sourcing sc, IGenerate ign, QuickData qd) {

		this.trueIncome = ign.trueIncome(qd);

		this.age = sc.getAge();
	}

	@Override
	public double getScore() {

		if (this.trueIncome <= 10000000 && this.trueIncome >= min) {
			if (this.age <= 40 && this.age >= 25) {
				return 50d;
			} else if (this.age > 40) {
				return 30d;
			} else if (this.age < 25 && this.age > agemin) {
				return 15d;
			} else
				return 0d;
		}

		else if (this.trueIncome <= 50000000 && this.trueIncome > 10000000) {
			if (this.age <= 40 && this.age >= 25) {
				return 70d;
			} else if (this.age > 40) {
				return 50d;
			} else if (this.age < 25 && this.age > agemin) {
				return 25d;
			} else
				return 0d;
		}

		else if (this.trueIncome > 50000000) {
			if (this.age <= 40 && this.age >= 25) {
				return 100d;
			} else if (this.age > 40) {
				return 80d;
			} else if (this.age < 25 && this.age > agemin) {
				return 40d;
			} else
				return 0d;
		}

		else
			return 0d;
	}
}
