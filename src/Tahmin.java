import java.util.Scanner;

public class Tahmin {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int guess = generateRandomNumber();
        System.out.println("Guess number");
        while (true) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == guess) break;
            if (number < guess) {
                System.out.println("Increase the number");
            } else {
                System.out.println("Decrease the number");
            }
        }
        System.out.println("Congratulations \uD83D\uDC4F You found the number: " + guess);
    }

    public static int generateRandomNumber() {
        return (int) (Math.random() * 100 + 1);
    }
}