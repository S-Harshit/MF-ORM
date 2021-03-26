package loanSystem;

import java.sql.SQLException;

//Interface implemented by IOOpertaion.
public interface IIOOperation {

	public void read(String appNo) throws ClassNotFoundException, SQLException;

	public void write(ICustomer ic, ILoanProcess il, Address add, LoanReq loan)
			throws ClassNotFoundException, SQLException;

}
