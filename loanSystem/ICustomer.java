package loanSystem;

//Interface implemented by Customer.
public interface ICustomer {

	public double getIncome();

	public void setIncome(double income);

	public double getAssetValue();

	public void setAssetValue(double assetValue);

	public double getLiabilityValue();

	public void setLiabilityValue(double liabilityValue);

	public String getLoan(LoanReq loan);

	public String getAddress(Address add);

	public String getFullName();

	public void setFullName(String fullName);

	public String getEmail();

	public void setEmail(String email);

	public int getAge();

	public void setAge(int age);

	public String getPhone();

	public void setPhone(String phone);

	public long getAadhar();

	public void setAadhar(long aadhar);

	public String getPan();

	public void setPan(String pan);
}
