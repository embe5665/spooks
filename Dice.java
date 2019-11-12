/*
ember
nov. 12
Dice game
 */
package dice;
import java.util.Scanner;

/**
 *
 * @author embte
 */
public class Dice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Welcome to Dice roll game!");
        System.out.println("Chose a number between 1 and 6");
        
        Scanner keyedInput = new Scanner(System.in);
        int counter = 0;
        int guess;
        int cguess;
        int score = 0;
        
        while (counter < 10)
        {
            System.out.print("Your guess: ");
            guess = keyedInput.nextInt();
            
            cguess = (int)(Math.random()*5+1);
            
            if (guess == cguess)
            {
                System.out.println("Correct!");
                counter = counter + 1;
                score = score + 1;
            }
            else
            {
                System.out.println("You suck");
                counter = counter + 1;
            }
            
        
        }
        System.out.println("You guessed " + score + " correctly");
        
    }
    
}
