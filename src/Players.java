public class Players extends Person {
    private double money;

    public Players(String firstName, String lastName) {
        super(firstName, lastName);
        this.money = 1000;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getLastName() + ": $" + String.format("%.2f", money);
    }
}
