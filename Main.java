import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] stars = { 1, 2, 3 };
        int total = 0;
        int[] correctAnswers = { 3, 2, 2, 3, 3 };
        int guess;

        String[] questions = { "What is the capital of France?",
                "Which planet is known as the Red Planet?",
                "What is 5 × 6?",
                "Which animal is known as the King of the Jungle?",
                "Which of these is a primary color?" };

        String[][] options = { { "1. Berlin", "2. Madrid", "3. Paris", "4. Rome" },
                { "1. Venus", "2. Mars", "3. Jupiter", "4. Saturn" },
                { "1. 5", "2. 30", "3. 35", "4. 40" },
                { "1. Tiger", "2. Elephant", "3. Lion", "4. Saturn" },
                { "1. Green", "2. Purple", "3. Red", "4. Orange" } };

        // Welcome message
        draw_stars(stars[0]);
        System.out.println("Welcome to the Java Quiz Game!");
        draw_stars(stars[0]);

        for (int i = 0; i < 5; i++) {

            System.out.println(questions[i]);
            System.out.println();

            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            scanner.nextLine();
            if (guess != correctAnswers[i]) {
                draw_stars(stars[1]);
                System.out.println("WRONG!");
                draw_stars(stars[1]);
            } else if (guess == correctAnswers[i]) {
                draw_stars(stars[1]);
                System.out.println("CORRECT!");
                draw_stars(stars[1]);
                total += 1;
            }
        }

        draw_stars(stars[0]);
        System.out.printf("Your final score is %d out of %d", total, correctAnswers.length);
        draw_stars(stars[0]);

    }

    static void draw_stars(int number) {

        if (number == 1) {
            for (int i = 0; i < 30; i++) {
                System.out.print("*");
            }
        } else if (number == 2) {
            for (int i = 0; i < 8; i++) {
                System.out.print("*");
            }
        } else if (number == 3) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
        }
        System.out.println();
    }

}