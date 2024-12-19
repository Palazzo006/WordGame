public class Turn {
    private static final double WINNING_AMOUNT = 1000;
    private static final double LOSING_AMOUNT = 200;

    public boolean takeTurn(Players player, Hosts host) {
        System.out.println(host.getFirstName() + " " + host.getLastName() + " says \"" + player.getFirstName() + " " + player.getLastName() + ", enter your guess for my random number between 0 and 100\"");
        int guess = Integer.parseInt(System.console().readLine());

        if (Numbers.compareNumber(guess)) {
            player.setMoney(player.getMoney() + WINNING_AMOUNT);
            System.out.println("Winner Winner, Chicken Dinner!");
            System.out.println("You win $" + String.format("%.2f", WINNING_AMOUNT));
            System.out.println(player);
            return true;
        } else {
            player.setMoney(player.getMoney() - LOSING_AMOUNT);
            System.out.println("You lose $" + String.format("%.2f", LOSING_AMOUNT));
            System.out.println(player);
            return false;
        }
    }
}
