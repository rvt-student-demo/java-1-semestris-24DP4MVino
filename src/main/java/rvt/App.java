package rvt;

public class App {

    public static void main(String[] args) {
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(ada);
        System.out.println(esko);
        System.out.println();

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        
        int i = 0;
        while (i < 25) {
        ollie.study();
        i = i + 1;
        }
        System.out.println(ollie);
    }
}