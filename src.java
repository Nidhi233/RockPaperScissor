import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("rock/paper/scissor Game");
        System.out.println("r - Rock \np - Paper \ns - Scissor");

        while (true) {
            String[] options = {"r", "p", "s"};
            String myMove = options[new Random().nextInt(options.length)];

            String yourMove;

            while(true) {
                System.out.println("Please make your move - r/p/s");
                yourMove = s.nextLine();
                if (yourMove.equals("r") || yourMove.equals("p") || yourMove.equals("s")) {
                    break;
                }
                System.out.println("Not a valid move");
            }

            System.out.println("My move: " + myMove);

            if (yourMove.equals(myMove)) {
                System.out.println("The game was a tie!");
            }
            else if (yourMove.equals("r")) {
                if (myMove.equals("p")) {
                    System.out.println("I win!");

                } else if (myMove.equals("s")) {
                    System.out.println("You win!");
                }
            }

            else if (yourMove.equals("p")) {
                if (myMove.equals("r")) {
                    System.out.println("You win!");

                } else if (myMove.equals("s")) {
                    System.out.println("I win!");
                }
            }

            else if (yourMove.equals("s")) {
                if (myMove.equals("p")) {
                    System.out.println("You win!");

                } else if (myMove.equals("r")) {
                    System.out.println("I win!");
                }
            }

            System.out.println("Play again? (y/n)");
            String playAgain = s.nextLine();

            if (!playAgain.equals("y")) {
                System.out.println("Thanks for playing :)");
                break;
            }
        }
        s.close();
    }
}
;
