package rvt;

public class OverloadedCounter {
    private int counter;

    public OverloadedCounter(int startValue) {
        counter = startValue;
    }

    public OverloadedCounter() {
        counter = 0;
    }

    public int value() {
        return counter;
    }

    public void increase() {
        counter += 1;
    }

    public void decrease() {
        counter -= 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            counter += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            counter -= decreaseBy;
        }
    }
}
