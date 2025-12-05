package rvt;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(title, pages, publicationYear));
        }

        System.out.print("What information will be printed? ");
        String print = scanner.nextLine();

        for (Book book: books) {
            if (print.equals("everything")) {
                System.out.println(book);
            } else if (print.equals("name")) {
                System.out.println(book.title());
            }
        }
    }
}
