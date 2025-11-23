package rvt;

public class Statistics {
    private int count;
    private int sum;
    private double average;

    public Statistics() {
        // initialize the variable numberCount here
        count = 0;
        sum = 0;
        average = 0;
    }

    public void addNumber(int number) {
        count += 1;
        sum += number;
        average = 1.0 * sum / count;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return average;
    }
}