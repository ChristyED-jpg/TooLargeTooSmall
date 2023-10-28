/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    }

    Random rand = new Random();
    int randomNumber = int.nextInt(100)++;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your name: (1-100 ");
    int playerGuess = scanner.nextInt();

    if (playerGuess = randomNumber){
      System.out.println( "correct") ;

    }
}

