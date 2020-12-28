abstract class Employee extends Person {
    private String companyName;


    public Employee() {
    }

    public Employee(String name,String address,int age,String companyName) {
        super(name,address,age);
        this.companyName = companyName;
     }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public void display(){
        super.display();
        System.out.println("Company Name: " + getCompanyName());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return this.companyName == ((Employee)o).companyName;
    }


    @Override
    public String toString() {
        return String.format("Name: %s\nAddress: %s\nAge: %d\nCompany Name: %s", getName(), getAddress(), getAge() , getCompanyName());
    }
 }