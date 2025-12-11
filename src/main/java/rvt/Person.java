package rvt;

public class Person {
    private String name;
    private String adress;
    private int salary;

    public Person(String name, String adress, int salary) {
        this.name = name;
        this.adress = adress;
        this.salary = salary;
    }

    public String toString() {
        return name + "\n" + "  " + adress + "\n" + "  salary " + salary + " euro/month";
    }
}