public class SavingsAccount extends BankAccount{
	private double interestRate = 0;

	public SavingsAccount(){}

	public SavingsAccount(String acctNum, String acctName, double balance, double interest){
		super(acctNum, acctName, balance);
		interestRate = interest;
		
	}

	public SavingsAccount(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public SavingsAccount interestRate(double interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	public void calculateInterest(){
		double interest = super.getBalance() * interestRate;
		super.setBalance(super.getBalance()+interest);
	}

	public String toString() {
		return "" +super.toString() +", "  +getInterestRate();
	}
}
