package rvt;

// super class
public class Person {
    private String name;
    private String address;

    public Person(String name) {
        this(name, null);
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // other constructors and methods

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String toString() {
        return this.name + "\n" + "  " + this.address;
    }
}