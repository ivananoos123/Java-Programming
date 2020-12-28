import java.util.*;

public class Height {

    /**public static void unique(int array[], int input[]){

        boolean isUnique;
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
             isUnique=true;
            for (int j : array) {
                if(j==input[i]){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                array[counter]=input[i]; //0,1,2
                counter++;
            }
        }

        for (int j : array) {
            System.out.println(j);
        }
    }
    */
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5); 
     System.out.println("The distinct elements are :"); 
     list.stream().distinct().forEach(System.out::println); 
    }
}
