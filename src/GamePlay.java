import java.util.Scanner;

public class GamePlay {
    private static Person player;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = scanner.nextLine();

        System.out.println("Would you like to enter a last name? Leave blank if not.");
        String lastName = scanner.nextLine();

        if (lastName.isEmpty()) {
            player = new Person(firstName);
        } else {
            player = new Person(firstName, lastName);
        }

        Numbers numbers = new Numbers();
        numbers.generateNumber();

        boolean guessedCorrectly = false;
        while (!guessedCorrectly) {
            System.out.println(player.getFirstName() + " " + player.getLastName() + ", guess what number I picked between 0 and 100.");
            int guess = scanner.nextInt();
            guessedCorrectly = numbers.compareNumber(guess);
        }

        scanner.close();
    }
}
