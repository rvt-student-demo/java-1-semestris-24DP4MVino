package rvt;

import java.util.*;

public class JMArrayList {
    public static void main(String[] args) {
        onlyTheseNumbers();
        System.out.println();
        listSize();
        System.out.println();
        System.out.println();
        onTheList();
        System.out.println();
        System.out.println();

        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);

        System.out.println(strings);
    }

    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num != -1) {
                list.add(num);
            } else { 
                break;
            }
        }

        System.out.print("From where? ");
        int from = Integer.valueOf(scanner.nextLine());

        System.out.print("To where? ");
        int to = Integer.valueOf(scanner.nextLine());

        for(int i = from; i <= to; i++) {
            System.out.println(list.get(i));
        }
    }

    public static void listSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true) {
            String name = String.valueOf(scanner.nextLine());
            if (name == "") {
                break;
            } else {
                list.add(name);
            }
        }

        System.out.print("In total: " + list.size());

    }

    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true) {
            String name = String.valueOf(scanner.nextLine());
            if (name == "") {
                break;
            } else {
                list.add(name);
            }
        }

        System.out.print("Search for? ");
        String name = String.valueOf(scanner.nextLine());

        boolean found = list.contains(name);
        if (found) {
            System.out.print(name + " was found!");
        } else {
            System.out.print(name + " was not found!");
        }
    }

    public static void removeLast(ArrayList<String> strings) {
        if(strings.size() == 0) {
            return;
        }

        strings.remove(strings.size() - 1);
    }
}