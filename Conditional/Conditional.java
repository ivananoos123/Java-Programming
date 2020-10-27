import java.util.*;
public class Conditional {
    public static void main(String[] args) {
        double commission = 0;
        Scanner userInput = new Scanner (System.in);
        System.out.print("Input Sale Price: P");
        double salePrice = userInput.nextInt();
        System.out.print("Input Type of Appliance [1-4]: ");
        int typeofAppliance = userInput.nextInt();
        switch (typeofAppliance) {
            case 1:
                salePrice*=0.07;
                if (salePrice>400) {
                    commission=salePrice;
                } else {
                    commission=400;
                }
                break;
            case 2:
                salePrice*=0.10;
                if (salePrice<900) {
                    commission=salePrice;
                } else {
                    commission=900;
                }
                break;
            case 3:
                commission=salePrice*0.12;
                break;
            case 4:
                commission=250;
                break;
            default:
            	System.out.printf("Invalid input!\n");
                break;
        }
        System.out.printf("Commission of the Sales Man: P%.2f\n", commission);
    }
}
