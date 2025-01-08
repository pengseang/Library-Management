package model;

import lombok.Getter;

@Getter
public class Book {
    private int id;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void getDetails() {
        System.out.println("Book-id : "+id + " - " + title + " by " + author + " (" + (isAvailable ? "Available" : "Not Available") + ")");
    }
}
