public class Employee extends Person {
    private String department;
    private double salary;

    public Employee(String name,String address,int age,String companyName, double salary) {
        super(name,address,age);
        this.department = companyName;
        setSalary(salary);
    }

    public Employee() {

    }

    public void setDepartment(String departmentName){
        department = departmentName;
    }

    public String getDepartment(){
        return department;
    }

    public String toString(){
        return super.toString()+", "+department+", " +salary;
    }

    public boolean equals(Object obj){
        boolean bool = false;

        if(obj instanceof Employee){
            Employee otherEmployee = (Employee) obj;
            bool = super.equals(otherEmployee) &&
                    salary == otherEmployee.getSalary() &&
                    department.equals(otherEmployee.getDepartment());
        }
        return bool;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        try{
            if(salary < 0)
                throw new InvalidSalaryException("Invalid salary.");
            this.salary = salary;
        }catch (InvalidSalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidSalaryException extends Exception{
    InvalidSalaryException(String message){
        super(message);
    }
}