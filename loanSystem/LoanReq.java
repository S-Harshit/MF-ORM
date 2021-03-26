package loanSystem;

import org.springframework.stereotype.Component;

//This class contains all getter and setter for all loan information of the user.
@Component("loanreq")
public class LoanReq {

	String kind;

	double amount;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
