import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        
       Scanner in = new Scanner(System.in);
Random rand = new Random();
int numberToGuess = rand.nextInt(100) + 1;
int userGuess;
int attempts = 0;

do {
    System.out.print("Guess a number between 1 and 100: ");
    userGuess = in.nextInt();
    attempts++;

    if (userGuess < numberToGuess) {
        System.out.println("Too low, try again.");
    } else if (userGuess > numberToGuess) {
        System.out.println("Too high, try again.");
    } else {
        System.out.println("Correct! Congratulations 🎉🎉");
        System.out.println("You guessed it in " + attempts + " attempts.");
    }
} while (userGuess != numberToGuess);

in.close();
     }
}
