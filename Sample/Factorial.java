import java.util.*;

public class Factorial{
    public static void main(String[] args) {

        long factorial=1;
        Scanner sc = new Scanner(System.in);
        
            try {
                int userInput = sc.nextInt();
                    if(userInput<0)
                        System.out.println("Invalid Input");
                    else{
                        for (int i = 1; i <= userInput; i++) {
                            factorial*=i;
                        }
                        System.out.println(factorial);
                    }
            } catch (Exception e) {
                System.out.println("InputMismatchException");
            }
    }
 }