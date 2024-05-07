import java.util.ArrayList;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        ArrayList<Object> players = new ArrayList<>();

        int playerCount = 0;
        int numPlayers = 0;
        int sides = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of sides for the die being used: ");
        sides = sc.nextInt();
        System.out.print("Enter the number of players: ");
        numPlayers = sc.nextInt();

        sc.nextLine();

        while (numPlayers > 0) {
            playerCount += 1;
            System.out.print("Enter the name for player " + playerCount + ": ");
            players.add(new Player(sc.nextLine(), new Die(sides)));
            numPlayers -= 1;
        }
        System.out.println();

        for (Object i : players) {
            System.out.print(i + "\n");
        }
        System.out.println();

        driver.decideWinner(players);
    }
}