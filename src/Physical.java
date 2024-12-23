import java.util.Random;

public class Physical implements Award {
    // Array of physical prizes
    private static final String[] prizes = {"Car", "Vacation Package", "TV", "Washer and Dryer", "Leather Couch"}; // Mark as final
    private final Random random = new Random(); // Mark as final

    // Method to get a random prize index
    public int getRandomPrize() {
        return random.nextInt(prizes.length);
    }

    @Override
    public int displayWinnings(Players player, boolean isWin) {
        int prizeIndex = getRandomPrize(); // Get a random prize index
        if (isWin) {
            System.out.println(player.getFirstName() + " " + player.getLastName() + ", you won a " + prizes[prizeIndex] + "!");
            return 0; // No monetary value for physical prizes
        } else {
            System.out.println(player.getFirstName() + " " + player.getLastName() + ", sorry, that is incorrect! You could have won a " + prizes[prizeIndex] + ".");
            return 0; // No monetary value for physical prizes
        }
    }
}
