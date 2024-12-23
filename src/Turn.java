import java.util.Random;

public class Turn {
    private Random randomGenerator = new Random();

    public boolean takeTurn(Players player, Hosts host) {
        System.out.println(host.getFirstName() + " " + host.getLastName() + " says \"" +
            player.getFirstName() + " " + player.getLastName() +
            ", enter your guess for my random number between 0 and 100\"");
        int guess = Integer.parseInt(System.console().readLine());

        boolean isWin = Numbers.compareNumber(guess);
        
        if (isWin) {
            if (randomGenerator.nextBoolean()) { // Randomly decide between money and physical prize
                Money moneyAward = new Money();
                player.setMoney(player.getMoney() + moneyAward.displayWinnings(player, true));
            } else {
                Physical physicalAward = new Physical();
                physicalAward.displayWinnings(player, true);
            }
            return true;
        } else {
            if (randomGenerator.nextBoolean()) { // Randomly decide between money and physical prize
                Money moneyAward = new Money();
                player.setMoney(player.getMoney() + moneyAward.displayWinnings(player, false));
            } else {
                Physical physicalAward = new Physical();
                physicalAward.displayWinnings(player, false);
            }
            return false;
        }
    }
}
