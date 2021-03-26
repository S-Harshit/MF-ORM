package loanSystem;

import java.sql.SQLException;

//Interface implemented by LoanProcess.
public interface ILoanProcess {

	public void setInfoForScore(ICustomer ic);

	public double getScore();

	public void setInfo(ICustomer ic);

	public boolean checkValdity() throws ClassNotFoundException, SQLException;

	public String generate(ICustomer ic);

	public double trueIncome(ICustomer ic);
}
