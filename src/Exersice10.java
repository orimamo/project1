import java.util.*;


public class Exersice10 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int randnum = rand.nextInt(1000);
        int numOfGuess1 = 0;
        int numOfGuess2 = 0;
        System.out.println("the number is between 0 to 1000\nstart play!!!! ");
        System.out.println("the num is " + randnum);
        int player1;
        int player2;
        do {

            System.out.println("player 1 is your turn to guess");
            player1 = scanner.nextInt();
            if (player1 != randnum)
            {
                if (player1 < randnum)
                {
                    System.out.println("wrong number ,the random number is higher");
                    numOfGuess1 = numOfGuess1 + 1;
                }
                else
                {
                    System.out.println("wrong number ,the random number is lower");
                    numOfGuess1 = numOfGuess1 + 1;
                }
            }
            else
            {
                if (player1 == randnum)
                {
                    System.out.println("player 1 your guess is right " + player1 + " you guess-" + numOfGuess1 + " times");
                    break;
                }
            }
            System.out.println("player 2 is your turn to guess");
            player2 = scanner.nextInt();
            if (player2 != randnum)
            {
                if (player2 < randnum)
                {
                    System.out.println("wrong number + the random number is higher");
                    numOfGuess2 = numOfGuess2 + 1;
                } else
                {
                    System.out.println("wrong number + the random number is lower");
                    numOfGuess2 = numOfGuess2 + 1;
                }
            }
            else
            {
                if (player2 == randnum)
                {
                    System.out.println("player 2 your guess is right " + player2 + " you guess-" + numOfGuess2 + "times");
                    break;
                }
            }

        } while (player1 != randnum && player2 != randnum);


    }


}
