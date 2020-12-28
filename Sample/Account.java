public class Account{
    private String accntNumber;
    private String accntName;
    private double balance;
    
    public Account(){}
    public Account(String num, String name, double bal){
        accntNumber = num;
        accntName = name;
        balance = bal;
    }
    
    public double getBalance(){ return balance;}
    
    public boolean withdraw (double amount){
            boolean withdraw = false;
            try {
                if (amount <= balance) {
                    balance -=amount;
                    withdraw = true;
                }
                else{
                    throw new InsufficientFunds();
                }
            } catch (InsufficientFunds e) {
                System.out.println("Insufficient: Insufficient funds.");
            }
        return withdraw;
    }      
    static class InsufficientFunds extends Exception {
	        public InsufficientFunds(){}
    }
    public static void main(String[] args) {
        Account account = new Account("Acct-001","Juan dela Cruz", 5000.0);
        account.withdraw(500.0);
        System.out.println("Balance: "+account.getBalance());
    }
}
