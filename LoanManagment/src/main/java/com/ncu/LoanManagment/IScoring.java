package com.ncu.LoanManagment;

public interface IScoring {

	public void setInfo(Sourcing sc, IGenerate ign, QuickData qd);

	public double getScore();
}
