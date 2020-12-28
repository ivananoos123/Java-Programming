



// Employee

// Override the display method in the Person class
// override the toString() and equals() methods
// Hourly Employee

// provide the setters and getters of your data members
// earnings is computed by having the product of the total number of hours worked and the rate. but if the number of hours worked exceeds 40, the rate increases to 150% of the current rate. (ex. rate=200; 150% = 300)
// override the toString() and equals() methods

public class TestCase {
    public static void main(String[] args) {
        // HourlyEmployee h = new HourlyEmployee("Yule Josef Ato","Cebu City",23,"Accenture",40, 550.98);
        // System.out.println(h);
        // System.out.println("\nEarnings: "+h.earnings());

        // HourlyEmployee h = new HourlyEmployee("Linc Josef Ato","Talisay City",28,"Alliance",41, 600.00);
        // h.display();
        // System.out.println("\nEarnings: "+h.earnings());

        // HourlyEmployee h1 = new HourlyEmployee("Yule Josef Ato","Cebu City",23,"Accenture",40, 550.98);
        // HourlyEmployee h2 = new HourlyEmployee("Linc Josef Ato","Talisay City",28,"Alliance",41, 600.00);
        // System.out.println(h1.equals(h2));

        HourlyEmployee h1 = new HourlyEmployee();
        h1.setName("Yule Josef Ato");
        h1.setAddress("Cebu City");
        h1.setAge(28);
        h1.setCompanyName("Kyocera");
        h1.setRate(600.00);
        h1.setHoursWorked(40);
        System.out.println(h1);
    }
}
