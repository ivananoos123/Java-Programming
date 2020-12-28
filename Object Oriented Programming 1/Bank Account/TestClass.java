public class TestClass {
    public void input(){
        SavingsAccount objA = new SavingsAccount("Act-001", "Mary Joy Torcende", 10000, 0.25);
        SavingsAccount objB = new SavingsAccount("Act-002", "Matt Plaza", 5000, 0.20);
        CheckingAccount objC = new CheckingAccount("Act-003", "David Andrew", 20000, 10000, 200);
        objA.withdraw(1000);
        objB.deposit(5500);
        objA.fundTransfer(objB, 2000);
        objC.cashCheck("Sheryl Cruz", 5000);
        System.out.println(objA);
        System.out.println(objB);
        System.out.println(objC);
    }

    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.input();
    }
}