import java.util.*;
/**
 Use a single-subscripted array to solve the following problem. A company pays its salespeople on a
commission basis. The salespeople receive Php200 per week plus 9 percent of their gross sales for the
week. For example a salesperson who grosses Php3000 in sales in a week receives Php200 plus 9 percent
of Php3000 or a total of Php470. Write a C program that determines how many of the 10 salespeople
earned salaries which is more than Php500.
 */
public class Array {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        int counter=0;
        double grossSales [] = new double [10];
        double earnedSalaries [] = new double [10];
        System.out.println("Gross Sales of 10 Salespeople:");
        for (int i = 0; i < grossSales.length; i++) {
            System.out.printf("[%d]: ", i+1);
            grossSales[i] = userInput.nextDouble();
            earnedSalaries[i] = 200 + (grossSales[i] * 0.09);
            if (earnedSalaries[i] > 500) {
                counter++;
            }
        }
        System.out.println("Earned Salaries of 10 Salespeople:");
        for (int i = 0; i < grossSales.length; i++) {
            System.out.printf("Salesperson %d: %.2f\n",i+1,earnedSalaries[i]);
        }
        System.out.println("Number of salespeople who's earned salary is more than Php500: "+counter);
    }

}