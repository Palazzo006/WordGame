import java.util.Random;

public class Physical implements Award {
    private String[] prizes = {"Car", "Vacation Package", "TV", "Appliances", "Furniture"};
    private Random random = new Random();

    public int getRandomPrize() {
        return random.nextInt(prizes.length);
    }

    @Override
    public int displayWinnings(Players player, boolean isWin) {
        int prizeIndex = getRandomPrize();
        if (isWin) {
            System.out.println(player.getFirstName() + " " + player.getLastName() + ", you won a " + prizes[prizeIndex] + "!");
            return 0; 
        } else {
            System.out.println(player.getFirstName() + " " + player.getLastName() + ", sorry, that is incorrect! You could have won a " + prizes[prizeIndex] + ".");
            return 0; 
        }
    }
}
