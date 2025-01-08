import model.Book;
import model.Library;
import model.Member;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library Management System.....!");

        Library library = new Library();


        System.out.println("Adding Books...");
        Book book1 = new Book(11, "The Great Gatsby", "F.Scott Fitzgerald");
        Book book2 = new Book(22, "To Kill a Mockingbird", "Harper Lee");
        library.addBook(book1);
        library.addBook(book2);

        System.out.println("Adding Members...");
        Member member1 = new Member(33, "Alice");
        Member member2 = new Member(44, "Bob");
        library.registerMember(member1);
        library.registerMember(member2);


        library.displayBooks();
        library.displayMembers();

        System.out.println("Bob borrows \"The Great Gatsby\"...");
        member2.returnBook(book1);

        library.displayBooks();
        library.displayMembers();

        System.out.println("Bob returns \"The Great Gatsby\"...");
        member2.borrowBook(book1);

        library.displayBooks();
        library.displayMembers();
    }
    }