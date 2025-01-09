package model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Library {
    private List<Member> members;
    private List<Book> books;



    public Library() {
        members = new ArrayList<>();
        books = new ArrayList<>();

    }


    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Registered member: " + member.getName());
    }

    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public Member findMemberById(int id) {
        for (Member member : members) {
            if (member.getId() == id) {
                return member;
            }
        }
        return null;
    }

    public void displayBooks() {
        System.out.println("Displaying All Books:");
        for (Book book : books) {
            book.getDetails();
        }
    }

    public void displayMembers() {
        System.out.println("Displaying All Members:");
        for (Member member : members) {
            member.getDetails();
        }
    }
}
