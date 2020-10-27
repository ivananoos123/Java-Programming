import java.util.*;
public class Trailer {
    public static void main(String[] args) {
        Scanner userInput = new Scanner (System.in);
        int teamOneScore = 0;
        int teamTwoScore = 0;
        int goalScore;
        System.out.println("SCOREBOARD: TEAM [1], TEAM [2]");
        System.out.print("Input goal sequence: ");
        do {
            goalScore = userInput.nextInt();
            if (goalScore==1 || goalScore==2 || goalScore==0) {
                if (goalScore==1) {
                    teamOneScore++;
                }
                if (goalScore==2){
                    teamTwoScore++;
                }
            }
            else{
                System.out.println("Invalid input, try again");
                continue;
            }
        } while (goalScore!=0);
        System.out.printf("TEAM [1]:  %d goals\n", teamOneScore);
        System.out.printf("TEAM [2]:  %d goals\n", teamTwoScore);
        if (teamOneScore>teamTwoScore) {
            System.out.println("Winner: TEAM [1]");
        }
        else if (teamTwoScore>teamOneScore) {
            System.out.println("Winner: TEAM [2]");
        }
        else {
            System.out.println("Both Tied");
        }

    }
}


