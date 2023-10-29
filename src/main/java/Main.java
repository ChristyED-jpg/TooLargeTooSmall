/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int randomNumber = rand.nextInt(100)+1;
        System.out.println( " random number is "+ randomNumber);
        int tryCount = 0;
        while( true) {

            Scanner scanner = new Scanner(System.in);
            int playerGuess = scanner.nextInt();
            tryCount++;

            if (playerGuess == randomNumber) {
                System.out.println("correct guess");
                break;
            } else if (playerGuess > randomNumber) {
                System.out.println(" no too large ");

            } else {
                System.out.println("no too small ");

            }
        }


    }
}

