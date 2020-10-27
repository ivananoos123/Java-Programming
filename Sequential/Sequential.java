import java.util.*;

public class Sequential {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input number of units: ");
        int input = userInput.nextInt();  // every unit = 45
        System.out.println("Number of Units: " +input);
        int unitsCost = input*45 ;
        System.out.println("Cost of Units: " +unitsCost);
        double misc = unitsCost*0.15;
        System.out.println("Misc: " +misc );
        int blanketFee = 200;
        System.out.println("Blanket Fee: " +blanketFee);
        double tuitionFee = unitsCost + (unitsCost*0.15 ) + 200 ;
        System.out.println("Tuition Fee: " +tuitionFee);

    }
}
