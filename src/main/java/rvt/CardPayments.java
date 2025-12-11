package rvt;

public class CardPayments {
    private double balance;

    public CardPayments(double balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }    
}