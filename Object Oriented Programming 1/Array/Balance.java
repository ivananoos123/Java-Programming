/**
 * Balance
 */
import java.util.*;
public class Balance {

    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        double prevBal = userInput.nextDouble();
        double addCharges = userInput.nextDouble();
        double interest=0;
        double newBal=0;
        double minPay=0;

        if (prevBal == 0){
            interest = 0;
            newBal = prevBal + addCharges + interest;
        }
        else{
            interest = 0.02*(prevBal + addCharges);
            newBal = prevBal + addCharges + interest;
        }

        if(newBal < 50)
            minPay = newBal;
        else if(newBal>= 50 && newBal<=300)
            minPay = 50.00;
        else{
            minPay = newBal * 0.20;
        }   

        System.out.printf("Previous Balance: $%.2f\n",prevBal);
        System.out.printf("Additional Charges: $%.2f\n",addCharges);
        System.out.printf("Interest: $%.2f\n",interest);
        System.out.printf("New Balance: $%.2f\n",newBal);
        System.out.printf("Minimum Payment: $%.2f\n",minPay);
    }
}
