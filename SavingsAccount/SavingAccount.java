package SavingsAccount;

//saving account class that has all the instance members of the class
public class SavingAccount {
	private double acc_balance;
	private int acc_ID;
	private String name;
	private boolean isSalary;

	// parameterized constructor
	public SavingAccount(double acc_balance, int acc_ID, String name, boolean isSalary) {
		super();
		this.acc_balance = acc_balance;
		this.acc_ID = acc_ID;
		this.name = name;
		this.isSalary = isSalary;
	}

//getters and setters
	public double getAcc_balance() {
		return acc_balance;
	}

	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}

	public int getAcc_ID() {
		return acc_ID;
	}

	public void setAcc_ID(int acc_ID) {
		this.acc_ID = acc_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	public void withdraw(double amount) {
		this.acc_balance -= amount;
	}

	public void deposit(double amount) {
		this.acc_balance += amount;
	}

//hashcode generator
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + acc_ID;
		long temp;
		temp = Double.doubleToLongBits(acc_balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isSalary ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

//equals checking
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SavingAccount other = (SavingAccount) obj;
		if (acc_ID != other.acc_ID)
			return false;
		if (Double.doubleToLongBits(acc_balance) != Double.doubleToLongBits(other.acc_balance))
			return false;
		if (isSalary != other.isSalary)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

//to string method to print the instances 
	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + acc_balance + ",acc_ID=" + acc_ID + ",name=" + name + ",isSalary="
				+ isSalary;
	}

}
