package practice_03;

import java.util.Random;
import java.util.Scanner;

public class TasKagıtMakas {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int userChoice = 0;
        int compChoice = 0;
        int user = 0;
        int comp = 0;

        do {
            System.out.println("==========================================\n" +
                    "Please make your choice :\n\t1 for Rock\n\t2 for Paper\n\t3 for Scissors");
            userChoice = scan.nextInt();
            compChoice = random.nextInt(3) + 1;

            if (userChoice == 1 && compChoice == 2) {
                System.out.println("Your Choice = " + userChoice + " | Computers' Choice = " + compChoice +
                        "\nPaper wraps Rock ===> Computer +1 ");
                comp++;
                System.out.println("User = " + user + " | Computer = " + comp);
            } else if (userChoice == 1 && compChoice == 3) {
                System.out.println("Your Choice = " + userChoice + " | Computers' Choice = " + compChoice +
                        "\nRock smashs Scissors ===> User +1 ");
                user++;
                System.out.println("User = " + user + " | Computer = " + comp);
            } else if (userChoice == 2 && compChoice == 1) {
                System.out.println("Your Choice = " + userChoice + " | Computers' Choice = " + compChoice +
                        "\nPaper wraps Rock ===> User +1 ");
                user++;
                System.out.println("User = " + user + " | Computer = " + comp);
            } else if (userChoice == 2 && compChoice == 3) {
                System.out.println("Your Choice = " + userChoice + " | Computers' Choice = " + compChoice +
                        "\nScissors cuts Paper ===> Computer +1 ");
                comp++;
                System.out.println("User = " + user + " | Computer = " + comp);
            } else if (userChoice == 3 && compChoice == 2) {
                System.out.println("Your Choice = " + userChoice + " | Computers' Choice = " + compChoice +
                        "\nScissors cuts Paper ===> User +1 ");
                user++;
                System.out.println("User = " + user + " | Computer = " + comp);
            } else if (userChoice == 3 && compChoice == 1) {
                System.out.println("Your Choice = " + userChoice + " | Computers' Choice = " + compChoice +
                        "\nRock smashs Scissors ===> Computer +1 ");
                comp++;
                System.out.println("User = " + user + " | Computer = " + comp);
            } else {
                System.out.println("Your Choice = " + userChoice + " | Computers' Choice = " + compChoice + "\nIt's a tie");
                System.out.println("User = " + user + " | Computer = " + comp);
            }

        } while (user != 5 && comp != 5);
        {
            if (user > comp) System.out.println("**************************************\nYou are the Winner!!!!" + "\nUser = " + user + " | Computer = " + comp);
            else System.out.println("**************************************\nSorry, You are Loser :( " +
                    "\nUser = " + user + " | Computer = " + comp);
        }

    }
}