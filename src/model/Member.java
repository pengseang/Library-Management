package model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Member {
    private int id;
    private String name;
    private List<Book> borrowedBooks;

    // Constructor
    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    // Methods
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println(name + " borrowed " + book.getTitle() + ".");
        } else {
            System.out.println(book.getTitle() + " is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " returned " + book.getTitle() + ".");
        } else {
            System.out.println(name + " has not borrowed this book.");
        }
    }

    public void getDetails() {
        System.out.print("Person-id : "+id + " - " + name + " (Books borrowed: ");
        if (borrowedBooks.isEmpty()) {
            System.out.println("No books borrowed)");
        } else {
            for (Book book : borrowedBooks) {
                System.out.print(book.getTitle() + ", ");
            }
            System.out.println(")");
        }
    }
}
