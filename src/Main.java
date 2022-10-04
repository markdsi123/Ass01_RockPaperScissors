import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        String playerA = "";
        String playerB = "";
        String trash;
        String yesOrNo = "";


        do {
            System.out.println("Choose a move for Player A [R,P,S]: ");
            if (in.hasNext()) {
                playerA = in.next();
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid move!");
            }

            System.out.println("Choose a move for Player B [R,P,S]: ");
            if (in.hasNext()) {
                playerB = in.next();
                in.nextLine();
            } else {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid move!");
            }

            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock v Rock is a tie!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock. Player B wins!");
                } else {
                    System.out.println("Rock breaks Scissors. Player A wins!");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock. Player A wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper v Paper is a tie!");
                } else {
                    System.out.println("Scissors cut Paper. Player B wins!");
                }
            } else //PlayerA is scissors
            {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors. Player B wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cut Paper. Player A wins!");
                } else {
                    System.out.println("Scissors v Scissors is a tie!");
                }
            }
            System.out.println("Do you want to play again? [Y/N]: ");
            if (in.hasNext())
            {
                yesOrNo = in.next();
                in.nextLine();
            }
        }
        while (yesOrNo.equalsIgnoreCase("Y"));

    }
}