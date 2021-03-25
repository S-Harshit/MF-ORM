package com.ncu.LoanManagment;

import java.sql.SQLException;

public interface IDedupe {

	public void setInfo(Sourcing sc, Education ed);

	public boolean checkValdity() throws ClassNotFoundException, SQLException;
}
