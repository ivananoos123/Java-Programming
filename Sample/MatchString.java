/**
 * MatchString
 */
import java.util.*;

public class MatchString {

    public static String match(String text, String word){

        String [] textArray = text.split(" ");
        String newText = "";
        while(text.length()!=0) {
            for (String words : textArray) {
                if(words.equals(word) || words.equals(word+",") ||words.equalsIgnoreCase(word) || words.equalsIgnoreCase(word+",")){
                    words = words.toUpperCase();
                }
                newText+=words;
                newText+=" ";
            }
            break;
        }
        return newText;
    }

    public static int countOccurence (String text, String word){

        String [] textArray = null;
        int counter =0;
        textArray = text.split(" ");
        while(text.length()!=0) {
            for (String words : textArray) {
                if(words.equals(word) || words.equals(word+",") ||words.equalsIgnoreCase(word) || words.equalsIgnoreCase(word+",")){
                    counter++;
                }
            }
            break;
        }
        return counter;
    }

    public static void main(String[] args) {

        String text = "You will always have my love, my love, for the love I love is as lovely as love itself. ";
        String word = "love";

        // Scanner userInput = new Scanner (System.in);
        // text = userInput.nextLine();
        // word = userInput.nextLine();
        
      

        System.out.printf("New text: %s", match(text, word));
        System.out.print("\n");
        System.out.print("\n");
        System.out.printf("Number of occurrence: %d", countOccurence(text, word));
        
    }
}
