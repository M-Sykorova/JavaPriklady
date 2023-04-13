import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        whoIsWinner(scanner);
    }

    private static void whoIsWinner(Scanner scanner) {

        int player1result = 0;
        int player2result = 0;
        boolean gameOver = false;

        while(!gameOver){
            System.out.println("Choose from: 1 - rock, 2 - paper, 3 - scissors");

            System.out.print("Player 1 choice: ");
            int player1 = scanner.nextInt();

            System.out.print("Player 2 choise: ");
            int player2 = scanner.nextInt();

            if(gameOver){
                break;
            } else if(player1 == player2){
                System.out.println("Draw!");
            } else if(player1 == 1 && player2 == 3 || player1 == 2 && player2 == 1 || player1 == 3 && player2 == 2){
                System.out.println("Player 1 win a round!");
                player1result++;
            } else {
                System.out.println("Player 2 win a round!");
                player2result++;

            }
            System.out.println("Scoreboard     " + player1result + " : " + player2result);

            if(player1result == 3){
                System.out.println("Player 1 is a winner!");
                gameOver = true;
            } else if(player2result == 3){
                System.out.println("Player 2 is a winner!");
                gameOver = true;
            }
        }
        scanner.close();


    }
}
