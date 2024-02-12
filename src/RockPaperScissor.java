import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerA, playerB, gameplay;
        boolean running = false;
        while (!running){

            if (input.hasNext()){
                do {
                    System.out.println("Player A: Enter [R, P, S]: ");
                    playerA = input.nextLine();
                }while (!playerA.equalsIgnoreCase("r") && !playerA.equalsIgnoreCase("p") && !playerA.equalsIgnoreCase("s"));
                do {
                    System.out.println("Player B: Enter [R, P, S]: ");
                    playerB = input.nextLine();
                }while(!playerB.equalsIgnoreCase("r") && !playerB.equalsIgnoreCase("p") && !playerB.equalsIgnoreCase("s"));

                if (playerA.equalsIgnoreCase("r")){
                    switch (playerB.toLowerCase()){
                        case "r":
                            System.out.println("Rock vs Rock: Its a Tie!");
                            break;
                        case "p":
                            System.out.println("Rock vs Paper: Paper covers Rock");
                            break;
                        case "s":
                            System.out.println("Rock vs Scissors: Rock breaks Scissor");
                    }
                }else if (playerA.equalsIgnoreCase("p")){
                    switch (playerB.toLowerCase()) {
                        case "r":
                            System.out.println("Paper vs Rock: Paper covers Rock");
                            break;
                        case "p":
                            System.out.println("Paper vs Paper: Its a Tie!");
                            break;
                        case "s":
                            System.out.println("Paper vs Scissors: Scissor cuts Paper");
                            break;
                    }
                } else if (playerA.equalsIgnoreCase("s")){
                    switch (playerB.toLowerCase()) {
                        case "r":
                            System.out.println("Scissors vs Rock: Rock breaks Scissor");
                            break;
                        case "p":
                            System.out.println("Scissors vs Paper: Scissor cuts Paper");
                            break;
                        case "s":
                            System.out.println("Scissors vs Scissors: Its a Tie!");
                            break;
                    }
                }else{
                    System.out.println("Something Went Wrong: Please Try Again");
                }
                System.out.println("Do you want to play again? [Y/N]: ");
                gameplay = input.nextLine();
                if (gameplay.equalsIgnoreCase("N")){
                    running = true;
                }

            } else {
                String trash = input.nextLine();
                System.out.println("Invalid Input: "+ trash);
                System.out.println("Please Try Again");
            }
        }

    }
}