import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerA, playerB, gameplay;
        boolean running = false;

        while (!running) {
            System.out.print("Player A: Enter [R, P, S]: ");
            playerA = input.nextLine();

            while (!playerA.equalsIgnoreCase("r") && !playerA.equalsIgnoreCase("p") && !playerA.equalsIgnoreCase("s")) {
                System.out.print("Invalid input! Please enter [R, P, S]: ");
                playerA = input.nextLine();
            }

            System.out.print("Player B: Enter [R, P, S]: ");
            playerB = input.nextLine();

            while (!playerB.equalsIgnoreCase("r") && !playerB.equalsIgnoreCase("p") && !playerB.equalsIgnoreCase("s")) {
                System.out.print("Invalid input! Please enter [R, P, S]: ");
                playerB = input.nextLine();
            }

            if (playerA.equalsIgnoreCase("r")) {
                switch (playerB.toLowerCase()) {
                    case "r":
                        System.out.println("Rock vs Rock: It's a Tie!");
                        break;
                    case "p":
                        System.out.println("Rock vs Paper: Paper covers Rock");
                        break;
                    case "s":
                        System.out.println("Rock vs Scissors: Rock breaks Scissors");
                        break;
                }
            } else if (playerA.equalsIgnoreCase("p")) {
                switch (playerB.toLowerCase()) {
                    case "r":
                        System.out.println("Paper vs Rock: Paper covers Rock");
                        break;
                    case "p":
                        System.out.println("Paper vs Paper: It's a Tie!");
                        break;
                    case "s":
                        System.out.println("Paper vs Scissors: Scissors cuts Paper");
                        break;
                }
            } else if (playerA.equalsIgnoreCase("s")) {
                switch (playerB.toLowerCase()) {
                    case "r":
                        System.out.println("Scissors vs Rock: Rock breaks Scissors");
                        break;
                    case "p":
                        System.out.println("Scissors vs Paper: Scissors cuts Paper");
                        break;
                    case "s":
                        System.out.println("Scissors vs Scissors: It's a Tie!");
                        break;
                }
            } else {
                System.out.println("Something went wrong. Please try again.");
            }

            System.out.print("Do you want to play again? [Y/N]: ");
            gameplay = input.nextLine();

            if (gameplay.equalsIgnoreCase("N")) {
                running = true;
            }
        }
    }
}
