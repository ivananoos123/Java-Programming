public interface Payable {
    public double getPaymentAmount();
}


abstract class Employee implements Payable{
    private String firstName;
    private String lastName;
    private String SSN;

        public Employee() {}
    
        public Employee(String firstName, String lastName, String SSN) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.SSN = SSN;
        }
    
        public String getFirstName() {
            return this.firstName;
        }
    
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    
        public String getLastName() {
            return this.lastName;
        }
    
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    
        public String getSSN() {
            return this.SSN;
        }
    
        public void setSSN(String SSN) {
            this.SSN = SSN;
        }
    
        public Employee firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
    
        public Employee lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
    
        public Employee SSN(String SSN) {
            this.SSN = SSN;
            return this;
        }
}


public class SalariedEmployee extends Employee{

    private double weeklySalary;
        public SalariedEmployee() {}
    
        public SalariedEmployee(double weeklySalary) {
            setWeeklySalary(weeklySalary);
        }

        public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary) {
            super(firstName, lastName, SSN);
            setWeeklySalary(weeklySalary);
        }
    
        public double getWeeklySalary() {
            return this.weeklySalary;
        }
    
        public void setWeeklySalary(double weeklySalary) {
            this.weeklySalary = weeklySalary;
        }
    
        public SalariedEmployee weeklySalary(double weeklySalary) {
            this.weeklySalary = weeklySalary;
            return this;
        }

        public double getPaymentAmount() {
            return getWeeklySalary();
        }
}
    