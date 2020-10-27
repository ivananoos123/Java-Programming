import java.util.*;
/**
Iterative (counter):
Take as input the student’s grades of seven subjects and its corresponding unit taken in a
semester. A student is considered failed if the average grade is less than 3.0. Compute the student’s
General Point Average (GPA) by multiplying the grade per subject by its corresponding unit, sum up the
products and divide the sum by its total units. Print the computed average grade and whether the student
failed or passed.

*/

public class Counter {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double sum = 0;
        int sumofUnits = 0;
        System.out.println("Calculating your GPA");
        for (int i = 0; i <7 ; i++) {
            System.out.printf("Input grade of subject no.[%d]: ",i+1);
            double grade = userInput.nextDouble();
            System.out.printf("Unit\s of subject no.[%d]: ",i+1);
            int units = userInput.nextInt();
            sumofUnits+=units;
            sum +=  grade * units;
        }
        double average =  sum/sumofUnits;
        System.out.printf("Average: %.2f\n", average);
        if (average<3.0) {
            System.out.print("Failed!");
        } else {
            System.out.print("Passed!");
        }

    }
}
