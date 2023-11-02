import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    static void Game() {
        int box;

        System.out.println("\t\t\t==========================================");
        System.out.println("\t\t\t|\t\tLET'S GO \t\t |");
        System.out.println("\t\t\t==========================================");
        System.out.print("\t\t\t\t Input number: ");
        try {
            box = sc.nextInt();
            for (int i = 1; i <= box; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("\t\t\t\tFizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("\t\t\t\tFizz");
                } else if (i % 5 == 0) {
                    System.out.println("\t\t\t\tBuzz");
                } else {
                    System.out.println("\t\t\t\t" + i);
                }
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("\t\t\t  Invalid input it should be a number");

        }

    }

    static void startMenu() {
        System.out.println("\t\t\t===========================================");
        System.out.println("\t\t\t|\t    WELCOME TO FIZZBUZZ \t  |");
        System.out.println("\t\t\t===========================================");
        System.out.println(
                "\t\t\t|  \"FizzBuzz is a programming task that\t  | \n\t\t\t|  involves printing numbers from 1 to N. | \n\t\t\t| When a number is a multiple of 3, \"Fizz\"| \n\t\t\t| is printed, for multiples of 5, \"Buzz\"  | \n\t\t\t| is printed, and if a number is both a   | \n\t\t\t| multiple of 3 and 5, \"FizzBuzz\"  is     | \n\t\t\t| printed.\"\t\t\t\t  |");
        System.out.println("\t\t\t-------------------------------------------");
        System.out.println("\t\t\t==========================================");
        System.out.println("\t\t\t|\t\t [1] START \t\t |");
        System.out.println("\t\t\t|\t\t [2] EXIT \t\t |");
        System.out.println("\t\t\t==========================================");
        boolean tryAgain = true;
        while (tryAgain == true) {
            System.out.print("\t\t\tInput number: ");
            String num = sc.nextLine();
            if (num.equalsIgnoreCase("1")) {
                Game();
                tryAgain = false;

            } else if (num.equalsIgnoreCase("2")) {
                System.out.println("\t\t\tBYE BYE!");
                System.exit(0);
                tryAgain = false;
            } else {
                System.out.println("\t\t\tInvalid input. It should be 1 or 2");
                tryAgain = true;
            }
        }

    }

    public static void main(String[] args) throws Exception {
        startMenu();

    }
}
