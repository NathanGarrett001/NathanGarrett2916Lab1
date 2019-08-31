/* ********************************
 * @author  Nathan Garrett
 * @date    08/30/19
 * Assignment:  Week1MathQuizzer
 * 
 * Algorithm
 * Random Number Generator
 * Generate two random numbers between in range between 0-9
 * Prompt user with an equation
 * Check given number with correct answer.
 * Loop program 10 times and keep record of correct and incorrect answers. 
 */
package javaapplication2;

import java.util.*;
/**
 *
 * @author natha
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner keyboard = new Scanner(System.in);
        int guess;
        int count;
        int right=0, wrong=0; 
        
        
        for (count =1; count ==10; count++)
        
        
        {
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        System.out.println("Please Solve. " + a + " + " + b + " = ");
        guess = keyboard.nextInt();
        
            if (guess==a+b)
            {
                System.out.println("Super duper!");
                right++;
                        }
            else
            {    
                System.out.println("Oh noes!");
                wrong++;
                        }
            
            count++;
        }
            System.out.println("Alrighty! You answered " + right + " right, and " + wrong + " wrong! ");
            
    }
}
    
