package rvt;

public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    public String title() {
        return title;
    }

    public int pages() {
        return pages;
    }

    public int publicationYear() {
        return publicationYear;
    }

    public String toString() {
        return title + ", " + pages + " pages, " + publicationYear;
    }
}
