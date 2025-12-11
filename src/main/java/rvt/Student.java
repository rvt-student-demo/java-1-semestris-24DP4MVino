package rvt;

public class Student {
    private String name;
    private String adress;
    private int credits;
    private int study;

    public Student(String name, String adress) {
        this.name = name;
        this.adress = adress;
        credits = 0;
        study = 0;
    }

    public int credits() {
        return credits;
    }

    public int study() {
        return credits += 1;
    }

    public String toString() {
        return name + "\n" + "  " + adress + "\n" + "  Study credits " + credits;
    }
}
