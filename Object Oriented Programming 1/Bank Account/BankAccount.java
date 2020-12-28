/**
 * Bank Account
 */
        public class BankAccount {
        private String AccountNumber;
        private String AccountName;
        private double balance;
    
        public BankAccount() {
        }
    
        public BankAccount(String acctNum, String acctName, double balance) {
            this.AccountNumber = acctNum;
            this.setAccountName(acctName);
            this.balance = balance;
        }
    
        public void setAccountName(String AccountName) {
            if(AccountName.split(" ").length>1)
                this.AccountName = AccountName;
            else
                this.AccountName = "John Doe";
        }
    
        public void setAccountNumber(String AccountNumber) {
            this.AccountNumber = AccountNumber;
        }
        
        public String getAccountName() {
            return AccountName;
        }

        public String getAccountNumber() {
            return AccountNumber;
        }
    
        public double getBalance() {
            return this.balance;
        }
    
        public void setBalance(double balance) {
            this.balance = balance;
        }
    
        public BankAccount accountName(String AccountName) {
            this.AccountName = AccountName;
            return this;
        }
    
        public BankAccount accountNumber(String AccountNumber) {
            this.AccountNumber = AccountNumber;
            return this;
        }
    
        public BankAccount balance(double balance) {
            this.balance = balance;
            return this;
        }
        public double deposit(double amount){
            if (amount>0) {
                return balance +=amount;
            }
            else{
                return balance;
            }
        }
    
        public boolean withdraw (double amount){
            
            if (balance<amount) {
                return false;
                
            } else {
                 balance -=amount;
                 return true;
            }
        }
    
        public void fundTransfer(BankAccount obj, double amount){
            boolean withdraw = this.withdraw(amount);
            if (withdraw) {
                obj.deposit(amount);
            }
        }
    
        @Override   
        public String toString() {
            return getAccountNumber() + ", " +getAccountName()+ ", " + getBalance();
        
        }
 }