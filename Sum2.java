/*
ember
November 11th, 2019
Unit two summerative
ROCK PAPER SCISSORS for when you are lonely and bored
 */

package sum2;

import java.util.Scanner;

/**
 *
 * @author emdea4472
 */
public class Sum2 {
   
    public static int Addtwo (int n1, int n2)
    {
        int sum = n1 + n2;
        return sum;
    }
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //state variables
        int value;
        int choice;
        int score = 0;
        int ascore = 0;
        int total = 0;
        Scanner keyedInput = new Scanner(System.in);

        //starting menu
        System.out.println("ROCK PAPER SCISSORS");
        System.out.println("---Please select your choice---");
        System.out.println("1...rock");
        System.out.println("2...paper");
        System.out.println("3...scissors");
        System.out.print("Enter choice here: ");
        
        //User selects option from above based on corrasponding number
        value = keyedInput.nextInt();
        
                     System.out.println("------------");
        
        // loop will continue until user or computer reach a score of ten
        while (Math.max(score, ascore) < 10)

        {
            if (value==1) // tell user what they have chosen
                {
                    System.out.println("You have chosen ROCK");
                }   
                if (value==2)
                {
                    System.out.println("You have chosen PAPER");
                }      
                if (value==3)
                {
                    System.out.println("You have chosen SCISSORS");
                }  
        
        //Roll random number to select opposing choice
        choice = (int)Math.round(Math.random()*2+1);
        
        if (choice == 1) //computer has rolled rock
            {
            System.out.println("Computer has chosen ROCK"); //tell User what computer has chosen
            
                if (value==1) // display outcome
                {
                    System.out.println("It's a tie!");
                }   
                if (value==2)
                {
                    System.out.println("You won!");
                    score = score + 1;
                }      
                if (value==3)
                {
                    System.out.println("You lost.");
                    ascore = ascore + 1;
                }      
                           System.out.println("------------");
            System.out.print("Please select your next move:");
            value = keyedInput.nextInt();
                           System.out.println("------------");                        
            }
       
        else if(choice ==2) //computer has rolled paper
            {
            System.out.println("Computer has chosen PAPER");
            
                if (value==1)
                {
                    System.out.println("You lost.");
                    ascore = ascore + 1;                    
                }   
                if (value==2)
                {
                    System.out.println("It's a tie!");      
                }      
                if (value==3)
                {
                    System.out.println("You won!");
                    score = score + 1;
                }   
                           System.out.println("------------");
            System.out.print("Please select your next move:");
            value = keyedInput.nextInt();
                           System.out.println("------------");            

            }
       
        else if(choice == 3) //computer has rolled scissors
            {
            System.out.println("Computer has chosen SCISSOERS"); 
            
                if (value==1)
                {
                    System.out.println("You won!");
                    score = score + 1;
                }   
                if (value==2)
                {
                    System.out.println("You lost.");
                    ascore = ascore + 1;
                }      
                if (value==3)
                {
                    System.out.println("It's a tie!");
                }      
                           System.out.println("------------");
            System.out.print("Please select your next move:");
            value = keyedInput.nextInt();
                           System.out.println("------------");            
            }
        }
        
        
        //Calculate total
        total = Addtwo(score, ascore);
        //Tell user whether thay have won or not
        System.out.println("GAME OVER");
        if (score == 10)
            {
                System.out.println("Congrats you win!!");
            }
        else if(ascore == 10)
            {
                System.out.println("Well, there's always next time...");
            }
        //Diplay wins, losses, and total number of rounds played
        System.out.println("-----STATS-----");
        System.out.println("Rounds: " + total);
        System.out.println("Wins: " + score);
        System.out.println("Losses: " + ascore);
        System.out.println("Thank you for playing!");

        
    }
    
}
