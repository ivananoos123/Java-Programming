public class CheckingAccount extends BankAccount
{
	private double minimum;
	private double charge;

	public CheckingAccount() {
	}

	public CheckingAccount(String acctNum, String acctName, double balance, double minimum, double charge) {
		super(acctNum, acctName, balance);
		this.minimum = minimum;
		this.charge = charge;
	}

	public double getMinimum() {
		return this.minimum;
	}

	public void setMinimum(double minimum) {
		this.minimum = minimum;
	}

	public double getCharge() {
		return this.charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public CheckingAccount minimum(double minimum) {
		this.minimum = minimum;
		return this;
	}

	public CheckingAccount charge(double charge) {
		this.charge = charge;
		return this;
	}

	void cashCheck(String payee, double amount){

		double newBal;

		if (amount>super.getBalance()){
			super.setBalance(super.getBalance());
		}
		else{
				newBal = getBalance() - amount ;
				if(newBal <minimum){
				super.setBalance(super.getBalance()-charge);
				super.setBalance(super.getBalance()-amount);
			}
			else{
				super.setBalance(super.getBalance()-amount);
			}
		}


	}

	@Override
	public String toString() {
		return "" +super.toString() + ", "+ getMinimum() + ", " +getCharge();
			
	}
}

