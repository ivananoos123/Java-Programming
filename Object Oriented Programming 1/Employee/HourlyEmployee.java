class HourlyEmployee extends Employee
{
	private int hoursWorked;  //total number of hours worked
	private double rate;	  // rate per hour


    public HourlyEmployee() {
    }

    public HourlyEmployee(String name,String address,int age,String cName,int hoursWorked,double rate)	{
		super(name,address,age,cName);
		this.hoursWorked = hoursWorked;
		this.rate = rate;
	}

	public HourlyEmployee(String name,String address,int age,String cName)	{
		super(name,address,age,cName);
		hoursWorked = 0;
		rate = 0;

	}

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getRate() {
        return this.rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public HourlyEmployee hoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
        return this;
    }

    public HourlyEmployee rate(double rate) {
        this.rate = rate;
        return this;
    }

    public double earnings(){
		if(hoursWorked > 40)
			return 40 * rate + ( hoursWorked - 40 ) * rate * 1.5;
		else
			return hoursWorked * rate;
    }
    

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof HourlyEmployee)) {
            return false;
        }
        HourlyEmployee hourlyEmployee = (HourlyEmployee) o;
        return hoursWorked == hourlyEmployee.hoursWorked && rate == hourlyEmployee.rate;
    }

   
	@Override
	public String toString(){
		return "" + super.toString() + "\nHours worked: " + hoursWorked + "\nRate: " + rate;
    }

}