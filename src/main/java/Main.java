/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumber = 28;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your guess: (1-100) ");
        int playerGuess = scanner.nextInt();

        if (playerGuess == randomNumber){
            System.out.println( "correct guess") ;

        }
        else if ( playerGuess < randomNumber ){
            System.out.println( " no too large ");

        }
        else !(playerGuess < randomNumber) {
            System.out.println("no too small ");

        }



    }
}

