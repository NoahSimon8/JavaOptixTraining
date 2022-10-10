
import java.util.Scanner;
import java.util.Random;
public class Imports {
    
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);




        int random_number = rand.nextInt(99)+1;
        int guess = -1;
        // the number of attempts allowed
        int lives = 5;

        while (guess != random_number && lives>0){
            System.out.println("Guess a new number");
            guess = Integer.valueOf(scan.nextLine());
            if (guess > random_number){
                System.out.println("Too High");

            }
            if (guess < random_number){
                System.out.println("Too Low");

            }
            if (guess == random_number){
                System.out.println("You guessed the number!");

            }   
            lives--;
        }
        if (lives == 0){
            System.out.println("You Lose!");
        }


    }

}
