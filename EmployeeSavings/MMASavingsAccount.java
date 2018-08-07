package EmployeeSavings;

//class to create and store instances of the savings account of employee
public class MMASavingsAccount {
	private int accountID;
	private String accountHolderName;
	private double accountBal;
	private boolean isSalaried;

	// parameterized constructor
	public MMASavingsAccount(int accountID, String accountHolderName, double accountBal, boolean isSalaried) {
		super();
		this.accountID = accountID;
		this.accountHolderName = accountHolderName;
		this.accountBal = accountBal;
		this.isSalaried = isSalaried;
	}

	// getter methods
	public int getAccountID() {
		return accountID;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBal() {
		return accountBal;
	}

	public boolean isSalaried() {
		return isSalaried;
	}

	// toString function
	@Override
	public String toString() {
		return "MMASavingsAccount [accountID=" + accountID + ", accountHolderName=" + accountHolderName
				+ ", accountBal=" + accountBal + ", isSalaried=" + isSalaried + "]";
	}

}
