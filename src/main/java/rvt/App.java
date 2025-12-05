package rvt;

public class App {
    public static void main(String[] args) {
        OverloadedCounter counter = new OverloadedCounter(37);

        counter.increase(10);
        System.out.println(counter.value());
        counter.decrease(13);
        System.out.println(counter.value());
    }
}
