package rvt;

public class Student extends Person {
    private int credits;

    public Student(String name, String adress) {
        super(name, adress);
        credits = 0;
    }

    public int credits() {
        return this.credits;
    }

    public int study() {
        return credits += 1;
    }

    public String toString() {
        return super.toString() + "\n" + "  Study credits " + credits;
    }
}
