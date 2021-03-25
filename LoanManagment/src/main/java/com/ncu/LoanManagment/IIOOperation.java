package com.ncu.LoanManagment;

import java.sql.SQLException;

public interface IIOOperation {

	public void read(/* IGenerate ign, Sourcing sc */String appNo) throws ClassNotFoundException, SQLException;

	public void write(Sourcing sc, Education ed, QuickData qd, IGenerate ign, IScoring isc)
			throws ClassNotFoundException, SQLException;

}
