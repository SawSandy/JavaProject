package controlflow;
import java.util.Scanner;
public class NestedIfStatement {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("How many states in USA?");
        int guess=0; // if we don't give "0" it will display error in if statement guess==50
        if (userInput.hasNext() == true) guess = userInput.nextInt();
        if (guess == 50) {
            System.out.println("Your answer correct.");
        }
        else {
            System.out.println("Your answer incorrect.");
            if(guess > 50){
                System.out.println("answer too low");
            }
            else{
                System.out.println("answer too high");
            }

        }

    }
}
