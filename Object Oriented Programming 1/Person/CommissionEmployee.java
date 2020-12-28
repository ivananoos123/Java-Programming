class CommissionEmployee extends Employee {

	private float regularSalary;  //fixed monthly salary
	private int itemSold;	      //total number of items sold
	private float commission_rate;	//rate per item (in decimal form)


    public CommissionEmployee(String name,String address, int age,String cName, float regSal, int nItems, float commission){
        super(name,address,age,cName);
        regularSalary = regSal;
        itemSold = nItems;
        commission_rate = commission;
    }

    public CommissionEmployee() {
    }

    public float getRegularSalary() {
        return this.regularSalary;
    }

    public void setRegularSalary(float regularSalary) {
        this.regularSalary = regularSalary;
    }

    public int getItemSold() {
        return this.itemSold;
    }

    public void setItemSold(int itemSold) {
        this.itemSold = itemSold;
    }

    public float getCommissionRate() {
        return this.commission_rate;
    }

    public void setCommissionRate(float commission_rate) {
        this.commission_rate = commission_rate;
    }

    public CommissionEmployee regularSalary(float regularSalary) {
        this.regularSalary = regularSalary;
        return this;
    }

    public CommissionEmployee itemSold(int itemSold) {
        this.itemSold = itemSold;
        return this;
    }

    public CommissionEmployee commission_rate(float commission_rate) {
        this.commission_rate = commission_rate;
        return this;
    }


	public double earnings(){
		return regularSalary + ((float)itemSold * 0.1);
	}

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CommissionEmployee)) {
            return false;
        }
        CommissionEmployee commissionEmployee = (CommissionEmployee) o;
        return regularSalary == commissionEmployee.regularSalary && itemSold == commissionEmployee.itemSold && commission_rate == commissionEmployee.commission_rate;
    }

 

    @Override
	public String toString(){
		super.toString();
		return "" + super.toString() + "\nRegular salary: " + regularSalary + "\nItem sold: " + itemSold + "\nCommission rate: " +commission_rate;
		}
}