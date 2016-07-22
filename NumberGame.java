/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

/**
 *
 * @author Tony
 */
import java.util.Scanner;
import java.util.Random;
public class NumberGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Random rn = new Random();
        boolean loop = true;
        while(loop == true){
        boolean answer = false;
        int randNum = rn.nextInt(11);
        System.out.println("The computer has chosen a number between 0 and 10. Take a guess (or type Q to quit)!");
        while (answer == false){
            String guess = scanner.next();
            if("Q".equals(guess)){
                System.exit(0);
            } 
            int guessint = Integer.parseInt(guess);
            if(guessint == randNum){
                answer = true;
                System.out.println("You got it!");
            } else {
                System.out.println("Guess again!");
            }
        }
    }
    } 
}
