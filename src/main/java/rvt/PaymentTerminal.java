package rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        money = 1000;
        affordableMeals = 0;
        heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        if (money > 2.50) {
            money += 2.50;
            affordableMeals += 1;
            return payment - 2.50;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        if (money > 4.30) {
            money += 4.30;
            heartyMeals += 1;
            return payment - 4.30;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(CardPayments card) {
        if (card.balance() > 2.50) {
            card.takeMoney(2.50);
            affordableMeals += 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(CardPayments card) {
        if (card.balance() > 4.30) {
            card.takeMoney(4.30);
            heartyMeals += 1;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(CardPayments card, double sum) {
        card.addMoney(sum);
        money += sum;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
